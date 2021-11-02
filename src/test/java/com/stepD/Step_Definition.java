package com.stepD;

import org.openqa.selenium.WebDriver;

import com.helper.File_Reader_Manager;
import com.hotel_baseclass.Adact_baseclass;
import com.runner.Test_runner;
import com.sdp.page_Object_manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Adact_baseclass {

	public static WebDriver driver = Test_runner.driver;
	public static page_Object_manager pom = new page_Object_manager(driver);
	
	@Given("^user launch the Application$")
	public void user_launch_the_Application() throws Throwable {
	  getURL("https://adactinhotelapp.com/index.php");
	}

	@When("^user enter the \"([^\"]*)\" in Username field$")
	public void user_enter_the_in_Username_field(String username) throws Throwable {
		implicity(20);
		InputToTheElement(pom.getInstanceLp().getUsername(),username);
	}

	@When("^user enter the \"([^\"]*)\" in Password field$")
	public void user_enter_the_in_Password_field(String password) throws Throwable {
	  
		InputToTheElement(pom.getInstanceLp().getPassword(),password);
	}

	@Then("^user Click On the Login Button and it navigate to the Search Hotel Page$")
	public void user_Click_On_the_Login_Button_and_it_navigate_to_the_Search_Hotel_Page() throws Throwable {
	    
		ClickOnTheElement(pom.getInstanceLp().getLogin());
	}

	@When("^user select the \"([^\"]*)\" location in location Dropbox$")
	public void user_select_the_location_in_location_Dropbox(String location) throws Throwable {
		implicity(20);
		Dropdown(pom.getInstanceRoombooking().getLocation(),"value",location);
	}
	
	@When("^user select the hotel in hotel Dropbox$")
	public void user_select_the_hotel_in_hotel_Dropbox() throws Throwable {
		
		Dropdown(pom.getInstanceRoombooking().getHotels(),"index","1");
	}

	@When("^user select the \"([^\"]*)\" room type in RoomType Dropbox$")
	public void user_select_the_room_type_in_RoomType_Dropbox(String roomtype) throws Throwable {
	 
		Dropdown(pom.getInstanceRoombooking().getRoomType(),"visibletext",roomtype);
	}

	@When("^user select the No Of Rooms in NoOfRooms Dropbox$")
	public void user_select_the_No_Of_Rooms_in_NoOfRooms_Dropbox() throws Throwable {
	   
		Dropdown(pom.getInstanceRoombooking().getRoomNos(),"value","2");
	}
	
	@When("^user select the Check In Date in CheckInDate Dropbox$")
	public void user_select_the_Check_In_Date_in_CheckInDate_Dropbox() throws Throwable {
		implicity(20);

		InputToTheElement(pom.getInstanceRoombooking().getCheckinDate(),"17/10/2021");
	}

	@When("^user select the Check Out Date in CheckOutDate Dropbox$")
	public void user_select_the_Check_Out_Date_in_CheckOutDate_Dropbox() throws Throwable {
	
		InputToTheElement(pom.getInstanceRoombooking().getCheckOutDate(),"18/10/2021");	
	}

	@When("^user select the Adult per Room in AdultPerRoom Dropbox$")
	public void user_select_the_Adult_per_Room_in_AdultPerRoom_Dropbox() throws Throwable {
	
		Dropdown(pom.getInstanceRoombooking().getAdultsPerRoom(),"value","2");
	}

	@When("^user select the Children per Room in ChildtPerRoom Dropbox$")
	public void user_select_the_Children_per_Room_in_ChildtPerRoom_Dropbox() throws Throwable {
	 
		Dropdown(pom.getInstanceRoombooking().getChildPerRoom(),"value","1");
	}

	@Then("^user Click On the Search button and it navigate to the Select Hotel$")
	public void user_Click_On_the_Search_button_and_it_navigate_to_the_Select_Hotel() throws Throwable {
	  
		ClickOnTheElement(pom.getInstanceRoombooking().getSearch());
	}

	@When("^user select the hotel by using Select button$")
	public void user_select_the_hotel_by_using_Select_button() throws Throwable {
	  
		ClickOnTheElement(pom.getInstanceHotelsearch().getSelect_btn());
	}

	@Then("^user Click On the Continue button and it navigate to the Book A Hotel$")
	public void user_Click_On_the_Continue_button_and_it_navigate_to_the_Book_A_Hotel() throws Throwable {
	
		ClickOnTheElement(pom.getInstanceHotelsearch().getContinues());
	}

	@When("^user enter the First Name in FirstName field$")
	public void user_enter_the_First_Name_in_FirstName_field() throws Throwable {
		implicity(20);

		InputToTheElement(pom.getInstanceBooking().getFirstname(),"Mohamed");
	}

	@When("^user enter the Last Name in LastName field$")
	public void user_enter_the_Last_Name_in_LastName_field() throws Throwable {
	
		InputToTheElement(pom.getInstanceBooking().getLastname(),"ameerdeen");
	}

	@When("^user enter the Billing Address in billing Address field$")
	public void user_enter_the_Billing_Address_in_billing_Address_field() throws Throwable {
	
		InputToTheElement(pom.getInstanceBooking().getBillingAddress(),"1/316 south street,New york");	
	}

	@When("^user enter the Credit Card number in Credit card field$")
	public void user_enter_the_Credit_Card_number_in_Credit_card_field() throws Throwable {
       
		String creditCardNo = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCreditCardNo();
		InputToTheElement(pom.getInstanceBooking().getCreditNo(),creditCardNo);
	}

	@When("^user select the Credit Card type in Credit card type Dropbox$")
	public void user_select_the_Credit_Card_type_in_Credit_card_type_Dropbox() throws Throwable {
	   
		String cardtype = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardtype();
		Dropdown(pom.getInstanceBooking().getCreditType(),"value",cardtype);
	}

	@When("^user select the Month in month Dropbox$")
	public void user_select_the_Month_in_month_Dropbox() throws Throwable {
	  
		implicity(20);
		String expMonth = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpMonth();
		Dropdown(pom.getInstanceBooking().getExpmonth(),"value",expMonth);
	}

	@When("^user select the Year in year Dropbox$")
	public void user_select_the_Year_in_year_Dropbox() throws Throwable {
	 
		String expYear = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpYear();
		Dropdown(pom.getInstanceBooking().getExpYear(),"value",expYear);
	}

	@When("^user enter the cvv number in cvv field$")
	public void user_enter_the_cvv_number_in_cvv_field() throws Throwable {
	 
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvv();
		InputToTheElement(pom.getInstanceBooking().getCcv(),cvv);		
	}

	@Then("^user Click On the BookNow button and it navigates to the Booking Confirmation$")
	public void user_Click_On_the_BookNow_button_and_it_navigates_to_the_Booking_Confirmation() throws Throwable {
	
		ClickOnTheElement(pom.getInstanceBooking().getBooknow());
	}

	@Then("^user Click On the My Itinerary button and it navigates to the Booked Itinerary$")
	public void user_Click_On_the_My_Itinerary_button_and_it_navigates_to_the_Booked_Itinerary() throws Throwable {
	   
		implicity(20);

		ClickOnTheElement(pom.getInstanceItinerary().getItinerary());
	}

	@Then("^user Click On the LogOut button$")
	public void user_Click_On_the_LogOut_button() throws Throwable {
	 
		scrollintoview(pom.getInstanceBooked().getBookedslot());
		
		takesnap("snap1");

		ClickOnTheElement(pom.getInstanceBooked().getLogout())	;
	}
	
	
	
}
