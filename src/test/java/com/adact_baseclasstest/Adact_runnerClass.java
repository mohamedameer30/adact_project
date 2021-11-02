package com.adact_baseclasstest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.helper.File_Reader_Manager;
import com.hotel_baseclass.Adact_baseclass;
import com.pom_Adact.Book_Hotel;
import com.pom_Adact.Booked_itinerary;
import com.pom_Adact.Itinerary;
import com.pom_Adact.Login_page;
import com.pom_Adact.Room_Booking_Details;
import com.pom_Adact.Select_hotel;
import com.sdp.page_Object_manager;

public class Adact_runnerClass extends  Adact_baseclass{

public static WebDriver driver = Adact_baseclass.get_Driver("chrome");

public static page_Object_manager pom = new page_Object_manager(driver);
	
public static void main(String[] args) throws Throwable {

String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();	
getURL(url);
		
implicity(20);

String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
InputToTheElement(pom.getInstanceLp().getUsername(),username);

String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
InputToTheElement(pom.getInstanceLp().getPassword(),password);
	
ClickOnTheElement(pom.getInstanceLp().getLogin());

implicity(20);

Dropdown(pom.getInstanceRoombooking().getLocation(),"value","London");

Dropdown(pom.getInstanceRoombooking().getHotels(),"index","1");

Dropdown(pom.getInstanceRoombooking().getRoomType(),"visibletext","Double");

Dropdown(pom.getInstanceRoombooking().getRoomNos(),"value","2");

implicity(20);

InputToTheElement(pom.getInstanceRoombooking().getCheckinDate(),"17/10/2021");

InputToTheElement(pom.getInstanceRoombooking().getCheckOutDate(),"18/10/2021");

Dropdown(pom.getInstanceRoombooking().getAdultsPerRoom(),"value","2");

Dropdown(pom.getInstanceRoombooking().getChildPerRoom(),"value","1");
	
ClickOnTheElement(pom.getInstanceRoombooking().getSearch());

ClickOnTheElement(pom.getInstanceHotelsearch().getSelect_btn());
		
ClickOnTheElement(pom.getInstanceHotelsearch().getContinues());
	    
implicity(20);

InputToTheElement(pom.getInstanceBooking().getFirstname(),"Mohamed");
	    
InputToTheElement(pom.getInstanceBooking().getLastname(),"ameerdeen");
	    
InputToTheElement(pom.getInstanceBooking().getBillingAddress(),"1/316 south street,New york");

String creditCardNo = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCreditCardNo();
InputToTheElement(pom.getInstanceBooking().getCreditNo(),creditCardNo);

String cardtype = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardtype();
Dropdown(pom.getInstanceBooking().getCreditType(),"value",cardtype);

implicity(20);

String expMonth = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpMonth();
Dropdown(pom.getInstanceBooking().getExpmonth(),"value",expMonth);

String expYear = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpYear();
Dropdown(pom.getInstanceBooking().getExpYear(),"value",expYear);

String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvv();
InputToTheElement(pom.getInstanceBooking().getCcv(),cvv);
		
ClickOnTheElement(pom.getInstanceBooking().getBooknow());
		
implicity(20);

ClickOnTheElement(pom.getInstanceItinerary().getItinerary());
	
scrollintoview(pom.getInstanceBooked().getBookedslot());
		
takesnap("snap1");

ClickOnTheElement(pom.getInstanceBooked().getLogout())	;
	}
}
