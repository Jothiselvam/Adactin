package com.Miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {
	public static void main(String[]args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		Robot r= new Robot();
		
		//WebElement flight = driver.findElement(By.xpath("//a[@class='makeFlex hrtlCenter column active']"));
		//flight.click();
		
//		WebElement ref1 = driver.findElement(By.xpath("//span[text()='From']"));
//		Thread.sleep(2000);
//		ref1.click();
		
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//    	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
//		WebElement ref2 = driver.findElement(By.xpath("//span[text()='To']"));
//		Thread.sleep(2000);
//		ref2.click();
		
		
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
		
		WebElement ref3 = driver.findElement(By.xpath("//p[text()='17']"));
		Thread.sleep(2000);
		ref3.click();
		
		
		WebElement ref4 = driver.findElement(By.xpath("//span[text()='Travellers & Class']"));
		Thread.sleep(2000);
		ref4.click();
		
		WebElement ref5 = driver.findElement(By.xpath("//li[@data-cy='adults-2']"));
		Thread.sleep(2000);
		ref5.click();
		
		WebElement ref6 = driver.findElement(By.xpath("//li[@data-cy='children-1']"));
		Thread.sleep(2000);
		ref6.click();
		
		
		WebElement ref7 = driver.findElement(By.xpath("//li[@data-cy='travelClass-3']"));
		Thread.sleep(2000);
		ref7.click();
		
		WebElement ref8 = driver.findElement(By.xpath("//button[@type='button']"));
		Thread.sleep(2000);
		ref8.click();
		
		WebElement ref9 = driver.findElement(By.xpath("//a[text()='Search']"));
		Thread.sleep(2000);
		ref9.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
