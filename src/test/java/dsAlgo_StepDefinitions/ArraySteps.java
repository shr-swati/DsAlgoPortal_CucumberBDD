package dsAlgo_StepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageFactory.ArrayPage;
import dsAlgo_PageFactory.HomePage;
import dsAlgo_PageFactory.LoginPage;
import dsAlgo_Reader.ExcelReader;
import dsAlgo_Reader.LoggerReader;
import dsAlgo_Reader.TryEditor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;


public class ArraySteps {
	
	 HomePage homePage = new HomePage();
	 LoginPage loginPage = new LoginPage();
	 ExcelReader readExcel = new ExcelReader();
	 TryEditor tryEditor = new TryEditor();
		
	WebDriver driver;
	ArrayPage arrayPage = new ArrayPage();
	
	
	
@Given("User on Home page of dsalgo portal")
public void user_on_home_page_of_dsalgo_portal() {
	LoggerReader.info("User at Home page");
}

@When("User clicks on Get Started button in Array section")
public void user_clicks_on_get_started_button_in_array_section() {
	arrayPage.clickArray();
		
}

@Then("User navigate to Array page")
public void user_navigate_to_array_page() {
		
	LoggerReader.info("User at Array Page");
	  
}
	
	

@Given("User browes to the try editor page")
public void user_browes_to_the_try_editor_page() {
	LoggerReader.info("User at Home page");
}

@When("User loggedin and navigate to Array In Python page and then Try Editor page")
public void user_loggedin_and_navigate_to_array_in_python_page_and_then_try_editor_page() {
	arrayPage.clickArray();
	arrayPage.clickArrayInPython();
	arrayPage.tryHereBtnArrayInPython();
}

@Then("user should verify try editor page")
public void user_should_verify_try_editor_page() {
	LoggerReader.info("User at Try Editor Page");
	
}

@Given("user is navigate to the tryEditor")
public void user_is_navigate_to_the_try_editor() {
	arrayPage.clickArray();
	arrayPage.clickArrayInPython();
	arrayPage.tryHereBtnArrayInPython();
}

@When("user enter the valid pythoncode input from sheet {string} and {int} in Array module and clicks on run button")
public void user_enter_the_valid_pythoncode_input_from_sheet_and_in_array_module_and_clicks_on_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	arrayPage.readDataFromExcelSheet(sheetName, rowNumber);
	arrayPage.textAreaSendKey();
	arrayPage.runButtonClick(); 
	
}

@Then("The user checks output in the console output")
public void the_user_checks_output_in_the_console_output() {
	arrayPage.resultOutput();
	arrayPage.logResultOutput();
	
}

@Given("user navigate to the tryEditor")
public void user_navigate_to_the_try_editor() {
	arrayPage.clickArray();
	arrayPage.clickArrayInPython();
	arrayPage.tryHereBtnArrayInPython();
}

@When("user enter the invalid pythoncode input from sheet {string} and {int} in Array module and clicks on run button")
public void user_enter_the_invalid_pythoncode_input_from_sheet_and_in_array_module_and_clicks_on_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	arrayPage.readDataFromExcelSheet(sheetName, rowNumber);
	arrayPage.textAreaSendKey();
	arrayPage.runButtonClick(); 
	
}

@Then("The user checks invalid output in the console output")
public void the_user_checks_invalid_output_in_the_console_output() throws InterruptedException {
	//arrayPage.resultOutput();
	Thread.sleep(3000);
	arrayPage.runButtonWithAlert();
}

@Given("User at home page of dsalgo portal")
public void user_at_home_page_of_dsalgo_portal() {
	
	LoggerReader.info("User is at the Home page start navigating to try editor page of array using list");
	
	
}

@When("User clicked Get Started button in Array section")
public void user_clicked_get_started_button_in_array_section() {
	arrayPage.clickArray();
	arrayPage.arrayUsingList();
	
	
}

@Then("User navigate to try editor page under Array Using List")
public void user_navigate_to_try_editor_page_under_array_using_list() {
	LoggerReader.info("User at the try editor page of array using list");
}

@Given("user is navigate to the tryEditor page under Array Using List")
public void user_is_navigate_to_the_try_editor_page_under_array_using_list() {
	arrayPage.clickArray();
	arrayPage.arrayUsingList();
	arrayPage.tryEditorArrayUsingList();
}

@When("user enter the valid pythoncode getting input from sheet {string} and {int} in Array Using List and clicks on run button")
public void user_enter_the_valid_pythoncode_getting_input_from_sheet_and_in_array_using_list_and_clicks_on_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	arrayPage.readDataFromExcelSheet(sheetName, rowNumber);
	arrayPage.textAreaSendKey();
	arrayPage.runButtonClick(); 
	
}

@Then("The user checks valid console output in Array Using List")
public void the_user_checks_valid_console_output_in_array_using_list() {
	arrayPage.resultOutput();
	arrayPage.logResultOutput();
}

@Given("user navigate to the tryEditor of Array Using List")
public void user_navigate_to_the_try_editor_of_array_using_list() {
	arrayPage.clickArray();
	arrayPage.arrayUsingList();
	arrayPage.tryEditorArrayUsingList();
}

@When("user enter the invalid pythoncode input from sheet {string} and {int} in Array Using List module and clicks on run button")
public void user_enter_the_invalid_pythoncode_input_from_sheet_and_in_array_using_list_module_and_clicks_on_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	arrayPage.readDataFromExcelSheet(sheetName, rowNumber);
	arrayPage.textAreaSendKey();
	//arrayPage.runButtonWithAlert();
	arrayPage.runButtonClick();
	
}

@Then("The user checks invalid console output in Array Using List")
public void the_user_checks_invalid_console_output_in_array_using_list() throws InterruptedException {
	Thread.sleep(3000);
	arrayPage.runButtonWithAlert();
}

@Given("User at home page of dsalgo portal for Basic Operation In List")
public void user_at_home_page_of_dsalgo_portal_for_basic_operation_in_list() {
	LoggerReader.info("User is at the Home page start navigating to try editor page of Basic Operation In List");
}

@When("User clicked Get Started button in Array section for Basic Operation In List")
public void user_clicked_get_started_button_in_array_section_for_basic_operation_in_list() {
	arrayPage.clickArray();
	arrayPage.basicOperationInList();
	arrayPage.tryEditorBasicOperationInList();
}

@Then("User navigate to try editor page under Basic Operation In List")
public void user_navigate_to_try_editor_page_under_basic_operation_in_list() {
	LoggerReader.info("User at the try editor page of Basic Operation In List");
}

@Given("user is navigate to the tryEditor page under Basic Operation In List")
public void user_is_navigate_to_the_try_editor_page_under_basic_operation_in_list() {
	arrayPage.clickArray();
	arrayPage.basicOperationInList();
	arrayPage.tryEditorBasicOperationInList();
}

@When("user enter the valid pythoncode getting input from sheet {string} and {int} in Basic Operation In List and clicks on run button")
public void user_enter_the_valid_pythoncode_getting_input_from_sheet_and_in_basic_operation_in_list_and_clicks_on_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	arrayPage.readDataFromExcelSheet(sheetName, rowNumber);
	arrayPage.textAreaSendKey();
	arrayPage.runButtonClick(); 
	
}

@Then("The user checks valid console output in Basic Operation In List")
public void the_user_checks_valid_console_output_in_basic_operation_in_list() {
	arrayPage.resultOutput();
	arrayPage.logResultOutput();
}

@Given("user navigate to the tryEditor of Basic Operation In List")
public void user_navigate_to_the_try_editor_of_basic_operation_in_list() {
	arrayPage.clickArray();
	arrayPage.basicOperationInList();
	arrayPage.tryEditorBasicOperationInList();
}

@When("user enter the invalid pythoncode input from sheet {string} and {int} in Basic Operation In List module and clicks on run button")
public void user_enter_the_invalid_pythoncode_input_from_sheet_and_in_basic_operation_in_list_module_and_clicks_on_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	arrayPage.readDataFromExcelSheet(sheetName, rowNumber);
	arrayPage.textAreaSendKey();
	//arrayPage.runButtonWithAlert();
	arrayPage.runButtonClick();
	
}

@Then("The user checks invalid console output in Basic Operation In List")
public void the_user_checks_invalid_console_output_in_basic_operation_in_list() throws InterruptedException {
	Thread.sleep(3000);
	arrayPage.runButtonWithAlert();
}

@Given("User at home page of dsalgo portal for Applications of Array")
public void user_at_home_page_of_dsalgo_portal_for_applications_of_array() {
	LoggerReader.info("User is at the Home page start navigating to try editor page of Applications of Array");
}

@When("User clicked Get Started button in Array section for Applications of Array")
public void user_clicked_get_started_button_in_array_section_for_applications_of_array() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.applicationOfArrayTryEditor();
	
}

@Then("User navigate to try editor page under Applications of Array")
public void user_navigate_to_try_editor_page_under_applications_of_array() {
	LoggerReader.info("User at the try editor page of Applications of Array");
}


@Given("user is navigate to the tryEditor page under Applications of Array")
public void user_is_navigate_to_the_try_editor_page_under_applications_of_array() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.applicationOfArrayTryEditor();
}

@When("user enter the valid pythoncode getting input from sheet {string} and {int} in Applications of Array and clicks on run button")
public void user_enter_the_valid_pythoncode_getting_input_from_sheet_and_in_applications_of_array_and_clicks_on_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	arrayPage.readDataFromExcelSheet(sheetName, rowNumber);
	arrayPage.textAreaSendKey();
	arrayPage.runButtonClick(); 
	
}

@Then("The user checks valid console output in Applications of Array")
public void the_user_checks_valid_console_output_in_applications_of_array() {
	arrayPage.resultOutput();
	arrayPage.logResultOutput();
}

@Given("user is navigate to the tryEditor under Applications of Array")
public void user_is_navigate_to_the_try_editor_under_applications_of_array() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.applicationOfArrayTryEditor();
}

@When("user enter the invalid pythoncode getting input from sheet {string} and {int} in Applications of Array and clicks on run button")
public void user_enter_the_invalid_pythoncode_getting_input_from_sheet_and_in_applications_of_array_and_clicks_on_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	arrayPage.readDataFromExcelSheet(sheetName, rowNumber);
	arrayPage.textAreaSendKey();
	//arrayPage.runButtonWithAlert();
	arrayPage.runButtonClick(); 
	
}

@Then("The user checks invalid console output in Applications of Array")
public void the_user_checks_invalid_console_output_in_applications_of_array() {
	arrayPage.runButtonWithAlert();
}

@Given("User at home page of dsalgo portal for practice questions")
public void user_at_home_page_of_dsalgo_portal_for_practice_questions() {
	LoggerReader.info("User at the try editor page of Pactice Questions ");  
}

@When("The user clicks Pactice Questions link")
public void the_user_clicks_pactice_questions_link() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.practiceQuestionsSearchTheArray();	
	
	
	
}

@Then("The user should be able to navigate to practice questions page")
public void the_user_should_be_able_to_navigate_to_practice_questions_page() {
	LoggerReader.info("User navigate to the try editor page of Pactice Questions "); 
}

@Given("User navigate to search the array for practice questions run button")
public void user_navigate_to_search_the_array_for_practice_questions_run_button() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.practiceQuestionsSearchTheArray();	
	LoggerReader.info("User at the try editor page of Pactice Questions ******** search_the_array_for_practice_questions_run_button ");  
}


@When("user enter the valid pythoncode getting input from sheet {string} and {int} in search the array for practice questions run button")
public void user_enter_the_valid_pythoncode_getting_input_from_sheet_and_in_search_the_array_for_practice_questions_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	
	arrayPage.readExcelRun(sheetName, rowNumber);
	Thread.sleep(3000);
	
}


@Then("The user checks valid console output in practice questions run button")
public void the_user_checks_valid_console_output_in_practice_questions_run_button() {
	LoggerReader.info("User navigate to the try editor page of Pactice Questions run button "); 
	arrayPage.logResultOutput();
}



@Given("User navigate to search the array for practice questions with submit button")
public void user_navigate_to_search_the_array_for_practice_questions_with_submit_button() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.practiceQuestionsSearchTheArray();	
}

@When("user enter the valid pythoncode getting input from sheet {string} and {int} in search the array for practice questions with submit button")
public void user_enter_the_valid_pythoncode_getting_input_from_sheet_and_in_search_the_array_for_practice_questions_with_submit_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
    arrayPage.readExcelSubmit(sheetName, rowNumber);
    Thread.sleep(3000);
}

@Then("The user checks valid console output in practice questions with submit button")
public void the_user_checks_valid_console_output_in_practice_questions_with_submit_button() {
	LoggerReader.info("User navigate to the try editor page of Pactice Questions submit button "); 
	arrayPage.logResultOutput();
}


@Given("User navigate to search the array for practice questions with run button")
public void user_navigate_to_search_the_array_for_practice_questions_with_run_button() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.practiceQuestionsSearchTheArray();	
	LoggerReader.info("User at try editor page for Invalid code of Pactice Questions ******** search_the_array_for_practice_questions_run_button ");  
}

@When("user enter the invalid pythoncode getting input from sheet {string} and {int} in search the array for practice questions run button")
public void user_enter_the_invalid_pythoncode_getting_input_from_sheet_and_in_search_the_array_for_practice_questions_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	
	arrayPage.readExcelRun(sheetName, rowNumber);
	Thread.sleep(3000);
	
}

@Then("The user checks invalid console output in practice questions submit button")
public void the_user_checks_invalid_console_output_in_practice_questions_submit_button() {
	LoggerReader.info("User navigate with Invalid code to the try editor page of Pactice Questions run button "); 
	//arrayPage.logResultOutput();
}


@Given("The user navigate to Practice Questions editor page of Max Consecutive Ones")
public void the_user_navigate_to_practice_questions_editor_page_of_max_consecutive_ones() {
	LoggerReader.info("User navigate to the try editor page of Max Consecutive Ones "); 
}

@When("The user click on Max Consecutive Ones link")
public void the_user_click_on_max_consecutive_ones_link() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.maxConsecutiveOnes();
}

@Then("The user should be able to navigate to Max Consecutive Ones")
public void the_user_should_be_able_to_navigate_to_max_consecutive_ones() {
	LoggerReader.info("The user should be able to navigate to Max Consecutive Ones"); 
}

@Given("The user navigate to try editor of Max Consecutive Ones page")
public void the_user_navigate_to_try_editor_of_max_consecutive_ones_page() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.maxConsecutiveOnes();
}

@When("The user enter the valid python code input from sheet {string} and {int} in Max Consecutive Ones page and clicks on submit button")
public void the_user_enter_the_valid_python_code_input_from_sheet_and_in_max_consecutive_ones_page_and_clicks_on_submit_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {

	arrayPage.readExcelSubmit(sheetName, rowNumber);
	
}

@Then("The user should able to see output in the console")
public void the_user_should_able_to_see_output_in_the_console() {
	LoggerReader.info("User navigate with valid code to the try editor page of Max Consecutive Ones run and submit button "); 
	//arrayPage.logResultOutput();
}



@Given("The user navigate to try editor page of Max Consecutive Ones page")
public void the_user_navigate_to_try_editor_page_of_max_consecutive_ones_page() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.maxConsecutiveOnes();
}

@When("The user enter the invalid python code input from sheet {string} and {int} in Max Consecutive Ones page and clicks on run button")
public void the_user_enter_the_invalid_python_code_input_from_sheet_and_in_max_consecutive_ones_page_and_clicks_on_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
arrayPage.readExcelRun(sheetName, rowNumber);
	
}

@Then("User should able to see output in the console")
public void user_should_able_to_see_output_in_the_console() {
	LoggerReader.info("User navigate with invalid code to the try editor page of Max Consecutive Ones run and submit button "); 
	arrayPage.logResultOutput();
}


@Given("The user navigate to try editor page of Max Consecutive Ones page exceptopn")
public void the_user_navigate_to_try_editor_page_of_max_consecutive_ones_page_exceptopn() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.maxConsecutiveOnes();
}

@When("The user enter the invalid python code input from sheet {string} and {int} in Max Consecutive Ones page and clicks on run button exception")
public void the_user_enter_the_invalid_python_code_input_from_sheet_and_in_max_consecutive_ones_page_and_clicks_on_run_button_exception(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	arrayPage.readExcelRun(sheetName, rowNumber);
}

@Then("User should able to see output in the console exception")
public void user_should_able_to_see_output_in_the_console_exception() {
	LoggerReader.info("User navigate with invalid code to the try editor page of Max Consecutive Ones run and exception submit button "); 
	//arrayPage.logResultOutput();
}




@Given("The user navigate to Practice Questions editor page of Find Numbers with Even Number of Digits")
public void the_user_navigate_to_practice_questions_editor_page_of_find_numbers_with_even_number_of_digits() {
	LoggerReader.info("User navigate to the try editor page of with Even Number of Digits "); 
}

@When("The user click on Find Numbers with Even Number of Digits link")
public void the_user_click_on_find_numbers_with_even_number_of_digits_link() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.findEvennumberDigits();
}

@Then("The user should be able to navigate to Find Numbers with Even Number of Digits")
public void the_user_should_be_able_to_navigate_to_find_numbers_with_even_number_of_digits() {
	LoggerReader.info("The user should be able to navigate to Find Numbers with Even Number of Digits"); 
}

@Given("The user navigate to try editor of Find Numbers with Even Number of Digits page")
public void the_user_navigate_to_try_editor_of_find_numbers_with_even_number_of_digits_page() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.findEvennumberDigits();
	
}

@When("The user enter the valid python code input from sheet {string} and {int} in Find Numbers with Even Number of Digits page and clicks on run button")
public void the_user_enter_the_valid_python_code_input_from_sheet_and_in_find_numbers_with_even_number_of_digits_page_and_clicks_on_run_button(String sheetName, Integer rowNumberNum) throws IOException, InterruptedException {

	//arrayPage.readExcelRun(sheetName, rowNumberNum);
	
}

@Then("The user should be able to see the output in the console")
public void the_user_should_be_able_to_see_the_output_in_the_console() {
	
	LoggerReader.info("User navigate with valid code to the try editor page of Find Numbers with Even Number of Digits page run button "); 
	//arrayPage.logResultOutput();
}

@Given("The user navigate to try editor of Find Numbers with Even Number of Digits page submit")
public void the_user_navigate_to_try_editor_of_find_numbers_with_even_number_of_digits_page_submit() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.findEvennumberDigits();
}

@When("The user enter the valid python code input from sheet {string} and {int} in Find Numbers with Even Number of Digits page and clicks on submit button")
public void the_user_enter_the_valid_python_code_input_from_sheet_and_in_find_numbers_with_even_number_of_digits_page_and_clicks_on_submit_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	
	arrayPage.readExcelSubmit(sheetName, rowNumber);
	Thread.sleep(5000);
}

@Then("The user should be able to see the output in the console submit")
public void the_user_should_be_able_to_see_the_output_in_the_console_submit() {
	arrayPage.logResultOutput();
}

@Given("The user navigate to try editor page of Find Numbers with Even Number of Digits page exception")
public void the_user_navigate_to_try_editor_page_of_find_numbers_with_even_number_of_digits_page() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.findEvennumberDigits();

}

@When("The user enter the invalid python code input from sheet {string} and {int} in Find Numbers with Even Number of Digits page and clicks on run excption button")
public void the_user_enter_the_invalid_python_code_input_from_sheet_and_in_find_numbers_with_even_number_of_digits_page_and_clicks_on_run_exception_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
arrayPage.readExcelRun(sheetName, rowNumber);
}

@Then("User should able to see the output in the console")
public void user_should_able_to_see_the_output_in_the_console() {
	LoggerReader.info("User navigate with invalid code to the try editor page of Find Numbers with Even Number of Digits page run button with exception "); 
}

@Given("The user navigate Practice Questions page from application of array page")
public void the_user_navigate_practice_questions_page_from_application_of_array_page() {
	LoggerReader.info("User navigate to the Squares of a Sorted Array"); 
}

@When("The user Squares of a Sorted Array navigate from Practice Questions page")
public void the_user_squares_of_a_sorted_array_navigate_from_practice_questions_page() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.squareSortedArray();
}

@Then("The user should be able to navigate to Squares of a Sorted Array")
public void the_user_should_be_able_to_navigate_to_squares_of_a_sorted_array() {
	LoggerReader.info("User navigate to the Squares of a Sorted Array"); 
}

@Given("The user navigate to try editor of Sorted Array page valid")
public void the_user_navigate_to_try_editor_of_sorted_array_page_valid() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.squareSortedArray();
}

@When("The user enter the valid python code input from sheet {string} and {int} in Squares of a Sorted Array page and clicks on run button")
public void the_user_enter_the_valid_python_code_input_from_sheet_and_in_squares_of_a_sorted_array_page_and_clicks_on_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	//arrayPage.readExcelRun(sheetName, rowNumber);
	//Thread.sleep(5000);
}

@Then("The user should able to see output in the console Squares of a Sorted Array run")
public void the_user_should_able_to_see_output_in_the_console_squares_of_a_sorted_array() {
	LoggerReader.info("User navigate to the Squares of a Sorted Array Valid Code");
	//arrayPage.logResultOutput();
}

@Given("The user navigate to try editor of Squares of a Sorted Array page valid")
public void the_user_navigate_to_try_editor_of_squares_of_a_sorted_array_page_valid() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.squareSortedArray();
}

@When("The user enter the valid python code input from sheet {string} and {int} in Squares of a Sorted Array page and clicks on submit button")
public void the_user_enter_the_valid_python_code_input_from_sheet_and_in_squares_of_a_sorted_array_page_and_clicks_on_submit_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	arrayPage.readExcelSubmit(sheetName, rowNumber);
	Thread.sleep(5000);
}

@Then("The user should able to see output in the console Squares of a Sorted Array submit")
public void the_user_should_able_to_see_output_in_the_console_squares_of_a_sorted_array_submit() {
	arrayPage.logResultOutput();
}

@Given("The user navigate to try editor of Squares of a Sorted Array page invalid")
public void the_user_navigate_to_try_editor_of_max_consecutive_ones_page_invalid() {
	arrayPage.clickArray();
	arrayPage.applicationOfArray();
	arrayPage.practiceQuestions();
	arrayPage.squareSortedArray();
}

@When("The user enter the invalid python code input from sheet {string} and {int} in Squares of a Sorted Array page and clicks on exception run button")
public void the_user_enter_the_invalid_python_code_input_from_sheet_and_in_squares_of_a_sorted_array_page_and_clicks_on_exception_run_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException {
	arrayPage.readExcelRun(sheetName, rowNumber);
}

@Then("The user should able to see output in the console Squares of a Sorted Array invalid")
public void the_user_should_able_to_see_output_in_the_console_squares_of_a_sorted_array_invalid() {
	LoggerReader.info("User navigate to the Squares of a Sorted Array InValid Code");
}


}
