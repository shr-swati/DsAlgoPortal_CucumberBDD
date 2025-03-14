Feature: queue


Scenario: Verify that user is able to navigate from Queue Page to Implementation of Queue in Python Page
Given user is on the DsAlgo Home Page
When user clicks on Get Started Button under Queue Page
Then user should be able to navigate to Queue Page

Scenario: Verify that user is on Queue Page`
Given user is on the Queue Page
When user clicks on Implementation of Queue in Python Link
Then user should be redirected to Implementation of Queue in Python Page

