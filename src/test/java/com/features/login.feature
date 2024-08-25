@Reg
Feature: Login funtionlity

Background: user in on application

@smoke
Scenario: Verify login functionality with valid deatils
When user enter username and password
And user click on login button
Then Validate user is sucessfully loggedIn


