package dsAlgo_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//h4[text()='Array']")
	WebElement array_displayTitle;
	
    @FindBy(xpath="//a[@href='array']")  
    WebElement arrayGetStartedBtn;
    
    @FindBy(xpath = "//a[normalize-space()='Try here>>>']")
	WebElement try_here_ArrayInPython;
    
    @FindBy(xpath="//a[normalize-space()='Arrays in Python']")  
    WebElement arrayInPython;
        
    @FindBy (xpath="//form[@id='answer_form']/div/div/div/textarea")
    WebElement text_area;
    
    @FindBy (xpath="//button[text()='Run']") WebElement RunButton;
    
    @FindBy (xpath="//pre[@id='output']") WebElement result;
    
  
    public ArrayPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    

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
		text_area.sendKeys("print(\"hello\"); ");
	}
	
	public void runButtonClick() {
		RunButton.click();
	}
	
	public void resultOutput() {
		String resultOutput = result.getText();
		if (resultOutput.equalsIgnoreCase("hello")) {
		System.out.println("Passed" +resultOutput);
		}
	}
	
}
