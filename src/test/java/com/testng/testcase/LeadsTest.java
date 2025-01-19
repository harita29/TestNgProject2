package com.testng.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.CreateOptyPage;
import com.testng.pages.LeadsPage;
import com.testng.pages.LoginPage;

public class LeadsTest extends BaseTest{
	
	
	LoginPage login;
	LeadsPage leadspage;
	WebDriver driver;
	//PropertyReader properties;
	//ScreenshotUtilities screenshot = new ScreenshotUtilities();

	@BeforeMethod
	public void beforeMethod() {
		// properties = new PropertyReader();
		// String browserName = properties.getProperties("browser");
		driver = getDriver();
		driver.get("https://login.salesforce.com");
		login = new LoginPage(driver);
		leadspage = new LeadsPage(driver);
		login.enterusername("harita@shroff.com");
		login.enterpassword("@2Lovebug");
		login.clickonlogin();
	}

	@Test
	public void CreateOpty_TC20() {
		leadspage.clickOnPlusTab();
		leadspage.clickOnLeadsLink();
		
	}
	@Test
	public void CreateOpty_TC21() {
		leadspage.clickOnPlusTab();
		leadspage.clickOnLeadsLink();
		leadspage.clickOnLeadsDropDown();
		
	}
	@Test
	public void CreateOpty_TC22() {
		leadspage.clickOnPlusTab();
		leadspage.clickOnLeadsLink();
		leadspage.clickOnLeadsDropDown();
		leadspage.clickOnUsermenuDropdown();
		leadspage.clickOnLogoutButton();
		login.enterusername("harita@shroff.com");
		login.enterpassword("@2Lovebug");
		login.clickonlogin();
		leadspage.clickOnPlusTab();
		leadspage.clickOnLeadsLink();
		leadspage.clickOnGoButton();
	}
	@Test
	public void CreateOpty_TC23() {
		leadspage.clickOnPlusTab();
		leadspage.clickOnLeadsLink();
		leadspage.selectFromLeadsDropDown();
		leadspage.clickOnGoButton();
		
	}
	@Test
	public void CreateOpty_TC24() {
		leadspage.clickOnPlusTab();
		leadspage.clickOnLeadsLink();
		leadspage.clickOnNewButton();
		leadspage.enterLastName();
		leadspage.enterCompanyName();
		leadspage.clickOnSaveButton();
		
	}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		//screenshot.takescreenshot(driver);
		//closebrowser();
		driver.quit();
	}	
	
	
}
