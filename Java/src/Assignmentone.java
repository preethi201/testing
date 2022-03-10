import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignmentone {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        
        String Title= driver.getTitle();
        System.out.println("the title of the page is:"+driver.getTitle());
        
        String Title1=driver.getCurrentUrl();
        System.out.println("the url of the page is:"+driver.getCurrentUrl());
        
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
        
        String Title2= driver.getTitle();
        System.out.println("the title2 of the page is:"+driver.getTitle());
        
        String url2=driver.getCurrentUrl();
        System.out.println("the url2 of the page is:"+driver.getCurrentUrl());
        
        
        Thread.sleep(2000);
        
        WebElement dropdown= driver.findElement(By.id("personal_cmbNation"));
        Select obj = new Select(dropdown);
        obj.selectByVisibleText("Antiguans");
       
        WebElement dropdown1= driver.findElement(By.id("personal_cmbMarital"));
        Select obj1 = new Select(dropdown1);
        obj1.selectByVisibleText("Married");

       
        
       
        Boolean button = driver.findElement(By.id("personal_optGender_1")).isDisplayed();
        
        System.out.println(button);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Welcome Rutuja']")).click();
        System.out.println("title of the page"+driver.getTitle());
        
       driver.findElement(By.xpath("(//div[@id='welcome-menu'])/ul/li//a[text()='Logout']")).click();
       System.out.println("title of the page"+driver.getTitle());
           
        
        driver.close();
        
        
        
     
	}

}
