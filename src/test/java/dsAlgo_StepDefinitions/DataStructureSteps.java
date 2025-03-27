package dsAlgo_StepDefinitions;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_Reader.ExcelReader;
import dsAlgo_Reader.LoggerReader;
import dsAlgo_Reader.TryEditor;
import dsAlgo_PageFactory.DataStructuresPage;
import dsAlgo_PageFactory.HomePage;
import dsAlgo_PageFactory.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureSteps extends DataStructuresPage {
	WebDriver driver;

	DataStructuresPage dsp = new DataStructuresPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	ExcelReader readExcel = new ExcelReader();
	TryEditor tryEditor = new TryEditor();
	boolean pagetitle;

	@Given("User launches ds-algo page")
	public void user_launches_ds_algo_page() {

		homePage.launchURL();
	}

	@When("User clicks the Get Started")
	public void user_clicks_the_get_started_button() {
		homePage.getStartedHomeBtnClick();
	}

	@Then("User clicks on Signin Link")
	public void user_clicks_on_signin_link() {
		loginPage.clickSignIn();
	}

	@Then("user gets data from excel sheet {string} and {int} for login")
	public void user_gets_data_from_excel_sheet_and_for_login(String sheetName, Integer rowNumber) throws IOException {
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
		loginPage.userName.sendKeys(credentials[0]);
		loginPage.passWord.sendKeys(credentials[1]);
		loginPage.LoginBtnClick();
	}

	@Given("The user is in the Home page after logged in for Data Structures - Introduction page")
	public void the_user_is_in_the_home_page_after_logged_in_for_data_structures_introduction_page()
			throws IOException {
		user_launches_ds_algo_page();
		user_clicks_the_get_started_button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login("Valid_Login", 1);
		
	}

	@When("The user clicks Get Started button in Data Structures - Introduction panel")
	public void the_user_clicks_get_started_button_in_data_structures_introduction_panel() {
		dsp.ds_dsGetstarted.click();
		
	}

	@Then("The user should able to view Data Structures- Introduction Page")
	public void the_user_should_able_to_view_data_structures_introduction_page() {
		Assert.assertEquals(dsp.DSPgTitleDiaplayed(), true);
	}

	@Given("The user is in the Data Structures - Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() throws IOException {
		user_launches_ds_algo_page();
		user_clicks_the_get_started_button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login("Valid_Login", 1);
		the_user_clicks_get_started_button_in_data_structures_introduction_panel();
		
		
	}

	@When("The user clicks Time Complexity link Data Structures- Introduction Page")
	public void the_user_clicks_time_complexity_link_data_structures_introduction_page() {

		 dsp.clickTimeComplexityLink();
		
	}

	@Then("The user should be redirected to Time Complexity page of Data structures-Introduction")
	public void the_user_should_be_redirected_to_time_complexity_page_of_data_structures_introduction() {
		Assert.assertEquals(dsp.PgTitleDiaplayed(), true);
	}

	@Given("The user is in the Time Complexity page of Data structures-Introduction")
	public void the_user_is_in_the_time_complexity_page_of_data_structures_introduction() throws IOException {
		the_user_is_in_the_data_structures_introduction_page();
		dsp.clickTimeComplexityLink();
		
	}

	@When("The user clicks Try here button in the Data structures-Introduction")
	public void the_user_clicks_try_here_button_in_the_data_structures_introduction() {
		dsp.tryhere();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test Data structures-Introduction")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_data_structures_introduction() {
		Assert.assertEquals(dsp.Run_btnDisplayed(), true);
	}

	@Given("The user is in the try Editor page of Data structures-Introduction1")
	public void the_user_is_in_the_try_editor_page_of_data_structures_introduction1() throws IOException {
		the_user_is_in_the_data_structures_introduction_page();
		dsp.clickTimeComplexityLink();
		dsp.tryhere();
	}

	@When("The user clicks the Run button without entering the code in the Editor of Data structures-Introduction")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_of_data_structures_introduction() {
		dsp.clickrun();
	}

	@Then("The user should able to see an error message in alert window of Data structures-Introduction")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_of_data_structures_introduction() {
		
		Alert alert_box = DriverFactory.getDriver().switchTo().alert();
		LoggerReader.info("Alert message: " + alert_box.getText());
		LoggerReader.info("Expected message: " + tryEditor.getExpectedResult());
		Assert.assertEquals(tryEditor.getExpectedResult(), alert_box.getText());
		alert_box.accept();
		
	}

	// Fail- alert is not shown

	@Given("The DS-user is in the try Editor page of Data structures-Introduction")
	public void ds_user_is_in_the_try_editor_page_of_data_structures_introduction() throws IOException {
		the_user_is_in_the_data_structures_introduction_page();
		dsp.clickTimeComplexityLink();
		dsp.tryhere();

	}

	@When("The user writes the invalid code in Editor {string} {int} and click the Run button")
	public void the_user_writes_the_invalid_code_in_editor_and_click_the_run_button(String sheetName, Integer rowNumber)
			throws IOException {
			
			String[] values = readExcel.excelDataRead(sheetName, rowNumber);
			dsp.entercode(values[0]);
			tryEditor.setExpectedResult(values[1]);
		dsp.clickrun();
	}

	@Then("The ds_user should able to see an error message in alert window of Data structures-Introduction")
	public void the_ds_user_should_able_to_see_an_error_message_in_alert_window_of_data_structures_introduction() {
	
				Alert alert_box = DriverFactory.getDriver().switchTo().alert();
				LoggerReader.info("Alert message: " + alert_box.getText());
				LoggerReader.info("Expected message: " + tryEditor.getExpectedResult());
				Assert.assertEquals(tryEditor.getExpectedResult(), alert_box.getText());
				alert_box.accept();

	}
	

	@Given("The user is in the try Editor page of Data structures-Introduction")
	public void the_user_is_in_the_try_editor_page_of_data_structures_introduction() throws IOException {

		the_user_is_in_the_data_structures_introduction_page();
		dsp.clickTimeComplexityLink();
		dsp.tryhere();
	}

	@When("The user write the valid code in Editor {string} {int} and click the Run button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button(String sheetName, Integer rowNumber)
			throws IOException {
		TryEditor tryEditor = new TryEditor();
		String[] values = readExcel.excelDataRead(sheetName, rowNumber);

		dsp.entercode(values[0]);
		LoggerReader.info("Valid code entered in the Editor.");

		tryEditor.setExpectedResult(values[1]);
		dsp.clickrun();
		LoggerReader.info("Run button clicked.");
	}

	@Then("The user should able to see output in the console of Data structures-Introduction")
	public void the_user_should_able_to_see_output_in_the_console_of_data_structures_introduction() {
		String output = dsp.getoutput();
		LoggerReader.info("Console Output: " + output);
		Assert.assertNotNull(output, "The output in the console is null. No message is displayed.");
	}

	
	@Given("The user is in the Time Complexity page of Data structures-Introduction to check Practice question page")
	public void the_user_is_in_the_time_complexity_page_of_data_structures_introduction_to_check_practice_question_page()
			throws IOException {
		the_user_is_in_the_data_structures_introduction_page();
		dsp.clickTimeComplexityLink();
		
	}

	@When("The user clicks the Practice Questions link in the Data structures-Introduction")
	public void the_user_clicks_the_practice_questions_link_in_the_data_structures_introduction() {
		dsp.PracticeQuestionClick();
		
	}

	@Then("The user should be redirected to Practice Questions in the Data structures-Introduction")
	public void the_user_should_be_redirected_to_practice_questions_in_the_data_structures_introduction() {
		Assert.assertEquals(dsp.PgTitleDiaplayed(), true);
		
	}
}