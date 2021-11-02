package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\ameer\\eclipse-workspace\\Adactin_maven_project\\src\\main\\java\\com\\config\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f); 
		p = new Properties();
		p.load(fis);
		
	}
	public String getUrl() {
		
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		
		String username = p.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		
		String password = p.getProperty("password");
		return password;
	}
	
	public String getCreditCardNo() {
		
		String cardno = p.getProperty("creditCardNo");
		return cardno;
	}
	public String getCardtype() {
		
		String cardtype = p.getProperty("cardtype");
		return cardtype;
	}
	public String getExpMonth() {
		
		String expmonth = p.getProperty("expMonth");
		return expmonth;
	}
	public String getExpYear() {
		
		String expyear = p.getProperty("expYear");
		return expyear;
	}
	public String getCvv() {
		
		String cvv = p.getProperty("cvv");
		return cvv;
	}
}
