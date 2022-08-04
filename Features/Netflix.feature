Feature: Netflix login

Scenario Outline: Simple login

Given I am on netflix home page
When I click on sign in 
Then I put my "<username>" in the email address
And I put my "<password>" 
And I click sing in
Then I access to my account 

Examples:

|username                 | password |
|karimahmed159@yahoo.com  | miThu1*s |

