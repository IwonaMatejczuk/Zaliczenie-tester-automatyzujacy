import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test {

    @Test
    public void shouldChangeAddress() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://mystore-testlab.coderslab.pl");

        WebElement signInButton= driver.findElement(By.xpath("//*[contains(text(), \"Sign in\")]"));
        signInButton.click();

        WebElement searchEmailInPut= driver.findElement(By.name("email"));
        searchEmailInPut.sendKeys("testerka@test.pl");

        WebElement searchPasswordInput= driver.findElement(By.name("password"));
        searchPasswordInput.sendKeys("haslo123.");

        WebElement searchSignIn= driver.findElement(By.id("submit-login"));
        searchSignIn.click();

        WebElement addFirstAddress = driver.findElement(By.id("addresses-link"));
        addFirstAddress.click();

        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=address&id_address=26694");

        String Alias= "Test";
        String element = driver.findElement(By.name("alias")).getText();
        System.out.println(element);
        Assert.assertEquals(Alias, element);
    }
}
