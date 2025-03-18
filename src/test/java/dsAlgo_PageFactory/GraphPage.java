package dsAlgo_PageFactory;

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
	  
	  @FindBy(xpath="/html/body/div[2]/div[7]/div/div/a")
	  @CacheLookup
	  WebElement graph_getStarted_btn;
	  
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
		  
}
