package com.hotel_baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adact_baseclass {

	public static WebDriver driver;
	
	public static WebDriver get_Driver(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			
		   driver = new ChromeDriver();
		}
		else {
			System.out.println("not found");
		}	
		driver.manage().window().maximize();
		return driver;
	}
	public static void ClickOnTheElement(WebElement element) {
		
		element.click();
	}
	public static void InputToTheElement(WebElement element, String value ) {
		
		element.sendKeys(value);
	}
	public static void getURL(String url) {
		
		driver.get(url);
	}
	public static void implicity(int second) {
		driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
	}
	
	public static void Dropdown(WebElement element,String type,String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		}
		else if (type.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		}}
	public static void scrollintoview(WebElement element) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public static void takesnap(String element) throws IOException {
		 TakesScreenshot ts = ((TakesScreenshot)driver);
	        
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        
	        
	        File dest = new File("C:\\Users\\ameer\\eclipse-workspace\\Adactin_maven_project\\Screenshots//"+element+".png");
	        
	        FileUtils.copyFile(src, dest);
	}
}
