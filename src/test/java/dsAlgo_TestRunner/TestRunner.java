package dsAlgo_TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src/test/resources/features"},
		glue = {"dsAlgo_StepDefinition", "dsAlgo_Hooks"},
		monochrome=true,
		plugin = {"pretty", "html:target/cucumber1.html",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"com.aventstack.chaintest.plugins.ChainTestCucumberListener:"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
	  
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
}
	


