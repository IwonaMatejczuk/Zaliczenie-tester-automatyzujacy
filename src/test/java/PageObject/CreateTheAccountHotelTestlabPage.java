package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import zadaniaPageObject.zadanie1.UserDetailsZad1;

import static zadania.Tools.fillInput;

public class CreateTheAccountHotelTestlabPage {
    private WebDriver driver;

    public CreateTheAccountHotelTestlabPage(WebDriver driver) {
        this.driver = driver;
    }

    public void attemptAccountCreationForUserDetails(UserDetails userDetails) {
        WebElement customerFirstnameInput = driver.findElement(By.id("customer_firstname"));
        fillInput(customerFirstnameInput, userDetails.getFirstName());

        WebElement customerLastnameInput = driver.findElement(By.id("customer_lastname"));
        fillInput(customerLastnameInput, userDetails.getLastName());

        WebElement customerEmailInput = driver.findElement(By.id("email"));

        WebElement passwordInput = driver.findElement(By.id("passwd"));
        fillInput(passwordInput, userDetails.getPassword());

        WebElement submitButton = driver.findElement(By.id("submitAccount"));
        submitButton.click();
    }

}
