package zadaniaPageObject.zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static zadania.Tools.fillInput;

public class SignInHotelTestlabZad1Page {
    private WebDriver driver;
    //private By customerEmailInPutLocator= By.id("email_create");
    @FindBy(css ="#email_create")
    private WebElement emailInput;

    private By customerAnAccountButtonLocator= By.cssSelector("#SubmitCreate");
    @FindBy(css= "#SubmitCreate")
    private WebElement createAnAccountButton;

    public SignInHotelTestlabZad1Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void attemptAccountCreationFroEmail(String email) {
        //WebElement emailInput = driver.findElement(customerEmailInPutLocator);
        fillInput(emailInput, email);
        //WebElement createAnAccountButton = driver.findElement(customerAnAccountButtonLocator);
        createAnAccountButton.click();
    }
}
