package Proface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face1 {
	WebDriver driver;
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void navigate(String url) {
	 driver.navigate().to(url);
	}
   
	public String title() {
		return driver.getTitle();
	}
	
	public String currenturl() {
		return driver.getCurrentUrl();
	}
	
	
	}


