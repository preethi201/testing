package Testing;

import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testngformat.Program7;

public class Linkedhashmap5 extends  Program7{
    
	public void name() {
		  LinkedHashMap<String, String> alllinks = new LinkedHashMap<String, String>();
		  List<WebElement> companynames=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		  List<WebElement> companyprice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		  
		  for(int i=0;i<companynames.size();i++) {
			 alllinks.put(companynames.get(i).getText(),companyprice.get(i).getText());
		  }
		  System.out.println(alllinks);
	}
	

	
		public static void main(String[] args) {
		Linkedhashmap5 a = new Linkedhashmap5();
		a.launch();
		a.navigate("https://demo.guru99.com/test/web-table-element.php");
		System.out.println("the title of the page"+a.title());
		System.out.println("the title of current url"+a.currenturl());
		a.name();

	}

}
