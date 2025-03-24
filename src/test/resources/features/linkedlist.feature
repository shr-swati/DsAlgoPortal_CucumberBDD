Feature: Linked List
#1
Background: Verify that the user is able to login to the portal with credentials
    Given User is in the ds-algo launch page
    When User clicks the Get Started button
   
 #2  
Scenario Outline: Verify that user is able to login with valid credentials and navigate to Linked List Page
Given user clicks on Signin Link
When user gets data from excel sheet '<Sheetname>' and <RowNumber> for login page 
And clicks Get Started Button
Then user should be redirected to Linked List Page
Examples:
|Sheetname   | RowNumber |
|Valid_Login |    1      |

#3
 Scenario: Verify that user is on Linked List Page
Given user is on the Linked List Page
When user clicks on Introduction Link
Then user should be redirected to Introduction Page

#4
Scenario Outline: Verify that the user is able to see output for valid python Code entered for introduction Page
Given user is on the tryEditor page for the Introduction page
When user enters valid python code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an output in the tryEditor screen for the Introduction page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     1      |


#5
Scenario Outline:  Verify that the user is able to see output for invalid and incorrect syntax python Code entered for introduction Page
Given user is on the tryEditor page for the Introduction page
When user enters invalid and incorrect syntax code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Introduction page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     2      |
| TryEditor    |     3      |
| TryEditor    |     4      |
| TryEditor    |     5      |
| TryEditor    |     6      |


Scenario Outline: Verify that the user is able to see alert window after clicking run button without writing code for introduction Page
Given user is on the tryEditor page for the Introduction page
When user enters blank code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Introduction page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     7      |

 Scenario Outline: Verify that the user is able to see alert window after writing numeric code for introduction Page
Given user is on the tryEditor page for the Introduction page
When user enters numeric code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Introduction page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     8      |
 
 #6
Scenario: Verify that user is able to navigate back to Introduction Page 
 Given user is on the tryEditor page for the Introduction page 
 When user clicks on browser back button
 Then user should be able to navigate back to Introduction Page
 
 #7
 Scenario: verify that user is able to navigate from Introduction Page to Creating Linked List page
  When user clicks on Creating Linked List Link
 Then user should be redirected to Creating linked Page
 
 #8
 Scenario Outline: Verify that the user is able to see output for valid python Code entered for Creating Linked List Page
Given user is on the tryEditor page for the Creating Linked List
When user enters valid python code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an output in the tryEditor screen for the Creating Linked List Page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     1      |

##9
Scenario Outline:  Verify that the user is able to see output for invalid and incorrect syntax python Code entered for Creating Linked List Page
Given user is on the tryEditor page for the Creating Linked List 
When user enters invalid and incorrect syntax code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Creating Linked List page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     2      |
| TryEditor    |     3      |
| TryEditor    |     4      |
| TryEditor    |     5      |
| TryEditor    |     6      |

Scenario Outline: Verify that the user is able to see alert window after clicking run button without writing code for Creating Linked List Page
Given user is on the tryEditor page for the Creating Linked List
When user enters blank code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Creating Linked List page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     7      |

 Scenario Outline: Verify that the user is able to see alert window after writing numeric code for Creating Linked List Page
Given user is on the tryEditor page for the Creating Linked List
When user enters numeric code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Creating Linked List page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     8      |
 
 
##10
Scenario: Verify that user is able to navigate back to Creating Linked List Page
 Given user is on the tryEditor page for the Creating Linked List 
 When user clicks on browser back button
 Then user should be able to navigate back to Creating Linked List Page
 
# #11
 Scenario: verify that user is able to navigate from Creating Linked List page to Types of Linked List Page
 #Given user is on the Creating Linked List Page
 When user clicks on Types Of Linked List Link
 Then user should be redirected to Types Of Linked List Page
 
# #12
 Scenario Outline: Verify that the user is able to see output for valid python Code entered for Types Of Linked List Page
Given user is on the tryEditor page for the Types Of Linked List page
When user enters valid python code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an output in the tryEditor screen for the Types Of Linked List page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     1      |

##13
Scenario Outline:  Verify that the user is able to see output for invalid and incorrect syntax python Code entered for Types of Linked List Page
Given user is on the tryEditor page for the Types Of Linked List page
When user enters invalid and incorrect syntax code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Types Of Linked List page 
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     2      |
| TryEditor    |     3      |
| TryEditor    |     4      |
| TryEditor    |     5      |
| TryEditor    |     6      |

Scenario Outline: Verify that the user is able to see alert window after clicking run button without writing code for Types Of Linked List  Page
Given user is on the tryEditor page for the Types Of Linked List page
When user enters blank code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Types Of Linked List page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     7      |

 Scenario Outline: Verify that the user is able to see alert window after writing numeric code for Types Of Linked List page
Given user is on the tryEditor page for the Types Of Linked List page
When user enters numeric code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Types Of Linked List page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     8      |

 
##14
Scenario: Verify that user is able to navigate back to Types of Linked List Page
 Given user is on the tryEditor page for the Types Of Linked List page
 When user clicks on browser back button
 Then user should be able to navigate back to Types Of Linked List page
 
##15
 Scenario: verify that user is able to navigate from  Types of Linked List Page to Implement Linked List in Python Page

 When user clicks on Implement Linked List in Python Link
 Then user should be redirected to Implement Linked List in Python Page
 
# #16
 Scenario Outline: Verify that the user is able to see output for valid python Code entered forImplement Linked List in Python Page
Given user is on the tryEditor page for the Implement Linked List in Python Page
When user enters valid python code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an output in the tryEditor screen for the Implement Linked List in Python page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     1      |

##17
Scenario Outline:  Verify that the user is able to see output for invalid and incorrect syntax python Code entered for Implement Linked List in Python Page
Given user is on the tryEditor page for the Implement Linked List in Python Page
When user enters invalid and incorrect syntax code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Implement Linked List in Python page 
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     2      |
| TryEditor    |     3      |
| TryEditor    |     4      |
| TryEditor    |     5      |
| TryEditor    |     6      |

 Scenario Outline: Verify that the user is able to see alert window after clicking run button without writing code for Implement Linked List in Python Page
Given user is on the tryEditor page for the Implement Linked List in Python Page
When user enters blank code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Implement Linked List in Python page 
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     7      |

 Scenario Outline: Verify that the user is able to see alert window after writing numeric code for Implement Linked List in Python Page
Given user is on the tryEditor page for the Implement Linked List in Python Page
When user enters numeric code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Implement Linked List in Python page 
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     8      |
  
# #18
 Scenario: Verify that user is able to navigate back to Implement Linked List in Python Page
 Given user is on the tryEditor page for the Implement Linked List in Python Page
 When user clicks on browser back button
 Then user should be able to navigate back to Implement Linked List in Python Page
 
# #19
  Scenario: verify that user is able to navigate from Implement Linked List in Python Page to Traversal Page
# Given user is on the Implement Linked List in Python Page 
 When user clicks on Traversal Link
 Then user should be redirected to Traversal Page
 
# #20
  Scenario Outline: Verify that the user is able to see output for valid python Code entered for Traversal Page
Given user is on the tryEditor page for the Traversal Page
When user enters valid python code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an output in the tryEditor screen for the Traversal page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     1      |

##21
Scenario Outline:  Verify that the user is able to see output for invalid and incorrect syntax python Code entered for Traversal Page
Given user is on the tryEditor page for the Traversal Page
When user enters invalid and incorrect syntax code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Traversal page 
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     2      |
| TryEditor    |     3      |
| TryEditor    |     4      |
| TryEditor    |     5      |
| TryEditor    |     6      |

 Scenario Outline: Verify that the user is able to see alert window after clicking run button without writing code for Traversal Page
Given user is on the tryEditor page for the Traversal Page
When user enters blank code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Traversal page 
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     7      |

 Scenario Outline: Verify that the user is able to see alert window after writing numeric code for Traversal Page
Given user is on the tryEditor page for the Traversal Page
When user enters numeric code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Traversal page 
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     8      |
  
# #22
 Scenario: Verify that user is able to navigate back to Traversal Page
 Given user is on the tryEditor page for the Traversal Page
 When user clicks on browser back button
 Then user should be able to navigate back to Traversal Page
 
# #23
  Scenario: verify that user is able to navigate from Traversal Page to Insertion Page
  
 When user clicks on Insertion Link
 Then user should be redirected to Insertion Page
 
# #24
  Scenario Outline: Verify that the user is able to see output for valid python Code entered for Insertion Page
Given user is on the tryEditor page for the Insertion Page
When user enters valid python code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an output in the tryEditor screen for the Insertion page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     1      |

##25
Scenario Outline:  Verify that the user is able to see output for invalid and incorrect syntax python Code entered for Insertion Page
Given user is on the tryEditor page for the Insertion Page
When user enters invalid and incorrect syntax code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Insertion page 
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     2      |
| TryEditor    |     3      |
| TryEditor    |     4      |
| TryEditor    |     5      |
| TryEditor    |     6      |

 Scenario Outline: Verify that the user is able to see alert window after clicking run button without writing code for Insertion Page
Given user is on the tryEditor page for the Insertion Page
When user enters blank code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Insertion page 
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     7      |

 Scenario Outline: Verify that the user is able to see alert window after writing numeric code for Insertion Page
Given user is on the tryEditor page for the Insertion Page
When user enters numeric code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Insertion page 
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     8      |

##26
 Scenario: Verify that user is able to navigate back to Insertion Page
 Given user is on the tryEditor page for the Insertion Page
 When user clicks on browser back button
 Then user should be able to navigate back to Insertion Page
 
# #27
 Scenario: verify that user is able to navigate from Insertion Page to Deletion Page
  
 When user clicks on Deletion Link
 Then user should be redirected to Deletion Page
 
 
# #28
 Scenario Outline: Verify that the user is able to see output for valid python Code entered for Deletion Page
Given user is on the tryEditor page for the Deletion Page
When user enters valid python code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an output in the tryEditor screen for the Deletion page
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     1      |

##29
Scenario Outline:  Verify that the user is able to see output for invalid and incorrect syntax python Code entered for Deletion Page
Given user is on the tryEditor page for the Deletion Page
When user enters invalid and incorrect syntax code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Deletion page 
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     2      |
| TryEditor    |     3      |
| TryEditor    |     4      |
| TryEditor    |     5      |
| TryEditor    |     6      |

 
Scenario Outline: Verify that the user is able to see alert window after clicking run button without writing code for Deletion Page
Given user is on the tryEditor page for the Deletion Page
When user enters blank code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Deletion page 
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     7      |

 Scenario Outline: Verify that the user is able to see alert window after writing numeric code for Deletion  Page
Given user is on the tryEditor page for the Deletion Page
When user enters numeric code from excel sheets '<Sheetname>' and <RowNumber> for the tryEditor Page and clicks on Run Button
Then user should be able to get an error message on  tryEditor screen for the Deletions page 
Examples:
|  Sheetname   |  RowNumber |
| TryEditor    |     8      | 
 
 #30
 Scenario: Verify that user is able to navigate back to Deletion Page
 Given user is on the tryEditor page for the Deletion Page
 When user clicks on browser back button
 Then user should be able to navigate back to Deletion Page
 
 #31
 Scenario: Verify that user is able to navigate and click on Practice Questions
 Given user is on the Deletion Page
 When user  clicks on Practice Questions Link
 Then user should be redirected to Practice Questions Page
 
 
 #32
 Scenario: Verify that user is able to navigate and click on signout Button
 Given user is on Linked List Page
 When user clicks on signout button
 Then user should be redirected to home page with message "Logged out successfully"

 
 
 
 
 
 
 