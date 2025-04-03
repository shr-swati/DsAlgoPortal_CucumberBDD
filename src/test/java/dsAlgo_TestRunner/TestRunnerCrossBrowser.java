package dsAlgo_TestRunner;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

//import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_Reader.ConfigReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/resources/features", glue = { "dsAlgo_StepDefinitions",
				"dsAlgo_Hooks" }, monochrome = true, plugin = { "pretty", "html:target/cucumber1.html",
						"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						 })

public class TestRunnerCrossBrowser extends AbstractTestNGCucumberTests {
	@BeforeTest
	@Parameters({ "browser" })
	public void defineBrowser(@Optional("chrome") String browser) throws IOException {
		ConfigReader.browserfromconfigfile();
	}

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}