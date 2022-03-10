package Testing;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Windows2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
         
        driver.findElement(By.xpath("(//a[text()= ' Click this link to start new Tab '])[2]")).click();
        
        String mainwindow = driver.getWindowHandle();
        System.out.println(mainwindow);
      
        
        ArrayList<String> allwindows = new ArrayList<String>(driver.getWindowHandles());
        
        driver.switchTo().window(allwindows.get(1));
        
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        
        System.out.println("title of the page is :"+driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@name='firstname'] ")).sendKeys("samurdh");
        
        driver.findElement(By.xpath(" //input[@name='lastname']")).sendKeys("sam");
        
        driver.findElement(By.xpath(" //input[@name='reg_email__']")).sendKeys("shhg14543");
        
        driver.findElement(By.xpath(" //input[@name='reg_passwd__']")).sendKeys("12354");
        
        WebElement daydropdown =driver.findElement(By.id("day"));
        Select obj = new Select(daydropdown);
        obj.selectByVisibleText("25");
        
     
        
        
        WebElement monthdropdown =driver.findElement(By.id("month"));
        Select month = new Select(monthdropdown);
        month.selectByVisibleText("Aug");
        
        
        
        WebElement yeardropdown =driver.findElement(By.id("year"));
        Select year = new Select(yeardropdown);
        year.selectByVisibleText("2006");
        
        driver.findElement(By.xpath(" (//input[@name='sex'])[2]")).click();
        
        driver.switchTo().window(allwindows.get(0));
        
        String text =driver.findElement(By.xpath("//h1[@class='title']/a ")).getText();
        System.out.println(text);
        
        System.out.println(driver.getTitle());
        
        System.out.println(driver.getCurrentUrl());
        
        
        
        driver.close();
        
        


        
        
        
        
        

	}

}
