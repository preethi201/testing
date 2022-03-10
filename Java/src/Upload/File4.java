package Upload;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class File4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.naukri.com/");
       String par= driver.getWindowHandle();
       System.out.println(par);
       
       driver.findElement(By.xpath("//div[text()='Jobs']")).click();
       driver.findElement(By.xpath("//div[text()='Companies']")).click();
       driver.findElement(By.xpath("//div[text()='Services']")).click();
      Set<String>chi=driver.getWindowHandles();
      System.out.println(chi.size());
      ArrayList<String> alltabs=new ArrayList<String>(chi);
      for(int i=0;i<alltabs.size();i++) {
    	  driver.switchTo().window(alltabs.get(i));
    	  System.out.println(driver.getTitle());
      }
        

	}

}
