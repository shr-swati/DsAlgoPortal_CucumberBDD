Feature: Testing the Data Structures - Introduction Module in dsAlgo Portal

  Background: Verify that the user is able to login to the portal with credentials

  Scenario Outline: Verify that user is able to login with valid credentials in Home Page
    Given User launches ds-algo page
    When User clicks the Get Started
    Then User clicks on Signin Link
    Then user gets data from excel sheet '<Sheetname>' and <RowNumber> for login

    Examples: 
      | Sheetname   | RowNumber |
      | Valid_Login |         1 |

  Scenario: Verify that user is able to navigate to Data Structures - Introduction page
    Given The user is in the Home page after logged in for Data Structures - Introduction page
    When The user clicks Get Started button in Data Structures - Introduction panel
    Then The user should able to view Data Structures- Introduction Page

  Scenario: Verify that user is able to navigate to Time Complexity link Data Structures- Introduction Page
    Given The user is in the Data Structures - Introduction page
    When The user clicks Time Complexity link Data Structures- Introduction Page
    Then The user should be redirected to Time Complexity page of Data structures-Introduction

  Scenario: Verify that user is able to navigate to try Editor page of Data structures-Introduction
    Given The user is in the Time Complexity page of Data structures-Introduction
    When The user clicks Try here button in the Data structures-Introduction
    Then The user should be redirected to a page having an try Editor with a Run button to test Data structures-Introduction

  Scenario: Verify that user receives error when click on Run button without entering code in the Data structures-Introduction
    Given The user is in the try Editor page of Data structures-Introduction1
    When The user clicks the Run button without entering the code in the Editor of Data structures-Introduction
    Then The user should able to see an error message in alert window of Data structures-Introduction

  Scenario Outline: Verify that user receives error for invalid python code to test Data structures-Introduction
    Given The user is in the try Editor page of Data structures-Introduction
    When The user writes the invalid code in Editor '<Sheetname>' <RowNumber> and click the Run button
    Then The ds_user should able to see an error message in alert window of Data structures-Introduction

    # Then user clears the code text area
    Examples: 
      | Sheetname | RowNumber |
      | TryEditor |         2 |
      | TryEditor |         3 |
      | TryEditor |         4 |
      | TryEditor |         5 |
      | TryEditor |         6 |

  Scenario Outline: Verify that user is able to see output for valid python code to test Data structures-Introduction
    Given The user is in the try Editor page of Data structures-Introduction
    When The user write the valid code in Editor '<Sheetname>' <RowNumber> and click the Run button
    Then The user should able to see output in the console of Data structures-Introduction

    Examples: 
      | Sheetname | RowNumber |
      | TryEditor |         1 |

  Scenario: Verify that user is able to navigate to Practice Questions page of Data structures-Introduction
    Given The user is in the Time Complexity page of Data structures-Introduction to check Practice question page
    Then The user clicks the Practice Questions link in the Data structures-Introduction
    Then The user should be redirected to Practice Questions in the Data structures-Introduction
