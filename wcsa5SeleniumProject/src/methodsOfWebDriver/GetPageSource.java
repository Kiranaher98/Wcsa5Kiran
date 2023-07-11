package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
      String pageSource  = driver.getPageSource();
      System.out.println(pageSource);
	}

}