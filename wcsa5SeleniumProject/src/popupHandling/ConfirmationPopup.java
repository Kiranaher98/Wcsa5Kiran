package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wbdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("file:///C:/Users/VISHAL/Desktop/HTML/Confirmation%20PopUP.html");
        
        driver.findElement(By.tagName("input")).click();
        
        // Handle Confirmation Pop up By using switchTo ():
        Thread.sleep(2000);
      Alert a1 = driver.switchTo().alert();
    
     // a1.dismiss();
      System.out.println(a1.getText());
      a1.accept();
      
        
	}

}
