package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.SharePOM;
import POM.Zerodhalogin;
import POM.ZerodhapinPage;
import Utility.Parametrization;

public class PinpageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() {
		driver=Browser.openBrowser();
	}
	
	@Test
	public void loginwithvalidpinTest() throws EncryptedDocumentException, IOException, InterruptedException {
		Zerodhalogin zerodhalogin=new Zerodhalogin(driver);
		String user=Parametrization.getData( 0, 1);
		String password=Parametrization.getData( 1, 1);
		zerodhalogin.enteruserid(user);
		zerodhalogin.enterpassword(password);
		zerodhalogin.clickonlogin();
		Thread.sleep(4000);
		ZerodhapinPage zerodhapinpage=new ZerodhapinPage(driver);
		String pin=Parametrization.getData(2, 1);
		zerodhapinpage.enterpin(pin);
		zerodhapinpage.clicksubmit();
		Thread.sleep(3000);
		 SharePOM sharepom=new SharePOM(driver);
		 sharepom.clickonsearch("tatamotor");
		 Actions action=new Actions(driver);
		 
		 action.moveToElement(driver.findElement(By.xpath("//span[text()='TATAMOTORS JUN 280 CE']")));
		 action.perform();
		// sharepom.clickbuy();
		 sharepom.clickchart();
		
	}
	
	

}
