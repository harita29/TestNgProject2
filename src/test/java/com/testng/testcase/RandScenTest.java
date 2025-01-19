package com.testng.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.LeadsPage;
import com.testng.pages.LoginPage;
import com.testng.pages.RandScenPage;

public class RandScenTest extends BaseTest {
	
	LoginPage login;
	RandScenPage randscenpage;
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
		randscenpage = new RandScenPage(driver);
		login.enterusername("harita@shroff.com");
		login.enterpassword("@2Lovebug");
		login.clickonlogin();
	}

	@Test
	public void verifyCorrectUserLoggedIn_TC33() {
		randscenpage.clickOnHomeTab();
		randscenpage.clickOnNameLink();
	}
	
	@Test
	public void verifyNameChange_TC34() {
		randscenpage.clickOnHomeTab();
		randscenpage.clickOnNameLink();
		randscenpage.clickOnEditProfile();
		randscenpage.switchFrame();
		randscenpage.clickOnAboutBtn();
		randscenpage.enterLastName();
		randscenpage.clickOnSaveAllBtn();
	}
	
	@Test
	public void verifyTabCustomization_TC35() {
		randscenpage.clickOnPlusTab();
		randscenpage.clickOnMyTab(); 
		randscenpage.clickOnSelectedTab();
		randscenpage.clickOnRemoveBtn();
		randscenpage.clickOnTabSaveBtn();
		randscenpage.clickOnUserMenuDropDown();
		randscenpage.clickOnLogoutBtn();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		//screenshot.takescreenshot(driver);
		driver.quit();
	}	

}
