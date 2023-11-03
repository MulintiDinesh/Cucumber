Feature: Login to Parabank Web Application

Background: 
Given User opens Parabank login page

@ValidCredentials
Scenario: Verifying login with valid Credentials

When User enters valid Credentials
And User clicks login
Then User should be able to login Successfully

@InvalidCredentials
Scenario: Verifying login with Invalid Credentials

When User enters Invalid Credentials
And User clicks login
Then User will be unsuccessful with error message