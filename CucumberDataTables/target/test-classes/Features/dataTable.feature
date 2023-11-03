Feature: Login to OrangehRM application
 
@ValidCredentials
Scenario: Login the website using valid credentials
 
Given User is on HRM Login webpage
When User provides credentials
	|	Username |	Password |
	|	Admin		 |	admin123 |
	
Then User should be able to login successfully and see homepage
 
@InvalidCredentials
Scenario: Login the website with invalid credentials
 
Given User is on HRM Login webpage
When User provides credentials
	|	Username	|	Password	|
	|	ADMIN			|	ADMIN123	|
	|	Admin1		|	admin12345|
	
Then User should be able to see unsuccessfull with error message