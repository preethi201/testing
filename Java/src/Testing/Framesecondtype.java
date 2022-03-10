package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Framesecondtype {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://chercher.tech/practice/frames-example-selenium-webdriver");
        driver.switchTo().frame("frame1");
        
        driver.findElement(By.xpath("//b[@id='topic']/../input")).sendKeys("selenium");
       
         driver.switchTo().frame("frame3");
       
         driver.findElement(By.xpath("//input[@id='a']")).click();
        
         driver.switchTo().defaultContent();
         driver.switchTo().frame("frame2");
        
        WebElement animalDropdown = driver.findElement(By.xpath("//select[@id='animals']"));
        
        Select obj= new Select(animalDropdown);
        
         obj.selectByVisibleText("Avatar");
         
         Thread.sleep(5000);


	}

}
