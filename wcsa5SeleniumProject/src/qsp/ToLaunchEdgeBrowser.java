package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchEdgeBrowser {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","./drivers/edgedriver.exe");
  WebDriver driver =	new EdgeDriver();
  
  // Maximize the browser
    driver.manage().window().maximize();
   
     
		Thread.sleep(2000);
		
		//To Close Browser
		driver.close();
	}

}
