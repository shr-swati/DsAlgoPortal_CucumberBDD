package dsAlgo_PageFactory;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_Reader.ConfigReader;

public class LoginPage {

	WebDriver driver= DriverFactory.getDriver();
	ConfigReader configFileReader=DriverFactory.configReader();
	
	@FindBy ( linkText = "Sign in") WebElement signIn;
	@FindBy(name = "username") public WebElement userName;
	@FindBy(name = "password") public WebElement passWord;
	@FindBy ( xpath = "//input[@value='Login']") WebElement loginButton;
	@FindBy ( xpath = "//div[contains(text(),'logged in')]") WebElement loggedInMessage;
	@FindBy ( xpath = "//div[contains(text(),'successfully')]") WebElement loggedOutMessage;
	@FindBy ( xpath = "//div[contains(text(),'Invalid')]") WebElement invalidMessage;
	@FindBy ( xpath = "//a[text()='Sign out']") WebElement signOut;
			
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean signInDisplayed() {
		return signIn.isDisplayed();
	}
	
	public void LoginBtnClick() {
	loginButton.click();
	}
	
	public void clickSignIn() {
		signIn.click();
	}
	
	public void clickSignOut() {
		signOut.click();
	}

	public boolean signOutDisplayed() {
		return signOut.isDisplayed();
	}
	
	public void LoggedMessageSignIn(String loggedInMsg) {
		String verifyLogMessage = loggedInMessage.getText();
		assertTrue(verifyLogMessage.contains(loggedInMsg));    
	}
	
	public void LoggedMessageSignOut(String loggedOutMsg) {
		String verifyLogMessage = loggedOutMessage.getText();
		assertTrue(verifyLogMessage.contains(loggedOutMsg));    
	}
		
	public void invalidMessage(String invalidMsg) {
		String verifyLogMessage = invalidMessage.getText();
		assertTrue(verifyLogMessage.contains(invalidMsg));    
	}
	
	public String getPopUpMessage() {
		WebElement activeElement = driver.switchTo().activeElement();
		String actualMessage = activeElement.getDomProperty("validationMessage").trim();
		return actualMessage;
	}

	/*public void doLogin() {
		Helper.openPage("https://dsportalapp.herokuapp.com/");
		clickGetStarted();
		clickSignIn();
		enterUsername("sdet199list");
		enterPassword("Static123@");
		clickLogin();
	}*/
}
