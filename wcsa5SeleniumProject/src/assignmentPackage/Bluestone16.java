package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone16 {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      WebDriver driver =  new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      
      driver.get("https://www.bluestone.com/");
      driver.findElement(By.id("denyBtn")).click();
      WebElement targetcoins = driver.findElement(By.xpath("//a[text()='Coins ']"));
      
   

	}

}
