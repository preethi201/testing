import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        
        driver.findElement(By.name("firstName")).sendKeys("preethi");
        
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("user");
        
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("3565788989");
        
        driver.findElement(By.id("userName")).sendKeys("pree@gmail.com");
        
        driver.findElement(By.name("address1")).sendKeys("football");
        
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("football");
        
        driver.findElement(By.name("state")).sendKeys("TG");
        
        driver.findElement(By.name("postalCode")).sendKeys("500000");
        
        driver.findElement(By.id("email")).sendKeys("desk");
        
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pass1234");
        
        
        driver.findElement(By.xpath("//input[@name='confirmpassword'")).sendKeys("pass1234");
	}

}
