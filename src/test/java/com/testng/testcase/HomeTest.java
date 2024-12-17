package com.testng.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.HomePage;
import com.testng.pages.LoginPage;

public class HomeTest extends BaseTest {
	
	LoginPage login;
	WebDriver driver;
	HomePage homepage;
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver = getDriver();
		driver.get("https://login.salesforce.com");
		login = new LoginPage(driver);
		homepage = new HomePage(driver);
		
	}
	
	@Test
	public void clickonhomebutton() {
		login.enterusername("harita@shroff.com");
		login.enterpassword("@2Lovebug");
		login.clickonlogin();
		homepage.clickhomebutton();
	}
	@AfterMethod
	public void teardown() {
		closebrowser();
	}
	
}
