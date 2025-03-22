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
   Scenario Outline: Verify that user is able to click on graphs Get started button of Graph on the home page after giving valid username and password
     Given The user is on the Home page "https://dsportalapp.herokuapp.com/home"
     When The user gets data from excel sheet '<Sheetname>' and <RowNumber> for the login page and clicks Graphs Get Started button
     Then The user should able to redirect to the Graph page
     
      Examples: 
      | Sheetname   | RowNumber |
      | Valid_Login |         1 |
      
  #Scenario4
  
  
  Scenario: Verify that user is able to click on the sublink Graph from the Tree page  
   Given The user is on the Graph page
   When The user clicks on the sublink Graph on the Graph page 
   Then The user should redirect to the sublink Graph page 
   #Scenario5
   
   Scenario: Verify that user is able to click on the button Try here >>> from the sublink Graph page  
   Given The user is on the sublink Graph page
   When The user clicks on the button Try here >>> from the sublink Graph page 
   Then The user should able to redirect to a new page with text area for trying the code 
   
   #Scenario6
   Scenario Outline: Verify that user is able to type python code in the text area of sublink Graph page  
    Given The user is on the try here textarea of sublink Graph page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Graph |         1 |
      
      #Scenario7,8,9,10
    Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of sublink Graph page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

     Examples:
       | Sheetname   | RowNumber |
       | Graph        |         2 |
       | Graph        |         4 |
       | Graph        |         5 |
       | Graph        |         6 |
   
   #Scenario11
   Scenario: Verify user is able to  navigate to the previous page sublink Graph on clicking browser back button
   Given The user is on the try here textarea of sublink Graph page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Graph page
   
   #Graph Representations
   Scenario: Verify that user is able to click on the link Graph Representations from the Graph page  
   Given The user is on the Graph page
   When The user clicks on the link Graph Representations on the Graph page 
   Then The user should redirect to the Graph Representations page 
   
   #Scenario 43
   Scenario: Verify that user is able to click on the button Try here >>> from the Graph Representations page  
   Given The user is on the Graph Representations page
   When The user clicks on the button Try here >>> from the Graph Representations page 
   Then The user should able to redirect to a new page with text area for trying the code 
   #Scenario 44
   Scenario Outline: Verify that user is able to type python code in the text area of Graph Representations page  
    Given The user is on the try here textarea of Graph Representations page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Graph |         1 |
     #Scenario 45 
      Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Graph Representations page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

     Examples:
       | Sheetname   | RowNumber |
       | Graph        |         2 |
       | Graph        |         4 |
       | Graph        |         5 |
       | Graph        |         6 |
   
   #Scenario 46
   Scenario: Verify user is able to  navigate to the previous page Graph Representations on clicking browser back button
   Given The user is on the try here textarea of Graph Representations page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Graph Representations page
   
   #Practice Questions
   Scenario: Verify that user is able to click on the link Practice Questions from the Graph page  
   Given The user is on the Graph page
   When The user clicks on the link Practice Questions on the Graph page 
   Then The user should redirect to the Practice Questions page 
   
   Scenario: Verify that user is able to view content in the Practice question page  
   Given The user is on the Graph page
   When The user clicks on the link Practice Questions on the Graph page 
   Then The user should able to view the content in Practice Questions page 
   
   
   