package Multiple;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Allapplication {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	     public  void display(String browser) throws InterruptedException {
			if(browser.equalsIgnoreCase("chrome")) {
	    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	    	 driver = new ChromeDriver();
	    	
	    	   }
			else if(browser.equalsIgnoreCase("Firefox")) {
		    	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\292849\\Pictures\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		    	 driver = new FirefoxDriver();
		    	
		    	   }
			else if(browser.equalsIgnoreCase("ie")) {
				Thread.sleep(2000);
		    	 System.setProperty("webdriver.ie.driver", "C:\\Users\\292849\\Pictures\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
		    		Thread.sleep(2000);
		    	 driver = new InternetExplorerDriver();
		    	
		    	   }
			 driver.manage().window().maximize();
	}
	
	@AfterTest
	public void close() {
	
		driver.quit();
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
//		 @Test
//		 public void handlefacebook() throws InterruptedException {
//		 	
//		 	navigateurl("https://www.facebook.com/");
//		 	Thread.sleep(2000);
//		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
//		 	     Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("tools");
//		 	      Thread.sleep(2000);
//		 	   
//		 	    
//		 	     
		 	      
		 	     
		// }
		 @Test
		 public void handlegoogle() throws InterruptedException {
		 	navigateurl("https://www.google.com/");
		 	
		 	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("testing"+Keys.ENTER);
		 	Thread.sleep(2000);
		 }
		 
		 
		 @Test
		 public void handleamazon() throws  InterruptedException {
		 	navigateurl("https://www.amazon.com/");
		 Thread.sleep(2000);
		 System.out.println("title of the page"+title());
		 System.out.println("url of the page"+currenturl());

		 	}

}	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
