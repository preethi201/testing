import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondrag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to(  "https://demoqa.com/droppable/");

        WebElement source=driver.findElement(By.id("draggable"));
        WebElement destination=driver.findElement(By.id("droppable"));
        
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, destination).build().perform();
        
        System.out.println("ttttttt"+driver.getCurrentUrl());
        
	}

}
