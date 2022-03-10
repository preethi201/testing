package Portable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Sample {

	WebDriver driver;
	@BeforeTest
public void display() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
        driver = new ChromeDriver();
       driver.manage().window().maximize();
		
        driver.navigate().to("https://www.flipkart.com/");
	}
	@Test
        public void kart() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8792481513");
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pratham2011");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        
        
	}
	
        

}
