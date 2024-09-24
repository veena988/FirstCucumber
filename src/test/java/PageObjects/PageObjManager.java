package PageObjects;

import org.openqa.selenium.WebDriver;

import utilis.DriverManager;
import utilis.GenericFunc;


public class PageObjManager {
	
	public WebDriver driver;
	LandingPageObj landingPageObj;
	OfferPageObject offerpageobj;
	CartPageObj cartPageObj;
	GenericFunc genericfunc;
	
	public PageObjManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public  LandingPageObj getLandingPageObj()
	{
	 landingPageObj = new  LandingPageObj(driver);
		return landingPageObj;
	}
	
	public OfferPageObject getOfferPageObj()
	{
	 offerpageobj = new OfferPageObject(driver);
				return offerpageobj;
	}
	
	public CartPageObj getCartPageObj()
	{
	 cartPageObj = new CartPageObj(driver);
				return cartPageObj;
	}

	
}
