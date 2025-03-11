package dsAlgo_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import dsAlgo_utilities.Helper;

public class RegistrationPage {
	WebDriver driver;

	@FindBy(className = "btn")
	WebElement getStartedButton;

	@FindBy(linkText = "NumpyNinja")
	WebElement getTitle;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement registerLink;

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password1")
	WebElement password;

	@FindBy(name = "password2")
	WebElement confirmPassword;

	@FindBy(xpath = "//input[@value='Register']")
	WebElement registerButton;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement loginLink;
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElement registerAlert;
	

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickGetStarted() {
		getStartedButton.click();
	}

	public void clickRegister() {
		registerLink.click();
	}

	public void enterUsername(String userN) {
		username.sendKeys(userN);
	}

	public void enterPassword(String passW) {
		password.sendKeys(passW);
	}

	public void enterConfirmPassword(String confirmPW) {
		confirmPassword.sendKeys(confirmPW);
	}

	public void clickRegisterButton() {
		registerButton.click();
	}

	public void clickLoginLink() {
		loginLink.click();
	}

	 public String getAlert() {
	 return registerAlert.getText();
	 }

}
