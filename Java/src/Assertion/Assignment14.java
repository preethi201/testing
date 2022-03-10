package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment14 {
	WebDriver driver;
	@Test
 public void display() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("title of the page"+driver.getTitle());
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("automation"+Keys.ENTER);
		String expectedtitle= "automation - Google Search";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
 }
	@Test
	public void sample() {
		String a = "sample123";
	Assert.assertTrue(a.contains("123"));
	
}
}