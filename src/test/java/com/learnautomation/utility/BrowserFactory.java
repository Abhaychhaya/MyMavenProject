package com.learnautomation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public static WebDriver LaunchBrowser(String BrowserName) {
	WebDriver driver = null;
	
	if(BrowserName.equalsIgnoreCase("Chrome")) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		System.out.println("Chrome is launched");
		
		
	}
	else if(BrowserName.equalsIgnoreCase("Firefox")) {
		
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("Firefox is launched");
	}
	
	return driver;
}

  public static void quitBrowser(WebDriver driver) {
	  
	  driver.quit();
	  
	   }


}
