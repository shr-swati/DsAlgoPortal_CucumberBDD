package dsAlgo_PageFactory;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_Reader.ConfigReader;

public class LinkedListPage {
	
	 WebDriver driver= DriverFactory.getDriver();
	 ConfigReader configFileReader=DriverFactory.configReader();
	 
	 @FindBy(xpath ="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")
	 //@FindBy("//a[text()='Sign in']")
	  @CacheLookup
	  WebElement signIn;
	 
	  @FindBy(id="id_username")
	  @CacheLookup
	  WebElement username;
	  
	  
	  @FindBy(id ="id_password")
	  @CacheLookup
	  WebElement password;
	  
	
	 
      @FindBy(xpath="//a[@href='linked-list']")
      WebElement getStartedButton;
     
    
     @FindBy(xpath="//a[@href='introduction']")
     WebElement introductionLink;
     
     @FindBy(xpath = "//a[normalize-space()='Try here>>>']")
  	 WebElement try_here_introduction;
      
      @FindBy(xpath= "//form[@id='answer_form']/div/div/div/textarea")
      WebElement text_area;
      
      @FindBy(xpath="//button[text()='Run']")
      WebElement RunButton;
      
      
      @FindBy (xpath="//pre[@id='output']")
      WebElement result;
      
      
      @FindBy(xpath="//a[@href= 'creating-linked-list']")
      WebElement creatingLinkedLIst;
      
      
      @FindBy(xpath="//a[@href= 'types-of-linked-list']")
      WebElement typesOfLinkedList;
      
      @FindBy(xpath="//a[@href= 'implement-linked-list-in-python']")
      WebElement implementLinkedListInPython;
      
      
      @FindBy(xpath= "//a[@href= 'traversal']")
      WebElement traversal;
      
      @FindBy(xpath= "//a[@href= 'insertion-in-linked-list']")
      WebElement insertion;
      
      @FindBy(xpath= "//a[@href='deletion-in-linked-list']")
      WebElement deletion;
     
      
      @FindBy(xpath= "//a[@href='/linked-list/practice']")
      WebElement practiceQuestions;
      
      @FindBy ( xpath = "//a[text()='Sign out']")
      WebElement signOut;
      
      @FindBy ( xpath = "//div[contains(text(),'successfully')]")
      WebElement loggedOutMessage;
      
		
     // Constructor
     public LinkedListPage() {
         PageFactory.initElements(driver, this);
     }
     public void clickSignIn() {
		  signIn.click();
     }
     
     public void clickGetStartedButton() {
     getStartedButton.click();
     
     }    
     public  void clickIntroductionLink() {
    	 introductionLink.click();
     }
     
     public void goToLinkedListPage() {
    	 clickGetStartedButton();
     }
     public void tryHereBtnIntroduction() {
    	 try_here_introduction.click();
     }

    // public void textAreaSendKey() {
 		//System.out.println("inside textAreaSendKey");
 		//text_area.sendKeys("print(\"hello\"); ");
    // }
     public void textAreaSendKey(String input) {
  		System.out.println("inside textAreaSendKey");
  		text_area.sendKeys(input);
      }
    // public void textAreaInValidSendKey() {
    	// System.out.println("inside textAreaInvalidSendkey");
    //	text_area.sendKeys("123abcd$");
    // }
	public  void runButtonClick() {
		RunButton.click();
		
	}
    public  void clickCreatingLinkedLIst() {
	creatingLinkedLIst.click();
    }
    public void clickTypesOfLinkedList() {
	typesOfLinkedList.click();
   }
    public void clickImplementLinkedListInPython() {
	implementLinkedListInPython.click();

   }

    public void clickTraversal() {
	traversal.click();
  }
    public void clickInsertion() {
    insertion.click();
  }

    public void clickDeletion() {
	deletion.click();
  }
	public String resultOutput() {
		String resultOutput = result.getText();
		return resultOutput;

	}
    public void SetUserName(String uName) {
		  username.clear();
		  username.sendKeys(uName);
	  }
	  
	   
	  public void SetPassword(String pwd) {
		  password.clear();
		  password.sendKeys(pwd);
	  }  
	
	 public void clickPracticeQuestions() {
       practiceQuestions.click();
    
     }
	 public void clickSignOut() {
		signOut.click();   
	}
	 public void runButtonwithAlert() {
			try {
				Alert alert = driver.switchTo().alert();
				String get_alert_msg = alert.getText();
				alert.accept();
				System.out.println("Alert is:" + get_alert_msg);
			} catch (NoAlertPresentException e) {
				System.out.println("No alert present");

			} catch (UnhandledAlertException e) {
				System.out.println("Unhandled alert exception" + e.getMessage());
			}
	
}
}
