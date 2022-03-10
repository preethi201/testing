package Testngformat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Program11 extends Program7{
	
	public void sample() {

		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li[1]//ul/li/a"));
		System.out.println(all.size());
		for(int i=0;i<all.size();i++) {
			System.out.println(all.get(i).getText());	
		
		}
		
	}

	public static void main(String[] args) {
		Program11 a = new Program11();
		a.launch();
		a.navigate("https://demo.guru99.com/V4/");
	    System.out.println(a.title());
		System.out.println(a.currenturl());
		a.sample();
	}

}
