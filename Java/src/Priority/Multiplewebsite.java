package Priority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiplewebsite {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	     public  void display(String browser) throws InterruptedException {
			if(browser.equalsIgnoreCase("chrome")) {
	    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	    	 driver = new ChromeDriver();
	    	 driver.manage().window().maximize();
	    	   }
			else if(browser.equalsIgnoreCase("Firefox")) {
				
		    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\292849\\Pictures\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		    	 driver = new FirefoxDriver();
		    	 driver.manage().window().maximize();
		    	   }
			else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\292849\\Pictures\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
		   driver = new InternetExplorerDriver();
		    driver.manage().window().maximize();
		    	   }
	}
			public void printalltitle(String url) {
				driver.navigate().to(url);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
			}
			@AfterTest
			public void close() {
				driver.close();
			}
			  @Test()
			  public void testcase() {
				 
				 printalltitle("https://www.facebook.com/");
				 
			  }
			  @Test
			  public void testcase1() {
				
				 printalltitle("https://www.google.com/");
				 
			  }
			  @Test
			  public void testcase2() {
				 
				 printalltitle("https://www.amazon.com/");
				 
			  }
		
				
			}
				

			