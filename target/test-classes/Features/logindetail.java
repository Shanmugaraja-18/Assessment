package Features;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class LoginSteps {

    @Given("User is on Home Page")
    public void userIsOnHomePage() {
        System.out.println("IN the home page");
        // Add implementation to navigate to the home page
    }

    @When("User navigate to Login Page")
    public void userNavigateToLoginPage() {
    	System.out.println("IN the home page");
        // Add implementation to navigate to the login page
    }

    @Then("User enters {string} and {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
    	System.out.println("IN the home page");
        // Add implementation to enter username and password
    }

    @Then("Keeping case as Valid")
    public void keepingCaseAsValid() {
    	System.out.println("IN the home page");
        // Add implementation to keep the case as valid
    }

    @Then("User should get logged in")
    public void userShouldGetLoggedIn() {
    	System.out.println("IN the home page");
        // Add implementation to verify successful login
    }

    @Then("Message displayed Login Successfully")
    public void messageDisplayedLoginSuccessfully() {
    	System.out.println("IN the home page");
        // Add implementation to verify successful login message
    }

    @Then("user will be asked to go back to login page")
    public void userWillBeAskedToGoBackToLoginPage() {
    	System.out.println("IN the home page");
        // Add implementation to verify user is prompted to go back to login page
    }

    @Then("Provide correct credentials")
    public void provideCorrectCredentials() {
    	System.out.println("IN the home page");
        // Add implementation to provide correct credentials
    }

    @Then("Keeping case as Invalid")
    public void keepingCaseAsInvalid() {
    	System.out.println("IN the home page");
        // Add implementation to keep the case as invalid
    }
}
