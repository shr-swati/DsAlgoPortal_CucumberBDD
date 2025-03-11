package dsAlgo_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo_utilities.Helper;

public class LoginPage {
	WebDriver driver;

	@FindBy(className = "btn")
	WebElement getStartedButton;

	@FindBy(linkText = "NumpyNinja")
	WebElement getTitle;

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement passWord;

	@FindBy(linkText = "Sign in")
	WebElement signInLink;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginButton;

	@FindBy(linkText = "Register!")
	WebElement registerLink;

	@FindBy(xpath = "//div[@role='alert']")
	WebElement loginAlert;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickGetStarted() {
		getStartedButton.click();
	}

	public void clickSignIn() {
		signInLink.click();
	}

	public void enterUsername(String uName) {
		userName.sendKeys(uName);
	}

	public void enterPassword(String pwd) {
		passWord.sendKeys(pwd);
	}

	public void clickLogin() {
		loginButton.click();
	}

	public String getAlert() {
		return loginAlert.getText();
	}

	public void doLogin() {
		Helper.openPage("https://dsportalapp.herokuapp.com/");
		clickGetStarted();
		clickSignIn();
		enterUsername("sdet199list");
		enterPassword("Static123@");
		clickLogin();
	}
}
