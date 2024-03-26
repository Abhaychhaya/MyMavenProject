package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Exefile/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}

}
