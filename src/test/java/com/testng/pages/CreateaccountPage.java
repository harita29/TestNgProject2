package com.testng.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class CreateaccountPage extends BasePage{

	@FindBy(xpath = "//img[@alt ='All Tabs']")
	WebElement plustab;
	
	@FindBy(xpath = "//a[@href ='/001/o']")
	WebElement accounttab;
	
	@FindBy(xpath = "//input[@value=' New ']")
	WebElement newtab;
	
	@FindBy(id = "acc2")
	WebElement accnametextbox;
	
	@FindBy(id = "acc6")
	WebElement type;
	
	@FindBy(xpath = "//select[@id='00Nbm000006T6xq']")
	WebElement priority;
	
	@FindBy(xpath = "//input[@tabindex='34']")
	WebElement btnsave;
	
	@FindBy(xpath = "//a[contains(text(),'Create New View')]")
	WebElement createview;
	
	@FindBy(id = "fname")
	WebElement viewname;
	
	@FindBy(id = "devname")
	WebElement viewuniquename;
	
	@FindBy(xpath = "//input[@data-uidsfdc='4']")
	WebElement saveviewname;	
	
	@FindBy(id = "fcf")
	WebElement viewDropDown;
	
	@FindBy(xpath = "//div[@id='00Bbm00000KI94X_filterLinks']//a[contains(text(),'Edit')]")
	WebElement editlink;
	
	@FindBy(id = "fcol1")
	WebElement fielddropdown;
	
	@FindBy(id = "fop1")
	WebElement operatordropdown;
	
	@FindBy(id = "fval1")
	WebElement valuedropdown;
	
	@FindBy(id = "colselector_select_0")
	WebElement availablefieldsdropdown;
	
	@FindBy(xpath = "//a[@id='colselector_select_0_right']//img[@title='Add']")
	WebElement addicon;
	
	@FindBy(xpath = "//input[@data-uidsfdc='5']")
	WebElement saveeditviewbutton;
	
	@FindBy(xpath = "//label[@for='fname']")
	WebElement editviewnameelement;
	
	@FindBy(xpath = "//label[@for='devname']")
	WebElement edituniqueviewnameelement;
	
	public CreateaccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnPlusTab() {
		plustab.click();
	}
	
	public void clickOnAccTab() {
		accounttab.click();
	}
	
	public void clickOnNewTab() {
		newtab.click();
	}
	
	public void enterAccountName() {
		accnametextbox.sendKeys("MyFirstAccount1");
	}
	
	public void clickOnSaveButton() {
		btnsave.click();
	}
	
	public void selectByDropDownType() {
		Select item1 = new Select(type);
		item1.selectByVisibleText("Technology Partner");
	}
	
	public void selectByDropDownPriority() {
		Select item2 = new Select(priority);
		item2.selectByVisibleText("High");
	}
	
	public void clickOnNewVIewName() {
		createview.click();
	}
	
	public void enterViewName() {
		viewname.sendKeys("testview7");
	}
	
	public void enterUniqueViewName() {
		viewuniquename.sendKeys("testview7");
	}
	
	public void saveViewName() {
		saveviewname.click();
	}
	
	public void selectViewName() {
		Select item1 = new Select(viewDropDown);
		item1.selectByVisibleText("testview7");
	}
	
	public void editViewLink() {
		editlink.click();
	}
	
	public void editViewName() {
		editlink.click();
		editviewnameelement.sendKeys("test_7");
		Select item2 = new Select(fielddropdown);
		item2.selectByVisibleText("Account Name");
		Select item3 = new Select(operatordropdown);
		item3.selectByVisibleText("contains");
		Select item4 = new Select(valuedropdown);
		item4.selectByVisibleText("a");
		Select item5 = new Select(availablefieldsdropdown);
		item5.selectByVisibleText("Last Activity");
		addicon.click();
		saveeditviewbutton.click();
	}
}