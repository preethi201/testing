package Screenshot111;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Multipleprogramsc extends Reuseablescreenshot {
	
	WebDriver driver;
	@Test
public void display() throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	 takescreenshot(driver,"facebooklanding");
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
	      
	      WebElement daydropdown =driver.findElement(By.id("day"));
	      WebElement monthdropdown =driver.findElement(By.id("month"));
	      WebElement yeardropdown =driver.findElement(By.id("year"));
	      
	     
	      
	      Select day= new Select(daydropdown);
	      Select month = new Select(monthdropdown);
	      Select year = new Select(yeardropdown);
	      
	      takescreenshot(driver,"facebooklanding");
	      
	      day.selectByVisibleText("16");
	     month.selectByVisibleText("Jun"); 
	      year.selectByVisibleText("2018"); 
	     Thread.sleep(2000);
	 
takescreenshot(driver,"dropdownscreen");




	}	
}

