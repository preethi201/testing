package Testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FameHandling {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Thread.sleep(3000);
        
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@id='getwebsitebtn']")).click();
        

	}

}
