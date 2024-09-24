package stepDefiniation;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.CartPageObj;
import io.cucumber.java.en.Then;
import utilis.CommonInfo;

public class CartPageStepDefiniation {
	CommonInfo info;
	CartPageObj cartPageObj;
	String cartProduct;
	
	public CartPageStepDefiniation(CommonInfo info)
	{
		this.info=info;
	}

	@Then("^verify same item (.+) is available in cart page$")
	public void verify_same_item_is_available_in_cart_page(String item) {
		cartPageObj = info.pageobjmanagerobj.getCartPageObj();
		cartProduct = cartPageObj.verifyProductIsAdded();
		System.out.println(cartProduct);
		 Assert.assertEquals(cartProduct,info.mainProductName );
		 

	}
	@Then("check Apply and proceed button in cart page")
	public void check_apply_and_proceed_button_in_cart_page() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(true,cartPageObj.validatePromotonCode());
		Assert.assertEquals(true,cartPageObj.validatePlaceOrderButton());
		
	}
}
