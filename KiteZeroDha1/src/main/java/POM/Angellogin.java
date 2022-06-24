package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Angellogin {
	@FindBy(xpath="//input[@id='txtUserID']")private WebElement ID;
	@FindBy(xpath="//input[@id='txtTradingPassword']")private WebElement PASS;
	@FindBy(xpath="//a[@id='loginBtn']")private WebElement ClickSignin;
	@FindBy(xpath="(//a[@class='btn btn-color'])[2]")private WebElement Register;
	@FindBy(xpath="//li[@class='dropdown menu-large childLI']")private List<WebElement> Menu;
	@FindBy(xpath="//li[@id='ub_myprofile']")private  List<WebElement> dropdown;
	@FindBy(xpath="//a[@data-toggle='dropdown']")private WebElement Dtoggle;
	@FindBy(xpath="//li[@id='ub_family']")private WebElement family;
     public  Angellogin (WebDriver driver)  {
		PageFactory.initElements(driver, this);
	}
	
	public void enterid(String id) {
		ID.sendKeys(id);
	}
	public void enterpass(String pass) {
		PASS.sendKeys(pass);
	}
    public void clickonsignup() {
    	ClickSignin.click();
    }
    
    public void clickregister() {
    	Register.click();
    }
    
    public void Contentlist(WebDriver driver) throws InterruptedException {
    	int num=Menu.size();
    	System.out.println(num);
    	for(int i=0;i<=num-1;i++) {
    		WebElement search=Menu.get(i);
    	//	System.out.println(search.getText());
    		if(search.getText().equals("Markets")) {
    			Actions act=new Actions(driver);
    					act.moveToElement(search);
    					act.perform();
    					Thread.sleep(3000);
    					search.click();
    					act.perform();
    					
    					
    		}
    		else {
    			System.out.println("not found");
    		}
    	} }
    public void Dropdown(WebDriver driver) throws InterruptedException {
    	Actions action=new Actions(driver);
    	action.moveToElement(Dtoggle);
    	action.perform();
    	action.click();
    	action.perform();
    	Thread.sleep(4000);
    	//family.click();
    	
    	int value=dropdown.size();
    	System.out.println(value);
    	for(int i=0;i<=value-1;i++) {
    		WebElement box=dropdown.get(i);
    		System.out.println(box.getText());
    		if(box.getText().equals("Settings")) {
    			
    			action.moveToElement(box);
    			action.perform();
    			Thread.sleep(4000);
    			box.click();
    			action.perform();
    		}else {
    			System.out.println("is not found");
    		}
    		
    	}
    	
    	
    }

}