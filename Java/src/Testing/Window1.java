package Testing;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Window1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
         
        driver.findElement(By.xpath("(//a[text()= ' Click this link to start new Tab '])[1]")).click();
        
        String mainwindow = driver.getWindowHandle();
        System.out.println(mainwindow);
      
        
        ArrayList<String> allwindows = new ArrayList<String>(driver.getWindowHandles());
        
        driver.switchTo().window(allwindows.get(1));
        
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium methods"+Keys.ENTER);
        
        System.out.println("title of the page is :"+driver.getTitle());
        
        
	}

}
