package Management;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LauchingFacebook {
	WebDriver driver;
	@BeforeTest
	public void display() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		 driver = new ChromeDriver();
        
        driver.manage().window().maximize();
	}
	@AfterTest
	public void browser() {
		 driver.close();
		
	}
	@Test
        public void sample() throws InterruptedException {
        
        driver.navigate().to(  "https://www.facebook.com/");
        
        driver.findElement(By.id("email")).sendKeys("prethi3455");
        driver.findElement(By.id("pass")).sendKeys("selenium");
        
        
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 	     Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("tools");
		 	      Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("testing");
		 	      Thread.sleep(2000);
		 	      
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("automation123");
		 	      Thread.sleep(2000);
		 	      
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("seema");
		 	      Thread.sleep(2000);
		 	      
		 	     WebElement daydropdown =driver.findElement(By.id("day"));
		         Select obj = new Select(daydropdown);
		         obj.selectByVisibleText("25");
		         
		      
		         
		         
		         WebElement monthdropdown =driver.findElement(By.id("month"));
		         Select month = new Select(monthdropdown);
		         month.selectByVisibleText("Aug");
		         
		         
		         
		         WebElement yeardropdown =driver.findElement(By.id("year"));
		         Select year = new Select(yeardropdown);
		         year.selectByVisibleText("2006");
		         
		     driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		 	      Thread.sleep(2000);
	 	   
		         
		 	      
	}

}
