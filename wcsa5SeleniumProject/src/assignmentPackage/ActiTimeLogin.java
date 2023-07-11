package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =	new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    Thread.sleep(2000);
	    driver.get("http://desktop-dgeqqi5/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
     	driver.findElement(By.name("pwd")).sendKeys("manager");
     	driver.findElement(By.id("loginButton")).click();
	}

}
