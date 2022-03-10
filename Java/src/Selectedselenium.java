import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectedselenium {

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
        
       Boolean pendingapproval= driver.findElement(By.xpath("//label[text()='Pending Approval']/following-sibling::input[1]")).isSelected();
        
System.out.println(pendingapproval);

if(pendingapproval) {
	driver.findElement(By.xpath("//label[text()='Pending Approval']/following-sibling::input[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Scheduled']/following-sibling::input[1]")).click();
}
else {
	System.out.println("check box is not selected");
	
}
	}

}
