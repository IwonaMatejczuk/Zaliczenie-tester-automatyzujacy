package zadaniaPageObjectZadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import zadaniaPageObject.zadanie1.UserDetailsZad1;

import static zadania.Tools.fillInput;

/*public class LoginInHotelTestlabZad2Page {
    private WebDriver driver;
    private By customerEmailInPutLocator= By.id("email");

    @FindBy(id="email")
    private WebElement emailInput;

    private By customerPasswordLocator= By.id("passwd");
    @FindBy(id="passwd")
    private WebElement passwordInput;

    private By customerSignInButtonLocator= By.class("icon-lock.left");
    @FindBy(id="passwd")
    private WebElement ;

    public LoginInHotelTestlabZad2Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

   public void attemptAccountCreationForEmail(UserDetailsZad2 userDetailsZad2) {
        fillInput(emailInput, email);
        fillInput(passwordInput, UserDetailsZad2.getPassword());

        WebElement createAnAccountButton = driver.findElement(By.class("icon-lock left"));
        createAnAccountButton.click();
    } */
