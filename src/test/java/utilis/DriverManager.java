package utilis;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	
	public WebDriver driver;
	
	
	public WebDriver getdriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/gobal.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String file = pro.getProperty("QAurl");
		String browser_properties = pro.getProperty("browser");
		String browser_maven = System.getProperty("browser");
		String browser = browser_maven!=null ? browser_maven :browser_properties; // if condition = true, browser_properties,if condition = false, browser_maven 

	if(driver == null)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(file);
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(file);
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	return driver;
	}

}
