Feature: Hotel booking in Adactin Application

@smokeTest
Scenario Outline: Login
Given user launch the Application
When user enter the "<username>" in Username field
And user enter the "<password>" in Password field
Then user Click On the Login Button and it navigate to the Search Hotel Page

Examples:
|username|password|
|Starc|12345|
|ameer|ameer12345|
|reemaabbas|I4X0NU|

@sanityTest
Scenario: Search Hotel
When user select the "London" location in location Dropbox
And user select the hotel in hotel Dropbox
And user select the "Double" room type in RoomType Dropbox
And user select the No Of Rooms in NoOfRooms Dropbox
And user select the Check In Date in CheckInDate Dropbox
And user select the Check Out Date in CheckOutDate Dropbox
And user select the Adult per Room in AdultPerRoom Dropbox
And user select the Children per Room in ChildtPerRoom Dropbox
Then user Click On the Search button and it navigate to the Select Hotel

@sanityTest
Scenario: Select Hotel
When user select the hotel by using Select button
Then user Click On the Continue button and it navigate to the Book A Hotel

@regressionTest
Scenario: Book a Hotel
When user enter the First Name in FirstName field
And user enter the Last Name in LastName field
And user enter the Billing Address in billing Address field
And user enter the Credit Card number in Credit card field
And user select the Credit Card type in Credit card type Dropbox
And user select the Month in month Dropbox
And user select the Year in year Dropbox
And user enter the cvv number in cvv field
Then user Click On the BookNow button and it navigates to the Booking Confirmation

Scenario: Booking Confirmation
Then user Click On the My Itinerary button and it navigates to the Booked Itinerary

Scenario: Booked Itinerary
Then user Click On the LogOut button

