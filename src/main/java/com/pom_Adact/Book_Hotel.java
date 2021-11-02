package com.pom_Adact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement billingAddress;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement creditNo;
	
	@FindBy(xpath ="//select[@name='cc_type']")
	private WebElement creditType;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expmonth;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expYear;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement ccv;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement booknow;

	public Book_Hotel(WebDriver ae) {
    this.driver=ae;
    PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditNo() {
		return creditNo;
	}

	public WebElement getCreditType() {
		return creditType;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBooknow() {
		return booknow;
	}
}
