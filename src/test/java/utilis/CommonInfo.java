package utilis;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjManager;
import stepDefiniation.Hooks;

public class CommonInfo {
	public WebDriver driver;
	public String offerprodname;
	public String mainProductName;
	public String cartProduct;
	public PageObjManager pageobjmanagerobj;
	public DriverManager drivermanager;
	public GenericFunc genericfunc;

	public CommonInfo() throws IOException
	{
		drivermanager = new DriverManager();
		pageobjmanagerobj = new PageObjManager(drivermanager.getdriverManager());
		genericfunc = new GenericFunc(drivermanager.getdriverManager());

	}

}
