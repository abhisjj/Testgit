package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POJO.Browser1;
import POM.Angellogin;

public class AngelTest {
	WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		driver=Browser1.Angelbrowser();
	}
	
	@DataProvider(name="Data")
	public Object[][] data(){
		return new Object [][]{ {"J258042","Abhi@1996"}};
	}
	
	@Test(dataProvider= "Data")
	public void Angeltest(String Id,String PASS) throws InterruptedException {
		//System.out.println(Id+PASS);
		 Angellogin login=new  Angellogin(driver);
		 login.clickregister();
		 login.enterid(Id);
		 login.enterpass(PASS);
		 login.clickonsignup();
		 Thread.sleep(3000);
		// login.Contentlist(driver);
		   login.Dropdown(driver);
	}

}
