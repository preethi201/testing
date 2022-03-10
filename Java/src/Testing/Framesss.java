package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesss {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        
        Thread.sleep(3000);
        
        List<WebElement> framescount=  driver.findElements(By.tagName("iframe"));
        System.out.println("number of frames available in the webpage is"+framescount.size());
        
        driver.switchTo().frame("iframeResult");
        
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        
       
        
        
        
	}

}
