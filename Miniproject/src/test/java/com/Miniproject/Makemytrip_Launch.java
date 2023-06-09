package com.Miniproject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project.Browser_Launch;

public class Makemytrip_Launch extends Browser_Launch {
	public static void main(String[] args) throws InterruptedException, IOException {
		getDriver();
		geturl("https://www.makemytrip.com/flights/");
		maximize();
		
		WebElement findElement2 = driver.findElement(By.xpath("//a[@class='makeFlex hrtlCenter column active']"));
        thread();
		click(findElement2);        
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Search']"));
		thread();
		click(findElement);
		
		
		WebElement findElement1 = driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']"));
		thread();
		click(findElement1);
		
		getScreenshot("Mytrip");
		getjavascript(5000);
		
		getjavascript(-5000);
		
	}

}
