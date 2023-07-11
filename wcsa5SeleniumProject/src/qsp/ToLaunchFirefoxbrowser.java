package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFirefoxbrowser {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	WebDriver driver =	new FirefoxDriver();
	
	Thread.sleep(2000);

	}

}
