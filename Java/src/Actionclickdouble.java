import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclickdouble {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to(  "http://demo.guru99.com/test/simple_context_menu.html");
        
        WebElement text =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        
        Actions action = new Actions(driver);
        action.doubleClick(text).build().perform();
        
	}

}
