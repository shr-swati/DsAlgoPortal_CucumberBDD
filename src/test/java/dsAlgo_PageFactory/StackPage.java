package dsAlgo_PageFactory;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_Reader.ExcelReader;
import dsAlgo_Reader.TryEditor;

public class StackPage {

	WebDriver driver = DriverFactory.getDriver();
	ExcelReader readExcel = new ExcelReader();
	TryEditor readTryEditor = new TryEditor();
	String input;
	String output;

	public StackPage() {
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return driver.getTitle();

	}

	@FindBy(xpath = "//a[@href='stack']")
	WebElement stackGetStarted;

	@FindBy(xpath = "//a[normalize-space()='Operations in Stack']")
	WebElement operationInStack;

	@FindBy(xpath = "//a[normalize-space()='Try here>>>']")
	WebElement try_here;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement StackTryEditor;

	@FindBy(xpath = "//button[normalize-space()='Run']")
	WebElement runButton;

	@FindBy(linkText = "Implementation")
	WebElement ImplementationLink;

	@FindBy(linkText = "Applications")
	WebElement ApplicationLink;

	@FindBy(xpath = "//a[normalize-space()='Implementation']")
	WebElement Implementation;

	@FindBy(xpath = "//a[normalize-space()='Applications']")
	WebElement Application;

	@FindBy(xpath = "//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]")
	WebElement codeMirror;

	@FindBy(id = "output")
	WebElement OutputWindow;

	@FindBy(xpath = "//a[text()='Search the Stack']")
	WebElement PracticeQuestionsStack;

	@FindBy(xpath = "//a[normalize-space()='Practice Questions']")
	WebElement PracticeQuestions;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement result;

	public void stackGetStarted() {
		stackGetStarted.click();
	}

	public void operationInStack() {
		operationInStack.click();
	}

	public void tryHereBtn() {
		try_here.click();
	}

	public void stackTryEditor() {
		StackTryEditor.click();
	}

	public void runButton() {
		runButton.click();
	}

	public void Implementation() {
		Implementation.click();

	}

	public void Applications() {
		Application.click();
	}

	public void PracticeQuestions() {
		PracticeQuestions.click();
	}

	public boolean OperationsinStacklinkEnabled() {
		return operationInStack.isEnabled();
	}

	public boolean ImplementationLinkEnabled() {
		return ImplementationLink.isEnabled();
	}

	public boolean ApplicationLinkEnabled() {
		return ApplicationLink.isEnabled();
	}

	public boolean OutputWindowDisplayed() {
		return OutputWindow.isDisplayed();
	}

	public boolean PracticeQuestionsStackDisplayed() {
		return PracticeQuestionsStack.isDisplayed();
	}

	public void tryEditorWindow(String sheetName, int rowNumber) throws IOException, InterruptedException {
		String[] editor = readTryEditor.excelTryEditor(sheetName, rowNumber);
		input = editor[0];
		output = editor[1];

		Actions actions = new Actions(driver);
		actions.moveToElement(codeMirror).click().perform();
		WebElement textArea = codeMirror.findElement(By.xpath(".//textarea"));
		textArea.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		textArea.sendKeys(editor[0]);
		runButton.click();

		try {
			Alert alert = driver.switchTo().alert();
			String get_alert_msg = alert.getText();
			alert.accept();
			System.out.println("Alert Is:" + get_alert_msg);
			System.out.println("Alert message: " + get_alert_msg);
			System.out.println("Expected message: " + output);
			Assert.assertEquals(output, get_alert_msg);
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present: " + e.getMessage());
		}
	}

	public void logResultOutput() {

		String logResultOutput = result.getText();
		System.out.println("Assertion Expected  : " + output);
		System.out.println("Assertion Actual : " + logResultOutput);
		assertTrue(logResultOutput.contains(output));

	}

}
