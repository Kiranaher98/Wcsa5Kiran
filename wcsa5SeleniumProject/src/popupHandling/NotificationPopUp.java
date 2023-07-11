package popupHandling;

import java.io.EOFException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import graphql.relay.Edge;

public class NotificationPopUp {
    static WebDriver driver;
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser value");
		String browserValue = sc.next();
		
		System.setProperty("wbdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--Disable-Notifications");
       
		if (browserValue.equalsIgnoreCase("Chrome")) {
			
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.spicejet.com/");
		}
		else if (browserValue.equalsIgnoreCase("Edge")) {
			
			System.setProperty("wbdriver.edge.driver", "./drivers/msedgedriver.exe");
			
          EdgeOptions eo = new EdgeOptions();
          eo.addArguments("--Disable-Notifications");
          WebDriver driver = new EdgeDriver(eo);
  		driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  		driver.get("https://www.spicejet.com/");
		}
		else if (browserValue.endsWith("FIREFOX")) 
			
		 {


			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			
			
          FirefoxOptions fi = new FirefoxOptions();
         fi.addArguments("--Disable-Notifications");
          WebDriver driver = new FirefoxDriver();
  		driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  		driver.get("https://www.spicejet.com/");
		}
			
		}
		
			
		
			
		}
			
		


