package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom_Adact.Book_Hotel;
import com.pom_Adact.Booked_itinerary;
import com.pom_Adact.Itinerary;
import com.pom_Adact.Login_page;
import com.pom_Adact.Room_Booking_Details;
import com.pom_Adact.Select_hotel;

public class page_Object_manager {

	public WebDriver driver;
	
	private  Login_page lp;
	private Room_Booking_Details roombooking;
	private Select_hotel hotelsearch;
	private Book_Hotel booking;
	private Itinerary itinerary;
	private Booked_itinerary booked;
	
	public page_Object_manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_page getInstanceLp() {
		lp = new Login_page(driver);
		return lp;
	}
	
	public Room_Booking_Details getInstanceRoombooking(){
		roombooking = new Room_Booking_Details(driver);
		return roombooking;
		
	}
	
	public Select_hotel getInstanceHotelsearch() {
		hotelsearch = new Select_hotel(driver);
		return hotelsearch;	
	}
	
	public Book_Hotel getInstanceBooking() {
		booking = new Book_Hotel(driver);
		return booking;
	}
	
	public Itinerary getInstanceItinerary() {
		itinerary = new Itinerary(driver);
		return itinerary;
	}
	
	public Booked_itinerary getInstanceBooked() {
		booked = new Booked_itinerary(driver);
		return booked;
	}
	
}
