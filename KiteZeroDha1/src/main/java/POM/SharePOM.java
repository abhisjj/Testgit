package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SharePOM {
	@FindBy(xpath="//input[@type='text']")private WebElement search;
	@FindBy(xpath="//button[@class='button-blue']")private WebElement BUY;
    @FindBy(xpath="//button[@data-balloon='Chart']")private WebElement Chart;
    @FindBy(xpath="")private WebElement xxx;
    
    
	public SharePOM (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickonsearch(String Searchshare) {
		search.sendKeys(Searchshare);
	}
	public void clickbuy() {
		BUY.click();
	}
	public void clickchart() {
		Chart.click();
	}
	
}
