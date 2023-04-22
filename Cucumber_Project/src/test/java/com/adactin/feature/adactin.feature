Feature: Adactin Hotel Booking
@smoke
Scenario: Login into Adactin Hotel App
Given user on the login page
When user enters username
And user enters password
And user clicks login button
Then user enters into Search Hotel Page to book a hotel room
@smoke
Scenario: Search Hotel
Given user have to select hotel location
When user have to select hotel 
And user have to select room type
And user have to select no of rooms
And user have to select check in date
And user have to select check out date
And user have to select adults per room
And user have to select children per room
And user should click on Search button to check with availability
@regression
Scenario: Select Hotel
When user should click on Select radio button to select the hotel
Then user should click on Continue button to proceed further
@regression
Scenario: Book A Hotel
Given user enters firstname
When user enters lastname
And user enters billing address
And user enters credit card no
And user enters credit card type
And user enters expiry month
And user enters expiry year
And user enters cvv number
Then user clicks cancel button since booking date might be changed
@smoke
Scenario: Logout
Given user clicks on Logout button
