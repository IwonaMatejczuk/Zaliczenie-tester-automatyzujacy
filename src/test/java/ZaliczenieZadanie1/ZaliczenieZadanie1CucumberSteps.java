package ZaliczenieZadanie1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ZaliczenieZadanie1CucumberSteps {
    private WebDriver driver;

    @Given("^Browser with open page at (.*)$")
    public void browserCodersLab(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get(url);
    }

    @When("Log in as an existing user")
    public void signedIn() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement signInButton= driver.findElement(By.className("user-info"));
        signInButton.click();

        WebElement searchEmailInPut= driver.findElement(By.name("email"));
        searchEmailInPut.sendKeys("testerka@test.pl");
        WebElement searchPasswordInput= driver.findElement(By.name("password"));
        searchPasswordInput.sendKeys("haslo123.");
        WebElement searchSignIn= driver.findElement(By.id("submit-login"));
        searchSignIn.click();
    }

    @And("Address clicked")
    public void newAddressClicked() {
        WebElement addFirstAddress = driver.findElement(By.id("addresses-link"));
        addFirstAddress.click();
    }

    @And("Create new address clicked")
    public void createNewAddressClicked(){
        WebElement CreateNewAddressButton= driver.findElement(By.xpath("//*[contains(text(),\"Create new address\")]"));
        CreateNewAddressButton.click();
    }

    @And("^New address form filled with (.*)$")
    public void searchAddressInPut (String Alias, String Address, String City, String Postalcode, String Phone) {
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
    }

    @Then("Checked the added address")
    public void checkedTheAddress() {
        //throw new io.cucumber.java.PendingException();

    }

}
