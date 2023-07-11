package readPropertyDta;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
      
		
		//Read data from config.properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		// Create a object properties class
		Properties prop = new Properties();
		
		// make file ready to use
		  prop.load(fis);
		  
		  // read particular property file
		String data1 = prop.getProperty("Url");
		
		System.out.println(data1);
		
		String data2 = prop.getProperty("Browser");
		System.out.println(data2);
		
		String data3 = prop.getProperty("Username");
		System.out.println(data3);
		
		String data4 = prop.getProperty("Password");
		System.out.println(data4);
		
		
		  
	}
	

}
