package com.pom_Adact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Room_Booking_Details {

	public WebDriver driver;
	
	@FindBy(xpath = "//select[@name = 'location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@name = 'hotels']")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@name = 'room_type']")
	private WebElement roomType;
	
	@FindBy(xpath = "//select[@name= 'room_nos']")
	private WebElement roomNos;
	
	@FindBy(xpath = "(//input[@type= 'text'])[2]")
	private WebElement checkinDate;
	
	@FindBy(xpath = "(//input[@type= 'text'])[3]")
	private WebElement checkOutDate;
	
	@FindBy(xpath = "//select[@name= 'adult_room']")
	private WebElement adultsPerRoom;
	
	@FindBy(xpath = "//select[@name= 'child_room']")
	private WebElement childPerRoom;
	
	@FindBy(xpath = "//input[@name= 'Submit']")
	private WebElement search;

	public Room_Booking_Details(WebDriver ac) {
    this.driver=ac;
    PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
}
