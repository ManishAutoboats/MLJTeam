Feature: Payment functionality

@test
Scenario: Verify user is able to place an order
When user enter username and password
And user click on login button
When user add product into the basket
And user naviate to checkout
And user enter firstName "Test" lastName "Automation" and PostalCOde "123456"
And user place an order
Then validate the sucess message "THANK YOU FOR YOUR ORDER1"
