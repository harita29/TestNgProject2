package com.testng.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class ContactsPage extends BasePage{

	@FindBy(xpath = "//img[@alt ='All Tabs']")
	WebElement plustab;

	@FindBy(xpath = "//a[@href='/003/o']")
	WebElement contacts_link;
	
	@FindBy(xpath = "//input[@value=' New ']")
	WebElement new_btn;
	
	@FindBy(id = "name_lastcon2")
	WebElement lastName;
	
	@FindBy(id = "con4")
	WebElement acctName;
	
	@FindBy(xpath = "//input[@tabindex='31']")
	WebElement save_btn;
	
	@FindBy(xpath = "//input[@tabindex='32']")
	WebElement save_new_btn;
	
	@FindBy(xpath = "//a[contains(text(),'Create')]")
	WebElement create_new_view;
	
	@FindBy(id = "fname")
	WebElement viewName;
	
	@FindBy(id = "devname")
	WebElement unique_view_Name;
	
	@FindBy(xpath = "//input[@data-uidsfdc='4']")
	WebElement save_view_btn;
	
	@FindBy(id = "hotlist_mode")
	WebElement recentDropDown;
	
	@FindBy(id = "fcf")
	WebElement view_dropdown;
	
	@FindBy(xpath = "//a[contains(text(),'ABCD')]")
	WebElement contactname_link;
	
	@FindBy(xpath = "//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")
	WebElement cancel_btn;
	
	public ContactsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnPlusTab() {
		plustab.click();
	}
	
	public void clickOnContactLink() {
		contacts_link.click();
	}
	
	public void clickOnNewContact() {
		new_btn.click();
	}
	
	public void enterLastName() {
		lastName.sendKeys("Parikh");
	}
	
	public void enterAccountName() {
		acctName.sendKeys("MyfirstTestAccount");
	}
	
	public void clickOnSaveButton() {
		save_btn.click();
	}
	
	public void createNewViewContacts() {
		create_new_view.click();
	}
	
	public void sendNewViewName() {
		viewName.sendKeys("NewContactView");
	}
	
	public void sendNewUniqueViewName() {
		unique_view_Name.sendKeys("");
	}
	
	public void saveNewViewButton() {
		save_view_btn.click();
	}
	
	public void selectRecentFromList() {
		Select item1 = new Select(recentDropDown);
		item1.selectByVisibleText("Recently Created");
	}
	
	public void viewMyContacts() {
		Select item1 = new Select(view_dropdown);
		item1.selectByVisibleText("My Contacts");
	}

	public void clickContact() {
		contactname_link.click();		
	}
	
	public void clickOnCancelButton() {
		cancel_btn.click();
	}
	
	public void clickOnSaveNewButton() {
		save_new_btn.click();
	}

}
