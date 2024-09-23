package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPageObj {
	WebDriver driver;
	By productName = By.className("product-name");
	By promotonCode = By.xpath("//button[contains(text(),'Apply')]");
	By PlaceOrderButton = By.xpath("//button[contains(text(),'Place Order')]");
	
	public CartPageObj(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String verifyProductIsAdded()
	{
		return driver.findElement(productName).getText().split("-")[0].trim();
	}
	
	public boolean validatePromotonCode()
	{
		return driver.findElement(promotonCode).isDisplayed();
		
	}
	
	public boolean validatePlaceOrderButton()
	{
		return driver.findElement(PlaceOrderButton).isDisplayed();
		//Assert.assertEquals(placeorder, "Place Order");
	}

}
