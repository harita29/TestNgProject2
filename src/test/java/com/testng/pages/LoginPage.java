package com.testng.pages;
import org.openqa.selenium.By;
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
	
	@FindBy(xpath = "//input[@name='rememberUn']")
	WebElement rememberme;
	
	@FindBy(id = "userNav")
	WebElement usermenudropdown;

	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logoutbutton;
	
	@FindBy(id = "forgot_password_link")
	WebElement forgotpassword;
	
	@FindBy(id = "un")
	WebElement forgotusername;
	
	@FindBy(id = "continue")
	WebElement cont;
	
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
	public void clickonRememberMe() {
		rememberme.click();
	}
	public void clickonUserMenuDropDown() {
		usermenudropdown.click();
	}
	public void clickonLogout() {
		logoutbutton.click();
	}
	public void clickonForgotPassowrd() {
		forgotpassword.click();
	}
	public void clickonContinue() {
		cont.click();
	}
	public void enterUsernameonForogtPassword() {
		forgotusername.sendKeys("harita@shroff.com");
	}
}
