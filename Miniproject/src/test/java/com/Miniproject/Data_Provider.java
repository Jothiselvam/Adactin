package com.Miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	String [] [] input= {{"Sai","123"},{"Sara","abc"},{"Saran","456"}};
	
    @DataProvider(name="login")
	public String[][] TestDataProvider() {
		return input;
	}
	@Test(dataProvider  ="login")
    public void login(String id,String Password) {
    	System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Miniproject\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.xpath("//input[@name='email']"));
		findElement.sendKeys(id);
		
		WebElement findElement1 = driver.findElement(By.xpath("//input[@type='password']"));
		findElement1.sendKeys(Password);
		
		WebElement findElement2 = driver.findElement(By.xpath("//button[@type='submit']"));
		findElement2.click();
		
    }
	
	
	
}
