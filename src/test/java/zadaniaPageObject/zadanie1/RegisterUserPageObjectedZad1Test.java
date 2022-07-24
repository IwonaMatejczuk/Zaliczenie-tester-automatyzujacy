package zadaniaPageObject.zadanie1;

import PageObject.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static zadania.Tools.generateRandomEmail;

public class RegisterUserPageObjectedZad1Test {
    private WebDriver driver;
    private MainHotelTestlabZad1Page mainPage;
    private SignInHotelTestlabZad1Page loginPage;
    private CreateTheAccountHotelTestlabZad1Page createAccountPage;
    private MyAccountHotelTestlabZad1Page myAccountPage;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.mainPage = new MainHotelTestlabZad1Page(driver);
        this.loginPage= new SignInHotelTestlabZad1Page(driver);
        this.createAccountPage= new CreateTheAccountHotelTestlabZad1Page(driver);
        this.myAccountPage= new MyAccountHotelTestlabZad1Page(driver);
    }

    @Test
    public void shouldFillRegisterUserForm() {
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        MainHotelTestlabPage mainPage= new MainHotelTestlabPage(driver);
        mainPage.clickSignIn();

        String email= generateRandomEmail();
        loginPage.attemptAccountCreationFroEmail(email);

        UserDetailsZad1 userDetails = new UserDetailsZad1()
                .setFirstName("Iwona")
                .setLastName("Test")
                .setPassword("supertajnehaslo");

        createAccountPage.attemptAccountCreationForUserDetails(userDetails);
        assertTrue(myAccountPage.isAccountCreationSuccessful());
    }
}
