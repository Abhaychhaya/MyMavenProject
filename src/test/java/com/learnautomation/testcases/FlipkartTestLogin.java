package com.learnautomation.testcases;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.learnautomation.pages.FilpkartLogin;
import com.learnautomation.utility.BrowserFactory;

 class FlipkartTestLogin {
	
	WebDriver driver;
	
	@Test
	public void loginapp() throws InterruptedException {
		
		driver = BrowserFactory.LaunchBrowser("chrome");
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		FilpkartLogin.Login_Userid(driver).sendKeys("8826146602");
		FilpkartLogin.Password_User(driver).sendKeys("abhay90");
		FilpkartLogin.Login_button(driver).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		FilpkartLogin.Search_box(driver).sendKeys("mobile");
		FilpkartLogin.Cick_button(driver).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		FilpkartLogin.Click_Mobile(driver).sendKeys(Keys.RETURN);
		
		
	}
	

}
