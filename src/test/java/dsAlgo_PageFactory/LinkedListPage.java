package dsAlgo_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPage {
	
	
	 WebDriver driver;
	  
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
     
     
     @FindBy(xpath="//a[@href= 'types-of-linked-list")
     WebElement typesOfLinkedList;
     
     @FindBy(xpath="//a[@href= 'implement-linked-list-in-python']")
     WebElement implementLinkedListInPython;
     
     
     @FindBy(xpath= "//a[@href= 'traversal']")
     WebElement traversal;
     
     @FindBy(xpath= "//a[@href= 'insertion-in-linked-list']")
     WebElement insertion;
     
     @FindBy(xpath= "//a[@href='deletion-in-linked-list']")
     WebElement deletion;
     
     // Constructor
     public LinkedListPage(WebDriver driver) {
    	 this.driver = driver;
         PageFactory.initElements(driver, this);
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

     public void textAreaSendKey() {
 		System.out.println("inside textAreaSendKey");
 		text_area.sendKeys("print(\"hello\"); ");
     }
     public void textAreaInValidSendKey() {
    	 System.out.println("inside textAreaInvalidSendkey");
    	text_area.sendKeys("123abcd$");
     }
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
	public void resultOutput() {
		String resultOutput = result.getText();
		if (resultOutput.equalsIgnoreCase("hello")) {
		System.out.println("Passed" +resultOutput);
		}

	}



	
	}


	
	


	
	


	








	

	
		
	
    	 
	
        
        
     