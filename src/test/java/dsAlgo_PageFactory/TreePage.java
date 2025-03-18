package dsAlgo_PageFactory;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_Reader.ConfigReader;
import freemarker.template.utility.DateUtil;

public class TreePage {
	 
	 WebDriver driver= DriverFactory.getDriver();
		ConfigReader configFileReader=DriverFactory.configReader();
	   	  
	  @FindBy(xpath="//a[text()='Data Structures']")
	  @CacheLookup 
	  WebElement Data_structure;
	  
	  @FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[5]")
	  @CacheLookup
	  WebElement ds_tree;
	  
	  @FindBy(xpath="/html/body/div[2]")
	  @CacheLookup
	  WebElement login_msg;
	  
	  @FindBy(xpath="/html/body/div[3]/div[6]/div/div/h5")
	  @CacheLookup
	  WebElement tree_title;
	  
	  @FindBy(xpath="//a[@href='tree']")
	  @CacheLookup
	  WebElement tree_getStarted_btn;
	  
	  @FindBy(xpath="//a[text()='Sign in']")
	  @CacheLookup
	  WebElement signin;
	  
	  @FindBy(id="id_username")
	  @CacheLookup
	  WebElement username;
	  
	  
	  @FindBy(id ="id_password")
	  @CacheLookup
	  WebElement password;
	  
	  	  
	  @FindBy(xpath="/html/body/div[2]/div/div[2]/form/input[4]")
	  @CacheLookup
	  WebElement login_btn; 
	  
	  @FindBy(xpath="/html/body/div[2]/ul[1]/a")
	  @CacheLookup
	  WebElement Overview_of_Trees; 
	  
	  @FindBy(xpath="/html/body/div[2]/ul[2]/a")
	  @CacheLookup
	  WebElement Terminologies; 
	  
	  @FindBy(xpath="/html/body/div[2]/ul[3]/a")
	  @CacheLookup
	  WebElement Types_of_Trees; 
	  
	  @FindBy(xpath="/html/body/div[2]/ul[4]/a")
	  @CacheLookup
	  WebElement Tree_Traversals; 
	  
	  @FindBy(xpath="/html/body/div[2]/ul[5]/a")
	  @CacheLookup
	  WebElement Traversals_Illustration; 
	  
	  @FindBy(xpath="/html/body/div[2]/ul[6]/a")
	  @CacheLookup
	  WebElement Binary_Trees; 
	  
	  @FindBy(xpath="/html/body/div[2]/ul[7]/a")
	  @CacheLookup
	  WebElement Types_of_Binary_Trees; 
	  
	  @FindBy(xpath="/html/body/div[2]/ul[8]/a")
	  @CacheLookup
	  WebElement Implementation_in_Python; 
	  
	  @FindBy(xpath="/html/body/div[2]/ul[9]/a")
	  @CacheLookup
	  WebElement Binary_Tree_Traversals; 
	  
	  @FindBy(xpath="/html/body/div[2]/ul[10]/a")
	  @CacheLookup
	  WebElement Implementation_of_Binary_Trees; 
	  
	  @FindBy(xpath="/html/body/div[2]/ul[11]/a")
	  @CacheLookup
	  WebElement Applications_of_Binary_trees; 
	  
	  @FindBy(xpath="/html/body/div[2]/ul[12]/a")
	  @CacheLookup
	  WebElement Binary_Search_Trees; 
	  
	  @FindBy(xpath="/html/body/div[2]/ul[13]/a")
	  @CacheLookup
	  WebElement Implementation_Of_BST; 
	  
	  
	  	  
	  @FindBy(xpath="//a[text()='Try here>>>']")
	  @CacheLookup 
	  WebElement Try_here; 
	  
	  @FindBy(xpath="//*[@id='answer_form']/div/div/div[1]/textarea")
	  @CacheLookup
	  public WebElement code_txtarea; 
	  
	  @FindBy(xpath="//*[@id='answer_form']/button")
	  @CacheLookup
	  WebElement Run_btn; 
	  
	  @FindBy(xpath="//*[@id=\"output\"]")
	  @CacheLookup
	  WebElement run_txtarea;

	   
	  public TreePage() {
		PageFactory.initElements(driver, this);
			}
	        
	    	 
	  public void ClickDS() {
		  Data_structure.click();
		}
	  
	  public void ClickDS_Tree() {
		  ds_tree.click();
		  
	  }
	  	  
	  public String getmsg() {
	    return login_msg.getText();  
	  }
	  
	  public void ClickGetStarted() {
		  tree_getStarted_btn.click();

		  }

	  public void ClickSignin() {
		  signin.click();
		}
		 
	  public void ClickOverview_of_Trees() {
		  Overview_of_Trees.click();
		
	  }
	  public void ClickTerminologies() {
		  Terminologies.click();
		
	  }
	  public void ClickTypes_of_Trees() {
		  Types_of_Trees.click();
		
	  }
	  public void ClickTree_Traversals() {
		  Tree_Traversals.click();
		
	  }
	  public void ClickTraversals_Illustration() {
		  Traversals_Illustration.click();
		
	  }
	  public void ClickBinary_Trees() {
		  Binary_Trees.click();
		
	  }
	  public void ClickTypes_of_Binary_Trees() {
		  Types_of_Binary_Trees.click();
		
	  }
	  public void ClickImplementation_in_Python() {
		  Implementation_in_Python.click();
		
	  }
	  public void ClickBinary_Tree_Traversals() {
		  Binary_Tree_Traversals.click();
		
	  }
	  public void ClickImplementation_of_Binary_Trees() {
		  Implementation_of_Binary_Trees.click();
		
	  }
	  public void ClickApplications_of_Binary_trees() {
		  Applications_of_Binary_trees.click();
		
	  }
	  public void ClickBinary_Search_Trees() {
		  Binary_Search_Trees.click();
		
	  }
	  public void ClickImplementation_Of_BST() {
		  Implementation_Of_BST.click();
		
	  }

	  public void ClickTry_here() {
		  Try_here.click();
		
	  }
	  
	  public String getResultText() {
	        return run_txtarea.getText();
	    }

	
	  public void ClickRun() {
		  Run_btn.click();
	  }
	  public void runButtonWithAlert() {
		  try {
				 
			  Alert alert = driver.switchTo().alert();
			  String get_alert_msg=alert.getText();
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
		  String actualResult= getResultText();
	        if (actualResult.equals(expectedResult)) {
	            System.out.println("Test Passed: The actual result matches the expected result.");
	        } else {
	            System.out.println("Test Failed: The actual result does not match the expected result.");
	            System.out.println("Expected Result: " + expectedResult);
	            System.out.println("Actual Result: " + actualResult);
	        }
	       // assertEquals("The actual result does not match the expected result!", expectedResult, actualResult);
	        //assertTrue(actualResult.contains(expectedResult);
	    }

}
	
	 




