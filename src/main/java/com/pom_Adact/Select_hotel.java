package com.pom_Adact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@type = 'radio']")
	private WebElement select_btn;
	
	@FindBy(xpath = "//input[@name = 'continue']")
	private WebElement continues;

	public Select_hotel(WebDriver ad) {
     this.driver=ad;
     PageFactory.initElements(driver, this);	
	}

	public WebElement getSelect_btn() {
		return select_btn;
	}

	public WebElement getContinues() {
		return continues;
	}
	
	
}
