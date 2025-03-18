Feature: Graph

#Scenario1
 Scenario: Verify that user able to see warning message while selecting Graph from the dropdown Data Structures without Sign in
  Given The user is on the Home page "https://dsportalapp.herokuapp.com/home"
  When The user selects Graph frpm Data Structures
  Then The user should able to see an warning message "You are not logged in"

#Scenario2
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Graph" on the home page without Sign in
  Given The user is on the Home page 
  When The user clicks Get Started buttons of Graph on the homepage without Sign in
  Then The user should able to see an warning message_graph "You are not logged in"
  
  #Scenario3
  