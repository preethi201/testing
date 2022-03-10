package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Assignment6 extends Facebookj{
     
	public void display()  {
		WebElement doc =driver.findElement(By.xpath("//span[text()='Quiz']"));
		Actions action = new Actions(driver);
		action.moveToElement(doc).build().perform();
		driver.findElement(By.xpath("//ul[@id='primary-menu']/li/following-sibling::li[7]/a/following-sibling::ul/li/a/span")).click();
	}
			
			


	public static void main(String[] args){
		Assignment6 ss = new Assignment6();
		ss.LaunchBrowser();
		ss.NavigateURL("https://stqatools.com/");
		System.out.println("title of the page"+ss.getTitle());
		System.out.println("title of the currenturl"+ss.getCurrentURL());
		ss.display();

	}

}
