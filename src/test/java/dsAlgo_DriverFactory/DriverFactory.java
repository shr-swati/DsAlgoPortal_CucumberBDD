package dsAlgo_DriverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import dsAlgo_Reader.ConfigReader;
import dsAlgo_Reader.LoggerReader;

public class DriverFactory {

	
	public static WebDriver driver;
	public static  ConfigReader configFileReader = new ConfigReader();
	private static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>() ;
	
	@Parameters("browser") 
	public static WebDriver initDriver(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			LoggerReader.info("Testing on firefox");
			tldriver.set(new FirefoxDriver());
		} else if (browser.equalsIgnoreCase("chrome")) {
			LoggerReader.info("Testing on chrome");
			tldriver.set(new ChromeDriver());
		} else if (browser.equalsIgnoreCase("edge")) {
			LoggerReader.info("Testing on Edge");
			tldriver.set(new EdgeDriver());
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return getDriver();
	}
	
	public static WebDriver getDriver() {
		return tldriver.get();
	}
	
	public static void quitDriver() throws Throwable {
		if (tldriver.get() != null) {
			tldriver.get().quit();
			tldriver.remove();
		}
	}
	
	public static ConfigReader configReader() {
		return configFileReader;
	}
}