package javaSriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDesableWebElement {

	public static void main(String[] args) {
		System.setProperty("wbdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("file:///C:/Users/VISHAL/Desktop/HTML/disabled%20Web%20Element.html");
        
        driver.findElement(By.id("i1")).sendKeys("Admin");
        
	}

}
