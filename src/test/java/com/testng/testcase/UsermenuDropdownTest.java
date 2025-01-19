package com.testng.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.LoginPage;
import com.testng.pages.UsermenuDropDownPage;
import com.testng.utilities.ScreenshotUtilities;

public class UsermenuDropdownTest extends BaseTest{

	LoginPage login;
	UsermenuDropDownPage dropdownpage;
	WebDriver driver;
	// PropertyReader properties;
	//ScreenshotUtilities screenshot = new ScreenshotUtilities();

	@BeforeMethod
	public void beforeMethod() {
		// properties = new PropertyReader();
		// String browserName = properties.getProperties("browser");
		driver = getDriver();
		driver.get("https://login.salesforce.com");
		login = new LoginPage(driver);
		dropdownpage = new UsermenuDropDownPage(driver);
		login.enterusername("harita@shroff.com");
		login.enterpassword("@2Lovebug");
		login.clickonlogin();
	}
	
	
	@Test
	public void usermenudropdown_tc05() {
		dropdownpage.clickonUserMenuDropDown();	
	}
	
	@Test
	public void devconsole_tc08() {
		dropdownpage.clickonUserMenuDropDown();
		dropdownpage.clickonDevConsole();
		dropdownpage.closePopWindow();
	}
	
	@Test
	public void logout_tc09() {
		dropdownpage.clickonUserMenuDropDown();	
		dropdownpage.clickonLogout();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		TimeUnit.SECONDS.sleep(10);
		//screenshot.takescreenshot(driver);
		closebrowser();
	}

}
