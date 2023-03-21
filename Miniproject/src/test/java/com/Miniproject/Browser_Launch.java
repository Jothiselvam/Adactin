package com.Miniproject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Browser_Launch {
	public static void main(String[]args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Miniproject\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
        
		WebElement findElement1 = driver.findElement(By.name("email"));
		findElement1.sendKeys("Sai Arudra");
		
		WebElement findElement2 = driver.findElement(By.name("pass"));
		findElement2.sendKeys("98765");
		
		WebElement findElement = driver.findElement(By.name("login"));
	    findElement.click();
	    
	    TakesScreenshot ts=(TakesScreenshot) driver;
		File from=ts.getScreenshotAs(OutputType.FILE); 
		File to=new File("C:\\Users\\Admin\\eclipse-workspace\\Miniproject\\Screenshot\\FB.png");
		FileHandler.copy(from,to);
		
}
}
