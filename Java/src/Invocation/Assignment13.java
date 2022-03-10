package Invocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment13 {
	WebDriver driver;
	@BeforeTest
	public void display() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public String gettitle() {
		return driver.getTitle();
	}
	
	
	@Test(invocationCount=2)
	public void navigateurl() {
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(gettitle());
	}
}

