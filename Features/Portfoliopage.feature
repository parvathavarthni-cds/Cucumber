Feature: Portfolio page
	Scenario: Validating the Global orders list in default
    Given the user is in portfolio valuation page
    When the user clicks on the global orders
    Then the orders list table should get populated
 
	Scenario: Validating the Global orders list
	Given the user is in Global orders table
	When the user click on the portfolio dropdown
	Then the user should be able to see the results based on the filter applied
	
	Scenario: Validating the Global orders list
	Given the user is in Global orders table list
	When the user clicks on the managed fund dropdown
	Then the user should be able to see the results based on the filter applied
	
	Scenario: Validating the last 7days option in datepicker
	Given the user is in datepicker
	When the user clicks the last 7 days option
	Then the user should be able to see the results for last 7 days
	
	Scenario: Validating the value dropdown
	Given the user is in Global Orders
	When the user clicks the value dropdown
	And the user enters the minimum and maximum values
	Then the user should get result based on the value applied
	
	