package StepDefinitions;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class SearchSteps {

    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        System.out.println("User is on Home Page");
        // Implement code to navigate to the home page
    }

    @When("User navigate to Login Page")
    public void user_navigate_to_login_page() {
        System.out.println("User navigates to Login Page");
        // Implement code to navigate to the login page
    }

    @Then("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        System.out.println("User enters username: " + username + " and password: " + password);
        // Implement code to enter username and password
    }

    @Then("Keeping case as {string}")
    public void keeping_case_as(String caseType) {
        System.out.println("Keeping case as " + caseType);
        // Implement code to handle case (valid or invalid)
    }

    @Then("User should get logged in")
    public void user_should_get_logged_in() {
        System.out.println("User should get logged in");
        // Implement verification for successful login
    }

    @Then("Message displayed Login Successfully")
    public void message_displayed_login_successfully() {
        System.out.println("Message displayed Login Successfully");
        // Implement verification for successful login message
    }

    @Then("user will be asked to go back to login page")
    public void user_will_be_asked_to_go_back_to_login_page() {
        System.out.println("User will be asked to go back to login page");
        // Implement verification for user being asked to go back to login page
    }

    @Then("Provide correct credentials")
    public void provide_correct_credentials() {
        System.out.println("Provide correct credentials");
        // Implement providing correct credentials
    }

    @Then("Keeping case as Invalid")
    public void keeping_case_as_invalid() {
        System.out.println("Keeping case as Invalid");
        // Implement code to keep the case as invalid
    }
}

