package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnRobotAndAction {

	public static void main(String[] args) throws AWTException {
          System.setProperty("wbdriver.chrome.driver", "./drivers/chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         
         driver.get("https://www.bluestone.com/");
         //handle hidden popup
         driver.findElement(By.id("denyBtn")).clear();
         //move to watch jewellary
         Actions act = new Actions(driver);
         
         WebElement target = driver.findElement(By.xpath("//a[text()='watch jewellery ']"));
         act.moveToElement(target).perform();
         
       WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
         act.clickAndHold(target2).perform();
         
         //copy filter by text
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        
        // identify search box
        driver.findElement(By.xpath("");
        
         
         
         
         
         
         
	}

}
