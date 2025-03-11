package dsAlgo_StepDefinitions;

import org.openqa.selenium.WebDriver;

import dsAlgo_PageFactory.LoginPage;
import dsAlgo_utilities.BaseClass;
import dsAlgo_utilities.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class LoginSteps extends BaseClass {
	WebDriver driver;
	LoginPage loginPage;

	@Given("User Launches Chrome Browser")
	public void user_launches_chrome_browser() {
		loginPage = new LoginPage(Helper.getDriver());

	}

	@When("User opens DsAlgo Portal link {string}")
	public void user_opens_dsalgo_portal_link(String url) {
		Helper.openPage(url);
	}

	@Then("User clicks on Get Started button")
	public void user_clicks_on_get_started_button() {
		loginPage.clickGetStarted();
	}

	@Then("User should see the page title {string}")
	public void user_should_see_the_page_title(String string) {
		String loginPgTitle = Helper.getTitle();
		Assert.assertEquals(string, loginPgTitle);
	}

	@Then("User clicks on Signin link")
	public void user_clicks_on_signin_link() {
		loginPage.clickSignIn();
	}

	@Then("User enters username sdet199list and password Static123@")
	public void user_enters_username_and_password() {
		loginPage.enterUsername("sdet199list");
		loginPage.enterPassword("Static123@");

	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLogin();
	}

	@Then("User is logged in with expected status Pass")
	public void user_is_logged_in_with_expected_status_pass() throws InterruptedException {
		Assert.assertEquals(loginPage.getAlert(), "You are logged in");
		System.out.println("Login Successful");

	}

}
