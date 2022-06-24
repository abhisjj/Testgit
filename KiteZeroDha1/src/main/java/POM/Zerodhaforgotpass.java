package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhaforgotpass {
	
	@FindBy(xpath="//input[@placeholder='User ID']")private WebElement user;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement pan;
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']")private WebElement email;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement reset;
	
   public Zerodhaforgotpass(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }
	
   public void enteruser(String id) {
	   user.sendKeys(id);
   }
   
   public void enterpan(String PAN) {
	   pan.sendKeys(PAN);
   }
   public void Emtermail(String Mail) {
	  email.sendKeys(Mail); 
   }
   public void Reset() {
	   reset.click();
   }
   
	

}
