Feature: Tree
 #Scenario1
  Scenario Outline: Verify that user able to see warning message while selecting "Data Structures" from the drop down without Sign in
    Given The user is on the Home page "https://dsportalapp.herokuapp.com/home"
    When The user selects "Data Structures" from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"
   #Scenario2 
    Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Tree" on the home page without Sign in
    Given The user is on the Home page "https://dsportalapp.herokuapp.com/home"
    When The user clicks Get Started buttons of Tree on the homepage without Sign in
    Then The user should able to see an warning message 'You are not logged in'
   #Scenario3
    Scenario: Verify that user is able to click on 'Get started' button of "Tree" on the home page after giving valid username and password
    Given The user is on the Home page "https://dsportalapp.herokuapp.com/home"
    When The user clicks Get Started buttons of Tree on the homepage after Sign in with valid "sdet199list" and "Static123@"
    Then The user should able to redirect to the tree page
   #Scenario4 
    Scenario: Verify that user is able to click on the link Overview of Trees from the Tree page  
    Given The user is on the Tree page
    When The user clicks on the link Overview of Trees  on the Tree page after Sign in
    Then The user should able to redirect to the Overview of Trees page 