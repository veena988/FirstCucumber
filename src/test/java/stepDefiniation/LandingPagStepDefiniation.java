package stepDefiniation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPageObj;
import PageObjects.PageObjManager;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilis.CommonInfo;
import utilis.DriverManager;
import utilis.GenericFunc;

public class LandingPagStepDefiniation {


	//public WebDriver driver;
	//public String offerprodname;
	public String mainProductName;
	CommonInfo info;
	LandingPageObj landingpageobj;
	
	public LandingPagStepDefiniation(CommonInfo info)
	{
		this.info=info;
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		//DriverManager driverManager = new DriverManager();
		//driverManager.getdriverManager();
		
		
		
	}
	@When("^user type short product name in search feild (.+) and exact the search result$")
	public void user_type_short_product_name_in_search_feild_and_exact_the_search_result(String prodshortname) throws InterruptedException {
		landingpageobj = info.pageobjmanagerobj.getLandingPageObj();
		landingpageobj.searchProductinMainPage(prodshortname);
		Thread.sleep(2000);
		String beforTrime =landingpageobj.returnSearchRestult() ;
		info.mainProductName= beforTrime.split("-")[0].trim();
		System.out.println(info.mainProductName);
		landingpageobj.ClickOnOfferLink();
	
	}	

@When("Increase quanity to {int} by click on + and click on add to cart button")
public void increase_quanity_to_by_click_on_and_click_on_add_to_cart_button(Integer int1) {
	landingpageobj.IncreasItemQuantity(3);
	landingpageobj.ClickOnAddToCart();
	
}

@When("click on cart and click on proceed to checkout")
public void click_on_cart_and_click_on_proceed_to_checkout() {
	landingpageobj.proceedToCheckout();
}




	
	
}
