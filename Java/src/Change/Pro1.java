package Change;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro1 {
	public WebDriver driver;

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
	

}
