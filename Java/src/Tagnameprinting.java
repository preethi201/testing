import javax.sql.RowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnameprinting {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://www.google.com/");
        System.out.println("title of the page"+driver.getTitle());
        
        WebElement data =driver.findElement(By.xpath("//input[@title='Search']"));
        data.sendKeys("Selenium concepts");
        
        
        
        
        
        
        
        
        
     
       
        
        
	}

}
