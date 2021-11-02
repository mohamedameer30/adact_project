package com.runner;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.hotel_baseclass.Adact_baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
  glue = "com.stepD",
  monochrome = true,
  dryRun = false,
  strict = true,
 // tags = ("@smokeTest,@sanityTest"),
 
  plugin = {"html:Report/HtmlReport",
		"pretty"  ,
		"json:JsonReport/Report.json",
	"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"
}
)



public class Test_runner {
	
	public static WebDriver driver;   ///-------null
	
	@BeforeClass
	public static  void set_Up() {

		driver = Adact_baseclass.get_Driver("chrome");
	}
	
	@AfterClass
     public static  void tear_Down() {

    	 driver.close();
}



}
