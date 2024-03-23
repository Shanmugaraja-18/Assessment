package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class Amazon {

    WebDriver driver;

    @Given("I am on the Login page URL {string}")
    public void i_am_on_the_login_page_url(String url) {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Then("I click on sign in button and wait for sign in page")
    public void i_click_on_sign_in_button_and_wait_for_sign_in_page() {
        WebElement signInButton = driver.findElement(By.linkText("My Account"));
        signInButton.click();
    }

    @When("I enter username and password")
    public void i_enter_username_and_password() {
        WebElement emailInput = driver.findElement(By.id("input-email"));
        emailInput.sendKeys("shanmugarajaofficial24@gmail.com");
        WebElement passwordInput = driver.findElement(By.id("input-password"));
        passwordInput.sendKeys("12345678");
    }

    @When("click on login button")
    public void click_on_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
        loginButton.click();
    }

    @Then("I am logged in")
    public void i_am_logged_in() {
        // No additional steps needed, as login is already performed in the previous step
    }

    @Then("I search different {string} from the search bar")
    public void i_search_different_from_the_search_bar(String product) {
        WebElement searchInput = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        searchInput.sendKeys(product);
        WebElement searchButton = driver.findElement(By.xpath("//i[@class='fa fa-search']"));
        searchButton.click();
    }
}
