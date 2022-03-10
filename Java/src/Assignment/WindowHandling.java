package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://www.naukri.com/");
        
       String parentwindow= driver.getWindowHandle();
       System.out.println(parentwindow);
       
     driver.findElement(By.xpath("//a[@class='fl nLogo']")).click();
     System.out.println("title of the page"+driver.getTitle());
     
    Set<String> allwindows= driver.getWindowHandles();
    System.out.println(allwindows.size());
    
    for(String child:allwindows) {
    	if(!parentwindow.equals(allwindows)) {
    	driver.switchTo().window(child);
    }
    	System.out.println(""+driver.getTitle());
    	 
    }
	}
}
        

	
	


