Feature: Testing the Data Structures - Introduction Module in dsAlgo Portal

  Scenario: Verify that user is able to navigate to Data Structures - Introduction page
    Given The user is in the Home page after logged in for Data Structures - Introduction page
    When The user clicks Get Started button in Data Structures - Introduction panel
    Then The user should able to view Data Structures- Introduction Page

  Scenario: Verify that user is able to navigate to Time Complexity link Data Structures- Introduction Page
    Given The user is in the Data Structures - Introduction page
    When The user clicks Time Complexity link Data Structures- Introduction Page
    Then The user should be redirected to Time Complexity page of Data structures-Introduction

  Scenario: Verify that user is able to navigate to Practice Questions page of Data structures-Introduction
    Given The user is in the Time Complexity page of Data structures-Introduction
    When The user clicks the Practice Questions link in the Data structures-Introduction
    Then The user should be redirected to Practice Questions in the Data structures-Introduction

  Scenario: Verify that user is able to navigate to try Editor page of Data structures-Introduction
    Given The DS-user is in the Time Complexity page of Data structures-Introduction
    When The user clicks Try here button in the Data structures-Introduction
    Then The user should be redirected to a page having an try Editor with a Run button to test Data structures-Introduction

  Scenario: Verify that user receives error when click on Run button without entering code in the Data structures-Introduction
    Given The ds-user is in the try Editor page of Data structures-Introduction
    When The user clicks the Run button without entering the code in the Editor of Data structures-Introduction
    Then The user should able to see an error message in alert window of Data structures-Introduction

  Scenario: Verify that user receives error for invalid python code to test Data structures-Introduction
    Given The DS-user is in the try Editor page of Data structures-Introduction
    When The user write the invalid code in Editor and click the Run button to test Data structures-Introduction
    Then The DS-user should able to see an error message in alert window of Data structures-Introduction

  Scenario: Verify that user is able to see output for valid python code to test Data structures-Introduction
    Given The user is in the try Editor page of Data structures-Introduction
    When The user write the valid code in Editor and click the Run button to test Data structures-Introduction
    Then The user should able to see output in the console of Data structures-Introduction
