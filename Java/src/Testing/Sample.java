package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public WebDriver driver;
	public void Launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		 driver = new ChromeDriver();
        
        driver.manage().window().maximize();

		 driver.navigate().to("https://www.google.com/");
	         
		 System.out.println("title of the page is"+driver.getTitle());
		 System.out.println("title of the url is"+driver.getCurrentUrl());
	        
       
		
	

	
	}
}
