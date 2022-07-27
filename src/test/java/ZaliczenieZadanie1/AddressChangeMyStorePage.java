package ZaliczenieZadanie1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddressChangeMyStorePage {

    String Alias= "Test";
    String Address= "ul. Testowa";
    String City= "Test";
    String Postalcode= "04-123";
    String Phone= "123123123";

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

        WebElement addFirstAddress = driver.findElement(By.id("address-link"));
        addFirstAddress.click();

        //WebElement CreateNewAddressButton= driver.findElement(By.xpath("//*[contains(text(),\"Create new address\")]"));
        //CreateNewAddressButton.click();

        WebElement searchAliasInput = driver.findElement(By.name("alias"));
        searchAliasInput.sendKeys(Alias);

        WebElement searchAddressInput = driver.findElement(By.name("address1"));
        searchAddressInput.sendKeys(Address);

        WebElement searchCityInput = driver.findElement(By.name("city"));
        searchCityInput.sendKeys(City);

        WebElement searchPostalCodeInput = driver.findElement(By.name("postcode"));
        searchPostalCodeInput.sendKeys(Postalcode);

        WebElement searchPhoneInput = driver.findElement(By.name("phone"));
        searchPhoneInput.sendKeys(Phone);

        WebElement searchSaveButton= driver.findElement(By.xpath("//*[contains(text(),\"Save\")]"));
        searchSaveButton.click();

        WebElement searchUpdate= driver.findElement(By.xpath("//*[contains(text(),\"Update\")]"));
        searchUpdate.click();

    }
}
