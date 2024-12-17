package com.testng.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.testng.utilities.PropertyReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	PropertyReader properties;
	String browserName;
	//String url;
	
	public WebDriver getDriver() {
		properties = new PropertyReader();
		browserName = properties.getProperties("browser");
		
		if(driver==null) {
			browserName = properties.getProperties("browser");

		if(browserName.equalsIgnoreCase("chrome")) 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		}else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		//url = properties.getProperties(url);
		//driver.get(url);
		driver.get("https://login.salesforce.com");
		return driver;
		
	}
	public void closebrowser() {
		driver.close();
		driver = null;
	}

}
