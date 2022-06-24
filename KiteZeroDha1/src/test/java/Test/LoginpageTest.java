package Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Zerodhaforgotpass;
import POM.Zerodhalogin;
import Utility.Parametrization;

public class LoginpageTest {
	WebDriver driver;
	@BeforeMethod
	public void browser() {
		driver=Browser.openBrowser();
	}
	
	@Test
	public void loginwithvalidcredentialsTest() throws EncryptedDocumentException, IOException {
		Zerodhalogin zerodhalogin=new Zerodhalogin(driver);
		String user=Parametrization.getData( 0, 1);
		String password=Parametrization.getData( 1, 1);
		zerodhalogin.enteruserid(user);
		zerodhalogin.enterpassword(password);
		zerodhalogin.clickonlogin();
	}
	@Test
	public void forgotpass() throws EncryptedDocumentException, IOException {
		Zerodhalogin zerodhalogin=new Zerodhalogin(driver);
		zerodhalogin.forgotpass();
		
		Zerodhaforgotpass forgotpass=new Zerodhaforgotpass(driver);
		String user=Parametrization.getData(0, 1);
		forgotpass.enteruser(user);
		String mail=Parametrization.getData(3, 1);
		forgotpass.Emtermail(mail);
		String pan=Parametrization.getData(4, 1);
		forgotpass.enterpan(pan);
		
	}
	

}
