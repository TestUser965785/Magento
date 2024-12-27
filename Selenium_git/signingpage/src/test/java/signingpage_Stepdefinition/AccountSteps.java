package signingpage_Stepdefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.Registrationpage;
public class AccountSteps {

	WebDriver driver;
	Registrationpage registrationpage;
    LoginPage loginpage;
    
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
    	registrationpage = new Registrationpage(driver);
    	registrationpage.navigateToRegistrationPage();
    }

    @When("I enter valid details and submit")
    public void i_enter_valid_details_and_submit() {
    	registrationpage.fillRegistrationForm("sindha", "A" , "testemail@example.com", "testpassword", "testpassword");
    	registrationpage.submitForm();
    }

    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
    	registrationpage.verifySuccessMessage();
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
    	loginpage = new LoginPage(driver);
    	loginpage.navigateToLoginPage();
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
    	loginpage.login("email@gmail.com", "testpassword");
    }

    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {
    	loginpage.verifyDashboardPage();
    }
	
	
	
}
