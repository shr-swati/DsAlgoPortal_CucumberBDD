Feature: Tree
 #Scenario1
  Scenario Outline: Verify that user able to see warning message while selecting "Data Structures" from the drop down without Sign in
    Given The user is on the Home page "https://dsportalapp.herokuapp.com"
    When The user selects "Data Structures" from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"
   #Scenario2 
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Tree" on the home page without Sign in
     Given The user is on the Home page "https://dsportalapp.herokuapp.com/home"
     When The user clicks Get Started buttons of Tree on the homepage without Sign in
     Then The user should able to see an warning message 'You are not logged in'
   #Scenario3
   
  Scenario Outline: Verify that user is able to click on 'Get started' button of "Tree" on the home page after giving valid username and password
     Given The user is on the Home page "https://dsportalapp.herokuapp.com/home"
     When The user gets data from excel sheet '<Sheetname>' and <RowNumber> for the login page and clicks Get Started button
     Then The user should able to redirect to the tree page
     
      Examples: 
      | Sheetname   | RowNumber |
      | Valid_Login |         1 |
      
   #Scenario4 
   Scenario: Verify that user is able to click on the link Overview of Trees from the Tree page  
   Given The user is on the Tree page
   When The user clicks on the link Overview of Trees
   Then The user should able to redirect to the Overview of Trees page 
    
    
    #Scenario5
    Scenario: Verify that user is able to click on the button Try here >>> from the 'Overview of Trees' page  
    Given The user is on the Overview of Trees page
    When The user clicks on the button Try here >>> from the Overview of Trees page after getting in the Tree page
    Then The user should able to redirect to a new page with text area for trying the code  
    #Scenario6,7
   Scenario Outline: Verify that user is able to type 'python code' in the text area and click on run button
    Given The user is on the try here textarea of Overview of Trees page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber> 
    
      Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
      | Tree |         2 |
    
    #Scenario7
    #Scenario: Verify that user is able to see an alert message while clicking on the Run button without giving any input in the code textarea
    #Given The user is on the try here textarea of Overview of Trees page
    #When The user click on the run button in the code try page without giving any code in the text area of Overview of Trees page
    #Then The user should be able to receive an alert message
    #Scenario8
   # Scenario: Verify that user able to see an alert warning message while giving some alphanumeric letters in the text area for trying the code
   # Given The user is on the try here textarea of Overview of Trees page
   # When The user click on the run button in the code try page after giving random alphanumeric characters in the text area of Overview of Trees page 
   # Then The user should be able to receive an alert message
  
  
   #Scenario8,9,10,11,12
    Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Overview of Trees page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

    Examples:
       | Sheetname   | RowNumber |
       | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
       | Tree        |         7 |
   
   #Scenario13
   Scenario: Verify user is able to  navigate to the previous page Overview of trees on clicking browser back button
      Given The user is on the try here textarea of Overview of Trees page
    	When The user try to click on the browser back button from the tryeditor page
    	Then The user should be able to navigate to the previous page from the try here page ie, Overview of Trees page
     #Scenario14
   Scenario: Verify that user is able to click on the link Terminologies from the Tree page  
      Given The user is on the Tree page
    	When The user clicks on the link Terminologies on the Tree page after Sign in
    	Then The user should able to redirect to the Terminologies page 
    #Scenario15
    Scenario: Verify that user is able to click on the button Try here >>> from Terminologies page  
    Given The user is on the Terminologies page
    When The user clicks on the button Try here >>> from the Terminologies page
    Then The user should able to redirect to a new page with text area for trying the code  
    
    #Scenario16,17
    Scenario Outline: Verify that user is able to type python code in the text area of 'Terminologies' page  
    Given The user is on the Terminologies page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
      | Tree |         2 |
      
    #Scenario18,19,20,21,22  
    Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Terminologies page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

    Examples:
       | Sheetname   | RowNumber |
       | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
       | Tree        |         7 |
   