@regression @smoke @SKYW-20 @E2E
Feature: Rahul Shetty practice

	Scenario: Iframe Practice
		Given Open Shetty Homepage
		When Click on iFrame Home
		Then It should reload iframe homepage
		
	Scenario: Alert Practice
		Given Open Shetty Homepage
		When Click on Alert
		Then Click on OK
		When Click on Confirm
		Then Click on OK
		When Click on Confirm
	    Then Click on cencel
		