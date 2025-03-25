Feature: Tree
 #Scenario1
  Scenario Outline: Verify that user able to see warning message while selecting "Data Structures" from the drop down without Sign in
    Given The user is on the Home page
    When The user selects "Data Structures" from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"
   #Scenario2 
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Tree" on the home page without Sign in
     Given The user is on the Home page
     When The user clicks Get Started buttons of Tree on the homepage without Sign in
     Then The user should able to see an warning message 'You are not logged in'
   #Scenario3
   
  Scenario Outline: Verify that user is able to click on 'Get started' button of "Tree" on the home page after giving valid username and password
     Given The user is on the Home page
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
   
     #Scenario8,9,10,11,12
    Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Overview of Trees page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

    Examples:
       | Sheetname   | RowNumber |
       | Tree        |         2 |
      # | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
   
   #Scenario13
   Scenario: Verify user is able to  navigate to the previous page Overview of trees on clicking browser back button
      Given The user is on the try here textarea of Overview of Trees page
    	When The user try to click on the browser back button
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
    Given The user is on the try here textarea of Terminologies page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
   
      
    #Scenario18,19,20,21,22  
    Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Terminologies page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

     Examples:
       | Sheetname   | RowNumber |
       | Tree        |         2 |
      # | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
   #Scenario23
   Scenario: Verify user is able to  navigate to the previous page Terminologies on clicking browser back button
   Given The user is on the try here textarea of Terminologies page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Terminologies page
   
   #Sceanrio 24
   Scenario: Verify that user is able to click on the link Types of Trees from the Tree page  
   Given The user is on the Tree page
   When The user clicks on the link Types of Trees on the Tree page 
   Then The user should redirect to the Types of Trees page 
   
   #Scenario 25
   Scenario: Verify that user is able to click on the button Try here >>> from the Types of Trees page  
   Given The user is on the Types of Trees page
   When The user clicks on the button Try here >>> from the Types of Trees page 
   Then The user should able to redirect to a new page with text area for trying the code  
   
   #Scenario 26,27
   Scenario Outline: Verify that user is able to type python code in the text area of Types of Trees page
   Given The user is on the try here textarea of Types of Trees page
   When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
   Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
       
    Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
      
   #Scenario 28,29,30,31,32
    Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Types of Trees page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

    Examples:
       | Sheetname   | RowNumber |
       | Tree        |         2 |
      # | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
       
       #Scenario33
   Scenario: Verify user is able to  navigate to the previous page Types of Trees on clicking browser back button
   Given The user is on the try here textarea of Types of Trees page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Types of Trees page
   
   
   #Scenario 34
   
   Scenario: Verify that user is able to click on the link Tree Traversals from the Tree page  
   Given The user is on the Tree page
   When The user clicks on the link Tree Traversals on the Tree page 
   Then The user should redirect to the Tree Traversals page 
   
   #Scenario 35
   Scenario: Verify that user is able to click on the button Try here >>> from the Tree Traversals page  
   Given The user is on the Tree Traversals page
   When The user clicks on the button Try here >>> from the Tree Traversals page 
   Then The user should able to redirect to a new page with text area for trying the code 
   
   #Scenario 36
   Scenario Outline: Verify that user is able to type python code in the text area of Tree Traversals page  
    Given The user is on the try here textarea of Tree Traversals page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
    
    #scenario 37,38,39,40  
      Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Tree Traversals page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

     Examples:
       | Sheetname   | RowNumber |
       | Tree        |         2 |
      # | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
   
   #Scenario 41
   Scenario: Verify user is able to  navigate to the previous page Tree Traversals on clicking browser back button
   Given The user is on the try here textarea of Tree Traversals page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Tree Traversals page
   
   
  #Traversals-Illustration'
  #Scenario 42
   Scenario: Verify that user is able to click on the link Traversals-Illustration from the Tree page  
   Given The user is on the Tree page
   When The user clicks on the link Traversals-Illustration on the Tree page 
   Then The user should redirect to the Traversals-Illustration page 
   
   #Scenario 43
   Scenario: Verify that user is able to click on the button Try here >>> from the Traversals-Illustration page  
   Given The user is on the Traversals-Illustration page
   When The user clicks on the button Try here >>> from the Traversals-Illustration page 
   Then The user should able to redirect to a new page with text area for trying the code 
   #Scenario 44
   Scenario Outline: Verify that user is able to type python code in the text area of Traversals-Illustration page  
    Given The user is on the try here textarea of Traversals-Illustration page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
     #Scenario 45 
      Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Traversals-Illustration page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

     Examples:
       | Sheetname   | RowNumber |
       | Tree        |         2 |
      # | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
   
   #Scenario 46
   Scenario: Verify user is able to  navigate to the previous page Traversals-Illustration on clicking browser back button
   Given The user is on the try here textarea of Traversals-Illustration page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Traversals-Illustration page
   
   #Binary trees
   
   Scenario: Verify that user is able to click on the link Binary Trees from the Tree page  
   Given The user is on the Tree page
   When The user clicks on the link Binary Trees on the Tree page 
   Then The user should redirect to the Binary Trees page 
   
   
   Scenario: Verify that user is able to click on the button Try here >>> from the Binary Trees page  
   Given The user is on the Binary Trees page
   When The user clicks on the button Try here >>> from the Binary Trees page 
   Then The user should able to redirect to a new page with text area for trying the code 
   
   Scenario Outline: Verify that user is able to type python code in the text area of Binary Trees page  
    Given The user is on the try here textarea of Binary Trees page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
      
      Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Binary Trees page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

     Examples:
       | Sheetname   | RowNumber |
       | Tree        |         2 |
      # | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
   
   
   Scenario: Verify user is able to  navigate to the previous page Binary Trees on clicking browser back button
   Given The user is on the try here textarea of Binary Trees page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Binary Trees page
   
   
   #Types of Binary Trees
   Scenario: Verify that user is able to click on the link Types of Binary Trees from the Tree page  
   Given The user is on the Tree page
   When The user clicks on the link Types of Binary Trees on the Tree page 
   Then The user should redirect to the Types of Binary Trees page 
   
   
   Scenario: Verify that user is able to click on the button Try here >>> from the Types of Binary Trees page  
   Given The user is on the Types of Binary Trees page
   When The user clicks on the button Try here >>> from the Types of Binary Trees page 
   Then The user should able to redirect to a new page with text area for trying the code 
   
   Scenario Outline: Verify that user is able to type python code in the text area of Types of Binary Trees page  
    Given The user is on the try here textarea of Types of Binary Trees page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
      
    Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Types of Binary Trees page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

     Examples:
       | Sheetname   | RowNumber |
       | Tree        |         2 |
      # | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
   
   
   Scenario: Verify user is able to  navigate to the previous page Types of Binary Trees on clicking browser back button
   Given The user is on the try here textarea of Types of Binary Trees page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Types of Binary Trees page
   
  #Implementation in Python
  
   Scenario: Verify that user is able to click on the link Implementation in Python from the Tree page  
   Given The user is on the Tree page
   When The user clicks on the link Implementation in Python on the Tree page 
   Then The user should redirect to the Implementation in Python page 
   
   
   Scenario: Verify that user is able to click on the button Try here >>> from the Implementation in Python page  
   Given The user is on the Implementation in Python page
   When The user clicks on the button Try here >>> from the Implementation in Python page 
   Then The user should able to redirect to a new page with text area for trying the code 
   
   Scenario Outline: Verify that user is able to type python code in the text area of Implementation in Python page  
    Given The user is on the try here textarea of Implementation in Python page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
      
    Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Implementation in Python page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

     Examples:
       | Sheetname   | RowNumber |
       | Tree        |         2 |
      # | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
   
   
   Scenario: Verify user is able to  navigate to the previous page Implementation in Python on clicking browser back button
   Given The user is on the try here textarea of Implementation in Python page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Implementation in Python page
   
   #Binary Tree Traversals
    Scenario: Verify that user is able to click on the link Binary Tree Traversals from the Tree page  
   Given The user is on the Tree page
   When The user clicks on the link Binary Tree Traversals on the Tree page 
   Then The user should redirect to the Binary Tree Traversals page 
   
   
   Scenario: Verify that user is able to click on the button Try here >>> from the Binary Tree Traversals page  
   Given The user is on the Binary Tree Traversals page
   When The user clicks on the button Try here >>> from the Binary Tree Traversals page 
   Then The user should able to redirect to a new page with text area for trying the code 
   
   Scenario Outline: Verify that user is able to type python code in the text area of Binary Tree Traversals page  
    Given The user is on the try here textarea of Binary Tree Traversals page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
      
    Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Binary Tree Traversals page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

     Examples:
       | Sheetname   | RowNumber |
       | Tree        |         2 |
      # | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
   
   
   Scenario: Verify user is able to  navigate to the previous page Binary Tree Traversals on clicking browser back button
   Given The user is on the try here textarea of Binary Tree Traversals page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Binary Tree Traversals page
   
   #Implementation of Binary Trees
    Scenario: Verify that user is able to click on the link Implementation of Binary Trees from the Tree page  
   Given The user is on the Tree page
   When The user clicks on the link Implementation of Binary Trees on the Tree page 
   Then The user should redirect to the Implementation of Binary Trees page 
   
   
   Scenario: Verify that user is able to click on the button Try here >>> from the Implementation of Binary Trees page  
   Given The user is on the Implementation of Binary Trees page
   When The user clicks on the button Try here >>> from the Implementation of Binary Trees page 
   Then The user should able to redirect to a new page with text area for trying the code 
   
   Scenario Outline: Verify that user is able to type python code in the text area of Implementation of Binary Trees page  
    Given The user is on the try here textarea of Implementation of Binary Trees page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
      
    Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Implementation of Binary Trees page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

     Examples:
       | Sheetname   | RowNumber |
       | Tree        |         2 |
      # | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
   
   
   Scenario: Verify user is able to  navigate to the previous page Implementation of Binary Trees on clicking browser back button
   Given The user is on the try here textarea of Implementation of Binary Trees page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Implementation of Binary Trees page
   
   #Applications of Binary trees
   Scenario: Verify that user is able to click on the link Applications of Binary trees from the Tree page  
   Given The user is on the Tree page
   When The user clicks on the link Applications of Binary trees on the Tree page 
   Then The user should redirect to the Applications of Binary trees page 
   
   
   Scenario: Verify that user is able to click on the button Try here >>> from the Applications of Binary trees page  
   Given The user is on the Applications of Binary trees page
   When The user clicks on the button Try here >>> from the Applications of Binary trees page 
   Then The user should able to redirect to a new page with text area for trying the code 
   
   Scenario Outline: Verify that user is able to type python code in the text area of Applications of Binary trees page  
    Given The user is on the try here textarea of Applications of Binary trees page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
      
    Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Applications of Binary trees page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

     Examples:
       | Sheetname   | RowNumber |
       | Tree        |         2 |
      # | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
   
   
   Scenario: Verify user is able to  navigate to the previous page Applications of Binary trees on clicking browser back button
   Given The user is on the try here textarea of Applications of Binary trees page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Applications of Binary trees page
   
   #Binary Search Trees
   Scenario: Verify that user is able to click on the link Binary Search Trees from the Tree page  
   Given The user is on the Tree page
   When The user clicks on the link Binary Search Trees on the Tree page 
   Then The user should redirect to the Binary Search Trees page 
   
   
   Scenario: Verify that user is able to click on the button Try here >>> from the Binary Search Trees page  
   Given The user is on the Binary Search Trees page
   When The user clicks on the button Try here >>> from the Binary Search Trees page 
   Then The user should able to redirect to a new page with text area for trying the code 
   
   Scenario Outline: Verify that user is able to type python code in the text area of Binary Search Trees page  
    Given The user is on the try here textarea of Binary Search Trees page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
      
    Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Binary Search Trees page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

     Examples:
       | Sheetname   | RowNumber |
       | Tree        |         2 |
      # | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
   
   
   Scenario: Verify user is able to  navigate to the previous page Binary Search Trees on clicking browser back button
   Given The user is on the try here textarea of Binary Search Trees page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Binary Search Trees page
   
   #Implementation Of BST
   Scenario: Verify that user is able to click on the link Implementation Of BST from the Tree page  
   Given The user is on the Tree page
   When The user clicks on the link Implementation Of BST on the Tree page 
   Then The user should redirect to the Implementation Of BST page 
   
   
   Scenario: Verify that user is able to click on the button Try here >>> from the Implementation Of BST page  
   Given The user is on the Implementation Of BST page
   When The user clicks on the button Try here >>> from the Implementation Of BST page 
   Then The user should able to redirect to a new page with text area for trying the code 
   
   Scenario Outline: Verify that user is able to type python code in the text area of Implementation Of BST page  
    Given The user is on the try here textarea of Implementation Of BST page
    When The user gets python code from excel sheet '<Sheetname>' and <RowNumber> for the tryeditor and click run button
    Then The user should able to get the result from excel sheet '<Sheetname>' and <RowNumber>
     
   Examples: 
      | Sheetname   | RowNumber |
      | Tree |         1 |
      
    Scenario Outline: User submits different codes and receives an alert
    Given The user is on the try here textarea of Implementation Of BST page
    When I enter the code from excel sheet '<Sheetname>' and <RowNumber>
    Then The user should be able to receive an alert message from excel sheet '<Sheetname>' and <RowNumber> 

     Examples:
       | Sheetname   | RowNumber |
       | Tree        |         2 |
      # | Tree        |         3 |
       | Tree        |         4 |
       | Tree        |         5 |
       | Tree        |         6 |
   
   
   Scenario: Verify user is able to  navigate to the previous page Implementation Of BST on clicking browser back button
   Given The user is on the try here textarea of Implementation Of BST page
   When The user try to click on the browser back button
   Then The user should be able to navigate to the previous page from the try here page ie, Implementation Of BST page
   
   #Practice Questions
   Scenario: Verify that user is view the page content in Practice Questions while clicking the link practice questions
   Given The user is on the Tree page
   When The user clicks on the link Practice Questions on the Tree page 
   Then The user should redirect to the Practice Questions page 
   
   
   