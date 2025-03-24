Feature: Login Functionality

  Background: Verify that the user is able to login to the portal with credentials
    Given User is in the ds-algo launch page
    When User clicks the Get Started button

  Scenario Outline: Verify user enters username and password fields
    Given The user clicks the Sign In link
    When The user gets data from excel sheet '<Sheetname>' and <RowNumber> for the login page
    Then The user is in the Home page after Sign In
    And The user clicks Sign Out
    Then The user should be redirected to home page with message "Logged out successfully"

    Examples: 
      | Sheetname   | RowNumber |
      | Valid_Login |         1 |

  Scenario Outline: Verify user receives error message when username and password fields are blank during Login
    Given The user clicks the Sign In link
    When The user gets data from excel sheet '<Sheetname>' and <RowNumber> for the login page
    Then The error message appears below Username and Password textbox like "Please fill out this field."

    Examples: 
      | Sheetname | RowNumber |
      | Login     |         1 |
      | Login     |         2 |

  Scenario Outline: Verify user receives error message for Invalid Username and Password during Login
    Given The user clicks the Sign In link
    When The user gets invalid data from excel sheet '<Sheetname>' and <RowNumber> for the login page
    Then The user should be able to see an error message "Invalid Username and Password"

    Examples: 
      | Sheetname | RowNumber |
      | Login     |         3 |
      | Login     |         4 |
