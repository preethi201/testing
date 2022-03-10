package Scrolling123;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium testing"+Keys.ENTER);
        System.out.println("title of the page"+driver.getTitle());
   
      
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
       js.executeScript("window.scrollBy(0,3200)");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[@class='EASEnb PZPZlf Bb1JKe']")).click();
       //driver.findElement(By.xpath("//h3[text()='What is Selenium Testing? What are the various ... - Tools QA']")).click();

	}

}
