package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("http://omayo.blogspot.com/");
	      
	      //get the handle or address of parent window
	     String parentHandle = driver.getWindowHandle();
	     System.out.println("Address of parent window = "+parentHandle);
	     
	     //launch the child window
	     driver.findElement(By.partialLinkText("Open a popup window")).click();
	     Thread.sleep(2000);
	      //get address of child window 
	     
	    Set<String> allHandles = driver.getWindowHandles();
	   
	    for (String string : allHandles) {
	    	System.out.println("Address of child window "+string);
		}
	     
	     
	     
	     
	     
	      
	      
	      
	}

}
