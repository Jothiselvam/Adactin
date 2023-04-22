package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Adactin_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_Step   {
	public static WebDriver  driver = Adactin_Runner.driver;
	@Given("^user on the login page$")
	public void user_on_the_login_page() throws Throwable {
//		driver.get("http://adactinhotelapp.com");
//		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com");
		
	}

	@When("^user enters username$")
	public void user_enters_username() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
		login.sendKeys("Saiarudra1");
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Arunkumar@789");
	}

	@When("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable {
		WebElement submit = driver.findElement(By.xpath("//input[@name='login']"));
		submit.click();
	}

	@Then("^user enters into Search Hotel Page to book a hotel room$")
	public void user_enters_into_Search_Hotel_Page_to_book_a_hotel_room() throws Throwable {
		
	}

	@Given("^user have to select hotel location$")
	public void user_have_to_select_hotel_location() throws Throwable {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		location.click();
		Select s= new Select(location);
		s.selectByValue("London");
		}

	@When("^user have to select hotel$")
	public void user_have_to_select_hotel() throws Throwable {
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		hotel.click();
		Select s1= new Select(hotel);
		s1.selectByValue("Hotel Cornice");
	}

	@When("^user have to select room type$")
	public void user_have_to_select_room_type() throws Throwable {
		WebElement type = driver.findElement(By.xpath("//select[@name='room_type']"));
		type.click();
		Select s2= new Select(type);
		s2.selectByValue("Super Deluxe");
	}

	@When("^user have to select no of rooms$")
	public void user_have_to_select_no_of_rooms() throws Throwable {
		WebElement no = driver.findElement(By.xpath("//select[@name='room_nos']"));
		no.click();
		Select s3= new Select(no);
		s3.selectByValue("2");
	}

	@When("^user have to select check in date$")
	public void user_have_to_select_check_in_date() throws Throwable {
		WebElement indate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		indate.sendKeys("10/03/2023");
	}

	@When("^user have to select check out date$")
	public void user_have_to_select_check_out_date() throws Throwable {
		WebElement outdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		outdate.sendKeys("12/03/2023");
	}

	@When("^user have to select adults per room$")
	public void user_have_to_select_adults_per_room() throws Throwable {
		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		adult.click();
		Select s4= new Select(adult);
		s4.selectByValue("2");
	}

	@When("^user have to select children per room$")
	public void user_have_to_select_children_per_room() throws Throwable {
		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		child.click();
		Select s5= new Select(child);
		s5.selectByValue("1");
	}

	@When("^user should click on Search button to check with availability$")
	public void user_should_click_on_Search_button_to_check_with_availability() throws Throwable {
		WebElement select = driver.findElement(By.xpath("//input[@type='submit']"));
		select.click();
	}

	@When("^user should click on Select radio button to select the hotel$")
	public void user_should_click_on_Select_radio_button_to_select_the_hotel() throws Throwable {
		WebElement button = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		button.click();
	}

	@Then("^user should click on Continue button to proceed further$")
	public void user_should_click_on_Continue_button_to_proceed_further() throws Throwable {
		WebElement submit1 = driver.findElement(By.xpath("//input[@type='submit']"));
		submit1.click();
	}

	@Given("^user enters firstname$")
	public void user_enters_firstname() throws Throwable {
		WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
		name.sendKeys("Sai");
	}

	@When("^user enters lastname$")
	public void user_enters_lastname() throws Throwable {
		WebElement name2 = driver.findElement(By.xpath("//input[@name='last_name']"));
		name2.sendKeys("Arudra");
	}

	@When("^user enters billing address$")
	public void user_enters_billing_address() throws Throwable {
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("London");
	}

	@When("^user enters credit card no$")
	public void user_enters_credit_card_no() throws Throwable {
		WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
		card.sendKeys("12345");
	}


	@When("^user enters credit card type$")
	public void user_enters_credit_card_type() throws Throwable {
		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		cardtype.click();
		Select s6= new Select(cardtype);
		s6.selectByValue("AMEX");
	}

	@When("^user enters expiry month$")
	public void user_enters_expiry_month() throws Throwable {
		WebElement exmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		exmonth.click();
		Select s7= new Select(exmonth);
		s7.selectByValue("2");
	}
	@When("^user enters expiry year$")
	public void user_enters_expiry_year() throws Throwable {
		WebElement exyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		exyear.click();
		Select s8= new Select(exyear);
		s8.selectByValue("2022");
	}

	@When("^user enters cvv number$")
	public void user_enters_cvv_number() throws Throwable {
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("123");
	}

	@Then("^user clicks cancel button since booking date might be changed$")
	public void user_clicks_cancel_button_since_booking_date_might_be_changed() throws Throwable {
		WebElement cancel = driver.findElement(By.xpath("//input[@name='cancel']"));
		cancel.click();
		Thread.sleep(2000);
	}

	@Given("^user clicks on Logout button$")
	public void user_clicks_on_Logout_button() throws Throwable {
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
		Thread.sleep(2000);
	}



}
