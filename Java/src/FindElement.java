import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://www.browserstack.com/");
        
        WebElement developersTab= driver.findElement(By.xpath("//span[text()='Developers ']"));
        
        Actions actions=new Actions(driver);
        actions.moveToElement(developersTab).build().perform();
        
        Thread.sleep(3000);
        
        WebElement supportLink=driver.findElement(By.xpath("//a[text()='Support']"));
        supportLink.click();
        
        System.out.println("title of the page is:"+driver.getTitle());
        
	}

}
