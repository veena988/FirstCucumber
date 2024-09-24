package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions",monochrome=true,plugin= {"pretty","html:target/cucmber.html","json:target/cucumber.json"})
//@CucumberOptions(features="src/test/java/features",glue="stepDefinitions",monochrome=true,tags="@Regression or @Smoke")

public class TestNGRunner extends AbstractTestNGCucumberTests {

}
