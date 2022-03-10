package Testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
        
        String parentwindow=driver.getWindowHandle();
        System.out.println(parentwindow);
        driver.findElement(By.xpath("(//a[text()= ' Click this link to start new Tab '])[1]")).click();
        
        System.out.println(driver.getTitle());
        
        Set<String> allWindows=driver.getWindowHandles();
        System.out.println(allWindows.size());
        
        for(String Window : allWindows) {
        	if(!parentwindow.equals(Window)) {
        		
        		driver.switchTo().window(Window);
        	}
        }
        
        System.out.println(driver.getTitle());
        		
        	
        	
        
	}

}
