package Screenshot111;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Website extends Reuseablescreenshot{
WebDriver driver;
@BeforeTest
	public void display() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver_win32\\chromedriver.exe");
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	   }

	@AfterTest
	public void closebrowser() {
		driver.close();
	}
	
public void navigatetourl(String url) {
	driver.get(url);
}

@Test
public void joing() throws InterruptedException, IOException {
	
	navigatetourl("https://www.facebook.com/");
	  WebElement link= driver.findElement(By.xpath("//a[text()='Create New Account']"));
	     link.click();
	     
	     Thread.sleep(2000);
	    
	     takescreenshot(driver,"facebooklanding");
	      
	      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("tools");
	      Thread.sleep(2000);
	      takescreenshot(driver,"first");
	      
	      driver.findElement(By.xpath("//input[@name='firstname']")).clear();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("selenium");
	      Thread.sleep(2000);
	      takescreenshot(driver,"aftername");
	      
}
@Test
public void sample1() throws IOException {
	navigatetourl("https://www.google.com/");
	takescreenshot(driver,"googlepage");
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("testing"+Keys.ENTER);
	takescreenshot(driver,"testingpage");
     
}

	}
