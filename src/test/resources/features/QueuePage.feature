Feature: Queue Page

    
    
Scenario: Verify that user is able to navigate to Queue Page
Given user is on the home page
When user clicks Get Started Button of Queue Page
Then user should be redirected to Queue Page

 Scenario: Verify that user is able to navigate and click on Implementation of Queue in Python Link
Given user is on the Queue Page
When user clicks on Implementation of Queue in Python Link
Then user should be redirected to Implementation of Queue in Python Page

Scenario Outline: Verify that the user is able to see output for valid python Code entered for Implementation of Queue in Python Page
Given user is on the tryEditor page for the Implementation of Queue in Python Page
When user enters valid python code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button for Queue
Then user should be able to get an output in the tryEditor screen for the Implementation of Queue in Python Page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     1      |

Scenario Outline: Verify that the user is able to see output for invalid and incorrect syntax python Code entered for Implementation of Queue in Python Page
Given user is on the tryEditor page for the Implementation of Queue in Python Page
When user enters invalid and incorrect syntax code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button for Queue
Then user should be able to get an error message on  tryEditor screen for the Implementation of Queue in Python page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     2      |
| TryEditor    |     3      |
| TryEditor    |     4      |
| TryEditor    |     5      |
| TryEditor    |     6      |

Scenario: Verify that user is able to navigate back to Implementation of Queue in Python  Page 
Given user is on the tryEditor page for the Implementation of Queue in Python Page 
When user clicks on browser back button
 Then user should be able to navigate back to Implementation of Queue in Python Page
 

 Scenario: verify that user is able to navigate from Implementation of Queue in Python Page to Implementation using collections.deque
 #Given user is on the Implementation of Queue in Python Page
When user clicks on Implementation using collections.deque Link
Then user should be redirected to Implementation using collections.deque Pages


Scenario Outline: Verify that the user is able to see output for valid python Code entered for Implementation using collections deque Page
Given user is on the tryEditor page for the Implementation using collections deque Page
When user enters valid python code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button for Queue
Then user should be able to get an output in the tryEditor screen for the Implementation using collections deque  Page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     1      |

Scenario Outline: Verify that the user is able to see output for invalid and incorrect syntax python Code entered for Implementation using collections deque Page
Given user is on the tryEditor page for the Implementation using collections deque Page
When user enters invalid and incorrect syntax code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button for Queue
Then user should be able to get an error message on  tryEditor screen for the Implementation using collections deque page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     2      |
| TryEditor    |     3      |
| TryEditor    |     4      |
| TryEditor    |     5      |
| TryEditor    |     6      |


Scenario: Verify that user is able to navigate back to Implementation using collections deque  Page 
Given user is on the tryEditor page for the Implementation using collections deque Page 
 When user clicks on browser back button
 Then user should be able to navigate back to Implementation using collections deque Page
 
 Scenario: verify that user is able to navigate from Implementation using collections deque Page to Implementation using array
# Given user is on the Implementation using collections deque Page
When user clicks on Implementation using array Link
Then user should be redirected to Implementation using array Page

Scenario Outline: Verify that the user is able to see output for valid python Code entered for Implementation using array Page
Given user is on the tryEditor page for the Implementation using array Page
When user enters valid python code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button for Queue
Then user should be able to get an output in the tryEditor screen for the Implementation using array Page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     1      |

Scenario Outline: Verify that the user is able to see output for invalid and incorrect syntax python Code entered for Implementation using array Page
Given user is on the tryEditor page for the Implementation using array Page
When user enters invalid and incorrect syntax code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button for Queue
Then user should be able to get an error message on  tryEditor screen for the Implementation using array page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     2      |
| TryEditor    |     3      |
| TryEditor    |     4      |
| TryEditor    |     5      |
| TryEditor    |     6      |

Scenario: Verify that user is able to navigate back to Implementation using array Page 
Given user is on the tryEditor page for the Implementation using array Page 
 When user clicks on browser back button
 Then user should be able to navigate back to Implementation using array Page
 
  Scenario: verify that user is able to navigate from Implementation using array Page to Queue Operations
 #Given user is on the Implementation using array Page
When user clicks on Queue Operations Link
Then user should be redirected to Queue Operations Page

Scenario Outline: Verify that the user is able to see output for valid python Code entered for Queue Operations Page
Given user is on the tryEditor page for the Queue Operations Page
When user enters valid python code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button for Queue
Then user should be able to get an output in the tryEditor screen for the Queue Operations Page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     1      |


Scenario Outline: Verify that the user is able to see output for invalid and incorrect syntax python Code entered for Queue Operations Page
Given user is on the tryEditor page for the Queue Operations Page
When user enters invalid and incorrect syntax code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button for Queue
Then user should be able to get an error message on  tryEditor screen for the Queue Operations page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     2      |
| TryEditor    |     3      |
| TryEditor    |     4      |
| TryEditor    |     5      |
| TryEditor    |     6      |



Scenario: Verify that user is able to navigate back to Implementation using array Page 
Given user is on the tryEditor page for the Queue Operations Page 
 When user clicks on browser back button
 Then user should be able to navigate back to Queue Operations Page

 Scenario: Verify that user is able to navigate and click on Practice Questions
# Given user is on the Implementation of Queue in Python Page
Given user is on Queue Operations Page
 When user  clicks on Practice Questions Link for Queue
 Then user should be redirected to Practice Questions Page

Scenario: Verify that user is able to navigate and click on signout Button
Given user is on the Queue Page
 When user clicks on signout button for Queue
 Then user should be redirected to home page with message "Logged out successfully"
 
 