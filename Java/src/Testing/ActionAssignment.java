package Testing;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ActionAssignment {

	@Test

	public void display() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://www.amazon.com/");
        
        WebElement accountlist=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
        
        
        Actions action = new Actions(driver);
        action.moveToElement(accountlist).build().perform();
        
        Thread.sleep(2000);
        
        WebElement signin =driver.findElement(By.linkText("Sign in"));
        signin.click();
        Thread.sleep(3000);
        driver.navigate().back();
        
        
        
       
        
        
        
	}

}