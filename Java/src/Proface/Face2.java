package Proface;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Face2 {
	WebDriver driver;
	@Test
	public void pro() throws IOException, InterruptedException {
		Properties properties = new Properties();
		FileInputStream fileinputstream = new FileInputStream("D:\\workspace\\Java\\Man.properties");
		properties.load(fileinputstream);
	    String url=	properties.getProperty("url");
		String email=properties.getProperty("email");
		String password=properties.getProperty("password");
		String first=properties.getProperty("firstna");
		String last=properties.getProperty("lastna");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.navigate().to(url);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.linkText("Create New Account")).click();;
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys(first);
		driver.findElement(By.name("lastname")).sendKeys(last);
	
	}
	
	

	


	}


