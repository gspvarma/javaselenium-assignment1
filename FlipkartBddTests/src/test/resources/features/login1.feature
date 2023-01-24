@FullSuite
Feature: As a user I should be able to login amazon so that I can buy items I need.

  @login
Scenario Outline: Verify login functionality
Given user launch the app
When user click on signin
Then user should be navigated to login page '<Page Title>'

Examples:
|Page Title|
|Amazon Sign In|

@login
Scenario Outline: Verify login functionality1
Given user launches the app
When user clicks on signin
Then user should be able to login using userId password '<user>''<pass>'


Examples:
|user|pass|
|7093321744|GSPvarma@28|

@login
Scenario Outline: search required item
Given user open the app
When user searches required item '<items>'
Then user should be navigated to that page '<pagetitle>'


Examples:
|items|pagetitle|
|mobiles|Amazon.in : mobiles|

@login
Scenario Outline: search required item1
Given user open the app
When user searches required item '<items>'
Then user should be able to select required product


Examples:
|items|
|redmi note 5 pro|

@login
Scenario Outline: search required item2
Given user open the app
When user searches required item '<items>'
Then user should be able to select and add to cart


Examples:
|items|
|hp probook 640 g2|

@addremove
Scenario Outline: search required item3
Given user open the app
When user searches required item '<items>'
Then user should be able to remove item from cart


Examples:
|items|
|redmi note 5 pro|

@paymentpage
Scenario Outline: proceed to payment
Given user open the app
When user searches required item '<items>'
And user able to click buy item and signin '<user>''<pass>'
Then user should able to go to payment page


Examples:
|items|user|pass|
|redmi note 5 pro|7093321744|GSPvarma@28|

@loginalert
Scenario Outline: Verify login functionality1
Given user launches the app
When user clicks on signin
Then user should be able to check login using userId password '<user>'


Examples:
|user|pass|
|abc|GSPvarma@28|

@login1
Scenario: Search from all by category
Given user launches the app
When user clicks on allnav 
Then user should able to search by category

@csupport
Scenario: Search for customer support
Given user launches the app
When user clicks on customer support and clicks particular support
Then user should able to navigated to support page