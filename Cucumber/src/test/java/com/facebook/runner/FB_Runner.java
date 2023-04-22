package com.facebook.runner;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Baseclass;
import com.facebook.helper.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\facebook\\feature\\fb.feature", glue = "FB_Runner.java", 
monochrome = true)
public class FB_Runner {

	public static WebDriver driver;

	@org.junit.BeforeClass
	public static void login() throws IOException {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver = Baseclass.getDriver(browser);
	}
}
