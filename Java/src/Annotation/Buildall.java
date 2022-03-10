package Annotation;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Buildall {
	
	
	WebDriver driver;
@BeforeMethod
	public void sample() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
@AfterMethod
public void fun() {
	driver.close();
}
	
	public void navigateurl(String url) {
		 driver.navigate();
		}
	public String title() {
	return driver.getTitle();
}
  public String url() {
   return driver.getCurrentUrl();
	   }
  @Test
  public void document() {
	 
	 navigateurl("https://www.facebook.com/");
	 System.out.println("title of the page"+driver.getTitle());
	 System.out.println("title of the page"+driver.getCurrentUrl());
  }
	@Test  
  public void document1() {

	navigateurl("https://www.google.com/");
	 System.out.println("title of the page"+driver.getTitle());
	 System.out.println("title of the page"+driver.getCurrentUrl());
  }
	@Test
  public void document2() {
	 
	navigateurl("https://www.flipkart.com/");
	 System.out.println("title of the page"+driver.getTitle());
	 System.out.println("title of the page"+driver.getCurrentUrl());
  }
	@Test
  public void document3() {
	navigateurl("https://www.amazon.in/");
	 System.out.println("title of the page"+driver.getTitle());
	 System.out.println("title of the page"+driver.getCurrentUrl());
  }
	  
	  
  }