package Change;


import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Hchange extends Pro1{
	
	public void fun() throws InterruptedException {
      LinkedHashSet<String> values= new LinkedHashSet<String>();
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]/following-sibling::ul[@class='dropdown-menu']/li/a")).click();
		List<WebElement> all = driver.findElements(By.tagName("li"));
		System.out.println(all.size());
		Thread.sleep(2000);
		for(int i=0;i<all.size();i++) {
			System.out.println(all.get(i).getText());
			System.out.println(values);
		
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		Hchange a = new Hchange();
		a.launch();
		a.navigate("https://demo.guru99.com/V4/");
		System.out.println(a.title());
		System.out.println(a.currenturl());
		a.fun();
	}


	
	}


