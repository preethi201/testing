package Priority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Firofox {
	WebDriver driver;
	
	@BeforeMethod
	public void launch(String string) {
		
	    	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\292849\\Downloads\\geckodriver-v0.30.0-win64.zip\\geckodriver.exe");
	    	 driver = new FirefoxDriver();
	    	 driver.manage().window().maximize();
	    	   }
	
	@AfterMethod
	public void close() {
		driver.close();
	}
		
	public void navigatetourl(String url) {
		driver.get(url);
	}
	public String title() {
		return driver.getTitle();
		}
	public String currenturl() {
		return driver.getCurrentUrl();
	}
	@Test
	public void test1() {
		launch("Firefox");
		navigatetourl("http://www.google.com");
		System.out.println("title of the page"+title());
		System.out.println("currenturl of the page"+currenturl());
		
	
	
	
	}

}
