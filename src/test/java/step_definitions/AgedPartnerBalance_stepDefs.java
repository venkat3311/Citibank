package step_definitions;

import com.CucumberFramework.pages.AgedPartnerBalancePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AgedPartnerBalance_stepDefs {

    AgedPartnerBalancePage agedPartnerBalancePage = new AgedPartnerBalancePage();

    @When("user clicks on Aged Partner Balance")
    public void user_clicks_on_Aged_Partner_Balance() {
        agedPartnerBalancePage.agedPartnerBalance.click();
    }

    @Then("user should be able to see selected default values")
    public void user_should_be_able_to_see_selected_default_values() {
        Assert.assertTrue(agedPartnerBalancePage.receivableAccount.isSelected());
        Assert.assertTrue(agedPartnerBalancePage.agedPartnerBalanceText.isDisplayed());
        Assert.assertTrue(agedPartnerBalancePage.allPostedEntries.isSelected());
    }

    @When("user clear the date box")
    public void user_clear_the_date_box() {
        agedPartnerBalancePage.date.clear();
    }

    @Then("user should see error message {string}")
    public void user_should_see_error_message(String errMsg) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(agedPartnerBalancePage.errorMsg.getText(), errMsg);
    }

    @Then("user should be able to see text {string}")
    public void user_should_be_able_to_see_text(String text) {
        Assert.assertEquals(agedPartnerBalancePage.text.getText(), text);
    }

    @Then("user should be able to click x icon to close the window")
    public void user_should_be_able_to_click_x_icon_to_close_the_window() {
        agedPartnerBalancePage.xIcon.click();
    }

}
