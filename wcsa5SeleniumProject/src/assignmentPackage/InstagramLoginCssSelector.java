package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginCssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =	new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[id^='em']")).sendKeys("9823071520");
	    Thread.sleep(2000);

	    
	    driver.findElement(By.cssSelector("input[id*='pa']")).sendKeys("sourabh@7687224");
	    Thread.sleep(2000);

	    driver.findElement(By.cssSelector("button[name$='in']")).click();
	}

}
