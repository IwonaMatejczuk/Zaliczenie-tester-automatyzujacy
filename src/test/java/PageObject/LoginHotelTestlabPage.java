package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static zadania.Tools.*;

public class LoginHotelTestlabPage {
    private WebDriver driver;

    public LoginHotelTestlabPage(WebDriver driver) {
        this.driver = driver;
    }

    public void attemptAccountCreationFroEmail(String email) {
        WebElement emailInput = driver.findElement(By.cssSelector("#email_create"));
        fillInput(emailInput, email);
        WebElement createAnAccountButton = driver.findElement(By.cssSelector("#SubmitCreate"));
        createAnAccountButton.click();
    }
}
