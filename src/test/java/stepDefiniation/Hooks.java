package stepDefiniation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utilis.CommonInfo;

public class Hooks {
	CommonInfo info;
	
	public Hooks(CommonInfo info)
	{
		this.info=info;
	}
	
	
	@After
	public void AfterScenario() throws IOException
	{
		info.drivermanager.getdriverManager().quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver = info.drivermanager.getdriverManager();
		if(scenario.isFailed())
		{
			File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent = FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(filecontent, "image/png", "img");
			
		}
	}

}
