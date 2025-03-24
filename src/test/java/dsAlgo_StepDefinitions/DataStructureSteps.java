package dsAlgo_StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import dsAlgo_Reader.ExcelReader;
import dsAlgo_Reader.ConfigReader;
import dsAlgo_Reader.LoggerReader;
import dsAlgo_Reader.TryEditor;
import dsAlgo_PageFactory.DataStructuresPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureSteps extends DataStructuresPage {

	DataStructuresPage dsp = new DataStructuresPage();
	ExcelReader readExcel = new ExcelReader();
	String pagetitle;

	@Given("The user is in the Home page after logged in for Data Structures - Introduction page")
	public void the_user_is_in_the_home_page_after_logged_in_for_data_structures_introduction_page()
			throws IOException {

		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		pagetitle = dsp.homepage(username, password);
	}

	@When("The user clicks Get Started button in Data Structures - Introduction panel")
	public void the_user_clicks_get_started_button_in_data_structures_introduction_panel() {

		pagetitle = dsp.dspage();
		LoggerReader.info(pagetitle);

	}

	@Then("The user should able to view Data Structures- Introduction Page")
	public void the_user_should_able_to_view_data_structures_introduction_page() {

		assertEquals(pagetitle, "Data Structures-Introduction", "Not on the Data Structures-Introduction");
		LoggerReader.info(pagetitle);

	}

	@Given("The user is in the Data Structures - Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() throws IOException {

		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		pagetitle = dsp.homepage(username, password);

		pagetitle = dsp.dspage();
		pagetitle = dsp.checkpageTitle();
	}

	@When("The user clicks Time Complexity link Data Structures- Introduction Page")
	public void the_user_clicks_time_complexity_link_data_structures_introduction_page() {

		pagetitle = dsp.clickTimeComplexityLink();
		LoggerReader.info(pagetitle);
	}

	@Then("The user should be redirected to Time Complexity page of Data structures-Introduction")
	public void the_user_should_be_redirected_to_time_complexity_page_of_data_structures_introduction() {

		pagetitle = dsp.checkpageTitle();
		assertEquals(pagetitle, "Time Complexity", "Not on the Time Complexity page");
		LoggerReader.info(pagetitle);

	}

	// Scenario failed

	@Given("The user is in the Time Complexity page of Data structures-Introduction")
	public void the_user_is_in_the_time_complexity_page_of_data_structures_introduction() throws IOException {
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		pagetitle = dsp.homepage(username, password);
		pagetitle = dsp.dspage();
		pagetitle = dsp.clickTimeComplexityLink();
	}

	@When("The user clicks the Practice Questions link in the Data structures-Introduction")
	public void the_user_clicks_the_practice_questions_link_in_the_data_structures_introduction() {

		dsp.PracticeQuestionClick();
	}

	@Then("The user should be redirected to Practice Questions in the Data structures-Introduction")
	public void the_user_should_be_redirected_to_practice_questions_in_the_data_structures_introduction() {

		practicequestioncontent = dsp.PracticeQuestioncontentcheck();
		assertEquals(practicequestioncontent, true);

	}

	@Given("The DS-user is in the Time Complexity page of Data structures-Introduction")
	public void the_ds_user_is_in_the_time_complexity_page_of_data_structures_introduction() throws IOException {
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		pagetitle = dsp.homepage(username, password);
		pagetitle = dsp.dspage();
		pagetitle = dsp.clickTimeComplexityLink();
	}

	@When("The user clicks Try here button in the Data structures-Introduction")
	public void the_user_clicks_try_here_button_in_the_data_structures_introduction() {

		pagetitle = dsp.tryhere();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test Data structures-Introduction")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_data_structures_introduction() {

		assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
		LoggerReader.info("Current page: " + pagetitle);

	}

	// passed(Bug)-not showing alert window

	@Given("The ds-user is in the try Editor page of Data structures-Introduction")
	public void the_ds_user_is_in_the_try_editor_page_of_data_structures_introduction() throws IOException {
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		pagetitle = dsp.homepage(username, password);
		pagetitle = dsp.dspage();
		pagetitle = dsp.clickTimeComplexityLink();
		pagetitle = dsp.tryhere();
	}

	@When("The user clicks the Run button without entering the code in the Editor of Data structures-Introduction")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_of_data_structures_introduction() {

		dsp.clickrun();

	}

	@Then("The user should able to see an error message in alert window of Data structures-Introduction")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_of_data_structures_introduction() {

		String alertmessage = dsp.handlealert();
		LoggerReader.info(alertmessage);

	}

	@Given("The DS-user is in the try Editor page of Data structures-Introduction")
	public void user_is_in_the_try_editor_page_of_data_structures_introduction() throws IOException {
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		pagetitle = dsp.homepage(username, password);
		pagetitle = dsp.dspage();
		pagetitle = dsp.clickTimeComplexityLink();
		pagetitle = dsp.tryhere();
	}

	@When("The user write the invalid code in Editor {string} {int} and click the Run button to test Data structures-Introduction")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button_to_test_data_structures_introduction(
			String sheetName, Integer rowNumber) throws IOException {
		TryEditor tryEditor = new TryEditor();
		String[] values = readExcel.excelDataRead(sheetName, rowNumber);
		dsp.entercode(values[0]);
		tryEditor.setExpectedResult(values[1]);
		dsp.clickrun();
	}

	@Then("The DS-user should able to see an error message in alert window of Data structures-Introduction")
	public void the_ds_user_should_able_to_see_an_error_message_in_alert_window_of_data_structures_introduction() {

		String alertmessage = dsp.handlealert();
		LoggerReader.info(alertmessage);

	}

	@Given("The user is in the try Editor page of Data structures-Introduction")
	public void the_user_is_in_the_try_editor_page_of_data_structures_introduction() throws IOException {
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		pagetitle = dsp.homepage(username, password);
		pagetitle = dsp.dspage();
		pagetitle = dsp.clickTimeComplexityLink();
		pagetitle = dsp.tryhere();
	}

	@When("The user write the valid code in Editor {string} {int} and click the Run button to test Data structures-Introduction")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button_to_test_data_structures_introduction(
			String sheetName, Integer rowNumber) throws IOException {
		TryEditor tryEditor = new TryEditor();
		String[] values = readExcel.excelDataRead(sheetName, rowNumber);
		dsp.entercode(values[0]);
		tryEditor.setExpectedResult(values[1]);
		dsp.clickrun();
	}

	@Then("The user should able to see output in the console of Data structures-Introduction")
	public void the_user_should_able_to_see_output_in_the_console_of_data_structures_introduction() {
		String output = dsp.getoutput();
		LoggerReader.info(output);

	}
}
