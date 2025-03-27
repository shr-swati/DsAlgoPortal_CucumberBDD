package dsAlgo_Hooks;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_Reader.ConfigReader;
import dsAlgo_Reader.LoggerReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {
	
    private static WebDriver driver;
	ConfigReader configFileReader = new ConfigReader();
	
    @Before
    public void setup() {	
    	String browser = ConfigReader.getBrowser();
    	LoggerReader.info("Initializing driver for: " + browser);
    	if (browser==null) {
			browser = ConfigReader.getBrowser();
	    	LoggerReader.info("Initializing driver for: " + browser);
    	}
    	else {
			driver = DriverFactory.initDriver(browser);
			driver.get(ConfigReader.getApplicationUrl());
	    	LoggerReader.info("Initializing driver for: " + browser);
    	}
    }
    
	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			LoggerReader.error("Steps Failed , Taking Screenshot");
			TakesScreenshot screenshotTaker = (TakesScreenshot) driver;
			final byte[] screenshot = screenshotTaker.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.addAttachment("Myscreenshot",
					new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		}
	}
	
    @After
    public static void teardown() throws Throwable {   
        if (driver != null) {
        	LoggerReader.info("Closing browser after all tests");
            DriverFactory.quitDriver();
        }
    }
}