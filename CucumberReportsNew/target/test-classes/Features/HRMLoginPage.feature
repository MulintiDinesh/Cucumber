Feature: Login to orange HRM application in website

@ValidCredentials
Scenario: Verifying login using valid credentials

Given User opens HRM login page
When User gives valid username and password
Then User should be able to login successfully