package Testing;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class Googlej extends Facebookj{
	
	ArrayList<String> Links = new ArrayList<String>();
	
	public void getalllinks() {
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<alllinks.size();i++) {
			System.out.println(alllinks.get(i).getText());
		}
		System.out.println(alllinks.size());
		System.out.println(alllinks.get(3).getText());
		System.out.println(alllinks.get(9).getText());
		
	}

	public static void main(String[] args) {
		Googlej a = new Googlej();
		a.LaunchBrowser();
		a.NavigateURL("https://www.google.co.in/");
		System.out.println(a.getTitle());
		System.out.println(a.getCurrentURL());
		a.getalllinks();

		

	}

}
