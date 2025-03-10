package dsAlgo_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListIntroPage {
	WebDriver driver;

	@FindBy(xpath = "//a[@href='//tryEditor']")
	WebElement tryHereButton;

	
	  // Constructor
    public LinkedListIntroPage(WebDriver driver) {
   	 this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	public void clickTryHereButton() {
		String hrefvalue3 = "/tryEditor";
        WebElement selectTryhereBtn = driver.findElement(By.xpath("//a[@href='" + hrefvalue3 + "']"));
        selectTryhereBtn.click();
	}
}
