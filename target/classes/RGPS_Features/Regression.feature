Feature: This is sign in page display

@Testcase
Scenario: Verify sign in page display, after clicking login button
Given Open "<URL>" Application 
Then click login button
Then Verify sign in page display, after clicking login button

@Testcase
Scenario: 	Verify Email address, password field, and signin button display in sign in page 
Given      	Open "<URL>" Application 
Then      	Click Login button
Then 				Verify all fields display in sign in page