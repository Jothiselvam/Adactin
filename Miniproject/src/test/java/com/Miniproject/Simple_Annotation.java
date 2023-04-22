package com.Miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	public static WebDriver driver;
	@BeforeSuite
	public void setproperty() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Miniproject\\Driver\\chromedriver.exe");	
		driver=new ChromeDriver();
		}
		
		
		@BeforeTest
	public static void browser_launch() {
		driver.get("http://adactinhotelapp.com");
	}
		@BeforeClass
		public static  void maxi()	{
		driver.manage().window().maximize();
}
		@BeforeMethod
	public static void login() {
		WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
		login.sendKeys("Saiarudra1");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Arunkumar@789");
		WebElement submit = driver.findElement(By.xpath("//input[@name='login']"));
		submit.click();
		}
		
		@Test
		private void booking() {
		
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		location.click();
		Select s= new Select(location);
		s.selectByValue("London");
		
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		hotel.click();
		Select s1= new Select(hotel);
		s1.selectByValue("Hotel Cornice");
		
		WebElement type = driver.findElement(By.xpath("//select[@name='room_type']"));
		type.click();
		Select s2= new Select(type);
		s2.selectByValue("Super Deluxe");
		
		WebElement no = driver.findElement(By.xpath("//select[@name='room_nos']"));
		no.click();
		Select s3= new Select(no);
		s3.selectByValue("2");
		
		WebElement indate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		indate.sendKeys("10/03/2023");
		
		WebElement outdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		outdate.sendKeys("12/03/2023");
		
		
		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		adult.click();
		Select s4= new Select(adult);
		s4.selectByValue("2");
		
	
		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		child.click();
		Select s5= new Select(child);
		s5.selectByValue("1");
		}
		@AfterMethod
		public void submit() {
	
		WebElement select = driver.findElement(By.xpath("//input[@type='submit']"));
		select.click();
		
		WebElement button = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		button.click();
		}
		@AfterClass
		public void payment() throws InterruptedException {
		WebElement submit1 = driver.findElement(By.xpath("//input[@type='submit']"));
		submit1.click();
	
		
		WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
		name.sendKeys("Sai");

		WebElement name2 = driver.findElement(By.xpath("//input[@name='last_name']"));
		name2.sendKeys("Arudra");

		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("London");

		WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
		card.sendKeys("12345");
		
		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		cardtype.click();
		Select s6= new Select(cardtype);
		s6.selectByValue("AMEX");
		
		WebElement exmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		exmonth.click();
		Select s7= new Select(exmonth);
		s7.selectByValue("2");
		
		WebElement exyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		exyear.click();
		Select s8= new Select(exyear);
		s8.selectByValue("2022");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("123");
		
		WebElement cancel = driver.findElement(By.xpath("//input[@name='cancel']"));
		cancel.click();
		Thread.sleep(2000);
		}
		@AfterTest
		public void logout() throws InterruptedException {
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
		Thread.sleep(2000);
		
		driver.close();
		

}
}
