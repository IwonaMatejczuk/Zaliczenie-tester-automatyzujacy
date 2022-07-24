package PageObject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import zadaniaPageObject.zadanie1.UserDetailsZad1;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static zadania.Tools.*;

public class RegisterUserPageObjectedTest {
    private WebDriver driver;
    private MainHotelTestlabPage mainPage;
    private LoginHotelTestlabPage loginPage;
    private CreateTheAccountHotelTestlabPage createAccountPage;
    private MyAccountHotelTestlabPage myAccountPage;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.mainPage = new MainHotelTestlabPage(driver);
        this.loginPage= new LoginHotelTestlabPage(driver);
        this.createAccountPage= new CreateTheAccountHotelTestlabPage(driver);
        this.myAccountPage= new MyAccountHotelTestlabPage(driver);
    }


    @Test
    public void shouldFillRegisterUserForm() {
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        MainHotelTestlabPage mainPage= new MainHotelTestlabPage(driver);
        mainPage.clickSignIn();

        loginPage.attemptAccountCreationFroEmail(generateRandomEmail());

        UserDetails userDetails = new UserDetails()
                .setFirstName("Iwona")
                .setLastName("Test")
                .setPassword("supertajnehaslo");


        createAccountPage.attemptAccountCreationForUserDetails(userDetails);
        assertTrue(myAccountPage.isAccountCreationSuccessful());
    }
}
