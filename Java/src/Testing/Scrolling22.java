package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling22 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://www.tutorialspoint.com/index.htm");
        System.out.println("title of the page is"+driver.getTitle());
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        driver.findElement(By.xpath("//div[text()='Machine Learning']"));
        
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, -document.body.scrollHeight)"); 
	}

}
