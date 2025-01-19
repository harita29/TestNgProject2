package com.testng.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.CreateaccountPage;
import com.testng.pages.LoginPage;
import com.testng.pages.UsermenuDropDownPage;

public class CreateaccountTest extends BaseTest{

	LoginPage login;
	WebDriver driver;
	CreateaccountPage createaccountPage;
	// PropertyReader properties;
	//ScreenshotUtilities screenshot = new ScreenshotUtilities();

	@BeforeMethod
	public void beforeMethod() {
		// properties = new PropertyReader();
		// String browserName = properties.getProperties("browser");
		driver = getDriver();
		driver.get("https://login.salesforce.com");
		login = new LoginPage(driver);
		createaccountPage = new CreateaccountPage(driver);
		login.enterusername("harita@shroff.com");
		login.enterpassword("@2Lovebug");
		login.clickonlogin();
	}

	@Test
	public void createAccount_TC10() {
		createaccountPage.clickOnPlusTab();
		createaccountPage.clickOnAccTab();
		createaccountPage.clickOnNewTab();
		createaccountPage.enterAccountName();
		createaccountPage.selectByDropDownType();
		createaccountPage.selectByDropDownPriority();
		createaccountPage.clickOnSaveButton();
	}
		
	@Test
	public void createNewView_TC11() {
		createaccountPage.clickOnPlusTab();
		createaccountPage.clickOnAccTab();
		createaccountPage.clickOnNewVIewName();
		createaccountPage.enterViewName();
		createaccountPage.enterUniqueViewName();
		createaccountPage.saveViewName();
	}
	
	
	@Test
	public void editView_TC12() {
		createaccountPage.clickOnPlusTab();
		createaccountPage.clickOnAccTab();
		createaccountPage.selectViewName();
		createaccountPage.editViewLink();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		TimeUnit.SECONDS.sleep(10);
		//screenshot.takescreenshot(driver);
		closebrowser();
	}
}
