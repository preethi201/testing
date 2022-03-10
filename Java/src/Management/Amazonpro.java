package Management;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazonpro {
	
	WebDriver driver;
	@Test
	public void sample() throws IOException, InterruptedException {
		Properties Properties = new Properties();
		FileInputStream fileinputstream = new FileInputStream("D:\\workspace\\Java\\amazon.properties");
		Properties.load(fileinputstream);
		String name=Properties.getProperty("name");
          String mobilenumber=Properties.getProperty("mobilenumber");
		String password=Properties.getProperty("password");
		String reenterpassword=Properties.getProperty("reenter");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
   	 driver = new ChromeDriver();
   	driver.manage().window().maximize();
   	 driver.navigate().to("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&prevRID=0V6KMJP6C3AD36W3J2SC&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	Thread.sleep(2000);
	driver.findElement(By.id("ap_customer_name")).sendKeys(name);
	driver.findElement(By.id("ap_email")).sendKeys(mobilenumber);
	driver.findElement(By.id("ap_password")).sendKeys(password);
	driver.findElement(By.id("ap_password_check")).sendKeys(reenterpassword);
	
	
	
	
	
	}

}
