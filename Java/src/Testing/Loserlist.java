package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Loserlist extends Facebookj{
	
	public void display() {
		List<WebElement> daily=driver.findElements(By.xpath("//h2[text()='Losers']/../div"));
		for(int i=0;i<daily.size();i++) {
			System.out.println(daily.get(i).getText());
		}
	}

	public static void main(String[] args) {
		Loserlist a = new Loserlist();
		a.LaunchBrowser();
		a.NavigateURL("https://demo.guru99.com/test/web-table-element.php");
		System.out.println("title of the page"+a.getTitle());
		System.out.println("title of the url"+a.getCurrentURL());
         a.display();

	}

}
