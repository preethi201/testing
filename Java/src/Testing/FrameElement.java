package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://demoqa.com/frames");
        
        Thread.sleep(3000);
        
        List<WebElement> framescount=  driver.findElements(By.tagName("iframe"));
        
        System.out.println("number of frames available in the webpage is"+framescount.size());
        
        WebElement frameswitch=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        
        driver.switchTo().frame(frameswitch);
        
        String text = driver.findElement(By.id("sampleHeading")).getText();
        
        System.out.println(text);
        
        driver.switchTo().defaultContent();
        
        WebElement frameswitch1=driver.findElement(By.id("frame2"));
        
        driver.switchTo().frame(frameswitch1);
        
        driver.findElement(By.id("sampleHeading")).getText();
        
        System.out.println(text);
        
	}

}
