package Testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;


public class Alertj extends Facebookj{
	
	public void Alert1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
	}

     public void Alert2() throws InterruptedException {
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
    	 Thread.sleep(7000);
    	 Alert alert=driver.switchTo().alert();
    	 Thread.sleep(2000);
    	 alert.accept();
    	 
    	 
	}
    
     public void Alert3() throws InterruptedException {
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
    	 Thread.sleep(2000);
    	 Alert alert=driver.switchTo().alert();
    	 alert.accept();
    	 Thread.sleep(2000);
    	 String text =driver.findElement(By.id("confirmResult")).getText();
    	
    	 if(text.contains("Ok")) {
    		 System.out.println("user have  selected ok button");
    	 }
    		 else{
    			 System.out.println("user have selected cancel button");
    		 }
    	 }
    	 
    	 public void Alert4() throws InterruptedException {
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
         Thread.sleep(2000);
    	 Alert alert=driver.switchTo().alert();
    	 Thread.sleep(2000);
    	 alert.sendKeys("testing");
    	 alert.accept();
    	 Thread.sleep(2000);
    	 String text= driver.findElement(By.id("promptResult")).getText();
    	 System.out.println("user entered:"+text);
    	 
 		
 	}
    
     public static void main(String[] args) throws InterruptedException {
		Alertj a = new Alertj();
		a.LaunchBrowser();
		a.NavigateURL("https://demoqa.com/alerts");
		System.out.println(a.getTitle());
		System.out.println(a.getCurrentURL());
		a.Alert1();
    	a.Alert2();
    	a.Alert3();
    	a.Alert4();
     	 
    	 
	}
     
     
     
}
