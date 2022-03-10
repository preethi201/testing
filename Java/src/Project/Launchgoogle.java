package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Launchgoogle {
@Test
	public void Change() {
		
	
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
	}			

}
