Feature: Linked List


Scenario: Verify that user is able to navigate from Linked List Page to Introduction Page
Given user is on the DsAlgo Home Page
When user clicks on Get Started Button under Linked List
Then user should be able to navigate to Linked List Page

Scenario: Verify that user is on Linked List Page
Given user is on the Linked List Page
When user clicks on Introduction Link
Then user should be redirected to Introduction Page

Scenario: Verify that user is able to navigate from Introduction Page to tryEditor Page
Given user is on Introduction page
When user clicks on Try Here Button
Then user is redirected to tryEditor Page
