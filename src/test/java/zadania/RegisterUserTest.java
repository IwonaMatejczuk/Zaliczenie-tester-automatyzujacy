package zadania;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static zadania.Tools.*;

public class RegisterUserTest {
    @Test
    public void shouldFillRegisterUserForm() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //żeby zaczekać aż strona się wczyta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInButton = driver.findElement(By.cssSelector("a.user_login.navigation-link"));
        signInButton.click();
        WebElement emailInput = driver.findElement(By.cssSelector("#email_create"));
        assertDisplayedAndEnabled(emailInput);

        //generateRandomemail w Tools, generuje jakis email
        fillInput(emailInput, generateRandomEmail());

        WebElement createAnAccountButton = driver.findElement(By.cssSelector("#SubmitCreate"));

        //metoda w Tools żeby fail jesli jest puste pole lubelemen jest niedostępny
        assertDisplayedAndEnabled(createAnAccountButton);
        createAnAccountButton.click();

        WebElement customerFirstnameInput = driver.findElement(By.id("customer_firstname"));
        assertDisplayedAndEnabled(customerFirstnameInput);
        fillInput(customerFirstnameInput, "ala");

        WebElement customerLastnameInput = driver.findElement(By.id("customer_lastname"));
        assertDisplayedAndEnabled(customerLastnameInput);
        fillInput(customerLastnameInput, "makota");

        WebElement customerEmailInput = driver.findElement(By.id("email"));
        assertDisplayedAndEnabled(customerEmailInput);

        WebElement passwordInput = driver.findElement(By.id("passwd"));
        assertDisplayedAndEnabled(passwordInput);
        fillInput(passwordInput, "supertajnehaslo");

        WebElement submitButton = driver.findElement(By.id("submitAccount"));
        assertDisplayedAndEnabled(submitButton);
        submitButton.click();
        //driver.quit();
    }
}
