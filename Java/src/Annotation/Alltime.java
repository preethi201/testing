package Annotation;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alltime {
	

	WebDriver driver;
	@BeforeMethod
    public void display() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	
    }
	
	@BeforeMethod
    public void display1() {
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\292849\\Downloads\\geckodriver-v0.30.0-win64.zip\\geckodriver.exe");
    	driver=new FirefoxDriver();
    	driver.manage().window().maximize();
    	
    }
	
	@BeforeMethod
    public void display2() {
    	System.setProperty("webdriver.ie.driver", "C:\\Users\\292849\\Downloads\\IEDriverServer_Win32_4.0.0.zip\\IEDRiverServer.exe");
    	driver=new InternetExplorerDriver();
    	driver.manage().window().maximize();
    	
    }
	///integration testing
	//regresstion testing
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	public void navigateurl(String url) {
		 driver.navigate();
		}
	
	public String title() {
		return driver.getTitle();
	}
	public String currenturl() {
		return driver.getCurrentUrl();
	}
	@Test(priority=0)
	public void facebook() {
		navigateurl("https://www.facebook.com/");
		System.out.println("title of the page"+driver.getTitle());
		
		System.out.println("url of the page"+driver.getCurrentUrl());
	}
	
	@Test(priority=2)
	public void google() {
		navigateurl("https://www.facebook.com/");
		System.out.println("title of the page"+driver.getTitle());
		
		System.out.println("url of the page"+driver.getCurrentUrl());
	}
	@Test(priority=1)
	public void amazon() {
		navigateurl("https://www.facebook.com/");
		System.out.println("title of the page"+driver.getTitle());
		
		System.out.println("url of the page"+driver.getCurrentUrl());
	}

}
