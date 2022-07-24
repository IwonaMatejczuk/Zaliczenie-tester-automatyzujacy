package zadania;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static zadania.Tools.fillInput;

public class FindByExamplesTestByClassName {

    @Test
    public void shouldFindElementsByClassName() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signIn= driver.findElement(By.className("hide_xs"));

        WebElement footerEmailInput = driver.findElement(By.className(".inputNew form-control grey newsletter-input"));

        signIn.submit();
        fillInput(footerEmailInput, "test@email.com");

    }
}

