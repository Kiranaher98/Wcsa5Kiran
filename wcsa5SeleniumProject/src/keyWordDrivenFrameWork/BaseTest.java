package keyWordDrivenFrameWork;

import org.openqa.selenium.WebDriver;

public class BaseTest extends Flib implements IautoConstant {

 static  WebDriver driver;
 
 public void openBrowser ()
 {
	Flib flib = new Flib();
  String browserValue	=flib.readPropertyData(PROP_PATH,"Browser");
	 
	 
 }
	
	
	
}
	
	


