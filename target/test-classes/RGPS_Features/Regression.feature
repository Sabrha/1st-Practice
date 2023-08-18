Feature: This is sign in page display

@Regression1
Scenario: Verify mouse hover to Acadamic link four option display
Given Open "<URL>" Application
Then mouse hover to Acadamic Link
Then Verify Four option link display

@Regression2
Scenario: Verify after clicking Examination link Sign in page will appear 
Given Open "<URL>" Application
Then mouse hover to Acadamic Link
Then click examinations link
Then Verify after clicking Examination link Sign in page will appear 

@Regression3
Scenario: Verify after clicking Library link Labrary page will appear 
Given Open "<URL>" Application
Then mouse hover to Acadamic Link
Then click Library link
Then Verify after clicking Library link Labrary page will appear  

@Regression4
Scenario: Verify after clicking Student Support link Student Support page will appear 
Given Open "<URL>" Application
Then mouse hover to Acadamic Link
Then click Student Support link
Then Verify after clicking Student Support link Student Support page will appear

@Regression5
Scenario: Verify after clicking Teachers link Teachers page will appear 
Given Open "<URL>" Application
Then mouse hover to Acadamic Link
Then click Teachers link
Then Verify after clicking Teachers link Teachers page will appear

@Regression
Scenario: Verify Notice page appear when click Notice link 
Given Open "<URL>" Application
Then click notice link
Then Verify Notice page appear when click Notice link 

@Regression
Scenario: Verify notice board display in notice page
Given Open "<URL>" Application
Then click notice link
Then Verify notice board displays 

@Regression
Scenario: Verify notice board display 3 informations Title Data View
Given Open "<URL>" Application
Then click notice link
Then Verify Title Data and View display

@Regression
Scenario: Verify notice board details display when click view 
Given Open "<URL>" Application
Then click notice link
Then click view
Then Verify notice board details display

@Regression
Scenario: Verify Blog page will display when clicking Blog Link
Given Open "<URL>" Application
Then click Blog Link
Then Verify Blog page display

@Regression
Scenario: Verify Blog details will display when clicking on details button Grandparents Day Celebration 
Given Open "<URL>" Application
Then click Blog Link
Then click on the details
Then Verify Blog Notice details will display Grandpartents

@Regression
Scenario: Verify Blog details will display when clicking on details button Annual Day Function
Given Open "<URL>" Application
Then click Blog Link
Then click on the annual details
Then Verify Blog Notice details will display AnnualDay 

@Regression
Scenario: Verify Blog details will display when clicking on details button Field Trip to the Local Zoo 
Given Open "<URL>" Application
Then click Blog Link
Then click on the field trip details
Then Verify Blog Notice will display FieldTrip

@Regression
Scenario: Verify Blog details will display when clicking on details button Festival Celebration at play Group 
Given Open "<URL>" Application
Then click Blog Link
Then click on the Festival Celebrations details
Then Verify Blog Notice details will display Festival

@Regression
Scenario: Verify Blog details will display when clicking on details button Science Fair for play Group
Given Open "<URL>" Application
Then click Blog Link
Then click on the Science Fair details
Then Verify Blog Notice details will display ScienceFair

@Regression
Scenario: Verify sign Up page appear when click Sign Up link
Given Open "<URL>" Application
Then click login button   
Then click Sign up link                                                                 
Then Verify signup page is display

@Regression
Scenario: Verify Name Email address field Password field and Sign up button are available in sign up page
Given Open "<URL>" Application
Then click login button   
Then click Sign up link 
Then Verify All fields and button available  

@Regression
Scenario: Verify Choose File button is available in signup page
Given Open "<URL>" Application
Then click login button   
Then click Sign up link
Then  Verify Choose File button is available in signup page   

@Regression
Scenario: Verify Already have an account yet Sign In is available in signup page
Given Open "<URL>" Application
Then click login button   
Then click Sign up link
Then Verify Already have an account yet Sign In is available

@Regression
Scenario: Verify Sign in page appear when click Sign In link in signup page
Given Open "<URL>" Application
Then click login button   
Then click Sign up link
Then click Sign In link
Then Verify Sign in page appear when click Sign In link 

@Regression
Scenario: Verify sign in page display after clicking login button
Given Open "<URL>" Application 
Then click login button
Then Verify sign in page display

@Regression
Scenario: 	Verify Email address password field and signin button display in sign in page 
Given      	Open "<URL>" Application 
Then      	click login button
Then 				Verify all fields display in sign in page

@Regression
Scenario:  Verify Forget Password Link display in signin page
Given Open "<URL>" Application
Then click login button
Then Verify Forget Password Link display

@Regression
Scenario: Verify sign up link display in Signin page
Given Open "<URL>" Application
Then click login button
Then Verify sign up link display in Signin page

@Regression
Scenario: Verify sign up page display when click sign up link 
Given Open "<URL>" Application
Then click login button
Then click Sign up link
Then Verify sign up page display when click sign up link 


@Regression
Scenario: Verify user able to Sign in
Given Open "<URL>" Application
Then click login button
Then enter Email Address and password
Then click Sign In button
Then Verify user able to Sign in













