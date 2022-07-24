package zadaniaPageObject.zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainHotelTestlabZad1Page {
    private WebDriver driver;
    private By customerSignInButtonLocator= By.cssSelector("a.user_login.navigation-link");
    @FindBy(css="a.user_login.navigation-link")
    private WebElement signInButton;

    public MainHotelTestlabZad1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignIn() {
        signInButton.click();
    }
}
