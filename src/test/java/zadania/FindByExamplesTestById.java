package zadania;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static zadania.Tools.fillInput;

public class FindByExamplesTestById {

    @Test
    public void shouldFindElementsByID() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationInput= driver.findElement(By.id("hotel_location"));
        fillInput(hotelLocationInput, "Warsaw");
        WebElement searchNowButton= driver.findElement(By.id("search_room_submit"));
        WebElement footerEmailInput= driver.findElement(By.id("newsletter-input"));
        fillInput(footerEmailInput, "test@email.com");
    }

}

