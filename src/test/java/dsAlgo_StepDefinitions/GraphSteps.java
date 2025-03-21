package dsAlgo_StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageFactory.GraphPage;
import dsAlgo_PageFactory.HomePage;
import dsAlgo_PageFactory.LoginPage;
import dsAlgo_PageFactory.TreePage;
import dsAlgo_Reader.ExcelReader;
import dsAlgo_Reader.TryEditor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphSteps {
	WebDriver driver;
	TreePage treePage = new TreePage();
	HomePage homePage = new HomePage();
	GraphPage graphPage = new GraphPage();
	LoginPage loginPage=new LoginPage();
	  ExcelReader readExcel = new ExcelReader();
	  TryEditor tryeditor =new TryEditor();
	
	 

	//Scenario1
	@When("The user selects Graph frpm Data Structures")
	public void the_user_selects_graph_frpm_data_structures() {
		homePage.dataStructureDropDownClick();
		homePage.treeBtnClick();
	
	}
	//Scenario2
	@Given("The user is on the Home page" )
	public void the_user_is_on_the_home_page() {
		homePage.launchURL();
		homePage.getStartedHomeBtnClick();
	}

	@When("The user clicks Get Started buttons of Graph on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_graph_on_the_homepage_without_sign_in() {
		
		graphPage.ClickGetStarted();

	}
	@Then("The user should able to see an warning message_graph {string}")
	public void the_user_should_able_to_see_an_warning_message(String string) throws InterruptedException { 
			    
		loginPage.LoggedMessageSignIn("You are not logged in");
		String homeText = homePage.getHomeLogMessage(); 
		assertEquals("You are not logged in", homeText); 

	}

	
	///new
	///
//Scenario3
	
	@When("The user gets data from excel sheet {string} and {int} for the login page and clicks Graphs Get Started button")
	public void the_user_gets_data_from_excel_sheet_and_for_the_login_page_and_clicks_graphs_get_started_button(String sheetName, Integer rowNumber) throws IOException {
		graphPage.ClickSignin();
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
	    loginPage.userName.sendKeys(credentials[0]);
		loginPage.passWord.sendKeys(credentials[1]);
		loginPage.LoginBtnClick();  
		
		graphPage.ClickGetStarted();
	}
	
@Then("The user should able to redirect to the Graph page")
public void the_user_should_able_to_redirect_to_the_graph_page() {
	String Graph = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Graph", Graph);
}

//Scenario4
@Given("The user is on the Graph page")
public void the_user_is_on_the_graph_page() throws IOException {
	the_user_is_on_the_home_page();
	homePage.getStartedHomeBtnClick();
	String sheetName = "Valid_Login"; // Define the sheet name
	Integer rowNumber = 1; // Define the row number
	the_user_gets_data_from_excel_sheet_and_for_the_login_page_and_clicks_graphs_get_started_button(sheetName,rowNumber);
}

@When("The user clicks on the sublink Graph on the Graph page")
public void the_user_clicks_on_the_sublink_graph_on_the_graph_page() {
    graphPage.Clickgraph();
}

@Then("The user should redirect to the sublink Graph page")
public void the_user_should_redirect_to_the_sublink_graph_page() {
	String Graph = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Graph", Graph);
}
//Scenario5
@Given("The user is on the sublink Graph page")
public void the_user_is_on_the_sublink_graph_page() throws IOException {
	the_user_is_on_the_graph_page();
	graphPage.Clickgraph();
}

@When("The user clicks on the button Try here >>> from the sublink Graph page")
public void the_user_clicks_on_the_button_try_here_from_the_sublink_graph_page() {
    graphPage.ClickTry_here();
}
//Scenario6
@Given("The user is on the try here textarea of sublink Graph page")
public void the_user_is_on_the_try_here_textarea_of_sublink_graph_page() throws IOException {
	the_user_is_on_the_sublink_graph_page();
	graphPage.ClickTry_here();
}




//Scenario11
@Then("The user should be able to navigate to the previous page from the try here page ie, Graph page")
public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_graph_page() {
	the_user_should_redirect_to_the_sublink_graph_page();
}

@When("The user clicks on the link Graph Representations on the Graph page")
public void the_user_clicks_on_the_link_graph_representations_on_the_graph_page() {
    graphPage.Clickgraph_representations();
}

@Then("The user should redirect to the Graph Representations page")
public void the_user_should_redirect_to_the_graph_representations_page() {
	String Graph_Representations = DriverFactory.getDriver().getTitle();
	 Assert.assertEquals("Graph Representations", Graph_Representations);
}

@Given("The user is on the Graph Representations page")
public void the_user_is_on_the_graph_representations_page() throws IOException {
	the_user_is_on_the_graph_page();
	graphPage.Clickgraph_representations();
}

@When("The user clicks on the button Try here >>> from the Graph Representations page")
public void the_user_clicks_on_the_button_try_here_from_the_graph_representations_page() {
    graphPage.ClickTry_here();
}

@Given("The user is on the try here textarea of Graph Representations page")
public void the_user_is_on_the_try_here_textarea_of_graph_representations_page() throws IOException {
	the_user_is_on_the_graph_representations_page();
	graphPage.ClickTry_here();
}

@Then("The user should be able to navigate to the previous page from the try here page ie, Graph Representations page")
public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_graph_representations_page() {
	the_user_should_redirect_to_the_graph_representations_page();
}



@When("The user clicks on the link Practice Questions on the Graph page")
public void the_user_clicks_on_the_link_practice_questions_on_the_graph_page() {
	graphPage.Clickgraph();
	graphPage.ClickPractice_Questions();
}




}
