package zadaniaPageObject.zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountHotelTestlabZad1Page {
    private WebDriver driver;

    @FindBy (css= "p.alert.alert-success")
    private WebElement accountCreationSuccessPanel;

    public MyAccountHotelTestlabZad1Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean isAccountCreationSuccessful() {

        if (accountCreationSuccessPanel == null) {
            return false;
        }
        return accountCreationSuccessPanel.getText().equals("Your account has been created.");
    }

}
