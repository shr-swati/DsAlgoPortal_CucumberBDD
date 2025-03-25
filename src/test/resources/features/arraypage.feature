Feature: Array

#Background: Verify that the user is able to login to the portal with credentials
    #Given User is in the ds-algo launch page
    #When User clicks the Get Started button
Background: The user is on the sign-in page with login credentials

    Given User is in the ds-algo launch page
    When User clicks the Get Started button
    Then login with "Valid_Login" and 1

    
 Scenario: Verify user click on Get Started button in Array section
 Given User on Home page of dsalgo portal
 When User clicks on Get Started button in Array section
 Then User navigate to Array page
 
Scenario: Verify Array in Python Page
Given User browes to the try editor page
When User loggedin and navigate to Array In Python page and then Try Editor page 
Then user should verify try editor page

Scenario Outline: Verify that the user is able to see output for valid Python code entered
    Given user is navigate to the tryEditor 
    When user enter the valid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user checks output in the console output

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         1 |
     
Scenario Outline: Verify that the user is able to see output for invalid Python code entered
    Given user navigate to the tryEditor 
    When user enter the invalid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array module and clicks on run button
    Then The user checks invalid output in the console output

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         2 |
      
 Scenario: Verify user land Arrays Using List in Array section
 Given User at home page of dsalgo portal
 When User clicked Get Started button in Array section
 Then User navigate to try editor page under Array Using List
 
 Scenario Outline: Verify user validate output using Python code at try editor page under Array Using List
    Given user is navigate to the tryEditor page under Array Using List
    When user enter the valid pythoncode getting input from sheet '<Sheetname>' and <RowNumber> in Array Using List and clicks on run button
    Then The user checks valid console output in Array Using List

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         3 |
     
Scenario Outline: User verify and validate output for invalid Python code entered at Array Using List
    Given user navigate to the tryEditor of Array Using List 
    When user enter the invalid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Array Using List module and clicks on run button
    Then The user checks invalid console output in Array Using List

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         4 |

Scenario: Verify user land Basic Operation In List page in Array section
 Given User at home page of dsalgo portal for Basic Operation In List 
 When User clicked Get Started button in Array section for Basic Operation In List 
 Then User navigate to try editor page under Basic Operation In List
 
 Scenario Outline: Verify user validate output using Python code at try editor page under Basic Operation In List 
    Given user is navigate to the tryEditor page under Basic Operation In List 
    When user enter the valid pythoncode getting input from sheet '<Sheetname>' and <RowNumber> in Basic Operation In List and clicks on run button
    Then The user checks valid console output in Basic Operation In List

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         5 |
     
Scenario Outline: User verify and validate output for invalid Python code entered at Basic Operation In List
    Given user navigate to the tryEditor of Basic Operation In List 
    When user enter the invalid pythoncode input from sheet '<Sheetname>' and <RowNumber> in Basic Operation In List module and clicks on run button
    Then The user checks invalid console output in Basic Operation In List

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         6 |
      
      
Scenario: Verify user land on Applications of Array page in Array section
 Given User at home page of dsalgo portal for Applications of Array 
 When User clicked Get Started button in Array section for Applications of Array 
 Then User navigate to try editor page under Applications of Array
 
 Scenario Outline: Verify user validate output using Python code at try editor page under Applications of Array
    Given user is navigate to the tryEditor page under Applications of Array 
    When user enter the valid pythoncode getting input from sheet '<Sheetname>' and <RowNumber> in Applications of Array and clicks on run button
    Then The user checks valid console output in Applications of Array

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         7 |
 
 Scenario Outline: Verify user validate invalid output using Python code at try editor page under Applications of Array
    Given user is navigate to the tryEditor under Applications of Array 
    When user enter the invalid pythoncode getting input from sheet '<Sheetname>' and <RowNumber> in Applications of Array and clicks on run button
    Then The user checks invalid console output in Applications of Array

    Examples: 
      | Sheetname | RowNumber |
      | Array     |         8 |    
      
 Scenario: Verify user is able to navigate to Practice Questions page after clicking practice question link
    Given User at home page of dsalgo portal for practice questions
    When The user clicks Pactice Questions link
    Then The user should be able to navigate to practice questions page   
    
 Scenario Outline: Verify user is able to navigate to Search The Array of Practice Questions page 
    Given User navigate to search the array for practice questions run button
    When user enter the valid pythoncode getting input from sheet '<Sheetname>' and <RowNumber> in search the array for practice questions run button
    Then The user checks valid console output in practice questions run button 
 
   Examples: 
      | Sheetname | RowNumber |
      | Array     |         9 |  
      | Array     |        11 |  
  
  Scenario Outline: Verify user is able to navigate to Search The Array of Practice Questions page with submit button 
    Given User navigate to search the array for practice questions with submit button
    When user enter the valid pythoncode getting input from sheet '<Sheetname>' and <RowNumber> in search the array for practice questions with submit button
    Then The user checks valid console output in practice questions with submit button 
 
   Examples: 
      | Sheetname | RowNumber |
      | Array     |         10 | 
      | Array     |         12 |   
  
 
 Scenario Outline: Verify user is able to navigate to Search The Array of Practice Questions page Exception run button 
    Given User navigate to search the array for practice questions with run button
    When user enter the invalid pythoncode getting input from sheet '<Sheetname>' and <RowNumber> in search the array for practice questions run button
    Then The user checks invalid console output in practice questions submit button     
 
  Examples: 
      | Sheetname | RowNumber |
      | Array     |        13 |   
      

  Scenario: Verify Max Consecutive Ones link and navigate to Max Consecutive Ones page
   Given The user navigate to Practice Questions editor page of Max Consecutive Ones 
    When The user click on Max Consecutive Ones link
    Then The user should be able to navigate to Max Consecutive Ones

  Scenario Outline: Verify that user is able to run valid python code for Max Consecutive Ones page
    Given The user navigate to try editor of Max Consecutive Ones page
    When The user enter the valid python code input from sheet '<Sheetname>' and <RowNumber> in Max Consecutive Ones page and clicks on submit button
    Then The user should able to see output in the console

    Examples: 
      | Sheetname | RowNumber |
      | Array     |        15 |
      
 Scenario Outline: Verify user is able to run invalid python code for Max Consecutive Ones page
    Given The user navigate to try editor page of Max Consecutive Ones page
    When The user enter the invalid python code input from sheet '<Sheetname>' and <RowNumber> in Max Consecutive Ones page and clicks on run button
    Then User should able to see output in the console

    Examples: 
      | Sheetname | RowNumber |
      | Array     |        14 |
      
Scenario Outline: Verify user is able to run invalid python code for Max Consecutive Ones page exception
    Given The user navigate to try editor page of Max Consecutive Ones page exceptopn
    When The user enter the invalid python code input from sheet '<Sheetname>' and <RowNumber> in Max Consecutive Ones page and clicks on run button exception
    Then User should able to see output in the console exception

    Examples: 
      | Sheetname | RowNumber |
      | Array     |        16 |
      
 Scenario: Verify Find Numbers with Even Number of Digits link and navigate to Find Numbers with Even Number of Digits page
   Given The user navigate to Practice Questions editor page of Find Numbers with Even Number of Digits
    When The user click on Find Numbers with Even Number of Digits link
    Then The user should be able to navigate to Find Numbers with Even Number of Digits

 Scenario Outline: Verify that user is able to run valid python code for Find Numbers with Even Number of Digits page run
    Given The user navigate to try editor of Find Numbers with Even Number of Digits page
    When The user enter the valid python code input from sheet '<Sheetname>' and <RowNumber> in Find Numbers with Even Number of Digits page and clicks on run button
    Then The user should be able to see the output in the console

    Examples: 
      | Sheetname | RowNumber |
      | Array     |        17 |
      
Scenario Outline: Verify that user is able to run valid python code for Find Numbers with Even Number of Digits page submit
    Given The user navigate to try editor of Find Numbers with Even Number of Digits page submit
    When The user enter the valid python code input from sheet '<Sheetname>' and <RowNumber> in Find Numbers with Even Number of Digits page and clicks on submit button
    Then The user should be able to see the output in the console submit

    Examples: 
      | Sheetname | RowNumber |
      | Array     |        18 |
      
 Scenario Outline: Verify user is able to run invalid python code for Find Numbers with Even Number of Digits page
    Given The user navigate to try editor page of Find Numbers with Even Number of Digits page exception
    When The user enter the invalid python code input from sheet '<Sheetname>' and <RowNumber> in Find Numbers with Even Number of Digits page and clicks on run excption button
    Then User should able to see the output in the console

    Examples: 
      | Sheetname | RowNumber |
      | Array     |        19 |    
           
Scenario: Verify Squares of a Sorted Array navigate from Practice Questions page
   Given The user navigate Practice Questions page from application of array page 
   When The user Squares of a Sorted Array navigate from Practice Questions page
   Then The user should be able to navigate to Squares of a Sorted Array     
        
Scenario Outline: Verify that user is able to run valid python code for Squares of a Sorted Array page
   Given The user navigate to try editor of Sorted Array page valid
   When The user enter the valid python code input from sheet '<Sheetname>' and <RowNumber> in Squares of a Sorted Array page and clicks on run button
   Then The user should able to see output in the console Squares of a Sorted Array run 

    Examples: 
      | Sheetname | RowNumber |
      | Array     |        20 |      

Scenario Outline: Verify that user is able to run valid python code for Squares of a Sorted Array  page
   Given The user navigate to try editor of Squares of a Sorted Array page valid
   When The user enter the valid python code input from sheet '<Sheetname>' and <RowNumber> in Squares of a Sorted Array page and clicks on submit button
   Then The user should able to see output in the console Squares of a Sorted Array submit 

    Examples: 
      | Sheetname | RowNumber |
      | Array     |        21 |      

Scenario Outline: Verify that user is able to run invalid python code for Squares of a Sorted Array page
   Given The user navigate to try editor of Squares of a Sorted Array page invalid
   When The user enter the invalid python code input from sheet '<Sheetname>' and <RowNumber> in Squares of a Sorted Array page and clicks on exception run button
   Then The user should able to see output in the console Squares of a Sorted Array invalid 

    Examples: 
      | Sheetname | RowNumber |
      | Array     |        22 |      