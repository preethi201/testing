import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        

        
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        
     WebElement password = driver.findElement(By.id("txtPassword"));
     password.sendKeys("admin123");
        
        WebElement loginbutton= driver.findElement(By.id("btnLogin"));
        loginbutton.click();
        
        Thread.sleep(2000);
        
        WebElement leave=driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leave.click();
        
        Thread.sleep(2000);
   
        
        WebElement orange =driver.findElement(By.xpath("//a[text()='Orange Test']"));
        orange.click();
        
        Thread.sleep(2000);
        
        WebElement EditSave=driver.findElement(By.xpath("//input[@value='Edit' and @id='btnSave']"));
        EditSave.click();
        
        WebElement firstname = driver.findElement(By.id("personal_txtEmpFirstName"));
        firstname.clear();
        firstname.sendKeys("selenium");
        
        
        WebElement lastname =driver.findElement(By.id("personal_txtEmpLastName"));
        lastname.clear();
        lastname.sendKeys("tool");
        
        WebElement empId = driver.findElement(By.id("personal_txtEmployeeId"));
        empId.clear();
        empId.sendKeys("1222223");
        
        

	

	
	}

}
