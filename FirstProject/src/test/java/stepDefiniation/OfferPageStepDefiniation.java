package stepDefiniation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import PageObjects.OfferPageObject;

import io.cucumber.java.en.Then;
import utilis.CommonInfo;
import utilis.GenericFunc;

public class OfferPageStepDefiniation {
	CommonInfo info;
	String offerprodname;
	
	public OfferPageStepDefiniation(CommonInfo info)
	{
		this.info=info;
	}
	

	@Then("^Same product (.+) search in offer page and check it exist$")
	public void same_product_search_in_offer_page_and_check_it_exist(String prodshortnam) throws InterruptedException {
	
		info.genericfunc.switchToChild();
		OfferPageObject offerPageobj = info.pageobjmanagerobj.getOfferPageObj();
		offerPageobj.searchProductinMainPage(prodshortnam);
		Thread.sleep(2000);
		offerprodname = offerPageobj.returnSearchRestult();
		System.out.println(offerprodname);
		
	}
	
	@Then("validate both product")
	public void validate_both_product()
	{
				Assert.assertEquals(offerprodname, info.mainProductName);
	}
}
