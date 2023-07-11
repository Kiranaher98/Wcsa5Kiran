package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wbdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("file:///C:/Users/VISHAL/Desktop/HTML/Alert%20PopUp.html");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        
        
        //Handle alert popup by using switchTo ();
       Alert a1 = driver.switchTo().alert();
       Thread.sleep(2000);
       
      // a1.accept();
      // a1.dismiss();
       System.out.println(a1.getText());
        
	}

}
