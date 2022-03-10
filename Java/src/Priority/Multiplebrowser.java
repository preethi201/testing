package Priority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Multiplebrowser {
	
	WebDriver driver;
@Parameters("browser")
@BeforeTest
     public void display(String browser) {
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
		else if(browser.equalsIgnoreCase("Internetexplorer")) {
	    	 System.setProperty("webdriver.ie.driver", "C:\\Users\\292849\\Pictures\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
	    	 driver = new InternetExplorerDriver();
	    	 driver.manage().window().maximize();
	    	   }
	
	}
	
	
	
	public void navigatetourl() {
		driver.get("https://www.google.com/");
	}
	public String title() {
		return driver.getTitle();
		}
	public String currenturl() {
		return driver.getCurrentUrl();
	}
	public void close() {
		driver.close();
	}
		
	@Test
	public void test1() {
		//display("chrome");
		navigatetourl();
		System.out.println("title of the page"+title());
		System.out.println("currenturl of the page"+currenturl());
		close();
	}
	@Test
	public void test2() {
		//display("firefox");
		navigatetourl();
		System.out.println("title of the page"+title());
		System.out.println("currenturl of the page"+currenturl());
		close();
	}
		
		
	

	@Test
	public void test3() {
		//display("internetexplorer");
		navigatetourl();
		System.out.println("title of the page"+title());
		System.out.println("currenturl of the page"+currenturl());
		close();
	}
}
