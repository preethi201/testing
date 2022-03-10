package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookj {
	public WebDriver driver;
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
	       
		 driver = new ChromeDriver();
       
       driver.manage().window().maximize();

	
		
	}

    public void NavigateURL(String url) {
    	 driver.navigate().to(url);
	}

    public String getTitle() {
    	return driver.getTitle();
    	
	
  }

    public String getCurrentURL() {
    return	driver.getCurrentUrl();
	
   
	
	}

}
