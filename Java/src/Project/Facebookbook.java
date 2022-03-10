package Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebookbook {

WebDriver driver;
@Test
	public void display() throws InterruptedException, IOException {
		Properties Properties = new Properties();
		FileInputStream fileinputstream = new FileInputStream("D:\\workspace\\Java\\configure.properties");
		Properties.load(fileinputstream);
		String url =Properties.getProperty("url");
		String firstname=Properties.getProperty("firstname");
		String lastname=Properties.getProperty("lastname");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
    	 driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	 driver.navigate().to(url);
    	 
    	 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
 	     Thread.sleep(2000);
 	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
	      Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
	      Thread.sleep(2000);
         
		
		
		
		
	}

	
		
	}

