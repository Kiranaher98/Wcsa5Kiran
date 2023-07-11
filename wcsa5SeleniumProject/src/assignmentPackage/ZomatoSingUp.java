package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSingUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.crome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.zomato.com/india");
	    
	    //to click on sign up link
	    driver.findElement(By.linkText("Sign up")).click();
	    
	    driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("abcgdgdhd");
	    driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("aherkiran@gamil.com");
	    
	}

}
