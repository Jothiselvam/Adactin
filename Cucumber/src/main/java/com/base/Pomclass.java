package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass {
	public WebDriver driver;
@FindBy(name="email")	
private WebElement username;
public WebElement getUsername() {
	return username;
}

public WebElement  getUserName() {
	return username;
	
}
@FindBy(name="pass")
private WebElement password;

public WebElement getPassword() {
	return password;
}
@FindBy(name="login")
private WebElement click;

public WebElement getClick() {
	return click;
}

public Pomclass(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver, this);
	
}

}