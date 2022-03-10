package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment7 extends Facebookj{
	
	public void display() {
		List<WebElement> alllinks=driver.findElements(By.xpath("(//select[@id='searchDropdownBox'])/option"));
		for(int i=0;i<alllinks.size();i++) {
			System.out.println(alllinks.get(i).getText());
		}
	}

	public static void main(String[] args) {
		Assignment7 a = new Assignment7();
		a.LaunchBrowser();
		a.NavigateURL("https://www.amazon.in/");
		System.out.println("title of the page"+a.getTitle());
		System.out.println("title of the currenturl"+a.getCurrentURL());
		a.display();
	}

}
