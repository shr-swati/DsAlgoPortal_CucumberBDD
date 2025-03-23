package dsAlgo_StepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import dsAlgo_PageFactory.HomePage;
import dsAlgo_PageFactory.LoginPage;
import dsAlgo_PageFactory.RegistrationPage;
import dsAlgo_Reader.ExcelReader;
import dsAlgo_Reader.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {

	HomePage homePage;
	LoginPage loginPage = new LoginPage();
	RegistrationPage registerPage = new RegistrationPage();
	ExcelReader readExcel = new ExcelReader();

	@Given("User is in the home page after launching ds-algo portal page")
	public void user_is_in_the_home_page_after_launching_ds_algo_portal_page() {
		LoggerReader.info("Register button is displayed");
	}

	@When("User clicks Register link in the home page")
	public void user_clicks_register_link_in_the_home_page() {
		registerPage.registerLinkClick();
	}

	@Then("User should be able to navigate to Register page")
	public void user_should_be_able_to_navigate_to_register_page() {
		Assert.assertEquals(registerPage.registerBtnDisplayed(), true);
	}

	@Given("User navigates to register page after clicking register link")
	public void user_navigates_to_register_page_after_clicking_register_link() {
		LoggerReader.info("Registration page is displayed");
	}

	@When("User enters data from excel sheet {string} and {int} for the username field")
	public void user_enters_data_from_excel_sheet_and_for_the_username_field(String sheetName, int rowNumber)
			throws IOException {
		registerPage.registerLinkClick();
		String[] Inputs = readExcel.excelDataRead(sheetName, rowNumber);
		registerPage.userNameRegisterBtn.clear();
		registerPage.userNameRegisterBtn.sendKeys(Inputs[0]);
	}

	@Then("User should be able to enter username and click Register button")
	public void user_should_be_able_to_enter_username_and_click_register_button() {
		registerPage.registerBtnClick();
	}

	@When("User enters invalid data from excel sheet {string} and {int} for the username field")
	public void user_enters_invalid_data_from_excel_sheet_and_for_the_username_field(String sheetName, int rowNumber)
			throws IOException {
		registerPage.registerLinkClick();
		String[] Inputs = readExcel.excelDataRead(sheetName, rowNumber);
		registerPage.userNameRegisterBtn.clear();
		registerPage.userNameRegisterBtn.sendKeys(Inputs[0]);
		registerPage.passwordRegisterBtn.sendKeys(Inputs[1]);
		registerPage.passwordConfirmRegisterBtn.sendKeys(Inputs[2]);
	}

	@Then("User gets error message for username in the Register page")
	public void user_gets_error_message_for_username_in_the_register_page()
			throws InterruptedException {
		registerPage.registerBtnClick();
		String invalidMsg = registerPage.invalidMessageDisplayed();
		System.out.println(invalidMsg);
	}

	@When("User enters data from excel sheet {string} and {int} for the password fields")
	public void user_enters_data_from_excel_sheet_and_for_the_password_fields(String sheetName, int rowNumber)
			throws IOException {
		registerPage.registerLinkClick();
		String[] Inputs = readExcel.excelDataRead(sheetName, rowNumber);
		registerPage.userNameRegisterBtn.clear();
		registerPage.userNameRegisterBtn.sendKeys(Inputs[1]);
	}

	@Then("User should be able to enter password and click Register button")
	public void user_should_be_able_to_enter_password_and_click_register_button() {
		registerPage.registerBtnClick();
	}

	@When("User enters invalid data from excel sheet {string} and {int} for the password field")
	public void the_user_enters_data_from_excel_sheet_and_for_blank_feilds(String sheetName, int rowNumber)
			throws IOException {
		registerPage.registerLinkClick();
		String[] Inputs = readExcel.excelDataRead(sheetName, rowNumber);
		registerPage.userNameRegisterBtn.clear();
		registerPage.userNameRegisterBtn.sendKeys(Inputs[0]);
		registerPage.passwordRegisterBtn.clear();
		registerPage.passwordRegisterBtn.sendKeys(Inputs[1]);
		registerPage.passwordConfirmRegisterBtn.clear();
		registerPage.passwordConfirmRegisterBtn.sendKeys(Inputs[2]);
		registerPage.registerBtnClick();
	}

	@Then("User gets an error message for password in the Register page")
	public void the_user_gets_an_error_message_for_password_in_the_register_page() {
		String invalidMsg = registerPage.invalidMessageDisplayed();
		System.out.println(invalidMsg);
	}

	@When("User enters data from excel sheet {string} and {int} for blank feilds")
	public void user_enters_data_from_excel_sheet_and_for_all_the_fields_to_be_left_blank(String sheetName,
			int rowNumber) throws IOException {
		registerPage.registerLinkClick();
		String[] Inputs = readExcel.excelDataRead(sheetName, rowNumber);
		registerPage.userNameRegisterBtn.clear();
		registerPage.userNameRegisterBtn.sendKeys(Inputs[0]);
		registerPage.passwordRegisterBtn.clear();
		registerPage.passwordRegisterBtn.sendKeys(Inputs[1]);
		registerPage.passwordConfirmRegisterBtn.clear();
		registerPage.passwordConfirmRegisterBtn.sendKeys(Inputs[2]);
		registerPage.registerBtnClick();
	}

	@Then("User gets error message in register page")
	public void user_gets_error_message_in_register_page() {
		String actualmessage = loginPage.getPopUpMessage();
		System.out.println(actualmessage);
	}


	/*@Given("User is in the Register page to enter username, password and password confirmation")
	public void user_is_in_the_register_page_to_enter_username_password_and_password_confirmation() {
		LoggerReader.info("Register button is displayed");
	}

	@When("User enters data from excel sheet {string} and {int} for all the fields and click RegisterButton")
	public void user_enters_data_from_excel_sheet_and_for_all_the_fields_and_click_register_button(String sheetName,
			int rowNumber) throws IOException {
		registerPage.registerLinkClick();
		String[] Inputs = readExcel.excelDataRead(sheetName, rowNumber);
		registerPage.userNameRegisterBtn.clear();
		registerPage.userNameRegisterBtn.sendKeys(Inputs[0]);
		registerPage.passwordRegisterBtn.clear();
		registerPage.passwordRegisterBtn.sendKeys(Inputs[1]);
		registerPage.passwordConfirmRegisterBtn.clear();
		registerPage.passwordConfirmRegisterBtn.sendKeys(Inputs[2]);
		registerPage.registerBtnClick();
	}

	@Then("User should be able to naviagte to home page and get the success message")
	public void user_should_be_able_to_naviagte_to_home_page_and_get_the_success_message() {
		String sucessGetText = registerPage.successMessageDisplayed();
		System.out.println(sucessGetText);
	}*/
}
