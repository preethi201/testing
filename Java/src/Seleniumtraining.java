import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Seleniumtraining {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to(  "https://www.facebook.com/");
		
		
		String title = driver.getTitle();
		System.out.println("title of the page"+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("url of the page"+url);
		
		String pagesource = driver.getPageSource();
		System.out.println("pagesource"+pagesource);
		
		WebElement content =driver.findElement(By.xpath("//div[@id='content']/div/div/div/div[1]/h2"));
		
		String contenttext = content.getText();
		System.out.println("content is "+contenttext);
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		link.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("testing tools");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("testing tools selenium");
		
		WebElement daydropdown = driver.findElement(By.id("day"));
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement yeardropdown = driver.findElement(By.id("year"));
		
		
		Select day = new Select(daydropdown);
		Select month = new Select(monthdropdown);
		Select year = new Select(yeardropdown);
		
		day.selectByIndex(5);
		month.selectByValue("6");
		year.selectByVisibleText("1983");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
		Thread.sleep(3000);
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("the number of links in the webpage:"+allLinks.size());
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("testing Refresh functionality");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
