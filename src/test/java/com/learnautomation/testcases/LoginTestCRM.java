package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.learnautomation.utility.BrowserFactory;

public class LoginTestCRM {
    
	WebDriver driver;
	
	@Test
	public void loginapp()
	{
		driver = BrowserFactory.LaunchBrowser("chrome");
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}
}
