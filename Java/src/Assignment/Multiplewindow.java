package Assignment;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://www.naukri.com/");
        
        driver.findElement(By.xpath("//a[@class='fl nLogo']")).click();
        System.out.println("title of the page"+driver.getTitle());
        
       String parentwindow= driver.getWindowHandle();
       System.out.println(parentwindow);
       
       driver.findElement(By.xpath("//a[@class='fl nLogo']")).click();
       System.out.println("title of the page"+driver.getTitle());
       
    
    Set<String> allwindows= driver.getWindowHandles();
    System.out.println(allwindows.size());
    
    ArrayList<String>alltabs = new ArrayList<String>(allwindows);
    for(int i=0;i<alltabs.size();i++) {
    	driver.switchTo().window(alltabs.get(i));
    	System.out.println(driver.getTitle());
    	
    }
	}

}
