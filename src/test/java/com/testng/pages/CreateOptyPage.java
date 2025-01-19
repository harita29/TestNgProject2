package com.testng.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class CreateOptyPage extends BasePage {

	@FindBy(xpath = "//img[@alt ='All Tabs']")
	WebElement plustab;
	
	@FindBy(xpath = "//a[@href='/006/o']")
	WebElement opportunitylink;
	
	@FindBy(id = "fcf")
	WebElement optydropdown;
	
	@FindBy(xpath = "//input[@value=' New ']")
	WebElement createnewopty;
	
	@FindBy(id = "opp3")
	WebElement createnewoptyname;
	
	@FindBy(id = "opp4")
	WebElement createnewaccountname;
	
	@FindBy(xpath = "//a[@tabindex='7']")
	WebElement enterclosedate;
	
	@FindBy(id = "opp11")
	WebElement stage_dropdown;

	@FindBy(id = "opp12")
	WebElement probability;

	@FindBy(id = "opp6")
	WebElement leadsource_dropdown;
	
	@FindBy(id = "opp17")
	WebElement primarycampaign;
	
	@FindBy(xpath = "//input[@tabindex='18']")
	WebElement save_btn;
	
	@FindBy(xpath = "//a[contains(text(),'Oppo')]")
	WebElement oppt_pipeline_link;
		
	@FindBy(xpath = "//a[contains(text(),'Stuck')]")
	WebElement stuck_oppt_link;
	
	@FindBy(id = "quarter_q")
	WebElement interval_dropdown;
	
	@FindBy(id = "open")
	WebElement include_dropdown;
	
	@FindBy(xpath = "//input[@title='Run Report']")
	WebElement run_report_btn;
	
	
	public CreateOptyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnPlusTab() {
		plustab.click();
	}
	
	public void clickonOpty() {
		opportunitylink.click();
	}
	
	public void clickOnOptyDropDown() {
		optydropdown.click();
	}
	
	public void clickOnNewBtn() {
		createnewopty.click();
	}

	public void enterNewOptyName() {
		createnewoptyname.sendKeys("MyOpportunity");
	}
	
	public void enterNewAcctName() {
		createnewaccountname.sendKeys("MyfirstTestAccount");
	}
	
	public void clickOnCloseDate() {
		enterclosedate.click();
	}
	
	public void selectStageDropDown() {
		Select item1 = new Select(stage_dropdown);
		item1.selectByVisibleText("Qualification");
	}
	
	public void enterProbability() {
		probability.clear();
		probability.sendKeys("5%");
	}
	
	public void selectLeadSourceDropDown() {
		Select item2 = new Select(leadsource_dropdown);
		item2.selectByVisibleText("Web");
	}
	
	public void enterPrimaryCampaign() {
		primarycampaign.sendKeys("GC Product Webinar - Jan 7, 2002");
	}
	
	public void clickOnSaveButton() {
		save_btn.click();
	}
	
	public void clickOnOptyPipeline() {
		oppt_pipeline_link.click();
	}
	
	public void clickOnStuckOpty() {
		stuck_oppt_link.click();
	}
	
	public void selectInterval() {
		Select item1 = new Select(interval_dropdown);
		item1.selectByVisibleText("Next FQ");
	}
	
	public void selectIncludeDropDown() {
		Select item2 = new Select(include_dropdown);
		item2.selectByVisibleText("Open Opportunities");
	}
	
	public void clickOnRunReport() {
		run_report_btn.click();
	}
}

