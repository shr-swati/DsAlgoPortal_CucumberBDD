package dsAlgo_StepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import dsAlgo_PageFactory.LoginPage;
import dsAlgo_PageFactory.TreePage;
import dsAlgo_utilities.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeSteps {

	WebDriver driver;
	TreePage treePage;
	LoginPage loginPage;
	
		
	//Scenario1 
	@Given("The user is on the Home page {string}")
	public void the_user_is_on_the_home_page(String url) {
		treePage = new TreePage(Helper.getDriver());
		Helper.openPage(url);
	}

	@When("The user selects {string} from the drop down without Sign in.")
	public void the_user_selects_from_the_drop_down_without_sign_in(String string) {
		treePage.ClickDS();
		treePage.ClickDS_Tree();
	}

	@Then("The user should able to see an warning message {string}")
	public void the_user_should_able_to_see_an_warning_message(String string) throws InterruptedException { 
			    
		Assert.assertEquals(treePage.getmsg(),"You are not logged in");
		System.out.println("not logged in");

	}

	//Scenario2
	

	@When("The user clicks Get Started buttons of Tree on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_tree_on_the_homepage_without_sign_in() {
		
		treePage.ClickGetStarted();
		
		
	}
	
	//Scenario3
	@When("The user clicks Get Started buttons of Tree on the homepage after Sign in with valid {string} and {string}")
	public void the_user_clicks_get_started_buttons_of_tree_on_the_homepage_after_sign_in_with_valid_and(String string, String string2) {
		

		loginPage = new LoginPage(Helper.getDriver());
		loginPage.clickGetStarted();
		loginPage.clickSignIn();
		loginPage.enterUsername("sdet199list");
		loginPage.enterPassword("Static123@");
		loginPage.clickLogin();
		treePage.ClickGetStarted();

	}


	@Then("The user should able to redirect to the tree page")
public void the_user_should_able_to_redirect_to_the_tree_page() {
	
		String TreePgTitle = Helper.getTitle();
		Assert.assertEquals("Tree", TreePgTitle);
}
	//Scenario4
	
	@Given("The user is on the Tree page")
	public void the_user_is_on_the_tree_page() {
		
		loginPage = new LoginPage(Helper.getDriver());
		the_user_is_on_the_home_page("https://dsportalapp.herokuapp.com/home");
		loginPage.clickSignIn();
		loginPage.enterUsername("sdet199list");
		loginPage.enterPassword("Static123@");
		loginPage.clickLogin();
		treePage.ClickGetStarted();
		
		
	}

	@When("The user clicks on the link Overview of Trees  on the Tree page after Sign in")
	public void the_user_clicks_on_the_link_overview_of_trees_on_the_tree_page_after_sign_in() {
		
		treePage.ClickOverview_of_Trees();
	}
	

	@Then("The user should able to redirect to the Overview of Trees page")
	public void the_user_should_able_to_redirect_to_the_overview_of_trees_page() {
		String Overview_of_TreesPgTitle = Helper.getTitle();
		Assert.assertEquals("Overview of Trees", Overview_of_TreesPgTitle);
	}

}

