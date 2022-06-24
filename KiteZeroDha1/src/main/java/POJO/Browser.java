package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static  WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suraj Bhosale\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	return driver;
	
	
	
	}

}
