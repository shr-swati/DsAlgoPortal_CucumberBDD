Feature: Linked List


Scenario: Verify that user is able to navigate from Linked List Page to Introduction Page
Given user is on the DsAlgo Home Page
When user clicks on Get Started Button under Linked List
Then user should be able to navigate to Linked List Page

Scenario: Verify that user is on Linked List Page`
Given user is on the Linked List Page
When user clicks on Introduction Link
Then user should be redirected to Introduction Page

Scenario: Verify that the user is able to see output for valid Python code entered
Given user is navigate to the tryEditor
When user enter valid pythoncode 
Then The user checks output in the console output

Scenario: Verify that user is able to get an error message in alert window
Given user is navigate to the tryEditor	
When user enter invalid pythoncode
When user clicks on ok button
	
Scenario: Verify that user is able to get an error message in alert window
Given user is navigate to the tryEditor
When user clicks on Run Button without entering code
Then user should be able to see an error message in alert window

	
Scenario: Verify that user is able to navigate back to Linked List Page
Given user is on the tryEditor
When user clicks on back browser button
Then user should be navigate to Creating Linked List page
	
	
	
	
	
