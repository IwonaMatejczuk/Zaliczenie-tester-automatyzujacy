package PageObject.DDPage;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuckDuckGoSearchPageObject {

    private WebDriver driver;
    private MainDdPage mainDdPage;

    @BeforeEach
    public void beforeEach(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.mainDdPage= new MainDdPage(driver);
    }

    @Test
    public void shouldSearchWPustyniWithDDG() {
        driver.get("https://duckduckgo.com/");
        mainDdPage.searchPhrase("W pustyni i w puszczy");
    }

    @Test
    public void shouldSearchMuminkiiWithDDG() {
        driver.get("https://duckduckgo.com/");
        mainDdPage.searchPhrase("Muminki");
    }
}

