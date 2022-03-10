package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gone {
	WebDriver driver;
	@Test
   public void display() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String expectedtitle= "Google";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		
		
		
   }
}
