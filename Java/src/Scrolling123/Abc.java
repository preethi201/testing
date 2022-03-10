package Scrolling123;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium testing"+Keys.ENTER);
        System.out.println("title of the page"+driver.getTitle());
   
      
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[text()='Help']")).click();
       JavascriptExecutor js1 = (JavascriptExecutor) driver;
       js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      Thread.sleep(2000);
      //Webelement doc=driver.findElement(By.xpath("//ol[@class='sc-select-show']/li[4]"));
    driver.findElement(By.xpath("//div[@class='language-selector-select sc-select']")).click();
    driver.findElement(By.xpath("//ol[@class='sc-select-show']/li[4]")).click();
	}

}
