package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
	@Test

	public void display(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.navigate().to("https://www.facebook.com/");
    

		
	}

}
