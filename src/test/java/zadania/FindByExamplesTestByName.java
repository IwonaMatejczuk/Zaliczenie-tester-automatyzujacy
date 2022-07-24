package zadania;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static zadania.Tools.fillInput;

public class FindByExamplesTestByName {

    @Test
    public void shouldFindElementsByID() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationInput= driver.findElement(By.name("hotel_location"));
       fillInput(hotelLocationInput, "Warsaw");
       Tools.sleep(2000);
        WebElement searchNowButton= driver.findElement(By.name("search_room_submit"));
        searchNowButton.submit();
        WebElement footerEmailInput= driver.findElement(By.name("email"));
        WebElement footerButtonSubscribe= driver.findElement(By.name("submitNewsletter"));
       fillInput(footerEmailInput, "test@test.com");
    }

}

