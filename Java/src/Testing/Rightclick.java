package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "http://demo.guru99.com/test/simple_context_menu.html");
        
        WebElement electronics = driver.findElement(By.xpath("//span[text()='right click me']"));
      
        
        Actions action = new Actions(driver);
        action.contextClick(electronics).build().perform();
        
        Thread.sleep(3000);
        
        WebElement doc=driver.findElement(By.xpath("//span[text()='Copy']"));
        doc.click();
        
        Thread.sleep(3000);
        
        WebElement text=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        
        Thread.sleep(3000);
        Actions action1 = new Actions(driver);
        action1.doubleClick(text).build().perform();
       
	}

}
