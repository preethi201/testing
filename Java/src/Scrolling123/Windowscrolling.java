package Scrolling123;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowscrolling {
	WebDriver driver;
	public void launch() {
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
		 String parent=driver.getWindowHandle();
		 System.out.println(parent);
		 WebElement coin =driver.findElement(By.xpath("//a[@title='Bitcoin']"));
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("arguments[0].scrollIntoView();",coin);
		 coin.click();
         WebElement mango=driver.findElement(By.xpath("//a[@title='Mongo DB Tutorial']"));
	     JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js2.executeScript("arguments[0].scrollIntoView();",mango);
		 mango.click();
		 Set<String>childwindow= driver.getWindowHandles();
		 System.out.println(childwindow.size());
		 ArrayList<String> alltabs = new ArrayList<String>(childwindow);
		 for(int i=0;i<alltabs.size();i++) {
		 driver.switchTo().window(alltabs.get(i));
		 System.out.println(driver.getTitle());
			
		}

	 }

	public static void main(String[] args) throws InterruptedException {
		Windowscrolling a = new Windowscrolling();
		a.launch();
		a.navigate("https://www.tutorialspoint.com/index.htm");
		System.out.println(a.title());
		System.out.println(a.current());
		a.test();

	}

}
