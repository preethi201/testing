package Testngformat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Program7a extends Program7{
	
	public void display() {
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(int i=0;i<alllinks.size();i++) {
			System.out.println(alllinks.get(i).getText());
			
		}
		System.out.println(alllinks.get(0).getText());
		System.out.println(alllinks.get(5).getText());
	}

	public static void main(String[] args) {
		 Program7a ss = new Program7a();
		 ss.launch();
		 ss.navigate("https://www.google.com/");
		 System.out.println(ss.title());
		 System.out.println(ss.currenturl());
		 ss.display();
		

	}

}
