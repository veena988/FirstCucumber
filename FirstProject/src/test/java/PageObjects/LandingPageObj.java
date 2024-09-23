
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageObj {


	public WebDriver driver;
	
	public LandingPageObj(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search = By.className("search-keyword");
	By mainPageprodname = By.cssSelector("h4.product-name");
	By clickOnofferLink = By.xpath("//a[@href='#/offers']");
	By increaseItem = By.className("increment");
	By AddToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By CartButton = By.cssSelector("img[alt='Cart']");
	By ClickOnProceedToCheckout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	
	public void searchProductinMainPage(String prodshortnam)
	{
		driver.findElement(search).sendKeys(prodshortnam);
	}
	
	public String returnSearchRestult()
	{
		return driver.findElement(mainPageprodname).getText();
	 
	}
	
	public void ClickOnOfferLink()
	{
		driver.findElement(clickOnofferLink).click();
	}
	public void IncreasItemQuantity(int numOfItem)
	{
		for (int i=1;i<=numOfItem;i++)
		{
			driver.findElement(increaseItem).click();
		}
	}
	public void ClickOnAddToCart()
	{
		driver.findElement(AddToCart).click();
	}
	
	public void proceedToCheckout()
	{
		driver.findElement(CartButton).click();
		driver.findElement(ClickOnProceedToCheckout).click();
	}
}

