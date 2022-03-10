import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        
        driver.findElement(By.id("btnLogin")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
        
        Thread.sleep(2000);
   
        
        driver.findElement(By.xpath("//a[text()='Orange Test']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@value='Edit' and @id='btnSave']")).click();
        
        
        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("selenium");
        
        driver.findElement(By.id("personal_txtEmpLastName")).clear();
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("tool");
        
        
        driver.findElement(By.id("personal_txtEmployeeId")).clear();
        driver.findElement(By.id("personal_txtEmployeeId")).sendKeys("1222223");
        
        
        
        
       driver.findElement(By.xpath("//input[@value='save']")).click();
        
        
	}
	

}
