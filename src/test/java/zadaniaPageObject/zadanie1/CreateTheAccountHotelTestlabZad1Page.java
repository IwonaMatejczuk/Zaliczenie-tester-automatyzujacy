package zadaniaPageObject.zadanie1;

import PageObject.UserDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static zadania.Tools.fillInput;

public class CreateTheAccountHotelTestlabZad1Page {
    private WebDriver driver;

    //private By customerFirstnameLocator = By.id("customer_firstname");
    @FindBy(id="customer_firstname")
    private WebElement customerFirstnameInput;

    //private By customerLastnameLocator = By.id("customer_lastname");
    @FindBy (id="customer_lastname")
    private WebElement customerLastnameInput;

    //private By customerPasswordLocator = By.id("passwd");
    @FindBy (id="passwd")
    private WebElement passwordInput;

    //private By customerSubmitLocator = By.id("submitAccount");
    @FindBy (id="submitAccount")
    private WebElement submitButton;


    public CreateTheAccountHotelTestlabZad1Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void attemptAccountCreationForUserDetails(UserDetailsZad1 userDetailsZad1) {
        fillInput(customerFirstnameInput, userDetailsZad1.getFirstName());
        fillInput(customerLastnameInput, userDetailsZad1.getLastName());
        fillInput(passwordInput, userDetailsZad1.getPassword());
        submitButton.click();
    }

}
