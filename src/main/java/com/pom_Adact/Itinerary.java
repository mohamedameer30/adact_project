package com.pom_Adact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement itinerary;

	public Itinerary(WebDriver af) {

		this.driver = af;
		PageFactory.initElements(driver,this);
	}

	public WebElement getItinerary() {
		return itinerary;
	}
	
}
