package step_definitions;

import com.CucumberFramework.pages.TaxReportsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TaxReports_StepDefs {

    TaxReportsPage taxReportsPage = new TaxReportsPage();

    @When("user clicks on Tax Reports from the drop down")
    public void user_clicks_on_Tax_Reports_from_the_drop_down() {
        taxReportsPage.taxReports.click();

    }

    @Then("the start and end dates pon Tax Reports window should be blank by dedault")
    public void the_start_and_end_dates_pon_Tax_Reports_window_should_be_blank_by_dedault() {
        Assert.assertTrue(taxReportsPage.startDate.getText().isEmpty());
        Assert.assertTrue(taxReportsPage.endDate.getText().isEmpty());
    }

    @Then("user should be able to see error message {string}")
    public void user_should_be_able_to_see_error_message(String errMsg) {
        Assert.assertTrue(taxReportsPage.errMessage.getText().contains(errMsg));
    }
}
