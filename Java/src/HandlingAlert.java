import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://demoqa.com/alerts");
        
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3);
        Alert alert= driver.switchTo().alert();
        alert.accept();
        
        Thread.sleep(2000);
       driver.findElement(By.id("timerAlertButton")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.id("confirmButton")).click();
       Alert alert1= driver.switchTo().alert();
        alert1.accept();
        String doc= driver.findElement(By.id("confirmResult")).getText();
        System.out.println("ttttttt"+doc);
        
        Thread.sleep(2000);
        driver.findElement(By.id("promtButton")).click();
       
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        Thread.sleep(2000);
        
        driver.findElement(By.id("promtButton")).click();
        
        Thread.sleep(2000);
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("preethi");
        alert3.accept();
        
        String output1 =driver.findElement(By.id("promptResult")).getText();
        System.out.println("the result is:"+output1);


	}

}
