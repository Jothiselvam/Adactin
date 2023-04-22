package com.base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Baseclass {
public static WebDriver driver;

	
	public static WebDriver  getDriver(String browser) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\eclipse-workspace\\Cucumber_Project\\Driver\\chromedriver.exe");
	  return driver= new ChromeDriver();
	}
	 public static void geturl(String url)  {
	driver.get(url);

}
	 public static void maximize() {
		 driver.manage().window().maximize();
	 }
	 public static void input(WebElement a, String b) {
		 a.sendKeys(b);
		 
	 }
	 public static void click(WebElement c) {
		 c.click();
	 }
	
	 public static void getScreenshot(String s) throws IOException {
		 TakesScreenshot ts=(TakesScreenshot) driver;
			File from=ts.getScreenshotAs(OutputType.FILE); 
			File to=new File("C:\\Users\\Admin\\eclipse-workspace\\Miniproject\\Screenshot\\"+ s+".png");
			FileHandler.copy(from,to);
	 }
	 public static void getjavascript(int j) {
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, "+j+");");
	 }
	 public static void thread() throws InterruptedException {
		 Thread.sleep(2000);
	 }
	 

}
