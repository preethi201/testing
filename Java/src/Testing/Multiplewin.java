package Testing;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
        
        driver.findElement(By.xpath("(//a[text()= ' Click this link to start new Tab '])[1]")).click();
        driver.findElement(By.xpath("(//a[text()= ' Click this link to start new Tab '])[2]")).click();
        driver.findElement(By.xpath("(//a[text()= ' Click this link to start new Tab '])[3]")).click();
        
        String parentwindow=driver.getWindowHandle();
        System.out.println(parentwindow);
        Set<String> allWindows=driver.getWindowHandles();
        ArrayList<String> alltabs = new ArrayList<String>(allWindows);
        
        for(int i=0;i<alltabs.size();i++) {
        	driver.switchTo().window(alltabs.get(i));
        	System.out.println(driver.getTitle());
        }
        
        
        
        
	}
	

}
