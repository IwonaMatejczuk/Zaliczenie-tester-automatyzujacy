package PageObject.DDPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainDdPage {
    private WebDriver driver;

    public MainDdPage(WebDriver driver) {
        this.driver= driver;
    }

    public void searchPhrase(String phraseToSearch) {
        WebElement searchInput= driver.findElement(By.name("q"));
        searchInput.sendKeys(phraseToSearch);
        searchInput.submit();
    }
}
