Feature: Array

   
Scenario: Verify that the user is able to click on Get Started button under Array section
Given User is on the Home page of dsalgo portal
When User clicks on Get Started button under Array section
Then User is navigated to Array page

Scenario: Verify Array in Python Page
Given User is on the Array Page
When user clicks on Arrays In Python Link
Then user should be redirected to Arrays In Python Page

Scenario: Verify that the user is able to see output for valid Python code entered
Given user is navigate to the tryEditor
When user enter valid pythoncode 
Then The user checks output in the console output
