package Testngformat;


import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Program8 extends Program7{
	
	public void display() throws InterruptedException {
	  LinkedHashSet<String> value1 = new LinkedHashSet<String>();
	 
	  List<WebElement> alllink1=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li[1]//ul/li/a"));
	 System.out.println(alllink1.size());
	  for(int i=0;i<alllink1.size();i++) {
		  value1.add(alllink1.get(i).getText());
	  }
	  System.out.println(value1);
	  LinkedHashSet<String> value2 = new LinkedHashSet<String>();
	  List<WebElement> alllink2=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li[5]//ul/li/a"));
        System.out.println(alllink2.size());
    
        for(int i=0;i<alllink2.size();i++) {
  		  value2.add(alllink2.get(i).getText());
  	  }
  	  System.out.println(value2);
     
    
        }
     
	public static void main(String[] args) throws InterruptedException {
		Program8 a = new Program8();
		a.launch();
		a.navigate("https://demo.guru99.com/V4/");
		System.out.println(a.title());
		System.out.println(a.currenturl());
		a.display();
		
	}
	

}
