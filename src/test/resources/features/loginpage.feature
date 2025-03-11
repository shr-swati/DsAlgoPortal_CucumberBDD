Feature: User Gets started from landing page and Logins to DsAlgoPortal

  Scenario Outline: User navigates to login page from landing page
    Given User Launches Chrome Browser
    When User opens DsAlgo Portal link "https://dsportalapp.herokuapp.com/"
    Then User clicks on Get Started button
    Then User should see the page title "NumpyNinja"
    Then User clicks on Signin link
    Then User enters username <username> and password <password>
    Then User clicks on login button
    Then User is logged in with expected status <status>

    Examples: 
      | username    | password   | status |
      | sdet199list | Static123@ | Pass   |
