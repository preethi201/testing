package Testing;

import org.openqa.selenium.By;

public class Assignment4 extends Facebookj{
	
	public void display() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='element-group'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("preethi");
		driver.findElement(By.id("lastName")).sendKeys("satish");
		Thread.sleep(2000);
		
		driver.findElement(By.id("userEmail")).sendKeys("suma1236");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='genterWrapper']/div/div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("userNumber")).sendKeys("7343384885");
        Thread.sleep(2000);
         
	}

	public static void main(String[] args) throws InterruptedException {
		Assignment4 s = new Assignment4();
		s.LaunchBrowser();
		s.NavigateURL("https://demoqa.com/automation-practice-form");
		System.out.println("title of the page"+s.getTitle());
		System.out.println("title of the current url"+s.getCurrentURL());
		s.display();
		
	}

}
