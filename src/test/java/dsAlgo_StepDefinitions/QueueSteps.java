package dsAlgo_StepDefinitions;

import org.junit.Assert;


import dsAlgo_PageFactory.LoginPage;
import dsAlgo_PageFactory.QueuePage;
import dsAlgo_utilities.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueSteps {
	
	QueuePage queuePage;
	LoginPage loginPage;
	
	@When("user clicks on Get Started Button under Queue Page")
	public void user_clicks_on_get_started_button_under_queue_page() {
		queuePage = new QueuePage(Helper.getDriver());
		queuePage.clickGetStartedButton();
	}

	@Then("user should be able to navigate to Queue Page")
	public void user_should_be_able_to_navigate_to_queue_page() {
		
		String queuePgTitle = Helper.getTitle();
		Assert.assertEquals("Queue", queuePgTitle);
	}   
	@Given("user is on the Queue Page")
	public void user_is_on_the_queue_page() {
		loginPage = new LoginPage(Helper.getDriver());
		loginPage.doLogin();
        queuePage = new QueuePage(Helper.getDriver());                           
		queuePage.goToQueuePage();
	}

	@When("user clicks on Implementation of Queue in Python Link")
	public void user_clicks_on_implementation_of_queue_in_python_link() {
		queuePage.clickImplementationOfQueueInPythonLink();
	}

	@Then("user should be redirected to Implementation of Queue in Python Page")
	public void user_should_be_redirected_to_implementation_of_queue_in_python_page() {
		String implementationOfQueueInPythonPgTitle = Helper.getTitle();
		Assert.assertEquals("Implementation of Queue in Python", implementationOfQueueInPythonPgTitle); 
	}

	
		
	}



