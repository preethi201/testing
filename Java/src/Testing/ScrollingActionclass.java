package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingActionclass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://www.facebook.com/");
        System.out.println("title of the page is"+driver.getTitle());
        
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        System.out.println("second title of the page is"+driver.getTitle());
	}

}
