package Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	 WebDriver driver;
	public void display() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	  
	}
	

	public void navigate(String navigate) {
	   driver.get(navigate);
	}
	 public String title() {
		 return driver.getTitle();
	 }
	 public String urltitle() {
		 return driver.getCurrentUrl();
	 }
}