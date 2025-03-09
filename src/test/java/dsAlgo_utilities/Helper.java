package dsAlgo_utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgo_PageFactory.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {
 private static Helper Helper;    
    private static WebDriver driver ;
    public final static int TIMEOUT = 2;
     
    private Helper() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
     }
    public static void openPage(String url) {
        //driver.get("https://dsportalapp.herokuapp.com/");
    	driver.get(url);
    }
    public static String getTitle() {
        return driver.getTitle();
    }
    public static void NavBack() {
     driver.navigate().back();
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public static void setUpDriver() {
        if (Helper==null) {
            Helper = new Helper();
        }
    }
     public static void tearDown() {
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
         Helper = null;
     }
     
     public static String GetUserName() {
      return "userName";
     }
     
     public static String GetPassword() {
      return "password";
     }
     
     public static void naviageToHomePage() {
    	 LoginPage loginPage = new LoginPage(Helper.getDriver());
    	 Helper.openPage("https://dsportalapp.herokuapp.com/");
    	 loginPage.clickGetStarted();
    	 loginPage.clickSignIn();
    	 loginPage.enterUsername("sdet199list");
 		 loginPage.enterPassword("Static123@");
 		loginPage.clickLogin();
     }
	
		
	}


