package Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class sample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		
        driver.navigate().to("https://www.flipkart.com/?s_kwcid=AL!739!3!582822158549!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=Cj0KCQiAjc2QBhDgARIsAMc3SqQ1HnUMwl1hqe7JSFeU-pWmUWybtKEIUEtPzemYWvfYv2YuRAOAePgaAmIzEALw_wcB");
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8792481513");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pratham2011");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Dell"+Keys.ENTER);    
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']")).click();
       WebElement doc= driver.findElement(By.xpath("//ul[@class='row']/li[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView( );", doc);
       //js.executeScript("window.scrollby(0.500)");
       Thread.sleep(2000);
     
      doc.click();
		

   
    
	}

	private static JavascriptExecutor xecutescript(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
