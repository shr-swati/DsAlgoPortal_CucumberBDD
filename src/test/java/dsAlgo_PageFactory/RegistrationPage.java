package dsAlgo_PageFactory;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import dsAlgo_DriverFactory.DriverFactory;
	import dsAlgo_Reader.ConfigReader;

	public class RegistrationPage {
		
		WebDriver driver= DriverFactory.getDriver();
		ConfigReader configFileReader=DriverFactory.configReader();
		
		@FindBy ( xpath = "//a[text()=' Register ']") WebElement registerLink;	
		@FindBy (id = "id_username") public WebElement userNameRegisterBtn;
		@FindBy (id = "id_password1") public WebElement passwordRegisterBtn;
		@FindBy (id = "id_password2") public WebElement passwordConfirmRegisterBtn;
		@FindBy (xpath = "//input[@type='submit']") WebElement registerBtn;
		@FindBy ( xpath = "//div[contains(text(),'Account Created')]") WebElement successMessage;
		@FindBy ( xpath = "//div[contains(text(),'password_mismatch')]") WebElement invalidMessage;
		
		public RegistrationPage() {
			PageFactory.initElements(driver, this);
		}

		public boolean registerLinkDisplayed() {
			return registerLink.isDisplayed();
		}
		
		public void registerLinkClick() {
			registerLink.click();
		}
		
		public void registerBtnClick() {
			registerBtn.click();
		}
		
		public boolean registerBtnDisplayed() {
			return registerBtn.isDisplayed();
		}
		
		public void userNameRegisterBtnClick() {
			userNameRegisterBtn.click();
		}
		
		public boolean isUsernameEnteredCorrectly() {
		  // Example: Check if the username is non-empty and matches a pattern
		    return userNameRegisterBtn != null && !((CharSequence) userNameRegisterBtn).isEmpty();
		}

		public void passwordRegisterBtnClick() {
			passwordRegisterBtn.click();
		}
		
		public boolean isPasswordEnteredCorrectly() {
			  // Example: Check if the username is non-empty and matches a pattern
			    return passwordRegisterBtn != null && !((CharSequence) passwordRegisterBtn).isEmpty();
			}
		
		public void passwordConfirmRegisterBtnClick() {
			passwordConfirmRegisterBtn.click();
		}
		
		public String invalidMessageDisplayed() {
			return invalidMessage.getText();
		}
		
		public String successMessageDisplayed() {
			 String homeSuccessMessage = successMessage.getText();
			 return homeSuccessMessage;
		}
	}
