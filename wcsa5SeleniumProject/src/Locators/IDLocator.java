package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =	new ChromeDriver();
	    driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        
	}

}
