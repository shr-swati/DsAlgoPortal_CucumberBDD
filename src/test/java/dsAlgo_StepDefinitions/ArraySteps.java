package dsAlgo_StepDefinitions;

import org.openqa.selenium.WebDriver;

import dsAlgo_PageFactory.ArrayPage;
import dsAlgo_utilities.BaseClass;
import dsAlgo_utilities.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ArraySteps extends BaseClass{
		
	WebDriver driver;
	ArrayPage arrayPage = new ArrayPage(Helper.getDriver());	
	
	@Given("User is on the Home page of dsalgo portal")
	public void user_is_on_the_home_page_of_dsalgo_portal() {		
		Helper.naviageToHomePage();
	}

	@When("User clicks on Get Started button under Array section")
	public void user_clicks_on_get_started_button_under_array_section() {		
		System.out.println("at array page");
		arrayPage.clickArray();
	}

	@Then("User is navigated to Array page")
	public void user_is_navigated_to_array_page() {
		System.out.println("Navigate to array page");
		String ArrayPgTitle = Helper.getTitle();
	    Assert.assertEquals("Array", ArrayPgTitle );
	}
	
	@Given("User is on the Array Page")
	public void user_is_on_the_array_page() {
		Helper.naviageToHomePage(); 
		arrayPage.clickArray();
	}
	
	@When("user clicks on Arrays In Python Link")
	public void user_clicks_on_arrays_in_python_link() {
	   arrayPage.clickArrayInPython();
	}

	@Then("user should be redirected to Arrays In Python Page")
	public void user_should_be_redirected_to_arrays_in_python_page() {
		System.out.println("Navigate to array in python page");
		String ArrayPgTitle = Helper.getTitle();
	    Assert.assertEquals("Arrays in Python", ArrayPgTitle );
		
	}
	
	@Given("user is navigate to the tryEditor")
	public void user_is_navigate_to_the_try_editor() {	
		Helper.naviageToHomePage();
		arrayPage.clickArray();
		arrayPage.clickArrayInPython();
		arrayPage.tryHereBtnArrayInPython();
	}

	@When("user enter valid pythoncode")
	public void user_enter_valid_pythoncode() {
	  arrayPage.textAreaSendKey();
	  arrayPage.runButtonClick(); 	  
	}

	@Then("The user checks output in the console output")
	public void the_user_checks_output_in_the_console_output() {
	 arrayPage.resultOutput();
	}
}
