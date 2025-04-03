package dsAlgo_StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import dsAlgo_PageFactory.HomePage;
import dsAlgo_Reader.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

	HomePage homePage = new HomePage();

	@Given("User is in the ds-algo launch page")
	public void user_is_in_the_ds_algo_launch_page() {
		homePage.launchURL();
	}

	@When("User clicks the Get Started button")
	public void User_clicks_the_Get_Started_button() {
		homePage.getStartedHomeBtnClick();
	}

	@Then("User should be able to navigate to the home page")
	public void user_should_be_able_to_navigate_to_the_home_page() {
		Assert.assertEquals(homePage.dataStructureDropDownDisplayed(), true);
	}

	@When("User clicks on the Data Structures dropdown")
	public void user_clicks_on_the_data_structures_dropdown() {
		homePage.dataStructureDropDownClick();
	}

	@Then("User should be able to see the options: Arrays, Linked List, Stack, Queue, Tree, Graph in the dropdown menu")
	public void user_should_be_able_to_see_the_options_arrays_linked_list_stack_queue_tree_graph_in_the_dropdown_menu() {
		Assert.assertEquals(homePage.dataStructureDropDownDisplayed(), true);
	}

	@When("User selects Arrays from the dropdown without signing in")
	public void user_selects_arrays_from_the_dropdown_without_signing_in() {
		homePage.dataStructureDropDownClick();
		homePage.arraysBtnClick();
	}

	@Then("User should be able to see a warning message You are not logged in")
	public void user_should_be_able_to_see_a_warning_message_you_are_not_logged_in() {
		String homeText = homePage.getHomeLogMessage();
		assertEquals("You are not logged in", homeText);
	}

	@When("User selects Linked List from the dropdown without signing in")
	public void user_selects_linked_list_from_the_dropdown_without_signing_in() {
		homePage.dataStructureDropDownClick();
		homePage.linkedListBtnClick();
	}

	@When("User selects Stack from the dropdown without signing in")
	public void user_selects_stack_from_the_dropdown_without_signing_in() {
		homePage.dataStructureDropDownClick();
		homePage.stackBtnClick();
	}

	@When("User selects Queue from the dropdown without signing in")
	public void user_selects_queue_from_the_dropdown_without_signing_in() {
		homePage.dataStructureDropDownClick();
		homePage.queueBtnClick();
	}

	@When("User selects Tree from the dropdown without signing in")
	public void user_selects_tree_from_the_dropdown_without_signing_in() {
		homePage.dataStructureDropDownClick();
		homePage.treeBtnClick();
	}

	@When("User selects Graph from the dropdown without signing in")
	public void user_selects_graph_from_the_dropdown_without_signing_in() {
		homePage.dataStructureDropDownClick();
		homePage.graphBtnClick();
	}

	@When("User clicks on the launch page other than the Get Started")
	public void user_clicks_on_the_launch_page_other_than_the_get_started() {
		homePage.randomClickMethod();
	}

	@Then("User should stay in the same launch page")
	public void user_should_stay_in_the_same_launch_page() {
		System.out.println("User is in Launch Page");
	}

	@When("User clicks on the launch page other than the Get Started button")
	public void user_clicks_on_the_launch_page_other_than_the_get_started_button() {
		homePage.randomClickMethod();
	}

	@Then("User should not be able to navigate to the home page")
	public void user_should_not_be_able_to_navigate_to_the_home_page() {
		LoggerReader.info("User is in Home Page");
	}

	@Then("The user is in Home Page")
	public void the_user_is_in_home_page() {
		LoggerReader.info("User is in Home Page");
	}
}