package dsAlgo_StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgo_PageFactory.ArrayPage;
import dsAlgo_PageFactory.HomePage;
import dsAlgo_PageFactory.LoginPage;
import dsAlgo_PageFactory.StackPage;
import dsAlgo_Reader.ExcelReader;
import dsAlgo_Reader.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackSteps {
	
	 HomePage homePage = new HomePage();
	 LoginPage loginPage = new LoginPage();
	 ExcelReader readExcel = new ExcelReader();
		
	WebDriver driver;
	StackPage stackPage = new StackPage();
	
	
	@Given("User is on the Home page of dsalgo portal")
	public void user_is_on_the_home_page_of_dsalgo_portal() {
		LoggerReader.info("User at Stack Home page");
	}

	@When("User clicks on Get Started button in Stack section")
	public void user_clicks_on_get_started_button_in_stack_section() {
		stackPage.stackGetStarted();
	}

	@Then("User navigate to Satck page")
	public void user_navigate_to_satck_page() {
		LoggerReader.info("User at Stack page");
	}
	
	
	@Given("User is in the Stack page after Sign-In and get started")
	public void user_is_in_the_stack_page_after_sign_in_and_get_started() {
		LoggerReader.info("User at Stack page verifying the links are enabled or not");
	}

	@When("User verify all the three links anabled")
	public void user_verify_all_the_three_links_anabled() {
		stackPage.stackGetStarted();		
		
	}

	@Then("User should be able to verify the links successfully")
	public void user_should_be_able_to_verify_the_links_successfully() {	
		Assert.assertEquals(stackPage.OperationsinStacklinkEnabled(), true);
		Assert.assertEquals(stackPage.ImplementationLinkEnabled(), true);
		Assert.assertEquals(stackPage.ApplicationLinkEnabled(), true);
	}
	
	@Given("User is in the Stack page after Sign-In")
	public void user_is_in_the_stack_page_after_sign_in() {
		LoggerReader.info("User at Stack page and navigating to Operaion in stack");	
	}

	@When("User clicks Operations in Stack link in the Stack page")
	public void user_clicks_operations_in_stack_link_in_the_stack_page() {
		stackPage.stackGetStarted();	
		stackPage.operationInStack();
		LoggerReader.info("Logging ::::::The user clicks Operations in Stack link in the Stack page");  
	}

	@Then("User should be able to navigate to Operations in Stack page")
	public void user_should_be_able_to_navigate_to_operations_in_stack_page() {
		LoggerReader.info("Logging ::::::User able to navigate to Operations in Stack page");
	}

	@Given("User is in the Operations in Stack page")
	public void user_is_in_the_operations_in_stack_page() {
		LoggerReader.info("User at Stack page and navigating to Operaion in stack try editor page");
	}

	@When("User clicks Try Here button in the Operations in Stack page")
	public void user_clicks_try_here_button_in_the_operations_in_stack_page() {
		stackPage.stackGetStarted();
		stackPage.operationInStack();
		stackPage.tryHereBtn() ;
	}

	@Then("User should be able to navigate to Stack Try Editor page with Run button to test")
	public void user_should_be_able_to_navigate_to_stack_try_editor_page_with_run_button_to_test() {
		LoggerReader.info("User at try editor page");
	}
	
	@Given("User at Try Editor page for the Operations in Stack page")
	public void user_at_try_editor_page_for_the_operations_in_stack_page() {
		stackPage.stackGetStarted();
		stackPage.operationInStack();
		stackPage.tryHereBtn() ;
		LoggerReader.info("Logging : Try Editor page for the Operations in Stack page");

	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		stackPage.tryEditorWindow(sheetName, rowNumber);
	}

	@Then("User verify output in the Try Editor screen for the Operations in Stack page")
	public void user_verify_output_in_the_try_editor_screen_for_the_operations_in_stack_page() {
		LoggerReader.info("Logging ::::::user verify the output - Try Editor screen for the Operations in Stack page");
	}
    
	@Given("User at Try Editor page for the Implementation page")
	public void user_at_try_editor_page_for_the_implementation_page() {
		stackPage.stackGetStarted();
		stackPage. Implementation();
		stackPage.tryHereBtn();
		LoggerReader.info("Logging : Try Editor page for the Implementation page");
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for Implementation page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_implementation_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		stackPage.tryEditorWindow(sheetName, rowNumber);
	}

	@Then("User verify output in the Try Editor screen for the Implementation page")
	public void user_verify_output_in_the_try_editor_screen_for_the_implementation_page() {
		LoggerReader.info("Logging ::::::user verify the output - Try Editor screen for the Implementation page");
	}
	
	@Given("User at Try Editor page for the Applications page")
	public void user_at_try_editor_page_for_the_applications_page() {
		stackPage.stackGetStarted();
		stackPage.Applications();
		stackPage.tryHereBtn();
		LoggerReader.info("Logging : Try Editor page for the Applications page");
	}

	@When("User enters valid, invalid and incorrect syntax code from excel sheet {string} and {int} and clicks on Run button for Applications page")
	public void user_enters_valid_invalid_and_incorrect_syntax_code_from_excel_sheet_and_and_clicks_on_run_button_for_applications_page(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
		stackPage.tryEditorWindow(sheetName, rowNumber);
	}

	@Then("User verify output in the Try Editor screen for the Applications page")
	public void user_verify_output_in_the_try_editor_screen_for_the_applications_page() {
		LoggerReader.info("Logging ::::::user verify the output - Try Editor screen for the Applications page");
	}
	@Given("User is at the Operations in Stack page")
	public void user_is_at_the_operations_in_stack_page() {
		stackPage.stackGetStarted();
		stackPage.operationInStack();
		LoggerReader.info("Logging : Try Editor page for the PracticeQuestions");
	}

	@When("User clicks Practice questions link")
	public void user_clicks_practice_questions_link() {
		stackPage.PracticeQuestions();
		LoggerReader.info("Logging ::::::User clicks Practice questions link"); 

	}

	@Then("User should be redirected to Practice page")
	public void user_should_be_redirected_to_practice_page() {
		LoggerReader.info("Logging ::::::User should be redirected to Practice page"); 
	}
}
