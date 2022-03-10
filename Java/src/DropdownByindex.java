import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownByindex {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://www.facebook.com/");
        
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        
        Thread.sleep(3000);
        
        WebElement daydropdown =driver.findElement(By.id("day"));
        Select obj = new Select(daydropdown);
        obj.selectByIndex(10);
        
     
        
        
        WebElement monthdropdown =driver.findElement(By.id("month"));
        Select month = new Select(monthdropdown);
        month.selectByIndex(5);
        
        
        
        WebElement yeardropdown =driver.findElement(By.id("year"));
        Select year = new Select(yeardropdown);
        year.selectByIndex(3);
        
	}

}
