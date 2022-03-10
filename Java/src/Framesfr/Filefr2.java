package Framesfr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filefr2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://demoqa.com/frames");
        
        Thread.sleep(3000);
        
        List<WebElement> frames=driver.findElements(By.tagName("iframe"));
        System.out.println("total number of frames"+frames.size());
        driver.switchTo().frame(1);
        
        String title=driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(title);
        System.out.println("//////////////////////////");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        String title1=driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(title1);
        
        
	}

}
