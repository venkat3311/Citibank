package step_definitions;

import com.CucumberFramework.pages.JournalsAuditPage;
import com.CucumberFramework.utilities.ConfigurationReader;
import com.CucumberFramework.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JournalsAudit_StepDefs {

    JournalsAuditPage journalsAuditPage = new JournalsAuditPage();

    @When("user logs in as an invoicing manager")
    public void user_logs_in_as_an_invoicing_manager() {

        journalsAuditPage.login(ConfigurationReader.getProperty("email"), ConfigurationReader.getProperty("password"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(journalsAuditPage.hasTagInbox));
    }

    @Then("user should be able to click on invoicing link")
    public void user_should_be_able_to_click_on_invoicing_link() {
        journalsAuditPage.invoicingLink.click();
    }

    @Then("user should be able to click PDF report")
    public void user_should_be_able_to_click_PDF_report() {
        journalsAuditPage.pdfReports.click();
    }

    @When("user clicks on Journals Audit")
    public void user_clicks_on_Journals_Audit() throws InterruptedException {
        journalsAuditPage.journalAudit.click();
        Thread.sleep(3000);
    }

    @Then("user should see the default values")
    public void user_should_see_the_default_values() throws InterruptedException {
        Assert.assertTrue(journalsAuditPage.allPostedEntries.isSelected());
        Thread.sleep(3000);
        Assert.assertTrue(journalsAuditPage.journalEntryNumber.isSelected());

    }

    @Then("user should be able to add journal from drop down")
    public void user_should_be_able_to_add_journal_from_drop_down() throws InterruptedException {
        journalsAuditPage.journalsDropDown.click();
        String firstOption = journalsAuditPage.firstOptionFromDropDown.getText();
        System.out.println(firstOption);
        journalsAuditPage.firstOptionFromDropDown.click();
        Thread.sleep(7000);
        String journals = journalsAuditPage.journalsWindow.getText();
        System.out.println(journals);
        Assert.assertTrue(journals.contains(firstOption));
    }

    @Then("user should be able delete it")
    public void user_should_be_able_delete_it() throws InterruptedException {
        journalsAuditPage.deleteButton.click();
        Thread.sleep(3000);
    }

    @Then("user should be able to click print button")
    public void user_should_be_able_to_click_print_button() {
        journalsAuditPage.printButton.click();
    }

    @Then("user should be able to close popup window")
    public void user_should_be_able_to_close_popup_window() {
        journalsAuditPage.popup.click();
    }

    @Then("user should be able to logout")
    public void user_should_be_able_to_logout() throws InterruptedException {
        journalsAuditPage.nameOnHeader.click();
        Thread.sleep(3000);
        journalsAuditPage.logout.click();

    }

    @Then("start and end dates should be empty by default")
    public void start_and_end_dates_should_be_empty_by_default() {
        Assert.assertTrue(journalsAuditPage.startDate.getText().isEmpty());
        Assert.assertTrue(journalsAuditPage.endtDate.getText().isEmpty());
    }

    @Then("user able to click cancel button")
    public void user_able_to_click_cancel_button() throws InterruptedException {
        Thread.sleep(3000);
        journalsAuditPage.cancelButton.click();

    }

    @Then("user able to click x icon")
    public void user_able_to_click_x_icon() throws InterruptedException {
        Thread.sleep(3000);
        journalsAuditPage.closeIcon.click();

    }


}
