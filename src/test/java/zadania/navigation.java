package zadania;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

    @Test
    public void shouldSearchWithDDG() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://coderslab.pl/pl");
        Tools.sleep(1500);
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        Tools.sleep(1500);
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        //searchInput.submit();
    }
}
