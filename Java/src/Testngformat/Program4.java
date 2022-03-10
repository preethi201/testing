package Testngformat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program4 {
	WebDriver driver;
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.flipkart.com/");
	}

	
	}


