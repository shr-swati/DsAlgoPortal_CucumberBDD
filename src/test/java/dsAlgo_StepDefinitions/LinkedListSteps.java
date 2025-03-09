package dsAlgo_StepDefinitions;

import org.junit.Assert;

import dsAlgo_PageFactory.LinkedListIntroPage;
import dsAlgo_PageFactory.LinkedListPage;
import dsAlgo_PageFactory.LoginPage;
import dsAlgo_utilities.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListSteps {
	LinkedListPage linkedListPage;
	LoginPage loginPage;
	LinkedListIntroPage linkedListIntroPage;

	@Given("user is on the DsAlgo Home Page")
	public void user_is_on_the_ds_algo_home_page() {
		loginPage = new LoginPage(Helper.getDriver());
		loginPage.doLogin();
	}

	@When("user clicks on Get Started Button under Linked List")
	public void user_clicks_on_get_started_button_under_linked_list() {
		linkedListPage = new LinkedListPage(Helper.getDriver());
		linkedListPage.clickGetStartedButton();
		System.out.println("Linked List Get Started Sucess");
	}

	@Then("user should be able to navigate to Linked List Page")
	public void user_should_be_able_to_navigate_to_linked_list_page() {
		String linkedlistPgTitle = Helper.getTitle();
		Assert.assertEquals("Linked List", linkedlistPgTitle);
	}
	@Given("user is on the Linked List Page")
	public void user_is_on_the_linked_list_page() {
		loginPage = new LoginPage(Helper.getDriver());
		loginPage.doLogin();
		linkedListPage = new LinkedListPage(Helper.getDriver());
		linkedListPage.goToLinkedListPage();
	}
	    
	@When("user clicks on Introduction Link")
	public void user_clicks_on_introduction_link() {
		linkedListPage.clickIntroductionLink();
	}

	@Then("user should be redirected to Introduction Page")
	public void user_should_be_redirected_to_introduction_page() {
		String introductionPgTitle = Helper.getTitle();
		Assert.assertEquals("Introduction", introductionPgTitle);

	}

	@Given("user is on Introduction page")
	public void user_is_on_introduction_page() {
		loginPage = new LoginPage(Helper.getDriver());
		loginPage.doLogin();
		linkedListPage = new LinkedListPage(Helper.getDriver());
		linkedListPage.goToLinkedListPage();
		linkedListPage.clickIntroductionLink();

	}

	@When("user clicks on Try Here Button")
	public void user_clicks_on_try_here_button() throws InterruptedException {
		linkedListIntroPage = new LinkedListIntroPage(Helper.getDriver());
		linkedListIntroPage.clickTryHereButton();
	}

	@Then("user is redirected to tryEditor Page")
	public void user_is_redirected_to_try_editor_page() {
		String tryEditorPgTitle = Helper.getTitle();
		Assert.assertEquals("Assessment", tryEditorPgTitle);
	}

}
