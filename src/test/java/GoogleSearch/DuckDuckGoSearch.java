package GoogleSearch;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuckDuckGoSearch {

    @Test
    public void shouldSearchWithDDG() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        //otwieranie przeglągarki
        driver.get("https://duckduckgo.com/");
        //znajdż element po name q
        WebElement searchInput= driver.findElement(By.name("q"));
        //wpisze "napis"
        searchInput.sendKeys("W pustyni i w puszczy");
        //zapisz
        searchInput.submit();
        //zamyka przeglądarkę, jak chce zakończyć test
        //driver.quit();
    }

}

