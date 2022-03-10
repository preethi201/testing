package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tablelist extends Facebookj {
	
	public void display() {
		List<WebElement> selenium= driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li/a"));
		for(int i=0;i<selenium.size();i++) {
			System.out.println(selenium.get(i).getText());
		}
	}

	public static void main(String[] args) {
		Tablelist a = new Tablelist();
		a.LaunchBrowser();
		a.NavigateURL("https://demo.guru99.com/test/web-table-element.php");
		System.out.println("title of the page"+a.getTitle());
		System.out.println("title of the url"+a.getCurrentURL());
	   a.display();
	}

}
