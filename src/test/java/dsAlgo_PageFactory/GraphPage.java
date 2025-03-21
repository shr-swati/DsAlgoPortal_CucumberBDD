package dsAlgo_PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_Reader.ConfigReader;

public class GraphPage {

	WebDriver driver= DriverFactory.getDriver();
	ConfigReader configFileReader=DriverFactory.configReader();
 	  
	  @FindBy(xpath="//a[text()='Data Structures']")
	  @CacheLookup 
	  WebElement Data_structure;
	  
	  @FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[6]")
	  @CacheLookup
	  WebElement ds_graph;
	  
	  @FindBy(xpath="/html/body/div[2]")
	  @CacheLookup
	  WebElement login_msg;
	  
	  @FindBy(xpath="//a[text()='Sign in']")
	  @CacheLookup
	  WebElement signin;
	  
	  @FindBy(xpath="//a[@href='graph']")
	  @CacheLookup
	  WebElement graph_getStarted_btn;
	  
	  @FindBy(xpath="/html/body/div[2]/ul[2]/a")
	  @CacheLookup
	  WebElement graph;
	  
	  @FindBy(xpath="/html/body/div[2]/ul[3]/a")
	  @CacheLookup 
	  WebElement graph_representations;
	  
	  @FindBy(xpath="//*[@id='content']/a")
	  @CacheLookup
	  WebElement practice_question;
	  
	  @FindBy(xpath="/html/body/div[2]/div/div[2]/a")
	  @CacheLookup
	  WebElement try_here;
	  
	  @FindBy(xpath="//*[@id='answer_form']/div/div/div[1]/textarea")
	  @CacheLookup
	  WebElement code_txtarea;
	  
	  @FindBy(xpath="//*[@id='answer_form']/button")
	  @CacheLookup
	  WebElement run_button;
	  
	  
	  
	  public GraphPage() {
		  PageFactory.initElements(driver, this);
	        
	    }
	    
	 
	  public void ClickDS() {
		  Data_structure.click();
		}
	  
	  public void ClickDS_Graph() {
		  ds_graph.click();
		  
	  }
	  public String getmsg() {
		   return login_msg.getText();  
		  }
	  public void ClickGetStarted() {
		  			
		  graph_getStarted_btn.click();

		  }
	  
	  public void Clickgraph() {
		  graph.click();
	  }

	  public void Clickgraph_representations() {
		  graph_representations.click();
		
	  }
	 
	  
		  
	  public void ClickPractice_Questions() {
		  practice_question.click();
	  }

	  public void ClickSignin() {
		  signin.click();
		}
	  public void ClickTry_here() {
		  try_here.click();
		
	  }
	  
	  public String getResultText() {
	        return code_txtarea.getText();
	    }

	  public void ClickRun() {
		  run_button.click();
	  }
	  
	  
public void runButtonWithAlert() {
		  
		  try {
				 
			  Alert alert = driver.switchTo().alert();
			  String get_alert_msg=alert.getText();
			  System.out.println("value in get_alert_msg Is" + get_alert_msg);
		        alert.accept();
		        System.out.println("Alert is:"+get_alert_msg);
		        
		  }
			  catch (NoAlertPresentException e){
			  System.out.println("No alert present");
		  }
		  catch (UnhandledAlertException e){
			  System.out.println("Unhandled alert exception"+e.getMessage());
		  }
		
	  }
	 
	  public void verifyResult(String expectedResult) {
		  
		  String actualResult = getResultText();

		    // Now compare the actual result (from either getResultText or alert) with the expected result
		    if (actualResult != null && actualResult.equals(expectedResult)) {
		        System.out.println("Test Passed: The actual result matches the expected result.");
		    } else {
		        System.out.println("Test Failed: The actual result does not match the expected result.");
		        System.out.println("Expected Result: " + expectedResult);
		        System.out.println("Actual Result: " + actualResult);
		    }
		
		  
	  }
	  
	  public void verifyAlertResult(String expectedResult) {
		  try
		  {
		  Alert alert = driver.switchTo().alert();
		  String get_alert_msg=alert.getText();
		  String actualResult= get_alert_msg;
		  
		  if (actualResult != null && actualResult.equals(expectedResult)) {
	            System.out.println("Test Passed: The actual result matches the expected result.");
	        } else {
	            System.out.println("Test Failed: The actual result does not match the expected result.");
	            System.out.println("Expected Result: " + expectedResult);
	           System.out.println("Actual Result: " + actualResult);
	        }
	       // assertEquals("The actual result does not match the expected result!", expectedResult, actualResult);
	        //assertTrue(actualResult.contains(expectedResult);
		  
		  }
	  catch (NoAlertPresentException e) {
	        System.out.println("Test Failed ,No alert present, The expected alert was not displayed.");
	        // You can optionally log the expected result here as well
	        System.out.println("Expected Result: " + expectedResult);
	    } catch (Exception e) {
	        System.out.println("An error occurred while handling the alert: " + e.getMessage());
	    }
	  }
}
