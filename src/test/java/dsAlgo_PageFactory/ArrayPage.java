package dsAlgo_PageFactory;


import java.io.IOException;
import static org.testng.Assert.assertTrue;
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
import dsAlgo_Reader.LoggerReader;
import dsAlgo_Reader.TryEditor;


public class ArrayPage {
	
	WebDriver driver = DriverFactory.getDriver();
	ExcelReader readExcel = new ExcelReader();
	TryEditor tryeditor_array = new TryEditor();
	String input ;
	String output; 
	
	public ArrayPage() {

		PageFactory.initElements(driver, this);
	}
  
     
	@FindBy(xpath = "//h4[text()='Array']") WebElement array_displayTitle;
	
    @FindBy(xpath="//a[@href='array']")  WebElement arrayGetStartedBtn;
    
    @FindBy(xpath = "//a[normalize-space()='Try here>>>']") WebElement try_here_ArrayInPython;
    
    @FindBy(xpath="//a[normalize-space()='Arrays in Python']")  WebElement arrayInPython;
        
    @FindBy (xpath="//form[@id='answer_form']/div/div/div/textarea") WebElement text_area;
    
    @FindBy (xpath="//button[text()='Run']") WebElement RunButton;
    
    @FindBy (xpath="//pre[@id='output']") WebElement result;
    
    @FindBy (xpath="//a[normalize-space()='Arrays Using List']") WebElement arrayUsingList;
    
    @FindBy (xpath="//a[normalize-space()='Try here>>>']") WebElement tryEditorArrayUsingList;
    
    @FindBy (xpath="//a[normalize-space()='Basic Operations in Lists']") WebElement basicOperationInList;
    
    @FindBy (xpath="//a[normalize-space()='Try here>>>']") WebElement tryEditorBasicOperationInList;
    
    @FindBy (xpath="//a[normalize-space()='Applications of Array']") WebElement applicationOfArray;
    
    @FindBy (xpath="//a[normalize-space()='Try here>>>']") WebElement applicationOfArrayTryEditor;
    
    @FindBy (xpath="//a[normalize-space()='Practice Questions']") WebElement practiceQuestions;
    
    @FindBy (xpath="//a[normalize-space()='Search the array']") WebElement practiceQuestionsSearchTheArray;
    
    @FindBy (xpath="//div[@class='CodeMirror cm-s-default']") WebElement searchTheArray;
    
    @FindBy (name="code") WebElement textBoxEditor; 
    
	@FindBy(xpath = "//button[text()='Run']") WebElement Run_btn_array;
	
	@FindBy(xpath = "//input[@value='Submit']") WebElement SubmitBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Max Consecutive Ones']") WebElement maxConsecutiveOnes;
	
	@FindBy(xpath = "//a[normalize-space()='Find Numbers with Even Number of Digits']") WebElement findEvennumberDigits;
	
	@FindBy(xpath = "//a[contains(text(),'Squares of')]") WebElement squareSortedArray;
	
    
	public void clickArray() {
		arrayGetStartedBtn.click();
    }
	
	public void clickArrayInPython() {
		arrayInPython.click();
    }
	
	public void tryHereBtnArrayInPython() {
		try_here_ArrayInPython.click();
	}
	
	public void textAreaSendKey() {
		
		System.out.println("inside textAreaSendKey");
		text_area.sendKeys(input);
	}
	
	public void textAreaClear() {
		text_area.clear();
	}
	
	public void runButtonClick() {
		RunButton.click();
	}
	
	
	public void arrayUsingList() {
		arrayUsingList.click();
	}
	
	public void tryEditorArrayUsingList() {
		tryEditorArrayUsingList.click();
	}
	
	public void basicOperationInList() {
		basicOperationInList.click();
	}
	
	public void tryEditorBasicOperationInList() {
		tryEditorBasicOperationInList.click();
	}
	
	public void applicationOfArray() {
		applicationOfArray.click();
	}
	
	public void applicationOfArrayTryEditor() {
		applicationOfArrayTryEditor.click();
	}
	public void practiceQuestions() {
		practiceQuestions.click();
	}
	
	public void practiceQuestionsSearchTheArray() {
		practiceQuestionsSearchTheArray.click();
	}
	
	public void textBoxEditor() {
		textBoxEditor.clear();
	}
	
	public boolean NavigateToTryHereBtn() {
		return Run_btn_array.isDisplayed();
	}
	
	public void SubmitBtn() {
		SubmitBtn.click();
	}
	
	public void maxConsecutiveOnes() {
		maxConsecutiveOnes.click();
	}
	
	public void findEvennumberDigits() {
		findEvennumberDigits.click();
	}
	
	public void squareSortedArray() {
		squareSortedArray.click();
	}
	
	public String getOutput() {
		return output;
	}
	
public void resultOutput() {
		
		System.out.println("result.getText() ************** :   " +output);
		
		
		if (output.equalsIgnoreCase("SyntaxError: bad input on line 1")){
			runButtonWithAlert();
		}
		else {
			String resultOutput = result.getText();
			if (resultOutput.equalsIgnoreCase(output)) {
			System.out.println("Passed" +resultOutput);
				}
			
		}
	}
	
	public void readDataFromExcelSheet(String sheetName, int rowNumber) throws IOException, InterruptedException {
		
		String[] editor = readExcel.excelDataRead(sheetName, rowNumber);
		String codeInput = editor[0];
		System.out.println("Code   :   " +codeInput);
		
		input = editor[0];
		output = editor[1];
		System.out.println("input   :   " +input);
		System.out.println("output   :   " +output);
		
		
	}
	
	public void runButtonWithAlert() {
		try {
			
			Alert alert_box = DriverFactory.getDriver().switchTo().alert();
			LoggerReader.info("Alert message: "+alert_box.getText());
			LoggerReader.info("Expected message: "+output);
			System.out.println("Alert message: " +alert_box.getText());
			System.out.println("Expected message: " +output);
			Assert.assertEquals(output, alert_box.getText());
			alert_box.accept();
			
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present:");
		} catch (UnhandledAlertException e) {

			System.out.println("Unhandled alert exception: " + e.getMessage());
		}
	} 
	
	public void readExcelRun(String sheetName, int rowNumber) throws IOException, InterruptedException {

		try {
			String[] editor = tryeditor_array.excelTryEditor(sheetName, rowNumber);
			System.out.println("Inside readExcel_forTryHereArray:");
			output = editor[1];
			WebElement codeMirror = driver.findElement(
					By.xpath("//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(codeMirror).click().perform();
			WebElement textArea = codeMirror.findElement(By.xpath(".//textarea"));
			enterCodePractice(editor[0], textArea);
			
			Run_btn_array.click();

			try {
				Alert alert = driver.switchTo().alert();
				String get_alert_msg = alert.getText();
				alert.accept();
				System.out.println("Alert Is:" + get_alert_msg);
				assertTrue(get_alert_msg.contains(output));
			} catch (NoAlertPresentException e) {
				System.out.println("No alert present:");
			} catch (UnhandledAlertException e) {

				System.out.println("Unhandled alert exception: " + e.getMessage());
			}
		} finally {
			System.out.println("ALert handled###");
		}
	}
	
	
	
	
	public void readExcelSubmit(String sheetName, int rowNumber) throws IOException, InterruptedException {

		try {
			String[] editor = tryeditor_array.excelTryEditor(sheetName, rowNumber);
			System.out.println("Inside readExcel_forTryHereArray:");
			output = editor[1];
			WebElement codeMirror = driver.findElement(
					By.xpath("//div[contains(@class, 'CodeMirror') and contains(@class, 'cm-s-default')]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(codeMirror).click().perform();
			WebElement textArea = codeMirror.findElement(By.xpath(".//textarea"));
			enterCodePractice(editor[0], textArea);
			
			System.out.println("Inside readExcelSubmit: editor[0] : " +editor[0]);
			System.out.println("Inside readExcelSubmit: editor[1] : " +editor[1]);
			SubmitBtn.click();

			try {
				Alert alert = driver.switchTo().alert();
				String get_alert_msg = alert.getText();
				alert.accept();
				System.out.println("Alert Is:" + get_alert_msg);
				assertTrue(get_alert_msg.contains(output));
			} catch (NoAlertPresentException e) {
				System.out.println("No alert present:");
			} catch (UnhandledAlertException e) {

				System.out.println("Unhandled alert exception: " + e.getMessage());
			}
		} finally {
			System.out.println("ALert handled###");
		}
	}
	
	public void enterCodePractice(String code, WebElement textArea) {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).perform();
		String[] str1 = code.split("\n");
		System.out.println("inside enterCodePractice");
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equalsIgnoreCase("\\b")) {
				textArea.sendKeys(Keys.BACK_SPACE);
			} else {
				textArea.sendKeys(str1[i]);
				textArea.sendKeys(Keys.RETURN);
			}
		}
	}
	
	public void logResultOutput() {
		
			String logResultOutput = result.getText();
			System.out.println("Assertion Expected : " +output);
			System.out.println("Assertion Actual : " +logResultOutput);
			assertTrue(logResultOutput.contains(output));
	
	}
	
	
	
}
