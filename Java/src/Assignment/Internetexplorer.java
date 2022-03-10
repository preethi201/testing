package Assignment;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Internetexplorer {
	
	
		public class Launch {
			@Test

			public void display(){
			System.setProperty("webdriver.ie.driver","C:\\Users\\292849\\Pictures\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
		    WebDriver driver = new InternetExplorerDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.navigate().to("https://www.facebook.com/");
		    
		    driver.navigate().to("https://www.amazon.com/");
		    

				
			}}}



