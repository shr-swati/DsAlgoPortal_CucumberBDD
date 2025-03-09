package dsAlgo_StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dsAlgo_PageFactory.LinkedListPage;
import dsAlgo_utilities.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListSteps {
	LinkedListPage linkedListPage;
	
	@Given("user is on the DsAlgo Home Page")
	public void user_is_on_the_ds_algo_home_page() {
	    linkedListPage = new LinkedListPage(Helper.getDriver());
	    Helper.naviageToHomePage();
	}

	@When("user clicks on Get Started Button under Linked List")
	public void user_clicks_on_get_started_button_under_linked_list() {
	    linkedListPage.clickGetStartedButton();
	    System.out.println("Linked List Get Started Sucess");
	}

	@Then("user should be able to navigate to Linked List Page")
	public void user_should_be_able_to_navigate_to_linked_list_page() {
	    	    String linkedlistPgTitle = Helper.getTitle();
	    	    Assert.assertEquals("Linked List", linkedlistPgTitle );
	}
	@When("user clicks on Introduction Link")
	public void user_clicks_on_introduction_link() {
		 linkedListPage.clickIntroductionLink();
	}

	@Then("user should be redirected to Introduction Page")
	public void user_should_be_redirected_to_introduction_page() {
		 String introductionPgTitle = Helper.getTitle();
 	    Assert.assertEquals("Introduction", introductionPgTitle );
	}
	
}
