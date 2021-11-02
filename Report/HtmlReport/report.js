$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the \"\u003cusername\u003e\" in Username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter the \"\u003cpassword\u003e\" in Password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On the Login Button and it navigate to the Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;login;;1"
    },
    {
      "cells": [
        "Starc",
        "12345"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;login;;2"
    },
    {
      "cells": [
        "ameer",
        "ameer12345"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login;;3"
    },
    {
      "cells": [
        "reemaabbas",
        "I4X0NU"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the \"Starc\" in Username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter the \"12345\" in Password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On the Login Button and it navigate to the Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_launch_the_Application()"
});
formatter.result({
  "duration": 7603260100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Starc",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_Username_field(String)"
});
formatter.result({
  "duration": 1665518400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_Password_field(String)"
});
formatter.result({
  "duration": 363807700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_the_Login_Button_and_it_navigate_to_the_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1346130800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the \"ameer\" in Username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter the \"ameer12345\" in Password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On the Login Button and it navigate to the Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_launch_the_Application()"
});
formatter.result({
  "duration": 772340700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ameer",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_Username_field(String)"
});
formatter.result({
  "duration": 308404600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ameer12345",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_Password_field(String)"
});
formatter.result({
  "duration": 302711000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_the_Login_Button_and_it_navigate_to_the_Search_Hotel_Page()"
});
formatter.result({
  "duration": 881323100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the \"reemaabbas\" in Username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter the \"I4X0NU\" in Password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On the Login Button and it navigate to the Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_launch_the_Application()"
});
formatter.result({
  "duration": 704424600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "reemaabbas",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_Username_field(String)"
});
formatter.result({
  "duration": 351888200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I4X0NU",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enter_the_in_Password_field(String)"
});
formatter.result({
  "duration": 237600000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_the_Login_Button_and_it_navigate_to_the_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1703102000,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user select the \"London\" location in location Dropbox",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user select the hotel in hotel Dropbox",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user select the \"Double\" room type in RoomType Dropbox",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user select the No Of Rooms in NoOfRooms Dropbox",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user select the Check In Date in CheckInDate Dropbox",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user select the Check Out Date in CheckOutDate Dropbox",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user select the Adult per Room in AdultPerRoom Dropbox",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user select the Children per Room in ChildtPerRoom Dropbox",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click On the Search button and it navigate to the Select Hotel",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_select_the_location_in_location_Dropbox(String)"
});
formatter.result({
  "duration": 1017503500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_hotel_in_hotel_Dropbox()"
});
formatter.result({
  "duration": 425625400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Double",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_select_the_room_type_in_RoomType_Dropbox(String)"
});
formatter.result({
  "duration": 323640100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_No_Of_Rooms_in_NoOfRooms_Dropbox()"
});
formatter.result({
  "duration": 306829000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_Check_In_Date_in_CheckInDate_Dropbox()"
});
formatter.result({
  "duration": 268097000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_Check_Out_Date_in_CheckOutDate_Dropbox()"
});
formatter.result({
  "duration": 282554100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_Adult_per_Room_in_AdultPerRoom_Dropbox()"
});
formatter.result({
  "duration": 306781700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_Children_per_Room_in_ChildtPerRoom_Dropbox()"
});
formatter.result({
  "duration": 294533300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_the_Search_button_and_it_navigate_to_the_Select_Hotel()"
});
formatter.result({
  "duration": 1835254600,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user select the hotel by using Select button",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Click On the Continue button and it navigate to the Book A Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_select_the_hotel_by_using_Select_button()"
});
formatter.result({
  "duration": 209845900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_the_Continue_button_and_it_navigate_to_the_Book_A_Hotel()"
});
formatter.result({
  "duration": 1307804700,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Book a Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user enter the First Name in FirstName field",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user enter the Last Name in LastName field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user enter the Billing Address in billing Address field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user enter the Credit Card number in Credit card field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user select the Credit Card type in Credit card type Dropbox",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user select the Month in month Dropbox",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user select the Year in year Dropbox",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user enter the cvv number in cvv field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Click On the BookNow button and it navigates to the Booking Confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_enter_the_First_Name_in_FirstName_field()"
});
formatter.result({
  "duration": 329425700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_Last_Name_in_LastName_field()"
});
formatter.result({
  "duration": 322464800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_Billing_Address_in_billing_Address_field()"
});
formatter.result({
  "duration": 379417200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_Credit_Card_number_in_Credit_card_field()"
});
formatter.result({
  "duration": 351967600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_Credit_Card_type_in_Credit_card_type_Dropbox()"
});
formatter.result({
  "duration": 364770500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_Month_in_month_Dropbox()"
});
formatter.result({
  "duration": 383948000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_Year_in_year_Dropbox()"
});
formatter.result({
  "duration": 309827900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_cvv_number_in_cvv_field()"
});
formatter.result({
  "duration": 313729900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_the_BookNow_button_and_it_navigates_to_the_Booking_Confirmation()"
});
formatter.result({
  "duration": 214505100,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Booking Confirmation",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 46,
  "name": "user Click On the My Itinerary button and it navigates to the Booked Itinerary",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_the_My_Itinerary_button_and_it_navigates_to_the_Booked_Itinerary()"
});
formatter.result({
  "duration": 7951091800,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Booked Itinerary",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booked-itinerary",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 49,
  "name": "user Click On the LogOut button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_the_LogOut_button()"
});
formatter.result({
  "duration": 6614619700,
  "status": "passed"
});
});