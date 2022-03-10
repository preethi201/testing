package Testngformat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Program5 {
	WebDriver driver;
	
	@Parameters("browser")
	
	@BeforeMethod
	public void launch(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\292849\\Pictures\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\292849\\Pictures\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
			Thread.sleep(2000);
			driver = new InternetExplorerDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
		}}

	public void navigate(String url) {
		driver.get(url);
		
	}

	public String title() {
		return driver.getTitle();
	}
	
	public String currenturl() {
		return driver.getCurrentUrl();
	}
	
//	public void close() {
//		driver.close();
//	}
	@Test(priority=0)
	public void google() throws InterruptedException {
//		Program5 a = new Program5();
//    a.launch("chrome");
		navigate("https://www.google.com/");
	    System.out.println(title());
		System.out.println(currenturl());
		
	}
	
	@Test(priority=1)
	public void facebook() throws InterruptedException {
//		Program5 a = new Program5();
//a.launch("firefox");
		navigate("https://www.facebook.com/");
	    System.out.println(title());
		System.out.println(currenturl());
		
	}
	@Test(priority=2)
	public void amazon() throws InterruptedException {
//		Program5 a = new Program5();
//      a.launch("ie");
		navigate("https://www.amazon.com/");
	    System.out.println(title());
		System.out.println(currenturl());
	}
	
		}
		
	

