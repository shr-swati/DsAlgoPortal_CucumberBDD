package dsAlgo_StepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import dsAlgo_PageFactory.HomePage;
import dsAlgo_PageFactory.LoginPage;
import dsAlgo_Reader.ExcelReader;
import dsAlgo_Reader.LoggerReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	 HomePage homePage = new HomePage();
	 //LoginPage loginpage;
	 LoginPage loginPage = new LoginPage();
	 ExcelReader readExcel = new ExcelReader();

		@Given("user is on the DS Algo Sign in Page")
		public void user_is_on_the_ds_algo_sign_in_page() {
			homePage.launchURL();
			homePage.getStartedHomeBtnClick();
		}
		
	    @Given("The user clicks the Sign In link")
		public void the_user_clicks_the_sign_in_link() {
		   loginPage.clickSignIn();
		}
	    
		@When("The user gets data from excel sheet {string} and {int} for the login page")
		public void the_user_gets_data_from_excel_sheet_and_for_the_login_page(String sheetName, int rowNumber) throws IOException {
			String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
		    loginPage.userName.sendKeys(credentials[0]);
			loginPage.passWord.sendKeys(credentials[1]);
			loginPage.LoginBtnClick();   
		}
		
		@Given("The user is in the Home page after Sign In")
		public void the_user_is_in_the_home_page_after_sign_in() {
			LoggerReader.info("Sign Out link is displayed");
		}
		
		@And("The user clicks Sign Out")
		public void the_user_clicks_sign_out() { 
		  loginPage.clickSignOut();  
		}

		@Then("The user should be redirected to home page with message {string}")
		public void the_user_should_be_redirected_to_home_page_with_message(String loggedOutMessage) {
			loginPage.LoggedMessageSignOut(loggedOutMessage);		
		}
		    
		@Given("The user is on the DS Algo Sign In page")
		public void the_user_is_on_the_ds_algo_sign_in_page() {
			LoggerReader.info("Login button is displayed");
		}  

		@Then("The error message appears below Username and Password textbox like {string}")
		public void the_error_message_appears_below_username_and_password_textbox_like(String message) {
			String actualmessage = loginPage.getPopUpMessage();
			Assert.assertEquals(actualmessage, message);
		}
		
		@When("The user gets invalid data from excel sheet {string} and {int} for the login page")
		public void the_user_gets_invalid_data_from_excel_sheet_and_for_the_login_page(String sheetName, int rowNumber) throws IOException {
			loginPage.clickSignIn();
			String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
		    loginPage.userName.sendKeys(credentials[0]);
			loginPage.passWord.sendKeys(credentials[1]);
			loginPage.LoginBtnClick(); 
		}

		@Then("The user should be able to see an error message {string}")
		public void the_user_should_be_able_to_see_an_error_message(String errorMessage) {
			loginPage.invalidMessage(errorMessage);
		}
		
		@Given("The user clicks the Sign In link from the portal")
		public void the_user_clicks_the_sign_in_link_from_the_portal() {
			homePage.launchURL();
			homePage.getStartedHomeBtnClick();
		}
		
		@When("^login with \"([^\"]*)\" and (\\d+)$")
		public void login_with_and(String sheetName, int rowNumber) throws IOException {
			loginPage.clickSignIn();
			String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
		    loginPage.userName.sendKeys(credentials[0]);
			loginPage.passWord.sendKeys(credentials[1]);
			loginPage.LoginBtnClick();   
		}
	}