package dsAlgo_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPage {
	
	
	 WebDriver driver;
	  
     @FindBy(xpath="//a[@href='linked-list']")
     WebElement getStartedButton;
     
    
     @FindBy(xpath="//a[@href='introduction']")
     WebElement introductionLink;
     
     
   
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
         
    
     }
         
        