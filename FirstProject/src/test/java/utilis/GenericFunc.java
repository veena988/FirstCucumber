package utilis;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericFunc {
	public WebDriver driver;
	
	public GenericFunc(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void switchToChild()
	{
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
	}

}
