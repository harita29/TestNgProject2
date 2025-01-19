package com.testng.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.CreateOptyPage;
import com.testng.pages.LoginPage;

public class CreateOptyTest extends BaseTest{

	LoginPage login;
	CreateOptyPage createoptypage;
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
		createoptypage = new CreateOptyPage(driver);
		login.enterusername("harita@shroff.com");
		login.enterpassword("@2Lovebug");
		login.clickonlogin();
	}
	
	@Test
	public void CreateOpty_TC15() {
		createoptypage.clickOnPlusTab();
		createoptypage.clickonOpty();
		createoptypage.clickOnOptyDropDown();
	}
	
	@Test
	public void CreateOpty_TC16() {
		createoptypage.clickOnPlusTab();
		createoptypage.clickonOpty();
		createoptypage.clickOnNewBtn();
		createoptypage.enterNewOptyName();
		createoptypage.enterNewAcctName();
		createoptypage.clickOnCloseDate();
		createoptypage.selectStageDropDown();
		createoptypage.enterProbability();
		createoptypage.selectLeadSourceDropDown();
		createoptypage.enterPrimaryCampaign();
		createoptypage.clickOnSaveButton();
	}
	
	@Test
	public void CreateOpty_TC17() {
		createoptypage.clickOnPlusTab();
		createoptypage.clickonOpty();
		createoptypage.clickOnOptyPipeline();
	}
	
	@Test
	public void CreateOpty_TC18() {
		createoptypage.clickOnPlusTab();
		createoptypage.clickonOpty();
		createoptypage.clickOnStuckOpty();
	}
	
	@Test
	public void CreateOpty_TC19() {
		createoptypage.clickOnPlusTab();
		createoptypage.clickonOpty();
		createoptypage.selectInterval();
		createoptypage.selectIncludeDropDown();
		createoptypage.clickOnRunReport();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		//screenshot.takescreenshot(driver);
		//closebrowser();
		driver.quit();
	}	
}
