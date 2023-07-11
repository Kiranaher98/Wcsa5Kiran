package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneChatbox {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("https://www.bluestone.com/");
	      driver.findElement(By.id("denyBtn")).click();

	      Actions act = new Actions(driver);
	   Object chat = driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
	   
	      
	}

}
