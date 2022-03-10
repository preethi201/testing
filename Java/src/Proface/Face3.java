package Proface;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face3 {
	
	public static String readdata(String key) throws IOException {
		Properties properties = new Properties();
		FileInputStream fileinputstream = new FileInputStream("D:\\workspace\\Java\\Man.properties");
		properties.load(fileinputstream);
		String value=properties.getProperty(key);
		return value;
			}
	WebDriver driver;
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void navigate(String url) {
	 driver.navigate().to(url);
	}
	public String title() {
		return driver.getTitle();
		}
	public String currenturl() {
		return driver.getCurrentUrl();
	}
	
	public void sample() throws IOException, InterruptedException {
		driver.findElement(By.id("ap_customer_name")).sendKeys(readdata("name"));
		Thread.sleep(2000);
		//driver.findElement(By.id("ap_phone_number")).sendKeys(readdata("mobile"));
	driver.findElement(By.name("email")).sendKeys(readdata("email1"));
		driver.findElement(By.id("ap_password")).sendKeys(readdata("password1"));
		
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Face3 a = new Face3();
		a.launch();
		a.navigate(readdata("url1"));
		System.out.println(a.title());
		System.out.println(a.currenturl());
		a.sample();
	      

	}

}
