package dsAlgo_StepDefinitions;


import java.io.File;
import java.sql.DriverAction;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import dsAlgo_PageFactory.LinkedListPage;
import dsAlgo_PageFactory.LoginPage;
import dsAlgo_utilities.BaseClass;
import dsAlgo_utilities.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListSteps extends BaseClass {
	LinkedListPage linkedListPage;
	LoginPage loginPage;
	

	@Given("user is on the DsAlgo Home Page")
	public void user_is_on_the_ds_algo_home_page() {
		loginPage = new LoginPage(Helper.getDriver());
		loginPage.doLogin();
	}

	@When("user clicks on Get Started Button under Linked List")
	public void user_clicks_on_get_started_button_under_linked_list() {
		linkedListPage = new LinkedListPage(Helper.getDriver());
		linkedListPage.clickGetStartedButton();
		System.out.println("Linked List Get Started Sucess");
	}

	@Then("user should be able to navigate to Linked List Page")
	public void user_should_be_able_to_navigate_to_linked_list_page() {
		String linkedlistPgTitle = Helper.getTitle();
		Assert.assertEquals("Linked List", linkedlistPgTitle);
	}
	@Given("user is on the Linked List Page")
	public void user_is_on_the_linked_list_page() {
		loginPage = new LoginPage(Helper.getDriver());
		loginPage.doLogin();
		linkedListPage = new LinkedListPage(Helper.getDriver());                           
		linkedListPage.goToLinkedListPage();
	}
	    
	@When("user clicks on Introduction Link")
	public void user_clicks_on_introduction_link() {
		linkedListPage.clickIntroductionLink();
		
	}

	@Then("user should be redirected to Introduction Page")
	public void user_should_be_redirected_to_introduction_page() {
		String introductionPgTitle = Helper.getTitle();
		Assert.assertEquals("Introduction", introductionPgTitle);

	}
		
		@Given("user is navigate to the tryEditor")
		public void user_is_navigate_to_the_try_editor() {
			    loginPage = new LoginPage(Helper.getDriver());
				loginPage.doLogin();	
				linkedListPage = new LinkedListPage(Helper.getDriver());
				linkedListPage.goToLinkedListPage();
				linkedListPage.clickIntroductionLink();
				linkedListPage.tryHereBtnIntroduction();
				
		}

		@When("user enter valid pythoncode")
		public void user_enter_valid_pythoncode() {
			
				  linkedListPage.textAreaSendKey();
				  linkedListPage.runButtonClick();  
				 
		}
		

		@Then("The user checks output in the console output")
		public void the_user_checks_output_in_the_console_output() {
			
			 linkedListPage.resultOutput();
		
		}
		
		@When("user enter invalid pythoncode")
		public void user_enter_invalid_pythoncode() throws InterruptedException {
		   linkedListPage.textAreaInValidSendKey();
		   linkedListPage.runButtonClick();
		   		   
		}
		
		@When("user clicks on ok button")
		public void user_clicks_on_ok_button() throws InterruptedException {
			Thread.sleep(3000);
			Alert alert_box = Helper.getDriver().switchTo().alert();
			 alert_box.accept();
		}
		@When("user clicks on Run Button without entering code")
		public void user_clicks_on_run_button_without_entering_code() {
			  linkedListPage.runButtonClick();
		}
		@Then("user should be able to see an error message in alert window")
		public void user_should_be_able_to_see_an_error_message_in_alert_window() {
		   
		}
		@Given("user is on the tryEditor")
		public void user_is_on_the_try_editor() {
			loginPage = new LoginPage(Helper.getDriver());
			loginPage.doLogin();
			linkedListPage = new LinkedListPage(Helper.getDriver());                           
			linkedListPage.goToLinkedListPage();
		    linkedListPage.clickCreatingLinkedLIst();

			
		}

		@When("user clicks on back browser button")
		public void user_clicks_on_back_browser_button() {
			Helper.NavBack();
			 
		}

		@Then("user should be navigate to Creating Linked List page")
		public void user_should_be_able_to_click_creating_linked_l_ist() {
			
			String creatingLinkedListPgTitle = Helper.getTitle();
			Assert.assertEquals("Linked List",creatingLinkedListPgTitle );
			
}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

