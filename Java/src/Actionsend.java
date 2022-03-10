

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsend {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://www.facebook.com/");
        
       driver.findElement(By.id("email"));
        
        Actions actions = new Actions(driver);
        actions.sendKeys("ahjhgs@gmail.com").build().perform();
        
        WebElement newAccount= driver.findElement(By.xpath("//a[text()='Create New Account']"));
        
        Actions actions1 = new Actions(driver);
        actions1.click(newAccount).build().perform();
   
	}

}
