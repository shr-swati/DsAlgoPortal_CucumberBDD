Feature: Check Registration Funtionality

  Scenario Outline: User navigates to Register page
    Given User Launches the Chrome Browser
    When User opens the DsAlgo Portal link "https://dsportalapp.herokuapp.com/"
    Then User clicks on the Get Started button
    Then User should see page title "NumpyNinja"
    Then User clicks on Register link
    Then User enters username as <username> and passwords as <password> <confirmpassword>
    Then User clicks on Register button
    Then User gets error on page <status>

    Examples: 
      | username         | password  | confirmpassword | status |
      | register199batch | Static123 | Static123@      | Fail   |
