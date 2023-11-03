Feature: Register to parabank web application

Scenario: Registering the application with valid credentials

Given User opens the parabank register page
When User enters the valid credentials
And User clicks the register
Then User should be able to register successfully