package dsAlgo_StepDefinitions;

	import org.openqa.selenium.WebDriver;

	import dsAlgo_PageFactory.RegistrationPage;
	import dsAlgo_utilities.BaseClass;
	import dsAlgo_utilities.Helper;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	import org.junit.Assert;

	public class RegistrationSteps extends BaseClass {
		WebDriver driver;
		RegistrationPage registrationPage;

		@Given("User Launches the Chrome Browser")
		public void user_launches_the_chrome_browser() {
			registrationPage = new RegistrationPage(Helper.getDriver());

		}

		@When("User opens the DsAlgo Portal link {string}")
		public void user_opens_the_dsalgo_portal_link(String url) {
			Helper.openPage(url);
		}

		@Then("User clicks on the Get Started button")
		public void user_clicks_on_the_get_started_button() {
			registrationPage.clickGetStarted();
		}

		@Then("User should see page title {string}")
		public void user_should_see_page_title(String string) {
			String registrationPgTitle = Helper.getTitle();
			Assert.assertEquals(string, registrationPgTitle);
		}
		
		@Then("User clicks on Register link")
		public void user_clicks_on_Register_link() {
			registrationPage.clickRegister();
		}

		
		@Then("User enters username as register199batch and passwords as Static123 Static123@")
		public void user_enters_username_as_and_passwords_as () {
			registrationPage.enterUsername("register199batch");
			registrationPage.enterPassword("Static123");
			registrationPage.enterConfirmPassword("Static123@");

		}

		@Then("User clicks on Register button")
		public void user_clicks_on_Register_button() {
			registrationPage.clickRegisterButton();
		}

		@Then("User gets error on page Fail")
		public void user_gets_error_on_page_Fail() throws InterruptedException {
			Assert.assertEquals(registrationPage.getAlert(), "password_mismatch:The two password fields didn’t match.");
			System.out.println("Registration unsuccessful");

		}

	}
