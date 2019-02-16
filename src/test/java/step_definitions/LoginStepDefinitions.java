package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        System.out.println("I am on the homepage");

    }

    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        System.out.println("I'm clicking on the sign in button");

    }

    @Then("login page should be displayed")
    public void login_page_should_be_displayed() {
        System.out.println("I see the login page");

    }

    @When("user logs in as a user")
    public void user_logs_in_as_a_user() {
        System.out.println("I'm logging in as a user");

    }

    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {
        System.out.println("I see the homepage");

    }

    @Then("the title should be correct")
    public void the_title_should_be_correct() {
        System.out.println("checking the title");

    }

    @When("user logs in as manager")
    public void user_logs_in_as_manager() {
        System.out.println("I'm logging in as a manager");

    }

    @Given("user is already on Login Page")
    public void user_is_already_on_Login_Page() {
        System.out.println("I'm on the login page");

    }

    @Given("title should be {string}")
    public void title_should_be(String BriteErp) {
        System.out.println("checking the title");


    }

    @Then("user selects BriteErpDemo")
    public void user_selects_BriteErpDemo() {
        System.out.println("selecting BriteErpDemo");

    }

    @Then("user enters {string} and {string}")
    public void user_enters_and(String email, String password) {
        System.out.println("Entering email and password");

    }

    @Then("user clicks on Log in button")
    public void user_clicks_on_Log_in_button() {
        System.out.println("I'm logging in");
    }

    @Then("channel_inbox page should be displayed")
    public void channel_inbox_page_should_be_displayed() {
        System.out.println("I see the channel_inbox page");

    }

}
