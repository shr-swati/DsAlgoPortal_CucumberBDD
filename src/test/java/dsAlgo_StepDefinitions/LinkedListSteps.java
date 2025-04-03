package dsAlgo_StepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Alert;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageFactory.HomePage;
import dsAlgo_PageFactory.LinkedListPage;
import dsAlgo_PageFactory.LoginPage;
import dsAlgo_Reader.ExcelReader;
import dsAlgo_Reader.LoggerReader;
import dsAlgo_Reader.TryEditor;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListSteps {

	LinkedListPage linkedListPage = new LinkedListPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	ExcelReader readExcel = new ExcelReader();
	TryEditor tryEditor = new TryEditor();

	@Given("user is on the DsAlgo Home Page")
	public void user_is_on_the_ds_algo_home_page() {

		homePage.launchURL();
	}

	@When("user clicks the Get Started Button")
	public void user_clicks_the_Get_Started_Button() {
		homePage.getStartedHomeBtnClick();
	}

	@Given("user clicks on Signin Link")
	public void user_clicks_on_signin_link() {

		loginPage.clickSignIn();
	}

	@When("user gets data from excel sheet {string} and {int} for login page")
	public void user_gets_data_from_excel_sheet_and_for_login_page(String sheetName, Integer rowNumber)
			throws IOException {
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
		loginPage.userName.sendKeys(credentials[0]);
		loginPage.passWord.sendKeys(credentials[1]);
		loginPage.LoginBtnClick();
	}

	@And("clicks Get Started Button")
	public void clicks_get_started_button() throws IOException {

		LinkedListPage linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
	}

	@Then("user should be redirected to Linked List Page")
	public void user_should_be_redirected_to_linked_list_page() {
		String linkedlistPgTitle = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Linked List", linkedlistPgTitle);
	}

	@Given("user is on the Linked List Page")
	public void user_is_on_the_linked_list_page() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
	}

	@When("user clicks on Introduction Link")
	public void user_clicks_on_introduction_link() throws IOException {

		linkedListPage.clickIntroductionLink();
	}

	@Then("user should be redirected to Introduction Page")
	public void user_should_be_redirected_to_introduction_page() {

		String introductionPgTitle = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Introduction", introductionPgTitle);

	}

	@Given("user is on the tryEditor page for the Introduction page")
	public void user_is_on_the_try_editor_page_for_the_introduction_page() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickIntroductionLink();
		linkedListPage.tryHereBtnIntroduction();

	}

	@When("user enters valid python code from excel sheets {string} and {int} for the tryEditor Page and clicks on Run Button")
	public void user_enters_valid_python_code_from_excel_sheets_and_for_the_try_editor_page_and_clicks_on_run_button(
			String sheetName, Integer rowNumber) throws IOException {
		tryEditor = new TryEditor();
		String[] values = readExcel.excelDataRead(sheetName, rowNumber);
		linkedListPage.textAreaSendKey(values[0]);
		tryEditor.setExpectedResult(values[1]);
		linkedListPage.runButtonClick();
	}

	@Then("user should be able to get an output in the tryEditor screen for the Introduction page")
	public void user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_introduction_page() {
		Assert.assertEquals(tryEditor.getExpectedResult(), linkedListPage.resultOutput());
	}

	@When("user enters invalid and incorrect syntax code from excel sheets {string} and {int} for the tryEditor Page and clicks on Run Button")
	public void user_enters_invalid_and_incorrect_syntax_code_from_excel_sheets_and_for_the_try_editor_page_and_clicks_on_run_button(
			String sheetName, Integer rowNumber) throws IOException {
		String[] values = readExcel.excelDataRead(sheetName, rowNumber);
		linkedListPage.textAreaSendKey(values[0]);
		tryEditor.setExpectedResult(values[1]);
		linkedListPage.runButtonClick();
	}

	@Then("user should be able to get an error message on  tryEditor screen for the Introduction page")
	public void user_should_be_able_to_get_an_error_message_on_try_editor_screen_for_the_introduction_page()
			throws InterruptedException {

		Alert alert_box = DriverFactory.getDriver().switchTo().alert();
		LoggerReader.info("Alert message: " + alert_box.getText());
		LoggerReader.info("Expected message: " + tryEditor.getExpectedResult());
		Assert.assertEquals(tryEditor.getExpectedResult(), alert_box.getText());
		alert_box.accept();

	}

	@When("user enters blank code from excel sheets {string} and {int} for the tryEditor Page and clicks on Run Button")
	public void user_enters_blank_code_from_excel_sheets_and_for_the_try_editor_page_and_clicks_on_run_button(
			String sheetName, Integer rowNumber) throws IOException {
		String[] values = readExcel.excelDataRead(sheetName, rowNumber);
		linkedListPage.textAreaSendKey(values[0]);
		tryEditor.setExpectedResult(values[1]);
		linkedListPage.runButtonClick();
	}

	@When("user enters numeric code from excel sheets {string} and {int} for the tryEditor Page and clicks on Run Button")
	public void user_enters_numeric_code_from_excel_sheets_and_for_the_try_editor_page_and_clicks_on_run_button(
			String sheetName, Integer rowNumber) throws IOException {
		String[] values = readExcel.excelDataRead(sheetName, rowNumber);
		linkedListPage.textAreaSendKey(values[0]);
		tryEditor.setExpectedResult(values[1]);
		linkedListPage.runButtonClick();
	}

	@When("user clicks on browser back button")
	public void user_clicks_on_browser_back_button() throws InterruptedException {

		DriverFactory.getDriver().navigate().back();

	}

	@Then("user should be able to navigate back to Introduction Page")
	public void user_should_be_able_to_navigate_back_to_introduction_page() {
		String introductionPgTitle = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Introduction", introductionPgTitle);

	}

	@When("user clicks on Creating Linked List Link")
	public void user_clicks_on_creating_linked_list_link() throws IOException, InterruptedException {

		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickCreatingLinkedLIst();

	}

	@Then("user should be redirected to Creating linked Page")
	public void user_should_be_redirected_to_creating_linked_page() throws InterruptedException {

		String creatingLinkedListPgTitle = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Creating Linked LIst", creatingLinkedListPgTitle);
	}

	@Given("user is on the tryEditor page for the Creating Linked List")
	public void user_is_on_the_try_editor_page_for_the_creating_linked_list() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickCreatingLinkedLIst();
		linkedListPage.tryHereBtnIntroduction();
	}

	@Then("user should be able to get an output in the tryEditor screen for the Creating Linked List Page")
	public void user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_creating_linked_list_page() {
		Assert.assertEquals(tryEditor.getExpectedResult(), linkedListPage.resultOutput());
	}

	@Then("user should be able to get an error message on  tryEditor screen for the Creating Linked List page")
	public void user_should_be_able_to_get_an_error_message_on_try_editor_screen_for_the_creating_linked_list_page()
			throws InterruptedException {

		Alert alert_box = DriverFactory.getDriver().switchTo().alert();
		LoggerReader.info("Alert message: " + alert_box.getText());
		LoggerReader.info("Expected message: " + tryEditor.getExpectedResult());
		Assert.assertEquals(tryEditor.getExpectedResult(), alert_box.getText());
		alert_box.accept();

	}

	@Then("user should be able to navigate back to Creating Linked List Page")
	public void user_should_be_able_to_navigate_back_to_creating_linked_list_page() {
		String creatingLinkedListPgTitle = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Creating Linked LIst", creatingLinkedListPgTitle);
	}

	@When("user clicks on Types Of Linked List Link")
	public void user_clicks_on_types_of_linked_list_link() throws IOException, InterruptedException {

		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickTypesOfLinkedList();

	}

	@Then("user should be redirected to Types Of Linked List Page")
	public void user_should_be_redirected_to_types_of_linked_list_page() {
		String typesOfLinkedListPgTitle = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Types of Linked List", typesOfLinkedListPgTitle);
	}

	@Given("user is on the tryEditor page for the Types Of Linked List page")
	public void user_is_on_the_try_editor_page_for_the_types_of_linked_list_page() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickTypesOfLinkedList();
		linkedListPage.tryHereBtnIntroduction();
	}

	@Then("user should be able to get an output in the tryEditor screen for the Types Of Linked List page")
	public void user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_types_of_linked_list_page() {
		Assert.assertEquals(tryEditor.getExpectedResult(), linkedListPage.resultOutput());
	}

	@Then("user should be able to get an error message on  tryEditor screen for the Types Of Linked List page")
	public void user_should_be_able_to_get_an_error_message_on_try_editor_screen_for_the_types_of_linked_list_page() {
		Alert alert_box = DriverFactory.getDriver().switchTo().alert();
		LoggerReader.info("Alert message: " + alert_box.getText());
		LoggerReader.info("Expected message: " + tryEditor.getExpectedResult());
		Assert.assertEquals(tryEditor.getExpectedResult(), alert_box.getText());
		alert_box.accept();

	}

	@Then("user should be able to navigate back to Types Of Linked List page")
	public void user_should_be_able_to_navigate_back_to_types_of_linked_list_page() {
		String typesOfLinkedListPgTitle = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Types of Linked List", typesOfLinkedListPgTitle);
	}

	@When("user clicks on Implement Linked List in Python Link")
	public void user_clicks_on_implement_linked_list_in_python_link() throws IOException, InterruptedException {

		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickImplementLinkedListInPython();

	}

	@Then("user should be redirected to Implement Linked List in Python Page")
	public void user_should_be_redirected_to_implement_linked_list_in_python_page() {
		String implementLinkedListInPythonPage = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Implement Linked List in Python", implementLinkedListInPythonPage);

	}

	@Given("user is on the tryEditor page for the Implement Linked List in Python Page")
	public void user_is_on_the_try_editor_page_for_the_implement_linked_list_in_python_page() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickImplementLinkedListInPython();
		linkedListPage.tryHereBtnIntroduction();
	}

	@Then("user should be able to get an output in the tryEditor screen for the Implement Linked List in Python page")
	public void user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_implement_linked_list_in_python_page() {
		Assert.assertEquals(tryEditor.getExpectedResult(), linkedListPage.resultOutput());
	}

	@Then("user should be able to get an error message on  tryEditor screen for the Implement Linked List in Python page")
	public void user_should_be_able_to_get_an_error_message_on_try_editor_screen_for_the_implement_linked_list_in_python_page() {
		Alert alert_box = DriverFactory.getDriver().switchTo().alert();
		LoggerReader.info("Alert message: " + alert_box.getText());
		LoggerReader.info("Expected message: " + tryEditor.getExpectedResult());
		Assert.assertEquals(tryEditor.getExpectedResult(), alert_box.getText());
		alert_box.accept();

	}

	@Then("user should be able to navigate back to Implement Linked List in Python Page")
	public void user_should_be_able_to_navigate_back_to_implement_linked_list_in_python_page() {

		String implementLinkedListInPythonPage = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Implement Linked List in Python", implementLinkedListInPythonPage);

	}

	@When("user clicks on Traversal Link")
	public void user_clicks_on_traversal_link() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickTraversal();
	}

	@Then("user should be redirected to Traversal Page")
	public void user_should_be_redirected_to_traversal_page() {
		String traversalPage = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Traversal", traversalPage);
	}

	@Given("user is on the tryEditor page for the Traversal Page")
	public void user_is_on_the_try_editor_page_for_the_traversal_page() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickTraversal();
		linkedListPage.tryHereBtnIntroduction();
	}

	@Then("user should be able to get an output in the tryEditor screen for the Traversal page")
	public void user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_traversal_page() {
		Assert.assertEquals(tryEditor.getExpectedResult(), linkedListPage.resultOutput());
	}

	@Then("user should be able to get an error message on  tryEditor screen for the Traversal page")
	public void user_should_be_able_to_get_an_error_message_on_try_editor_screen_for_the_traversal_page() {
		Alert alert_box = DriverFactory.getDriver().switchTo().alert();
		LoggerReader.info("Alert message: " + alert_box.getText());
		LoggerReader.info("Expected message: " + tryEditor.getExpectedResult());
		Assert.assertEquals(tryEditor.getExpectedResult(), alert_box.getText());
		alert_box.accept();

	}

	@Then("user should be able to navigate back to Traversal Page")
	public void user_should_be_able_to_navigate_back_to_traversal_page() {
		String traversalPage = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Traversal", traversalPage);

	}

	@When("user clicks on Insertion Link")
	public void user_clicks_on_insertion_link() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickInsertion();
	}

	@Then("user should be redirected to Insertion Page")
	public void user_should_be_redirected_to_insertion_page() {
		String insertionPage = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Insertion", insertionPage);

	}

	@Given("user is on the tryEditor page for the Insertion Page")
	public void user_is_on_the_try_editor_page_for_the_insertion_page() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickInsertion();
		linkedListPage.tryHereBtnIntroduction();
	}

	@Then("user should be able to get an output in the tryEditor screen for the Insertion page")
	public void user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_insertion_page() {
		Assert.assertEquals(tryEditor.getExpectedResult(), linkedListPage.resultOutput());
	}

	@Then("user should be able to get an error message on  tryEditor screen for the Insertion page")
	public void user_should_be_able_to_get_an_error_message_on_try_editor_screen_for_the_insertion_page() {
		Alert alert_box = DriverFactory.getDriver().switchTo().alert();
		LoggerReader.info("Alert message: " + alert_box.getText());
		LoggerReader.info("Expected message: " + tryEditor.getExpectedResult());
		Assert.assertEquals(tryEditor.getExpectedResult(), alert_box.getText());
		alert_box.accept();

	}

	@Then("user should be able to navigate back to Insertion Page")
	public void user_should_be_able_to_navigate_back_to_insertion_page() {
		String insertionPage = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Insertion", insertionPage);

	}

	@When("user clicks on Deletion Link")
	public void user_clicks_on_deletion_link() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickDeletion();
	}

	@Then("user should be redirected to Deletion Page")
	public void user_should_be_redirected_to_deletion_page() {
		String deletionPage = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Deletion", deletionPage);
	}

	@Given("user is on the tryEditor page for the Deletion Page")
	public void user_is_on_the_try_editor_page_for_the_deletion_page() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickDeletion();
		linkedListPage.tryHereBtnIntroduction();

	}

	@Then("user should be able to get an output in the tryEditor screen for the Deletion page")
	public void user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_deletion_page() {
		Assert.assertEquals(tryEditor.getExpectedResult(), linkedListPage.resultOutput());
	}

	@Then("user should be able to get an error message on  tryEditor screen for the Deletion page")
	public void user_should_be_able_to_get_an_error_message_on_try_editor_screen_for_the_deletion_page() {

		Alert alert_box = DriverFactory.getDriver().switchTo().alert();
		LoggerReader.info("Alert message: " + alert_box.getText());
		LoggerReader.info("Expected message: " + tryEditor.getExpectedResult());
		Assert.assertEquals(tryEditor.getExpectedResult(), alert_box.getText());
		alert_box.accept();

	}

	@Then("user should be able to navigate back to Deletion Page")
	public void user_should_be_able_to_navigate_back_to_deletion_page() {
		String deletionPage = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Deletion", deletionPage);
	}

	@Given("user is on the Deletion Page")
	public void user_is_on_the_deletion_page() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickDeletion();
	}

	@When("user  clicks on Practice Questions Link")
	public void user_clicks_on_practice_questions_link() throws IOException, InterruptedException {

		linkedListPage.clickPracticeQuestions();

	}

	@Then("user should be redirected to Practice Questions Page")
	public void user_should_be_redirected_to_practice_questions_page() {
		String practiceQuestionsPage = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Practice Questions", practiceQuestionsPage);
	}

	@Given("user is on Linked List Page")
	public void user_is_on_linked_list_page() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		linkedListPage = new LinkedListPage();
		linkedListPage.goToLinkedListPage();
	}

	@When("user clicks on signout button")
	public void user_clicks_on_signout_button() {
		linkedListPage.clickSignOut();
	}

	@Then("user should be redirected to home page with message {string}")
	public void user_should_be_redirected_to_home_page_with_message(String loggedOutMsg) {
		loginPage.LoggedMessageSignOut(loggedOutMsg);

	}
}
