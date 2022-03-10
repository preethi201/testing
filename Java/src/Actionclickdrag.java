import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclickdrag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to(  "https://the-internet.herokuapp.com/drag_and_drop");
        
        WebElement source= driver.findElement(By.id("column-a"));
        WebElement destination= driver.findElement(By.id("column-b"));
        
        Actions action = new Actions(driver);
        action.dragAndDrop(source,destination).build().perform();
	}

}
