package dsAlgo_StepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Alert;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageFactory.HomePage;
import dsAlgo_PageFactory.LinkedListPage;
import dsAlgo_PageFactory.LoginPage;
import dsAlgo_PageFactory.QueuePage;
import dsAlgo_Reader.ExcelReader;
import dsAlgo_Reader.LoggerReader;
import dsAlgo_Reader.TryEditor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueSteps {
	QueuePage queuePage = new QueuePage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	ExcelReader readExcel = new ExcelReader();
	TryEditor tryEditor = new TryEditor();

	public void user_is_on_the_ds_algo_home_page() {

		homePage.launchURL();
	}

	public void user_clicks_the_Get_Started_Button() {
		homePage.getStartedHomeBtnClick();
	}
//2

	public void user_clicks_on_signin_link() {

		loginPage.clickSignIn();
	}

	public void user_gets_data_from_excel_sheet_and_for_login_page(String sheetName, Integer rowNumber)
			throws IOException {
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
		loginPage.userName.sendKeys(credentials[0]);
		loginPage.passWord.sendKeys(credentials[1]);
		loginPage.LoginBtnClick();
	}
	
	
	
	@Given("user is on the home page")
	public void user_is_on_the_home_page() throws IOException {
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);

		
	}
	

	@When("user clicks Get Started Button of Queue Page")
	public void user_clicks_get_started_button_of_queue_page() throws IOException {
		//queuePage.clickGetStartedButton();
		queuePage.goToQueuePage();
	}

	@Then("user should be redirected to Queue Page")
	public void user_should_be_redirected_to_queue_page() {
		String queuePgTitle = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Queue", queuePgTitle);
	}

	@Given("user is on the Queue Page")
	public void user_is_on_the_queue_page() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		queuePage = new QueuePage();
		queuePage.goToQueuePage();
	}

	@When("user clicks on Implementation of Queue in Python Link")
	public void user_clicks_on_implementation_of_queue_in_python_link() {
		queuePage.clickImplementationOfQueueInPython();
	}

	@Then("user should be redirected to Implementation of Queue in Python Page")
	public void user_should_be_redirected_to_implementation_of_queue_in_python_page() {

		String implementationOfQueueInPythonPgTitle = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Implementation of Queue in Python", implementationOfQueueInPythonPgTitle);
	}

	@Given("user is on the tryEditor page for the Implementation of Queue in Python Page")
	public void user_is_on_the_try_editor_page_for_the_implementation_of_queue_in_python_page() throws IOException {
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);

		queuePage = new QueuePage();
		queuePage.goToQueuePage();
		queuePage.clickImplementationOfQueueInPython();
		queuePage.tryHereBtn();
	}
	@When("user enters valid python code from excel sheets {string} and {int} for the tryEditor Page and clicks on Run Button for Queue")
	public void user_enters_valid_python_code_from_excel_sheets_and_for_the_try_editor_page_and_clicks_on_run_button_for_queue(String sheetName, Integer rowNumber) throws IOException {
		tryEditor= new TryEditor();
		String[] values = readExcel.excelDataRead(sheetName, rowNumber);
		queuePage.textAreaSendKey(values[0]);
		tryEditor.setExpectedResult(values[1]);
		queuePage.runButtonClick();
	}

	@Then("user should be able to get an output in the tryEditor screen for the Implementation of Queue in Python Page")
	public void user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_implementation_of_queue_in_python_page() {
		Assert.assertEquals(tryEditor.getExpectedResult(), queuePage.resultOutput());
	
	}

	@When("user enters invalid and incorrect syntax code from excel sheets {string} and {int} for the tryEditor Page and clicks on Run Button for Queue")
	public void user_enters_invalid_and_incorrect_syntax_code_from_excel_sheets_and_for_the_try_editor_page_and_clicks_on_run_button_for_queue(String sheetName, Integer rowNumber) throws IOException {
		String[] values = readExcel.excelDataRead(sheetName, rowNumber);
		queuePage.textAreaSendKey(values[0]);
		tryEditor.setExpectedResult(values[1]);
		queuePage.runButtonClick();
	}
	

	@Then("user should be able to get an error message on  tryEditor screen for the Implementation of Queue in Python page")
	public void user_should_be_able_to_get_an_error_message_on_try_editor_screen_for_the_implementation_of_queue_in_python_page() throws InterruptedException {
		Thread.sleep(2000);
		Alert alert_box = DriverFactory.getDriver().switchTo().alert();
		LoggerReader.info("Alert message: "+alert_box.getText());
		LoggerReader.info("Expected message: "+tryEditor.getExpectedResult());
		Assert.assertEquals(tryEditor.getExpectedResult(), alert_box.getText());
		alert_box.accept();
		Thread.sleep(3000);
		
		//queuePage.runButtonwithAlert();
		



		    
	
	}

	@Then("user should be able to navigate back to Implementation of Queue in Python Page")
	public void user_should_be_able_to_navigate_back_to_implementation_of_queue_in_python_page() {

		String implementationOfQueueInPythonPgTitle = DriverFactory.getDriver().getTitle();
		Assert.assertEquals("Implementation of Queue in Python", implementationOfQueueInPythonPgTitle);
		
	}

	//@Given("user is on the Implementation of Queue in Python Page")
	//public void user_is_on_the_implementation_of_queue_in_python_page() throws IOException, InterruptedException {
		//Thread.sleep(2000);
		//user_is_on_the_ds_algo_home_page();
		//user_clicks_the_Get_Started_Button();
		//user_clicks_on_signin_link();
		//user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		//queuePage = new QueuePage();
		//queuePage.goToQueuePage();
		//queuePage.clickImplementationOfQueueInPython();
		//Thread.sleep(2000);
	//}

	@When("user clicks on Implementation using collections.deque Link")
	public void user_clicks_on_implementation_using_collections_deque_link() throws InterruptedException, IOException {
		Thread.sleep(2000);
		user_is_on_the_ds_algo_home_page();
		user_clicks_the_Get_Started_Button();
		user_clicks_on_signin_link();
		user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
		queuePage = new QueuePage();
		queuePage.goToQueuePage();
		queuePage.clickImplementationUsingCollectionsDeque();
	}

	
	

@Then("user should be redirected to Implementation using collections.deque Pages")
public void user_should_be_redirected_to_implementation_using_collections_deque_pages() {
	String implementationUsingCollectionsDequePgTitle = DriverFactory.getDriver().getTitle();
	Assert.assertEquals("Implementation using collections.deque", implementationUsingCollectionsDequePgTitle);
}

@Given("user is on the tryEditor page for the Implementation using collections deque Page")
public void user_is_on_the_try_editor_page_for_the_implementation_using_collections_deque_page() throws IOException, InterruptedException {
	user_is_on_the_ds_algo_home_page();
	user_clicks_the_Get_Started_Button();
	user_clicks_on_signin_link();
	user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);

	queuePage = new QueuePage();
	queuePage.goToQueuePage();
	queuePage = new QueuePage();
	Thread.sleep(3000);
	queuePage.clickImplementationUsingCollectionsDeque();
	queuePage.tryHereBtn();
}

@Then("user should be able to get an output in the tryEditor screen for the Implementation using collections deque  Page")
public void user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_implementation_using_collections_deque_page() {
	Assert.assertEquals(tryEditor.getExpectedResult(), queuePage.resultOutput());
	
}
@Then("user should be able to get an error message on  tryEditor screen for the Implementation using collections deque page")
public void user_should_be_able_to_get_an_error_message_on_try_editor_screen_for_the_implementation_using_collections_deque_page() throws InterruptedException {
   //queuePage.runButtonwithAlert();
	Thread.sleep(3000);
	Alert alert_box = DriverFactory.getDriver().switchTo().alert();
	LoggerReader.info("Alert message: "+alert_box.getText());
	LoggerReader.info("Expected message: "+tryEditor.getExpectedResult());
	Assert.assertEquals(tryEditor.getExpectedResult(), alert_box.getText());
	alert_box.accept();
}

@Then("user should be able to navigate back to Implementation using collections deque Page")
public void user_should_be_able_to_navigate_back_to_implementation_using_collections_deque_page() {
	String implementationUsingCollectionsDequePgTitle = DriverFactory.getDriver().getTitle();
	Assert.assertEquals("Implementation using collections.deque", implementationUsingCollectionsDequePgTitle);
}
//@Given("user is on the Implementation using collections deque Page")
//public void user_is_on_the_implementation_using_collections_deque_page() throws IOException {
	//user_is_on_the_ds_algo_home_page();
	//user_clicks_the_Get_Started_Button();
	//user_clicks_on_signin_link();
	//user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);

	//queuePage = new QueuePage();
	//queuePage.goToQueuePage();
	//queuePage.clickImplementationUsingCollectionsDeque();
//}

@When("user clicks on Implementation using array Link")
public void user_clicks_on_implementation_using_array_link() throws IOException {
	user_is_on_the_ds_algo_home_page();
	user_clicks_the_Get_Started_Button();
	user_clicks_on_signin_link();
	user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);

	queuePage = new QueuePage();
	queuePage.goToQueuePage();
   queuePage.clickImplementationUsingArray();
}
@Then("user should be redirected to Implementation using array Page")
public void user_should_be_redirected_to_implementation_using_array_page() {
	String implementationUsingArrayPgTitle = DriverFactory.getDriver().getTitle();
	Assert.assertEquals("Implementation using array", implementationUsingArrayPgTitle);
}

@Given("user is on the tryEditor page for the Implementation using array Page")
public void user_is_on_the_try_editor_page_for_the_implementation_using_array_page() throws IOException {
	user_is_on_the_ds_algo_home_page();
	user_clicks_the_Get_Started_Button();
	user_clicks_on_signin_link();
	user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);

	queuePage = new QueuePage();
	queuePage.goToQueuePage();
	queuePage.clickImplementationUsingArray();
	queuePage.tryHereBtn();
}

@Then("user should be able to get an output in the tryEditor screen for the Implementation using array Page")
public void user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_implementation_using_array_page() {
	Assert.assertEquals(tryEditor.getExpectedResult(), queuePage.resultOutput());
	
}

@Then("user should be able to get an error message on  tryEditor screen for the Implementation using array page")
public void user_should_be_able_to_get_an_error_message_on_try_editor_screen_for_the_implementation_using_array_page() throws InterruptedException {
    //queuePage.runButtonwithAlert();
	Thread.sleep(3000);
	Alert alert_box = DriverFactory.getDriver().switchTo().alert();
	LoggerReader.info("Alert message: "+alert_box.getText());
	LoggerReader.info("Expected message: "+tryEditor.getExpectedResult());
	Assert.assertEquals(tryEditor.getExpectedResult(), alert_box.getText());
	alert_box.accept();
}

@Then("user should be able to navigate back to Implementation using array Page")
public void user_should_be_able_to_navigate_back_to_implementation_using_array_page() {
	String implementationUsingArrayPgTitle = DriverFactory.getDriver().getTitle();
	Assert.assertEquals("Implementation using array", implementationUsingArrayPgTitle); 
}
//@Given("user is on the Implementation using array Page")
//public void user_is_on_the_implementation_using_array_page() throws IOException {
	//user_is_on_the_ds_algo_home_page();
	//user_clicks_the_Get_Started_Button();
	//user_clicks_on_signin_link();
	//user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);

	//queuePage = new QueuePage();
	//queuePage.goToQueuePage();
	//queuePage.clickImplementationUsingArray();
//}

@When("user clicks on Queue Operations Link")
public void user_clicks_on_queue_operations_link() throws IOException {
	user_is_on_the_ds_algo_home_page();
	user_clicks_the_Get_Started_Button();
	user_clicks_on_signin_link();
	user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);

	queuePage = new QueuePage();
	queuePage.goToQueuePage();
   queuePage.clickQueueOperations();
}

@Then("user should be redirected to Queue Operations Page")
public void user_should_be_redirected_to_queue_operations_page() {
	String queueOperationsPgTitle = DriverFactory.getDriver().getTitle();
	Assert.assertEquals("Queue Operations", queueOperationsPgTitle); 
}

@Given("user is on the tryEditor page for the Queue Operations Page")
public void user_is_on_the_try_editor_page_for_the_queue_operations_page() throws IOException {
	user_is_on_the_ds_algo_home_page();
	user_clicks_the_Get_Started_Button();
	user_clicks_on_signin_link();
	user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);

	queuePage = new QueuePage();
	queuePage.goToQueuePage();
	queuePage.clickQueueOperations();
	queuePage.tryHereBtn();
	
}

@Then("user should be able to get an output in the tryEditor screen for the Queue Operations Page")
public void user_should_be_able_to_get_an_output_in_the_try_editor_screen_for_the_queue_operations_page() {
	Assert.assertEquals(tryEditor.getExpectedResult(), queuePage.resultOutput());
	
}

@Then("user should be able to get an error message on  tryEditor screen for the Queue Operations page")
public void user_should_be_able_to_get_an_error_message_on_try_editor_screen_for_the_queue_operations_page() throws InterruptedException {
   // queuePage.runButtonwithAlert();
	Thread.sleep(3000);
	Alert alert_box = DriverFactory.getDriver().switchTo().alert();
	LoggerReader.info("Alert message: "+alert_box.getText());
	LoggerReader.info("Expected message: "+tryEditor.getExpectedResult());
	Assert.assertEquals(tryEditor.getExpectedResult(), alert_box.getText());
	alert_box.accept();
}

@Then("user should be able to navigate back to Queue Operations Page")
public void user_should_be_able_to_navigate_back_to_queue_operations_page() {
	String queueOperationsPgTitle = DriverFactory.getDriver().getTitle();
	Assert.assertEquals("Queue Operations", queueOperationsPgTitle); 
}
@Given("user is on Queue Operations Page")
public void user_is_on_Queue_Operations_Page() throws IOException, InterruptedException {

Thread.sleep(2000);
user_is_on_the_ds_algo_home_page();
user_clicks_the_Get_Started_Button();
user_clicks_on_signin_link();
user_gets_data_from_excel_sheet_and_for_login_page("Valid_Login", 1);
queuePage = new QueuePage();
queuePage.goToQueuePage();
queuePage.clickQueueOperations();
}
@When("user  clicks on Practice Questions Link for Queue")
public void user_clicks_on_practice_questions_link_for_queue() throws InterruptedException {
	

		

		//queuePage.clickImplementationOfQueueInPython();
		
		//queuePage= new QueuePage();
		Thread.sleep(3000);
		queuePage.clickPracticeQuestions();
		Thread.sleep(5000);
}


@When("user clicks on signout button for Queue")
public void user_clicks_on_signout_button_for_queue() throws InterruptedException {
	Thread.sleep(3000);
    queuePage.clickSignOut();
    Thread.sleep(5000);
}
}


