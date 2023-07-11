package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.crome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
       driver.get("https://www.netflix.com/in/login");
       
       //To identify webelement we use locator
       driver.findElement(By.id("id_userLoginId")).sendKeys("aherkiran842@gmail.com");//Username
       Thread.sleep(2000);
       driver.findElement(By.id("id_password")).sendKeys("Kiranaher@98");//pasword
       
       driver.findElement(By.xpath("button[@class='btn login-button btn-submit btn-small']")).click();
	}

}
