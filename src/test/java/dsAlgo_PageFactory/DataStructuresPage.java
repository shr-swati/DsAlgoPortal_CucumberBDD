package dsAlgo_PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_Reader.ConfigReader;
import dsAlgo_Reader.LoggerReader;

public class DataStructuresPage {

	WebDriver driver = DriverFactory.getDriver();
	ConfigReader configFileReader = DriverFactory.configReader();

	String pagetitle;
	protected boolean practicequestioncontent;

	@FindBy(linkText = "Sign in")
	WebElement signin;
	@FindBy(name = "username")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement Login;
	@FindBy(linkText = "Get Started")
	public WebElement dsGetstarted;

	@FindBy(xpath = "/html/body/div[2]/h4")
	public WebElement firstds_dsGetstarted;

	@FindBy(xpath = "//a[@href='data-structures-introduction']")
	public WebElement ds_dsGetstarted;

	@FindBy(xpath = "//h4[normalize-space()='Data Structures-Introduction']")
	WebElement pageTitle;
	@FindBy(xpath = "//a[normalize-space()='Time Complexity']")
	WebElement TimeComplexity;
	@FindBy(xpath = "//*[@id=\"content\"]/li/a")
	WebElement PracticeQuestion;
	@FindBy(xpath = "//*[@id=\"content\"]/a")
	WebElement practicequescontent;
	@FindBy(linkText = "Try here>>>")
	WebElement Tryhere;
	@FindBy(xpath = "//div[@class='CodeMirror-scroll']")
	WebElement codetextarea;
	@FindBy(xpath = "//button[normalize-space()='Run']")
	WebElement runbutton;
	@FindBy(xpath = "//pre[@id='output']")
	WebElement consoleoutput;

	/*
	 * public String homepage(String uname, String Password) {
	 * PageFactory.initElements(driver, this); signin.click();
	 * username.sendKeys(uname); password.sendKeys(Password); Login.click();
	 * pagetitle = driver.getTitle(); return pagetitle; }
	 */
	public DataStructuresPage() {
		PageFactory.initElements(driver, this);

	}

	public String dspage() {

		dsGetstarted.click();
		pagetitle = driver.getTitle();
		return pagetitle;

	}

//	public String checkpageTitle() {
//
//		String currentpagetitle = driver.getTitle();
//		return currentpagetitle;
//	}
//	

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/strong/p")
	@CacheLookup
	WebElement pgTitle;

	public boolean PgTitleDiaplayed() {
		return pgTitle.isDisplayed();
	}

	public boolean DSPgTitleDiaplayed() {
		return firstds_dsGetstarted.isDisplayed();
	}

	public boolean Run_btnDisplayed() {
		return runbutton.isDisplayed();
	}

	public String getCurrentUrl() {

		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public String clickTimeComplexityLink() {

		TimeComplexity.click();
		pagetitle = driver.getTitle();
		return pagetitle;
	}

	public void clearCodeArea() {
		codetextarea.clear();
	}

	public String getCodeAreaContent() {
		return codetextarea.getText();
	}

	public void PracticeQuestionClick() {
		PracticeQuestion.click();

	}

	public boolean PracticeQuestioncontentcheck() {
		boolean iscontentpresent = practicequescontent.isDisplayed();
		return iscontentpresent;
	}

	public String tryhere() {
		Tryhere.click();
		pagetitle = driver.getTitle();
		return pagetitle;
	}

	public void clickrun() {
		runbutton.click();
	}

	public void entercode(String code) {
		Actions actions = new Actions(driver);
		actions.sendKeys(code).perform();
	}

	public String handlealert() {
		try {
			// Switch to the alert
			Alert alert = driver.switchTo().alert();

			// Get the alert message
			String alertMessage = alert.getText();

			// Log the alert message
			LoggerReader.info("Alert message displayed: " + alertMessage);

			// Assert that the alert message is not null or empty
			Assert.assertNotNull(alertMessage, "The alert message is null. No alert is displayed.");
			Assert.assertFalse(alertMessage.isEmpty(),
					"The alert message is empty. No meaningful message is displayed.");

			// Accept the alert
			alert.accept();

			// Return the alert message
			return alertMessage;
		} catch (NoAlertPresentException e) {
			// Log an error if no alert is present
			LoggerReader.error("No alert was displayed.");
			Assert.fail("No alert was displayed.");
		}

		// Default return in case of an exception (though the method will fail before
		// reaching here)
		return null;
	}

	public String getoutput() {
		String output = consoleoutput.getText();
		return output;
	}

}
