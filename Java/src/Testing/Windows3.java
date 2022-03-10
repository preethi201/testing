package Testing;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
         
        driver.findElement(By.xpath("(//a[text()= ' Click this link to start new Tab '])[3]")).click();
        
        String mainwindow = driver.getWindowHandle();
        System.out.println(mainwindow);
      
        
        ArrayList<String> allwindows = new ArrayList<String>(driver.getWindowHandles());
        
        driver.switchTo().window(allwindows.get(1));
        
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        System.out.println("............................................");
        
        driver.switchTo().window(allwindows.get(0));
        
        String text =driver.findElement(By.xpath("//h1[@class='title']/a ")).getText();
        System.out.println(text);
        
        System.out.println(driver.getTitle());
        
        System.out.println(driver.getCurrentUrl());
        
	}
	

}
