package com.testng.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testng.base.*;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		
		super(driver);
		//PageFactory.initElements(driver, driver);
		
	}
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement homebtn;
	
	public void clickhomebutton() {
		waitforElement(homebtn);
	  homebtn.click();
	
	}
	

}
