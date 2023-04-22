package com.adactin.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

		
@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\adactin.feature",
		 glue="com.adactin.stepdefinition")
		
public class Adactin_Runner {
	public static WebDriver  driver;
	
    @BeforeClass
	public static void url_launch() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Cucumber_Project\\Driver\\chromedriver.exe");	
	 driver=new ChromeDriver();
    }
    @AfterClass
    public static void finish() {
    	driver.close();
    }
    
    
	
	
    

}