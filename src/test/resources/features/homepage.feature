Feature: Home Page

  Background: Verify that the user is able to launch the url
    Given User is in the ds-algo launch page
    When User clicks the Get Started button

  Scenario: Verify that the user is able to navigate to the home page
    Then User should be able to navigate to the home page

  Scenario: Verify that the user can view Data Structures dropdown options without signing in
    When User clicks on the Data Structures dropdown
    Then User should be able to see the options: Arrays, Linked List, Stack, Queue, Tree, Graph in the dropdown menu

  Scenario: Verify warning message when selecting Arrays without signing in
    When User selects Arrays from the dropdown without signing in
    Then User should be able to see a warning message You are not logged in

  Scenario: Verify warning message when selecting Linked List without signing in
    When User selects Linked List from the dropdown without signing in
    Then User should be able to see a warning message You are not logged in

  Scenario: Verify warning message when selecting Stack without signing in
    When User selects Stack from the dropdown without signing in
    Then User should be able to see a warning message You are not logged in

  Scenario: Verify warning message when selecting Queue without signing in
    When User selects Queue from the dropdown without signing in
    Then User should be able to see a warning message You are not logged in

  Scenario: Verify warning message when selecting Tree without signing in
    When User selects Tree from the dropdown without signing in
    Then User should be able to see a warning message You are not logged in

  Scenario: Verify warning message when selecting Graph without signing in
    When User selects Graph from the dropdown without signing in
    Then User should be able to see a warning message You are not logged in

  Scenario: Verify that the user stays on the same page when clicking elsewhere
    When User clicks on the launch page other than the Get Started
    Then User should stay in the same launch page