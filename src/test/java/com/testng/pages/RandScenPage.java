package com.testng.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testng.base.BasePage;

public class RandScenPage extends BasePage{

	@FindBy(xpath = "//a[@title='Home Tab']")
	WebElement home_tab;

	@FindBy(xpath = "//a[@href='/_ui/core/userprofile/UserProfilePage'][normalize-space()='Harita Abcd']")
	WebElement firstandlastname_link;
	
	@FindBy(xpath = "//img[@alt='Edit Profile']")
	WebElement editpen;
	
	@FindBy(xpath = "//iframe[@id='contactInfoContentId']")
	WebElement iFrame;
	
	@FindBy(xpath = "//a[normalize-space()='About']")
	WebElement aboutbtn;
	
	@FindBy(id = "lastName")
	WebElement lname;
	
	@FindBy(xpath = "//input[@value='Save All']")
	WebElement saveall_btn;
	
	@FindBy(xpath = "//img[@alt ='All Tabs']")
	WebElement plus_tab;
	
	@FindBy(xpath = "//input[@title='Customize My Tabs']")
	WebElement customizeMyTab;
	
	@FindBy(xpath = "//option[contains(text(),'People')]")
	WebElement SelectedTabs;
	
	@FindBy(xpath = "//img[@alt='Remove']")
	WebElement remove_btn;
	
	@FindBy(xpath = "//input[@value=' Save ']")
	WebElement save_btn;
	
	@FindBy(id = "userNav")
	WebElement usermenudropdown;
	
	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logoutbutton;
	
	public RandScenPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnHomeTab() {
		home_tab.click();
	}
	
	public void clickOnNameLink() {
		firstandlastname_link.click();
	}
	
	public void clickOnEditProfile() {
		editpen.click();
	}
	
	public void switchFrame() {
		driver.switchTo().frame(iFrame);
	}
	
	public void clickOnAboutBtn() {
		aboutbtn.click();
	}
	
	public void enterLastName() {
		lname.clear();
		lname.sendKeys("Shroff");
	}
	
	public void clickOnSaveAllBtn() {
		saveall_btn.click();
	}

	public void clickOnPlusTab() {
		plus_tab.click();
	}
	
	public void clickOnMyTab() {
		customizeMyTab.click();
	}
	
	public void clickOnSelectedTab() {
		SelectedTabs.click();
	}
	
	public void clickOnRemoveBtn() {
		remove_btn.click();
	}
	
	public void clickOnTabSaveBtn() {
		save_btn.click();
	}
	
	public void clickOnUserMenuDropDown() {
		usermenudropdown.click();
	}
	
	public void clickOnLogoutBtn() {
		logoutbutton.click();
	}
}
