

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actionclassfacebook {
   
	   @Test
 
	   public void display(){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
		       
			WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.navigate().to("https://www.facebook.com/");
        
        WebElement googlesearchbox = driver.findElement(By.id("email"));
        
        googlesearchbox.sendKeys("selenium");
        
        for(int i=0;i<=3;i++) {
        
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        }
        
        
	}
        
        
   }


