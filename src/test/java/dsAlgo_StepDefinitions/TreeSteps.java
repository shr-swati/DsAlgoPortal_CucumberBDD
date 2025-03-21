package dsAlgo_StepDefinitions;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Table.Cell;

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
			 //driver = new ChromeDriver();
			String[] credentials = tryeditor.excelTryEditor(sheetName, rowNumber);
			treePage.code_txtarea.sendKeys(credentials[0]);
	        treePage.ClickRun();


	//check code to fix indentation	
			 // Ensure that the code is not null or empty
//		    if (credentials != null && credentials.length > 0 && credentials[0] != null && !credentials[0].isEmpty()) {
//
//		        // Clear the text area before entering code
//		        new Actions(driver)
//		            .keyDown(Keys.CONTROL)  // For Windows, use CONTROL, for Mac use COMMAND
//		            .sendKeys("a")          // Select all text in the text area
//		            .sendKeys(Keys.DELETE)  // Delete the selected text
//		            .keyUp(Keys.CONTROL)    // Release the CONTROL key
//		            .perform();
//
//		        // Process the python code
//		        String code = credentials[0];
//		      
//		        // Loop through the code and send it to the text area
//		        for (int i = 0; i < code.length(); i++) {
//		            char currentChar = code.charAt(i);
//
//		            if (currentChar == '\b') {  // Check if the character is a backspace
//		                treePage.code_txtarea.sendKeys(Keys.BACK_SPACE);  // Send backspace key
//		            } else {
//		                treePage.code_txtarea.sendKeys(String.valueOf(currentChar));  // Send current character
//		               // treePage.code_txtarea.sendKeys(Keys.RETURN);  // Press Enter after each character (if needed)
//		            }
//		        }
//
//		        // Wait for a few seconds (you can adjust this or remove it)
		      

		        // Click the Run button to execute the code
		    
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
		public void the_user_should_be_able_to_receive_an_alert_message_from_excel_sheet_and(String sheetName, Integer rowNumber) throws IOException{
			
			 treePage.runButtonWithAlert();
			 String expectedResult = tryeditor.excelTryEditor(sheetName, rowNumber)[1]; 
			    treePage.ClickRun();

			    treePage.verifyAlertResult(expectedResult); // Calling the verify method from the page object

}
		//Scenario 13
		
		@When("The user try to click on the browser back button")
		public void the_user_try_to_click_on_the_browser_back_button() {
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
			treePage.ClickTerminologies();
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
//Sceanrio 23
	

		@Then("The user should be able to navigate to the previous page from the try here page ie, Terminologies page")
		public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_terminologies_page() {
			the_user_should_able_to_redirect_to_the_terminologies_page();
		}
//scenario24
		
		@When("The user clicks on the link Types of Trees on the Tree page")
		public void the_user_clicks_on_the_link_types_of_trees_on_the_tree_page() {
			treePage.ClickTypes_of_Trees();
		}

		@Then("The user should redirect to the Types of Trees page")
		public void the_user_should_redirect_to_the_types_of_trees_page() {
			String Types_of_Trees = DriverFactory.getDriver().getTitle();
			 Assert.assertEquals("Types of Trees", Types_of_Trees); 
		}
//scenario 25
		@Given("The user is on the Types of Trees page")
		public void the_user_is_on_the_types_of_trees_page() throws IOException {
			the_user_is_on_the_tree_page();
			the_user_clicks_on_the_link_types_of_trees_on_the_tree_page();
		}

		@When("The user clicks on the button Try here >>> from the Types of Trees page")
		public void the_user_clicks_on_the_button_try_here_from_the_types_of_trees_page() {
		   treePage.ClickTry_here();
		}
//scenario 26,27
		@Given("The user is on the try here textarea of Types of Trees page")
		public void the_user_is_on_the_try_here_textarea_of_types_of_trees_page() throws IOException {
			the_user_is_on_the_types_of_trees_page();
			treePage.ClickTry_here();
		}
//Scenario 33
		@Then("The user should be able to navigate to the previous page from the try here page ie, Types of Trees page")
		public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_types_of_trees_page() {
			the_user_should_redirect_to_the_types_of_trees_page();
		}

//new scnarios
		
		//Scenario 34
@When("The user clicks on the link Tree Traversals on the Tree page")
public void the_user_clicks_on_the_link_tree_traversals_on_the_tree_page() {
	treePage.ClickTree_Traversals();
}

@Then("The user should redirect to the Tree Traversals page")
public void the_user_should_redirect_to_the_tree_traversals_page() {
	String Tree_Traversals = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Tree Traversals", Tree_Traversals);
}
//Scenario 35

@Given("The user is on the Tree Traversals page")
public void the_user_is_on_the_tree_traversals_page() throws IOException {
	the_user_is_on_the_tree_page();
	treePage.ClickTree_Traversals();
}

@When("The user clicks on the button Try here >>> from the Tree Traversals page")
public void the_user_clicks_on_the_button_try_here_from_the_tree_traversals_page() {
	treePage.ClickTry_here();
}
//Scenario 36
@Given("The user is on the try here textarea of Tree Traversals page")
public void the_user_is_on_the_try_here_textarea_of_tree_traversals_page() throws IOException {
	the_user_is_on_the_tree_traversals_page();
	treePage.ClickTry_here();
}
//Scenario 41
@Then("The user should be able to navigate to the previous page from the try here page ie, Tree Traversals page")
public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_tree_traversals_page() {
	the_user_should_redirect_to_the_tree_traversals_page();
}

@When("The user clicks on the link Traversals-Illustration on the Tree page")
public void the_user_clicks_on_the_link_traversals_illustration_on_the_tree_page() {
    treePage.ClickTraversals_Illustration();
}

@Then("The user should redirect to the Traversals-Illustration page")
public void the_user_should_redirect_to_the_traversals_illustration_page() {
	String Traversals_Illustration = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Traversals-Illustration", Traversals_Illustration);
}

@Given("The user is on the Traversals-Illustration page")
public void the_user_is_on_the_traversals_illustration_page() throws IOException {
	the_user_is_on_the_tree_page();
	treePage.ClickTraversals_Illustration();
}

@When("The user clicks on the button Try here >>> from the Traversals-Illustration page")
public void the_user_clicks_on_the_button_try_here_from_the_traversals_illustration_page() {
   treePage.ClickTry_here();
}

@Given("The user is on the try here textarea of Traversals-Illustration page")
public void the_user_is_on_the_try_here_textarea_of_traversals_illustration_page() throws IOException {
	 the_user_is_on_the_traversals_illustration_page();
	 treePage.ClickTry_here();
	 
}

@Then("The user should be able to navigate to the previous page from the try here page ie, Traversals-Illustration page")
public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_traversals_illustration_page() {
	the_user_should_redirect_to_the_traversals_illustration_page();
}

@When("The user clicks on the link Binary Trees on the Tree page")
public void the_user_clicks_on_the_link_binary_trees_on_the_tree_page() {
    treePage.ClickBinary_Trees();
}

@Then("The user should redirect to the Binary Trees page")
public void the_user_should_redirect_to_the_binary_trees_page() {
	String Binary_Trees = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Binary Trees", Binary_Trees);
}

@Given("The user is on the Binary Trees page")
public void the_user_is_on_the_binary_trees_page() throws IOException {
	the_user_is_on_the_tree_page();
	 treePage.ClickBinary_Trees();
}

@When("The user clicks on the button Try here >>> from the Binary Trees page")
public void the_user_clicks_on_the_button_try_here_from_the_binary_trees_page() {
	treePage.ClickTry_here();
}

@Given("The user is on the try here textarea of Binary Trees page")
public void the_user_is_on_the_try_here_textarea_of_binary_trees_page() throws IOException {
	the_user_is_on_the_binary_trees_page();
	treePage.ClickTry_here();
}

@Then("The user should be able to navigate to the previous page from the try here page ie, Binary Trees page")
public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_binary_trees_page() {
	the_user_should_redirect_to_the_binary_trees_page();
}

@When("The user clicks on the link Types of Binary Trees on the Tree page")
public void the_user_clicks_on_the_link_types_of_binary_trees_on_the_tree_page() {
    treePage.ClickTypes_of_Binary_Trees();
}

@Then("The user should redirect to the Types of Binary Trees page")
public void the_user_should_redirect_to_the_types_of_binary_trees_page() {
	String Types_of_Binary_Trees = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Types of Binary Trees", Types_of_Binary_Trees);
}

@Given("The user is on the Types of Binary Trees page")
public void the_user_is_on_the_types_of_binary_trees_page() throws IOException {
	the_user_is_on_the_tree_page();
	treePage.ClickTypes_of_Binary_Trees();
}

@When("The user clicks on the button Try here >>> from the Types of Binary Trees page")
public void the_user_clicks_on_the_button_try_here_from_the_types_of_binary_trees_page() {
	treePage.ClickTry_here();
}

@Given("The user is on the try here textarea of Types of Binary Trees page")
public void the_user_is_on_the_try_here_textarea_of_types_of_binary_trees_page() throws IOException {
	the_user_is_on_the_types_of_binary_trees_page();
	treePage.ClickTry_here();
}

@Then("The user should be able to navigate to the previous page from the try here page ie, Types of Binary Trees page")
public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_types_of_binary_trees_page() {
	the_user_should_redirect_to_the_types_of_binary_trees_page();
}

@When("The user clicks on the link Implementation in Python on the Tree page")
public void the_user_clicks_on_the_link_implementation_in_python_on_the_tree_page() {
    treePage.ClickImplementation_in_Python();
}

@Then("The user should redirect to the Implementation in Python page")
public void the_user_should_redirect_to_the_implementation_in_python_page() {
	String Implementation_in_Python = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Implementation in Python", Implementation_in_Python);
}

@Given("The user is on the Implementation in Python page")
public void the_user_is_on_the_types_of_implementation_in_python_page() throws IOException {
	the_user_is_on_the_tree_page();
	treePage.ClickImplementation_in_Python();
}

@When("The user clicks on the button Try here >>> from the Implementation in Python page")
public void the_user_clicks_on_the_button_try_here_from_the_types_of_implementation_in_python_page() {
	treePage.ClickTry_here();
}

@Given("The user is on the try here textarea of Implementation in Python page")
public void the_user_is_on_the_try_here_textarea_of_implementation_in_python_page() throws IOException {
	the_user_is_on_the_types_of_implementation_in_python_page();
	treePage.ClickTry_here();
}

@Then("The user should be able to navigate to the previous page from the try here page ie, Implementation in Python page")
public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_implementation_in_python_page() {
	the_user_should_redirect_to_the_implementation_in_python_page();
}
///Undefined scenarios	///
///

@When("The user clicks on the link Binary Tree Traversals on the Tree page")
public void the_user_clicks_on_the_link_binary_tree_traversals_on_the_tree_page() {
    treePage.ClickBinary_Tree_Traversals();
}

@Then("The user should redirect to the Binary Tree Traversals page")
public void the_user_should_redirect_to_the_binary_tree_traversals_page() {
	String Binary_Tree_Traversals = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Binary Tree Traversals", Binary_Tree_Traversals);
}

@Given("The user is on the Binary Tree Traversals page")
public void the_user_is_on_the_binary_tree_traversals_page() throws IOException {
	the_user_is_on_the_tree_page();
	treePage.ClickBinary_Tree_Traversals();
}

@When("The user clicks on the button Try here >>> from the Binary Tree Traversals page")
public void the_user_clicks_on_the_button_try_here_from_the_binary_tree_traversals_page() {
    treePage.ClickTry_here();
}

@Given("The user is on the try here textarea of Binary Tree Traversals page")
public void the_user_is_on_the_try_here_textarea_of_binary_tree_traversals_page() throws IOException {
	the_user_is_on_the_binary_tree_traversals_page();
	treePage.ClickTry_here();
}

@Then("The user should be able to navigate to the previous page from the try here page ie, Binary Tree Traversals page")
public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_binary_tree_traversals_page() {
	the_user_should_redirect_to_the_binary_tree_traversals_page();
}

@When("The user clicks on the link Implementation of Binary Trees on the Tree page")
public void the_user_clicks_on_the_link_implementation_of_binary_trees_on_the_tree_page() {
    treePage.ClickImplementation_of_Binary_Trees();
}

@Then("The user should redirect to the Implementation of Binary Trees page")
public void the_user_should_redirect_to_the_implementation_of_binary_trees_page() {
	String Implementation_of_Binary_Trees = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Implementation of Binary Trees", Implementation_of_Binary_Trees);
}

@Given("The user is on the Implementation of Binary Trees page")
public void the_user_is_on_the_implementation_of_binary_trees_page() throws IOException {
	the_user_is_on_the_tree_page();
	treePage.ClickImplementation_of_Binary_Trees();
}

@When("The user clicks on the button Try here >>> from the Implementation of Binary Trees page")
public void the_user_clicks_on_the_button_try_here_from_the_implementation_of_binary_trees_page() {
	treePage.ClickTry_here();
}

@Given("The user is on the try here textarea of Implementation of Binary Trees page")
public void the_user_is_on_the_try_here_textarea_of_implementation_of_binary_trees_page() throws IOException {
	the_user_is_on_the_implementation_of_binary_trees_page();
	treePage.ClickTry_here();
}

@Then("The user should be able to navigate to the previous page from the try here page ie, Implementation of Binary Trees page")
public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_implementation_of_binary_trees_page() {
	the_user_should_redirect_to_the_implementation_of_binary_trees_page();
}

@When("The user clicks on the link Applications of Binary trees on the Tree page")
public void the_user_clicks_on_the_link_applications_of_binary_trees_on_the_tree_page() {
    treePage.ClickApplications_of_Binary_trees();
}

@Then("The user should redirect to the Applications of Binary trees page")
public void the_user_should_redirect_to_the_applications_of_binary_trees_page() {
	String Applications_of_Binary_trees = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Applications of Binary trees", Applications_of_Binary_trees);
}

@Given("The user is on the Applications of Binary trees page")
public void the_user_is_on_the_applications_of_binary_trees_page() throws IOException {
	the_user_is_on_the_tree_page();
	 treePage.ClickApplications_of_Binary_trees();
}

@When("The user clicks on the button Try here >>> from the Applications of Binary trees page")
public void the_user_clicks_on_the_button_try_here_from_the_applications_of_binary_trees_page() {
	treePage.ClickTry_here();
}

@Given("The user is on the try here textarea of Applications of Binary trees page")
public void the_user_is_on_the_try_here_textarea_of_applications_of_binary_trees_page() throws IOException {
	the_user_is_on_the_applications_of_binary_trees_page();
	treePage.ClickTry_here();
}

@Then("The user should be able to navigate to the previous page from the try here page ie, Applications of Binary trees page")
public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_applications_of_binary_trees_page() {
	the_user_should_redirect_to_the_applications_of_binary_trees_page();
}

@When("The user clicks on the link Binary Search Trees on the Tree page")
public void the_user_clicks_on_the_link_binary_search_trees_on_the_tree_page() {
    treePage.ClickBinary_Search_Trees();
}

@Then("The user should redirect to the Binary Search Trees page")
public void the_user_should_redirect_to_the_binary_search_trees_page() {
	String Binary_Search_Trees = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Binary Search Trees", Binary_Search_Trees);
}

@Given("The user is on the Binary Search Trees page")
public void the_user_is_on_the_binary_search_trees_page() throws IOException {
	the_user_is_on_the_tree_page();
	treePage.ClickBinary_Search_Trees();
}

@When("The user clicks on the button Try here >>> from the Binary Search Trees page")
public void the_user_clicks_on_the_button_try_here_from_the_binary_search_trees_page() {
	treePage.ClickTry_here();
}

@Given("The user is on the try here textarea of Binary Search Trees page")
public void the_user_is_on_the_try_here_textarea_of_binary_search_trees_page() throws IOException {
	the_user_is_on_the_binary_search_trees_page();
	treePage.ClickTry_here();
}

@Then("The user should be able to navigate to the previous page from the try here page ie, Binary Search Trees page")
public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_binary_search_trees_page() {
	the_user_should_redirect_to_the_binary_search_trees_page();
}

@When("The user clicks on the link Implementation Of BST on the Tree page")
public void the_user_clicks_on_the_link_implementation_of_bst_on_the_tree_page() {
    treePage.ClickImplementation_Of_BST();
}

@Then("The user should redirect to the Implementation Of BST page")
public void the_user_should_redirect_to_the_implementation_of_bst_page() {
	String Implementation_Of_BST = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Implementation Of BST", Implementation_Of_BST);
}

@Given("The user is on the Implementation Of BST page")
public void the_user_is_on_the_implementation_of_bst_page() throws IOException {
	the_user_is_on_the_tree_page();
	treePage.ClickImplementation_Of_BST();
}

@When("The user clicks on the button Try here >>> from the Implementation Of BST page")
public void the_user_clicks_on_the_button_try_here_from_the_implementation_of_bst_page() {
	treePage.ClickTry_here();
}

@Given("The user is on the try here textarea of Implementation Of BST page")
public void the_user_is_on_the_try_here_textarea_of_implementation_of_bst_page() throws IOException {
	the_user_is_on_the_implementation_of_bst_page();
	treePage.ClickTry_here();
}

@Then("The user should be able to navigate to the previous page from the try here page ie, Implementation Of BST page")
public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_implementation_of_bst_page() {
	the_user_should_redirect_to_the_implementation_of_bst_page();
}

@When("The user clicks on the link Practice Questions on the Tree page")
public void the_user_clicks_on_the_link_practice_questions_on_the_tree_page() {
	treePage.ClickOverview_of_Trees();
    treePage.ClickPractice_Questions();
}

@Then("The user should redirect to the Practice Questions page")
public void the_user_should_redirect_to_the_practice_questions_page() {
	String Practice_Questions = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Practice Questions", Practice_Questions);
}

@Then("The user should able to view the content in Practice Questions page")
public void the_user_should_able_to_view_the_content_in_practice_questions_page() {
    System.out.println("No content in Practice Questions");
}
}


