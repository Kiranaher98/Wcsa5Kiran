package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =	new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/signup");
	    
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kiran");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Aher");
	    Thread.sleep(2000); 
	    
	  
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7083607870");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Kiranaher@98");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1998");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='2']")).click();

	    driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	    



	    
	}

}
