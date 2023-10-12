package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.sql.DriverManager.getDriver;
import static runner.Driver.getDriver;

public class DeviceProtectionPage {
    private WebDriver driver;

    public DeviceProtectionPage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.banner-text")
    private WebElement pageTitle;

    @FindBy(id = "selected")
    private WebElement dppDropDown;

    public void assertTitle(){
        String title = pageTitle.getText();
        Assert.assertEquals("Device Protection",title);
    }

}
