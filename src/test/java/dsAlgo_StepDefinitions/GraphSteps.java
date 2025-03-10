package dsAlgo_StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dsAlgo_PageFactory.GraphPage;
import dsAlgo_PageFactory.LoginPage;
import dsAlgo_PageFactory.TreePage;
import dsAlgo_utilities.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphSteps {
	WebDriver driver;
	TreePage treePage;
	LoginPage loginPage;
	GraphPage graphPage;

	//Scenario1
	@When("The user selects Graph frpm Data Structures")
	public void the_user_selects_graph_frpm_data_structures() {
		graphPage = new GraphPage(Helper.getDriver());

		graphPage.ClickDS();
		graphPage.ClickDS_Graph();
	}
	//Scenario2
	@Given("The user is on the Home page" )
	public void the_user_is_on_the_home_page() {
		graphPage = new GraphPage(Helper.getDriver());
		Helper.openPage("https://dsportalapp.herokuapp.com/home");
	}

	@When("The user clicks Get Started buttons of Graph on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_graph_on_the_homepage_without_sign_in() {
		
		graphPage.ClickGetStarted();

	}
	@Then("The user should able to see an warning message_graph {string}")
	public void the_user_should_able_to_see_an_warning_message(String string) throws InterruptedException { 
			    
		Assert.assertEquals(graphPage.getmsg(),"You are not logged in");
		System.out.println("not logged in");

	}

}
