package com.learnautomation.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilpkartLogin {
	
	private static WebElement element = null;
	 
	public static WebElement Login_Userid(WebDriver driver) {
		
		
		element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		
		return element;
		
	}
	public static WebElement Password_User(WebDriver driver) {
		
		element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		
		return element;
	}
	
       public static WebElement Login_button(WebDriver driver) {
		
		element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		return element;
}
       
       public static WebElement Search_box(WebDriver driver) {
   		
   		element = driver.findElement(By.name("q"));
   		return element; 

        }
       
       public static WebElement Cick_button(WebDriver driver) {
      		
       element = driver.findElement(By.className("L0Z3Pu"));
       return element; 
      }
       
       public static WebElement Click_Mobile(WebDriver driver) {
     		
           element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]"));
           return element;
       
       
        
      /* public static WebElement Click_order(WebDriver driver) {
    	   //element = driver.findElement(By.linkText("_2KpZ6l _2U9uOA ihZ75k _3AWRsL"));
    element = driver.findElement(By.cssSelector("#container > div > div._2c7YLP.UtUXW0._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div._1YokD2._3Mn1Gg.col-5-12._78xt5Y > div:nth-child(2) > div > ul > li:nth-child(2) > form > button"));
	return element;*/
       }

}
