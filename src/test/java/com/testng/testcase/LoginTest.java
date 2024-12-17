package com.testng.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.*;
import com.testng.pages.LoginPage;
import com.testng.utilities.PropertyReader;
import com.testng.utilities.ScreenshotUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest {

	LoginPage login;
	WebDriver driver;
	// PropertyReader properties;
	ScreenshotUtilities screenshot = new ScreenshotUtilities();

	@BeforeMethod
	public void beforeMethod() {
		// properties = new PropertyReader();
		// String browserName = properties.getProperties("browser");
		driver = getDriver();
		driver.get("https://login.salesforce.com");
		login = new LoginPage(driver);

	}

	@Test

	public void validlogin() {
		login.enterusername("harita@shroff.com");
		login.enterpassword("@2Lovebug");
		login.clickonlogin();
	}

	@Test

	public void loginwithinvalidpassword() {
		login.enterusername("harita@shroff.com");
		login.enterpassword("@3Lovebug");
		login.clickonlogin();
	}

	@AfterMethod
	public void teardown() {

		screenshot.takescreenshot(driver);
		closebrowser();
	}
}
