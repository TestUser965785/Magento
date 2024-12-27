package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



//(//li[@class='authorization-link'])[1]

public class LoginPage {
	
	private By login = By.xpath("//li[@class='authorization-link'])[1]");
	private By submit = By.id("send2");
	private By password = By.id("pass");
	private By email = By.id("email");
	private By verifylogin = By.xpath("(//li[@class='greet welcome'])[1]");

	
	
	 WebDriver driver;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void navigateToLoginPage() {
	        driver.get("http://example.com/login");
	        driver.findElement(login).click();
	    }

	    public void login(String emailid, String password1) {
	    	driver.findElement(email).sendKeys(emailid);
	    	driver.findElement(password).sendKeys(password1);
	    	driver.findElement(submit).click();
	    }

	    public boolean verifyDashboardPage() {
	    	return driver.findElement(verifylogin).isDisplayed();
	    }
}
