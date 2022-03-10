package Upload;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.softwaretestinghelp.com/");
        Thread.sleep(8000);
       //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 //driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
     List<WebElement> doc= driver.findElements(By.tagName("iframe"));
    System.out.println("print number of frames" +doc.size());
  
      }
       
	}


