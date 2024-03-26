package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Irctclogin {
private static WebElement element = null;
public static WebElement BOOK_TICKET(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
	return element;
}
public static WebElement To_Location(WebDriver driver) {
	
	element = driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input"));
	return element;
}
	
	

}
