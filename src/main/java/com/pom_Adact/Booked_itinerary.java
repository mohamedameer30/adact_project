package com.pom_Adact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_itinerary {

	public WebDriver driver;
	
	@FindBy(xpath = "//td[@class = 'login_title']")
	private WebElement bookedslot;
	
	@FindBy(xpath = "//input[@name ='logout']")
	private WebElement logout;

	public Booked_itinerary(WebDriver ag) {
    this.driver = ag;
    PageFactory.initElements(driver,this);
	
	}

	public WebElement getBookedslot() {
		return bookedslot;
	}

	public WebElement getLogout() {
		return logout;
	}
	
}
