package dsAlgo_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {
	

	 WebDriver driver;
	  
    @FindBy(xpath="//a[@href='queue']")
    @CacheLookup
    WebElement getStartedButton;
    
   
    @FindBy(xpath="//a[@href='implementation-lists']")
    @CacheLookup
    WebElement ImplementationOfQueueInPythonLink;
    
    @FindBy(xpath = "//a[normalize-space()='Try here>>>']")
   	WebElement tryHereBtnImplementationOfQueueInPython ;
    
    @FindBy(xpath= "//form[@id='answer_form']/div/div/div/textarea")
    WebElement text_area;
    
    @FindBy(xpath="//button[text()='Run']")
    WebElement RunButton;
    
    
    @FindBy (xpath="//pre[@id='output']")
    WebElement result;
       
    @FindBy(xpath= "//a[@href='implementation-collections'")
    WebElement implementationUsingCollectionsDeque;
    
    @FindBy(xpath= "//a[@href='implementation-array")
    WebElement implementationUsingArray;
    
    @FindBy(xpath= "//a[@href='QueueOp")
    WebElement queueOperations;
    // Constructor
    public QueuePage(WebDriver driver) {
   	 this.driver = driver;
        PageFactory.initElements(driver, this);
        
    }
        public void clickGetStartedButton() {
        getStartedButton.click();
        
        }    
        public  void clickImplementationOfQueueInPythonLink() {
        	ImplementationOfQueueInPythonLink.click();
        }
		public void goToQueuePage() {
			clickGetStartedButton();
			
		}
        
		public void tryHereBtnImplementationOfQueueInPython() {
			
			tryHereBtnImplementationOfQueueInPython.click();
					
	     }

	     public void textAreaSendKey() {
	 		
	 		System.out.println("inside textAreaSendKey");
	 		text_area.sendKeys("print(\"hello\"); ");
	     }
		public  void runButtonClick() {
			RunButton.click();
			
		}

		public void resultOutput() {
			String resultOutput = result.getText();
			if (resultOutput.equalsIgnoreCase("hello")) {
			System.out.println("Passed" +resultOutput);
			}
		}
}
