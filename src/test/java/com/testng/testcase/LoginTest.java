package com.testng.testcase;

import java.util.concurrent.TimeUnit;

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

	public void validlogin_tc02() {
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
	

	@Test

	public void loginwithoutpassword_tc01() {
		login.enterusername("harita@shroff.com");
		login.clickonlogin();
	}

	@Test

	public void loginrememberme_tc03() {
		login.enterusername("harita@shroff.com");
		login.enterpassword("@2Lovebug");
		login.clickonRememberMe();
		login.clickonlogin();
		login.clickonUserMenuDropDown();
		login.clickonLogout();
	}

	@Test
	
	public void forgotpassword_tc04a() {
		login.clickonForgotPassowrd();
		login.enterUsernameonForogtPassword();
		login.clickonContinue();
	}
	
	@Test

	public void forgotpassword_tc04b() {
		login.enterusername("123");
		login.enterpassword("22131");
		login.clickonlogin();
	}
	
	
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		//TimeUnit.SECONDS.sleep(10);
		//screenshot.takescreenshot(driver);
		closebrowser();
	}
}
