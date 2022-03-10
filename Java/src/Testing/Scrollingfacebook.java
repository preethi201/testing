package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingfacebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://www.facebook.com/");
        System.out.println("title of the page is"+driver.getTitle());
        
        
        Thread.sleep(2000);
        
    
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("window.scrollBy(0, 1000)");
        
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,-1000)");

	}

}
