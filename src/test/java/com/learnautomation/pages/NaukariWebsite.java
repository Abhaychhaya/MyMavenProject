package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NaukariWebsite {
	
	  WebDriver driver;
	  
	     @Test
	  
	      public void setup() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  ChromeDriver driver  = new ChromeDriver();
		  driver.get("https://www.naukri.com/account/createaccount?othersrcp=16201&err=1");
		  driver.manage().window().maximize();
		  WebElement Button_click = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/button"));
          Button_click.click();
           //Name TextBox
          WebElement Txtbox = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
           
          Txtbox.sendKeys("abhay");
          //Valid EmailIDTextbox
          Thread.sleep(2000);
          WebElement Emailid = driver.findElement(By.xpath("//*[@id=\"email\"]"));
          Emailid.sendKeys("abhaysing.singh@gmail.com");
          //Verfy Create Password
         
          
          
           
    }
}
    


