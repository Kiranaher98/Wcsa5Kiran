package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInLogin {
	
public static void main(String[] args) {
	System.setProperty("webdriver.crome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://in.linkedin.com/");
    
    driver.findElement(By.id("session_key")).sendKeys(args);
    
    
    
	    
}
}