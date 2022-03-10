package Assignment;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firfox {
	public class Launch {
		@Test

		public void display(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\292849\\Pictures\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.facebook.com/");
	    

			
		}}}

