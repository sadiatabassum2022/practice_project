Feature: This feature is to validate signin functionality 

Scenario: Verify user signin successfully

Given Launch "<URLWIN>" application
Then Click signin button 
Then Enter username and password and click signin button
Then Verify user signin successfullyy