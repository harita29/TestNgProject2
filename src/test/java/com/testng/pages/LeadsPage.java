package com.testng.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class LeadsPage extends BasePage{

	@FindBy(xpath = "//img[@alt ='All Tabs']")
	WebElement plustab;
	
	@FindBy(xpath = "//a[@href='/00Q/o']")
	WebElement leads_link;
	
	@FindBy(id = "fcf")
	WebElement leads_dropdown;
	
	@FindBy(xpath = "//input[@value=' New ']")
	WebElement New_btn;
	
	@FindBy(id = "name_lastlea2")
	WebElement lastName;
	
	@FindBy(id = "lea3")
	WebElement company_Name;
	
	@FindBy(xpath = "//input[@value=' Save ']")
	WebElement save_btn;
	
	@FindBy(xpath = "//input[@value=' Go! ']")
	WebElement Go_btn;
	
	@FindBy(id = "userNav")
	WebElement usermenudropdown;
	
	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logoutbutton;
	
	public LeadsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void clickOnPlusTab() {
		plustab.click();
	}
	
	public void clickOnLeadsLink() {
		leads_link.click();
	}
	public void clickOnLeadsDropDown() {
		leads_dropdown.click();
	}
	public void clickOnNewButton() {
		New_btn.click();
	}
	public void enterLastName() {
		lastName.sendKeys("ABCD");
	}
	public void enterCompanyName() {
		company_Name.sendKeys("ABCD");
	}
	
	public void clickOnSaveButton() {
		save_btn.click();
	}
	
	public void selectFromLeadsDropDown() {
		Select item1 = new Select(leads_dropdown);
		item1.selectByVisibleText("Today's Leads");
	}
	
	public void clickOnGoButton() {
		Go_btn.click();
	}
	
	public void clickOnUsermenuDropdown() {
		usermenudropdown.click();
	}
	
	public void clickOnLogoutButton() {
		logoutbutton.click();
	}
}
