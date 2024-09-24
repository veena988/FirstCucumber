package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPageObject {


	public WebDriver driver;
	
	public OfferPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search = By.id("search-field");
	By offerprodname = By.cssSelector("tr td:nth-child(1)");
	
	public void searchProductinMainPage(String prodshortnam)
	{
		driver.findElement(search).sendKeys(prodshortnam);
	}
	
	public String returnSearchRestult()
	{
		return driver.findElement(offerprodname).getText();
	 
	}
}
