package zadania;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation2 {
    @Test
    public void navigation() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        Tools.sleep(2000);
        driver.get("https://coderslab.pl/pl");
        Tools.sleep(2000);
        driver.navigate().back();
        Tools.sleep(2000);
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        Tools.sleep(2000);
        driver.navigate().back();
        Tools.sleep(2000);
        driver.navigate().forward();
        Tools.sleep(2000);
        driver.navigate().refresh();
    }
}
