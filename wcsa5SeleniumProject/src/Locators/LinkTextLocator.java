package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkTextLocator {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =	new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/VISHAL/Desktop/HTML/flipkart3.html");
	    driver.findElement(By.linkText("FLIPKART_LINK")).click();
	    
	}
}
