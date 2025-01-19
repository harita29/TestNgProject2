package com.testng.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testng.base.BasePage;

public class UsermenuDropDownPage extends BasePage {

	@FindBy(id = "userNav")
	WebElement usermenudropdown;
	
	@FindBy(xpath = "//a[contains(text(),'Developer Console')]")
	WebElement devconsole;
	
	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logoutbutton;
	
	public void clickonUserMenuDropDown() {
		usermenudropdown.click();
	}
	
	public void clickonDevConsole() {
		devconsole.click();
	}
	
	public void closePopWindow() {
		Set<String> wind = driver.getWindowHandles();
		Iterator<String> i = wind.iterator();
		String parentwind = i.next();
		String popwind = i.next();
		driver.switchTo().window(popwind);
		driver.close();
		driver.switchTo().window(parentwind);
	}
	
	public void clickonLogout() {
		logoutbutton.click();
	}
	
	public UsermenuDropDownPage(WebDriver driver) {
		super(driver);
	}

}
