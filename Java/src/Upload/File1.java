package Upload;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class File1 {

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
		
		WebElement doc= driver.findElement(By.xpath("//div[@class='_28p97w']"));
		
        Actions action = new Actions(driver);
        action.moveToElement(doc).build().perform();
        
        List<WebElement> alllinks= driver.findElements(By.tagName("a"));
        for(int i=0;i<alllinks.size();i++) {
            System.out.println(alllinks.get(i).getText());
        if(alllinks.get(i).getText().equals("SuperCoin Zone")) {
            alllinks.get(i).click();
        	 System.out.println(driver.getTitle());
        	
        }
        }
        
       
       
       
   
        

	}}
     
		
		
		
		

