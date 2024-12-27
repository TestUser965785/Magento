package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registrationpage {
	WebDriver driver;

	
	private By usernameField = By.id("firstname");
	private By lastnameField = By.id("Last Name");
    private By passwordField = By.id("password");
    private By emailField = By.id("email_address");
    private By confirmpassword = By.id("password-confirmation");
    private By submitButton = By.id("action submit primary");
    private By successMessage = By.xpath("//div[text()='Thank you for registering with Main Website Store.']");
    private By register = By.xpath("(//a[text()='Create an Account'])[1]");
  //sindhahasnal95@gmail.com ,  Sindha@123   
    
    public Registrationpage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToRegistrationPage() {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(register).click();
    }

    public void fillRegistrationForm(String username, String lastname, String password, String confirm, String email) {
    	 driver.findElement(usernameField).sendKeys(username);
    	 driver.findElement(lastnameField).sendKeys(lastname);
    	 driver.findElement(emailField).sendKeys(email);
    	 driver.findElement(passwordField).sendKeys(password);
    	 driver.findElement(confirmpassword).sendKeys(confirm);
    	
   
    
    
    
    }

    public void submitForm() {
    	 driver.findElement(submitButton).click();
    }

    public boolean verifySuccessMessage() {
    	 WebElement successMsg = driver.findElement(successMessage);
         return successMsg.isDisplayed();
    }
}

