package ZaliczenieZadanie1;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ZaliczenieZadanie1CucumberSteps {
    private WebDriver driver;

    @Given("^Browser with open page at address (.*)$")
    public void browserCodersLab(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get(url);
    }

    @When("Log in as an existing user")
    public void signedIn () {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement signInButton = driver.findElement(By.className("user-info"));
        signInButton.click();

        WebElement searchEmailInPut = driver.findElement(By.name("email"));
        searchEmailInPut.sendKeys("testerka@test.pl");
        WebElement searchPasswordInput = driver.findElement(By.name("password"));
        searchPasswordInput.sendKeys("haslo123.");
        WebElement searchSignIn = driver.findElement(By.id("submit-login"));
        searchSignIn.click();
    }

    @And("Address clicked")
    public void newAddressClicked() {
        WebElement addFirstAddress = driver.findElement(By.id("addresses-link"));
        addFirstAddress.click();
    }

    @And("Create new address clicked")
    public void createNewAddressCreate() {
       WebElement createNewAddressButton= driver.findElement(By.xpath("//*[contains(text(),\"Create new address\")]"));
        createNewAddressButton.click();
    }

   @And("^New address form filled with (.*)$")
    public void searchAddressInPut (String Alias) {
        WebElement searchAliasInput = driver.findElement(By.name("alias"));
        searchAliasInput.sendKeys(Alias);
    }

    @And("^Add new (.*)$")
       public void searchAddressInPut2 (String Address) {
        WebElement searchAddressInput = driver.findElement(By.name("address1"));
        searchAddressInput.sendKeys(Address);
    }

    @And("^Type (.*)$")
    public void searchAddressInPut3 (String City) {
        WebElement searchCityInput = driver.findElement(By.name("city"));
        searchCityInput.sendKeys(City);
    }

    @And("^Enter the (.*)$")
    public void searchAddressInPut4 (String Postcode) {
        WebElement searchPostalCodeInput = driver.findElement(By.name("postcode"));
        searchPostalCodeInput.sendKeys(Postcode);
    }

    @And("^Choose (.*)$")
    public void searchAddressInPut5 (String Country) {
        WebElement searchPostalCodeInput = driver.findElement(By.name("id_country"));
        searchPostalCodeInput.sendKeys(Country);
    }

     @And("^Complete (.*)$")
    public void searchAddressInPut6 (String Phone) {
        WebElement searchPhoneInput = driver.findElement(By.name("phone"));
        searchPhoneInput.sendKeys(Phone);
    }

    @And("^Save clicked")
    public void saveClicked () {
        WebElement saveButton = driver.findElement(By.xpath("//*[contains(text(),\"Save\")]"));
        saveButton.click();
    }

    @Then("Checked the added address")
    public void checkIfAddressWasAdd() {
        String checkAdddress = driver.findElement(By.id("notifications")).getText();
        String expectedNotifications = "Address successfully added!";
        Assert.assertEquals(expectedNotifications, checkAdddress);
        System.out.println("Gratulacje prawidłowo dodałeś adres");
    }
}
