package com.facebook.step;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.base.Baseclass;
import com.base.Pomclass;
import com.facebook.helper.File_Reader_Manager;
import com.facebook.runner.FB_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FB_Step extends Baseclass {
	public static WebDriver  driver = FB_Runner.driver;
	public static Pomclass p;
	@Given("^user On The Login Page$")
	public void user_On_The_Login_Page() throws IOException {
		String url=File_Reader_Manager.getInstance().getInstanceCR().getUrl();
	    geturl(url);
		//driver.get("https://www.facebook.com/login/");
	}

	@When("^user Enters Username$")
	public void user_Enters_Username() {
//		WebElement findElement1 = driver.findElement(By.name("email"));
//		findElement1.sendKeys("Sai Arudra");
		p=new Pomclass(driver);
		input(p.getUserName(), "Sai");
		
	}

	@When("^user Enters Password$")
	public void user_Enters_Password() {
//		WebElement findElement2 = driver.findElement(By.name("pass"));
//		findElement2.sendKeys("98765");
		input(p.getPassword(), "123");
	}
	

	@Then("^user Clicks Login Button$")
	public void user_Clicks_Login_Button() {
//		WebElement findElement = driver.findElement(By.name("login"));
//	    findElement.click();
		click(p.getClick());
	}

}
