package ZaliczenieZadanie2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;

public class ShoppingOnTheMyStorePage {

    String chooseSize= "M";
    String chooseQuantity = "5";

    @Test
    public void shopping() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://mystore-testlab.coderslab.pl");

        WebElement signInButton = driver.findElement(By.xpath("//*[contains(text(), \"Sign in\")]"));
        signInButton.click();

        WebElement searchEmailInPut = driver.findElement(By.name("email"));
        searchEmailInPut.sendKeys("testerka@test.pl");
        WebElement searchPasswordInput = driver.findElement(By.name("password"));
        searchPasswordInput.sendKeys("haslo123.");
        WebElement searchSignIn = driver.findElement(By.id("submit-login"));
        searchSignIn.click();

        WebElement searchClothes = driver.findElement(By.id("category-3"));
        searchClothes.click();

        WebElement searchOurCatalog = driver.findElement(By.name("s"));
        searchOurCatalog.sendKeys("Hummingbird Printed Sweater");
        searchOurCatalog.submit();

        WebElement sweaterImg = driver.findElement(By.xpath("//img[@alt=\"Brown bear printed sweater\"]"));
        sweaterImg.click();

        WebElement searchSizeList = driver.findElement(By.id("group_1"));
        searchSizeList.sendKeys(chooseSize);

        WebElement searchQuantity = driver.findElement(By.name("qty"));
        //searchQuantity.click();
        searchQuantity.clear();
        searchQuantity.sendKeys(chooseQuantity);

        WebElement searchAddToCart = driver.findElement(By.className("add"));
        searchAddToCart.click();

        WebElement searchProceedToCheckout = driver.findElement(By.xpath("//a[contains(text(),\"Proceed to checkout\")]"));
        searchProceedToCheckout.click();
        WebElement searchProceedToCheckout2 = driver.findElement(By.xpath("//a[contains(text(),\"Proceed to checkout\")]"));
        searchProceedToCheckout2.click();

        WebElement searchContinueButton = driver.findElement(By.name("confirm-addresses"));
        searchContinueButton.click();

        WebElement searchContinueButton2 = driver.findElement(By.name("confirmDeliveryOption"));
        searchContinueButton2.click();

        WebElement searchPayByCheck = driver.findElement(By.name("payment-option"));
        searchPayByCheck.click();

        WebElement searchIAgree = driver.findElement(By.name("conditions_to_approve[terms-and-conditions]"));
        searchIAgree.click();

        WebElement searchOrderWithAnObligationToPay = driver.findElement(By.id("payment-confirmation"));
        searchOrderWithAnObligationToPay.click();

        File tmpScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:\\Users\\iwona\\screenshots", currentDateTime+ ".png"));

        driver.quit();
    }
}
