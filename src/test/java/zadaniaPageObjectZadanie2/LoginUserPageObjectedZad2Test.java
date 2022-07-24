package zadaniaPageObjectZadanie2;

import PageObject.MainHotelTestlabPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import zadaniaPageObject.zadanie1.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static zadania.Tools.generateRandomEmail;

/*public class LoginUserPageObjectedZad2Test {
    private WebDriver driver;
    private MainHotelTestlabZad1Page mainPage;
    private LoginInHotelTestlabZad2Page loginPage;
    private CreateTheAccountHotelTestlabZad1Page createAccountPage;
    private MyAccountHotelTestlabZad1Page myAccountPage;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.mainPage = new MainHotelTestlabZad1Page(driver);
        this.loginPage= new LoginInHotelTestlabZad2Page(driver);
        this.createAccountPage= new CreateTheAccountHotelTestlabZad1Page(driver);
        this.myAccountPage= new MyAccountHotelTestlabZad1Page(driver);
    }

    @Test
    public void shouldFillRegisterUserForm() {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        MainHotelTestlabPage mainPage= new MainHotelTestlabPage(driver);
        mainPage.clickSignIn();

        UserDetailsZad2 userDetailsZad2 = new UserDetailsZad2()
                .setFirstName("Iwona")
                .setLastName("Test")
                .setPassword("supertajnehaslo");
    }
}
/*
 */
