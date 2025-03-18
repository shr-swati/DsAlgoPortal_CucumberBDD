package dsAlgo_StepDefinitions;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import dsAlgo_DriverFactory.DriverFactory;

import dsAlgo_PageFactory.HomePage;
import dsAlgo_PageFactory.LoginPage;

import dsAlgo_PageFactory.TreePage;

import dsAlgo_Reader.ExcelReader;

import dsAlgo_Reader.TryEditor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeSteps {

	WebDriver driver;
	TreePage treePage = new TreePage();
	HomePage homePage = new HomePage();
	LoginPage loginPage=new LoginPage();
	  ExcelReader readExcel = new ExcelReader();
	  TryEditor tryeditor =new TryEditor();
	
	
	//Scenario1 
	@Given("The user is on the Home page {string}")
	public void the_user_is_on_the_home_page(String url) {
		
		homePage.launchURL();
		homePage.getStartedHomeBtnClick();
		
		}

	@When("The user selects {string} from the drop down without Sign in.")
	public void the_user_selects_from_the_drop_down_without_sign_in(String string) {
		homePage.dataStructureDropDownClick();
		homePage.treeBtnClick();
	}

	@Then("The user should able to see an warning message {string}")
	public void the_user_should_able_to_see_an_warning_message(String string) {
		loginPage.LoggedMessageSignIn("You are not logged in");
		String homeText = homePage.getHomeLogMessage(); 
		assertEquals("You are not logged in", homeText); 
	}

	//Scenario2
	
	@When("The user clicks Get Started buttons of Tree on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_tree_on_the_homepage_without_sign_in() {
		
		treePage.ClickGetStarted();
			
	}
	
	//Scenario3
	@When("The user gets data from excel sheet {string} and {int} for the login page and clicks Get Started button")
	public void the_user_gets_data_from_excel_sheet_and_for_the_login_page_and_clicks_get_started_button(String sheetName, Integer rowNumber) throws IOException {
		treePage.ClickSignin();
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
	    loginPage.userName.sendKeys(credentials[0]);
		loginPage.passWord.sendKeys(credentials[1]);
		loginPage.LoginBtnClick();   
		treePage.ClickGetStarted();

	}


	@Then("The user should able to redirect to the tree page")
public void the_user_should_able_to_redirect_to_the_tree_page() {
		
		
		String TreePgTitle = DriverFactory.getDriver().getTitle();
		 Assert.assertEquals("Tree", TreePgTitle);
	
}
	//Scenario4
	
	@Given("The user is on the Tree page")
	public void the_user_is_on_the_tree_page() throws IOException {
		the_user_is_on_the_home_page("https://dsportalapp.herokuapp.com");
		homePage.getStartedHomeBtnClick();
		String sheetName = "Valid_Login"; // Define the sheet name
		Integer rowNumber = 1; // Define the row number
		the_user_gets_data_from_excel_sheet_and_for_the_login_page_and_clicks_get_started_button(sheetName,rowNumber);

	}
	@When("The user clicks on the link Overview of Trees")
	public void the_user_clicks_on_the_link_overview_of_trees() {
		
		treePage.ClickOverview_of_Trees();
	}

	@Then("The user should able to redirect to the Overview of Trees page")
	public void the_user_should_able_to_redirect_to_the_overview_of_trees_page() {
		
		String Overview_of_TreesPgTitle = DriverFactory.getDriver().getTitle();
		 Assert.assertEquals("Overview of Trees", Overview_of_TreesPgTitle);
	
	}
	//Scenario5
		@Given("The user is on the Overview of Trees page")
		public void the_user_is_on_the_page() throws IOException {
			the_user_is_on_the_tree_page();
			treePage.ClickOverview_of_Trees();
			
		}

		@When("The user clicks on the button Try here >>> from the Overview of Trees page after getting in the Tree page")
		public void the_user_clicks_on_the_button_from_the_page_after_getting_in_the_page() {
			treePage.ClickTry_here();
		}

		@Then("The user should able to redirect to a new page with text area for trying the code")
		public void the_user_should_able_to_redirect_to_a_new_page_with_text_area_for_trying_the_code() {
		    //no title for the page
		}

	//Scenario6,7
		@Given("The user is on the try here textarea of Overview of Trees page")
		public void the_user_is_on_the_try_here_textarea_of_overview_of_trees_page() throws IOException {
			the_user_is_on_the_page();
			
			treePage.ClickTry_here();
		}

		@When("The user gets python code from excel sheet {string} and {int} for the tryeditor and click run button")
		public void the_user_gets_python_code_from_excel_sheet_and_for_the_tryeditor_and_click_run_button(String sheetName, Integer rowNumber) throws IOException {
			
			String[] credentials = tryeditor.excelTryEditor(sheetName, rowNumber);
		    treePage.code_txtarea.sendKeys(credentials[0]);
		   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   treePage.ClickRun();
		
		}

		@Then("The user should able to get the result from excel sheet {string} and {int}")
		public void the_user_should_able_to_get_the_result_from_excel_sheet(String sheetName, Integer rowNumber) throws IOException {
		
			String expectedResult = tryeditor.excelTryEditor(sheetName, rowNumber)[1]; 
		    treePage.verifyResult(expectedResult); // Calling the verify method from the page object
			
				
		}
		
		//Scenario8.9.10.11.12
		
		@When("I enter the code from excel sheet {string} and {int}")
		public void i_enter_the_code_from_excel_sheet_and(String sheetName, Integer rowNumber) throws IOException {
			String[] credentials = tryeditor.excelTryEditor(sheetName, rowNumber);
		    treePage.code_txtarea.sendKeys(credentials[0]);
		    treePage.ClickRun();
		}
		@Then("The user should be able to receive an alert message from excel sheet {string} and {int}")
		public void the_user_should_be_able_to_receive_an_alert_message_from_excel_sheet_and(String sheetName, Integer rowNumber){
			
			 treePage.runButtonWithAlert();

}
		//Scenario 13
		
		@When("The user try to click on the browser back button from the tryeditor page")
		public void the_user_try_to_click_on_the_browser_back_button_from_the_tryeditor_page() {
			DriverFactory.getDriver().navigate().back();
		   
		}

		@Then("The user should be able to navigate to the previous page from the try here page ie, Overview of Trees page")
		public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_overview_of_trees_page() {
			String Overview_of_TreesPgTitle = DriverFactory.getDriver().getTitle();
			 Assert.assertEquals("Overview of Trees", Overview_of_TreesPgTitle);
		}


		//Starting of Terminologies

		//Scenario 14
		@When("The user clicks on the link Terminologies on the Tree page after Sign in")
		public void the_user_clicks_on_the_link_terminologies_on_the_tree_page_after_sign_in() throws IOException {
			
			treePage.ClickTerminologies();
		}

		@Then("The user should able to redirect to the Terminologies page")
		public void the_user_should_able_to_redirect_to_the_terminologies_page() {
			String TerminologiesPgTitle = DriverFactory.getDriver().getTitle();
			 Assert.assertEquals("Terminologies", TerminologiesPgTitle); 
		}
//Scenario 15
		@Given("The user is on the Terminologies page")
		public void the_user_is_on_the_terminologies_page() throws IOException {
			the_user_is_on_the_tree_page();
			the_user_clicks_on_the_link_terminologies_on_the_tree_page_after_sign_in();
		}

		@When("The user clicks on the button Try here >>> from the Terminologies page")
		public void the_user_clicks_on_the_button_try_here_from_the_terminologies_page() {
		   treePage.ClickTry_here();
		}
//Scenario16,17
		@Given("The user is on the try here textarea of Terminologies page")
		public void the_user_is_on_the_try_here_textarea_of_terminologies_page() throws IOException {
			the_user_is_on_the_terminologies_page();
			treePage.ClickTry_here();
			
		}

}
	

