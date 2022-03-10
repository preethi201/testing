package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment3list extends Facebookj{
	
	public void display() {
		driver.findElement(By.xpath("//a[normalize-space(.)='Selenium']")).click();
		List<WebElement> seleniumlist=driver.findElements(By.xpath("//a[normalize-space(.)='Selenium']/following-sibling::ul/li/a"));
		for(int i=0;i<seleniumlist.size();i++) {
			System.out.println(seleniumlist.get(i).getText());
		}
	}

	public static void main(String[] args) {
		Assignment3list a = new Assignment3list();
		a.LaunchBrowser();
		a.NavigateURL("http://demo.guru99.com/test/ajax.html");
		System.out.println("title of the page"+a.getTitle());
		System.out.println("title of the current url"+a.getCurrentURL());
		a.display();
	}

}
