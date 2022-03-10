package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asdf {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://www.google.com/");
        System.out.println("title of the page"+driver.getTitle());
        
        List<WebElement> alllinks=driver.findElements(By.tagName("a"));
        System.out.println("number of links"  +alllinks.size());
        
        for(int i=0;i<alllinks.size();i++) {
        	System.out.println(alllinks.get(i).getText());
        	
        	if(alllinks.get(i).getText().equals("About")) {
        		alllinks.get(i).click();
        		System.out.println(driver.getTitle());
        		
        	}
        }
	}

}
