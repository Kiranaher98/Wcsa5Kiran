package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluestoneFrame {

	public static void main(String[] args) throws InterruptedException {
		
			 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		      
		      driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		      driver.get("https://www.bluestone.com/");
		      driver.findElement(By.id("denyBtn")).click();
              Thread.sleep(5000);
           
                
		      driver.switchTo().frame("fc_widget");
		      driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		      
		      driver.switchTo().defaultContent();
		      Thread.sleep(5000);
		      driver.findElement(By.id("chat-fc-name")).sendKeys("kiran");
		      driver.findElement(By.id("chat-fc-email")).sendKeys("aherkiranaher@98");
		      driver.findElement(By.id("chat-fc-phone")).sendKeys("7083607870");
		      
		      
		      //switch the control back to main web page
		      
		      driver.switchTo().defaultContent();
	}
	

}
