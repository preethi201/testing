package Scrolling123;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc3 {
	WebDriver driver;
	public void sample() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window();
	}

	public void navigate(String url) {
		driver.navigate().to(url);
	}
	public String title() {
		return driver.getTitle();
	}
	public String current() {
		return driver.getCurrentUrl();
	}
	
	public void test() throws InterruptedException {
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//	     js.executeScript("window.scrollBy(0,3600)");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		js.executeScript("window.scrollBy(300,0)");
		js.executeScript("window.scroolTo(0,document.body.scrollheight)");
		js.executeScript("window.scrollTo(0,-document.body.scrollheight)");
		
	
	     Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Careers']")).click();
	Thread.sleep(2000);
		System.out.println(""+driver.getTitle());
		}
	
	public static void main(String[] args) throws InterruptedException {
		Abc3 a = new Abc3();
		a.sample();
		a.navigate("https://www.amazon.com/");
		System.out.println(a.title());
		System.out.println(a.current());
		a.test();

	}

}
