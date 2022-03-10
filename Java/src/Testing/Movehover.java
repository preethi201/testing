package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movehover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://www.flipkart.com/");
        
        WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
      
        
        
        
        Actions action = new Actions(driver);
        action.moveToElement(electronics).build().perform();
        
        Thread.sleep(3000);
        
        WebElement text=driver.findElement(By.xpath("//a[text()='Gaming']"));
        text.click();

	}

}
