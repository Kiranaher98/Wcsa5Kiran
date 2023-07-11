package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gooleFrame {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("https://www.google.com/");
	      driver.findElement(By.xpath("//div[@class='gb_S gb_Pd gb_x']")).click();
	      driver.findElement(By.xpath("//span[@class='MrEfLc']")).click();
	}

}
