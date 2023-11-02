Feature: Login to orangeHRM website

Scenario: Verifying login using valid credentials

Given User opens HRM login page
When User gives valid username and password
Then User should be able to login successfully