package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DeviceProtectionPage;
import runner.Driver;

public class DeviceProtectionSteps extends Driver {

    DeviceProtectionPage dppPage = new DeviceProtectionPage();

    @Given("im in the device protection screen")
    public void im_in_the_device_protection_screen() {
        dppPage.assertTitle();
    }
    @And("I select the {string}")
    public void i_select_the(String devicePurchasePrice) {

    }
    @Then("I should see the {string} per month")
    public void i_should_see_the_per_month(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
