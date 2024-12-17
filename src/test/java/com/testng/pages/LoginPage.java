package com.testng.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testng.base.*;

public class LoginPage extends BasePage {

	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	
	@FindBy(id = "Login")
	WebElement login;
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}
	public void enterusername(String strUsername) {
		waitforElement(username);
		username.sendKeys(strUsername);
	}
	public void enterpassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	public void clickonlogin() {
		login.click();
	}
}
