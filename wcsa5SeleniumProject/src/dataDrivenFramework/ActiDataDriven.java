package dataDrivenFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiDataDriven {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("http://desktop-dgeqqi5/login.do");
	      
	      
	      // read data from excel file 
	     Flib flib = new Flib();
	     
	     driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTime.xlsx", "ValidTesting", 1, 0);
	     driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTime.xlsx", "ValidTesting", 1, 1));
	     driver.findElement(By.id("loginbutton")).click();
	}

}
