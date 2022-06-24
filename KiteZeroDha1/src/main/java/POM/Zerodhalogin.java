package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhalogin {
	@FindBy(xpath="//input[@id='userid']")private WebElement userid;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement pass;
	@FindBy(xpath="//button[@type='submit']")private WebElement Clickonlogin;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement Clickonforgotpass;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement Clickonsignup;
	
	
	
	public Zerodhalogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enteruserid(String user) {
		userid.sendKeys(user);
		}
	public void enterpassword(String password) {
		pass.sendKeys(password);
	}
	public void clickonlogin() {
		Clickonlogin.click();
	}
	public void forgotpass() {
		Clickonforgotpass.click();
	}
	public void clickonsignup() {
		Clickonsignup.click();
	}
	

}
