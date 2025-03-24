Feature: Register Page

  Background: Verify that the user is able to register to the portal with credentials
    Given User is in the ds-algo launch page
    When User clicks the Get Started button

  Scenario: Verify that the user is able to navigate to the home page
    Then User should be able to navigate to the home page

  Scenario: Verify that User is able to launch ds-algo portal
    Given User is in the home page after launching ds-algo portal page
    When User clicks Register link in the home page
    Then User should be able to navigate to Register page

  Scenario Outline: Verify that the user is able to enter valid username in the username field
    Given User navigates to register page after clicking register link
    When User enters data from excel sheet '<Sheetname>' and <RowNumber> for the username field
    Then User should be able to enter username and click Register button

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         1 |
      | Register  |         2 |
      | Register  |         3 |

  Scenario Outline: Verify that user gets an error message upon entering invalid username
    Given User navigates to register page after clicking register link
    When User enters invalid data from excel sheet '<Sheetname>' and <RowNumber> for the username field
    Then User gets error message for username in the Register page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         5 |
      | Register  |         6 |
      | Register  |         7 |

  Scenario Outline: Verify that the user is able to enter valid passwords in the field
    Given User navigates to register page after clicking register link
    When User enters data from excel sheet '<Sheetname>' and <RowNumber> for the password fields
    Then User should be able to enter password and click Register button

    Examples: 
      | Sheetname | RowNumber |
      | Register  |         8 |
      | Register  |         9 |

  Scenario Outline: Verify that the user gets error upon entering invalid passwords
    Given User navigates to register page after clicking register link
    When User enters invalid data from excel sheet '<Sheetname>' and <RowNumber> for the password field
    Then User gets an error message for password in the Register page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |        10 |
      | Register  |        11 |
      | Register  |        12 |

  Scenario Outline: Verify pop-up message when password and password confirmation fields are left blank
    Given User navigates to register page after clicking register link
    When User enters data from excel sheet '<Sheetname>' and <RowNumber> for blank feilds
    Then User gets error message in register page

    Examples: 
      | Sheetname | RowNumber |
      | Register  |        13 |
      | Register  |        14 |
    #Scenario Outline: Verify that the user is able to naviagte to home page with the message
    #Given User is in the Register page to enter username, password and password confirmation
   # When User enters data from excel sheet '<Sheetname>' and <RowNumber> for all the fields and click RegisterButton
   # Then User should be able to naviagte to home page and get the success message
    # Examples: 
     # | Sheetname | RowNumber |
      #| Register  |        15 |
