package com.testng.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.ContactsPage;
import com.testng.pages.LeadsPage;
import com.testng.pages.LoginPage;

public class ContactTest extends BaseTest{
	
	LoginPage login;
	ContactsPage contactspage;
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
		contactspage = new ContactsPage(driver);
		login.enterusername("harita@shroff.com");
		login.enterpassword("@2Lovebug");
		login.clickonlogin();
	}
	
	@Test
	public void createNewContact_TC25() {
		contactspage.clickOnPlusTab();
		contactspage.clickOnContactLink();
		contactspage.clickOnNewContact(); 
		contactspage.enterLastName();
		contactspage.enterAccountName();
		contactspage.clickOnSaveButton();
		
	}
	
	@Test
	public void createNewViewContact_TC26() {
		contactspage.clickOnPlusTab();
		contactspage.clickOnContactLink();
		contactspage.createNewViewContacts(); 
		contactspage.sendNewViewName();
		contactspage.sendNewUniqueViewName(); 
		contactspage.saveNewViewButton();
	}
	
	@Test
	public void viewRecentContact_TC27() {
		contactspage.clickOnPlusTab();
		contactspage.clickOnContactLink();
		contactspage.selectRecentFromList();
	}
	
	@Test
	public void viewMyContact_TC28() {
		contactspage.clickOnPlusTab();
		contactspage.clickOnContactLink();
		contactspage.viewMyContacts();
	}
	
	@Test
	public void viewContactPage_TC29() {
		contactspage.clickOnPlusTab();
		contactspage.clickOnContactLink();
		contactspage.clickContact();
	}
	
	@Test
	public void createViewWithoutViewName_TC30() {
		contactspage.clickOnPlusTab();
		contactspage.clickOnContactLink();
		contactspage.createNewViewContacts();
		contactspage.sendNewUniqueViewName(); 
		contactspage.saveNewViewButton();
	}
	
	@Test
	public void createViewAndCancel_TC31() {
		contactspage.clickOnPlusTab();
		contactspage.clickOnContactLink();
		contactspage.createNewViewContacts(); 
		contactspage.sendNewViewName();
		contactspage.sendNewUniqueViewName(); 
		contactspage.clickOnCancelButton();
	}
	
	@Test
	public void createNewContact_TC32() {
		contactspage.clickOnPlusTab();
		contactspage.clickOnContactLink();
		contactspage.clickOnNewContact(); 
		contactspage.enterLastName();
		contactspage.enterAccountName();
		contactspage.clickOnSaveNewButton();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		//screenshot.takescreenshot(driver);
		driver.quit();
	}	

}
