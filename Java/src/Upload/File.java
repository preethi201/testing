package Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.guru99.com/test/upload/");
        Thread.sleep(2000);
     driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\292849\\Desktop\\file\\WINDOWHANDLIG1.txt");
     driver.findElement(By.id("terms")).click();
     driver.findElement(By.id("submitbutton")).click();
     
     
	}
	

}
