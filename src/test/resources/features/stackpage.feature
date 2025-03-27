Feature: Stack

#Background: Verify that the user is able to login to the portal with credentials
    #Given User is in the ds-algo launch page
    #When User clicks the Get Started button
Background: The user is on the sign-in page with login credentials
    Given User is in the ds-algo launch page
    When User clicks the Get Started button
    Then login with "Valid_Login" and 1

 Scenario: Verify user click on Get Started button in Stack section
 Given User is on the Home page of dsalgo portal
 When User clicks on Get Started button in Stack section
 Then User navigate to Satck page  
 
 Scenario: Verify that user is able to navigate to Stack page
    Given User is in the Stack page after Sign-In and get started
    When User verify all the three links anabled
    Then User should be able to verify the links successfully
 
 Scenario: Verify that user is able to navigate to Operations in Stack page
    Given User is in the Stack page after Sign-In
    When User clicks Operations in Stack link in the Stack page
    Then User should be able to navigate to Operations in Stack page

 Scenario: Verify that user is able to navigate to Try Here page for Operations in Stack page
    Given User is in the Operations in Stack page
    When User clicks Try Here button in the Operations in Stack page
    Then User should be able to navigate to Stack Try Editor page with Run button to test
    
 Scenario Outline: User verify the output for valid syntax Python code operation in stack page
    Given User at Try Editor page for valid Operations in Stack page
    When User enters valid syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button
    Then User verify output in the valid Try Editor screen for the Operations in Stack page

    Examples: 
      | Sheetname | RowNumber |
      | TryEditor |         1 |
  
  Scenario Outline: User verify the output for invalid and incorrect syntax Python code operation in stack page
    Given User at Try Editor page for the Operations in Stack page
    When User enters invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button
    Then User verify output in the Try Editor screen for the Operations in Stack page

    Examples: 
      | Sheetname | RowNumber |
      | TryEditor |         2 |
      | TryEditor |         3 |

 Scenario Outline: User verify the output for valid Python code for implementation page
    Given User at Try Editor page for the Implementation page valid
    When User enters valid code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for Implementation page
    Then User verify output in the Try Editor screen for the Implementation page valid

    Examples: 
      | Sheetname | RowNumber |
      | TryEditor |         1 |
   
 
  Scenario Outline: User verify the output for invalid and incorrect syntax Python code for implementation page
    Given User at Try Editor page for the Implementation page
    When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for Implementation page
    Then User verify output in the Try Editor screen for the Implementation page

    Examples: 
      | Sheetname | RowNumber |
      | TryEditor |         2 |
      | TryEditor |         3 |
 
 Scenario Outline: User verify the output for valid Python code for Applications page
    Given User at Try Editor page for the Applications page valid
    When User enters valid code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for Applications page
    Then User verify output in the Try Editor screen for the Applications page valid

    Examples: 
      | Sheetname | RowNumber |
      | TryEditor |         1 | 
   
   Scenario Outline: User verify the output for invalid and incorrect syntax Python code for Applications page
    Given User at Try Editor page for the Applications page
    When User enters valid, invalid and incorrect syntax code from excel sheet '<Sheetname>' and <RowNumber> and clicks on Run button for Applications page
    Then User verify output in the Try Editor screen for the Applications page

    Examples: 
      | Sheetname | RowNumber |
      | TryEditor |         2 |
      | TryEditor |         3 |  
      
   Scenario: Verify that user is able to navigate to Practice Questions in Operation in Stack Page 
    Given User is at the Operations in Stack page
    When User clicks Practice questions link
    Then User should be redirected to Practice page    
      
 