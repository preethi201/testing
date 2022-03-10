package Testing;


import java.util.LinkedHashSet;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Comanylist extends Facebookj {
	
	
	public void name() {
		LinkedHashSet<String> allcompanies = new LinkedHashSet<String>();
		List<WebElement> Companynames=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		for(WebElement value:Companynames) {
			allcompanies.add(value.getText());
			
		}
		System.out.println(allcompanies);
		
	
		
	}
	public void Rate() {
	  LinkedHashSet<String> allcurrentprice = new LinkedHashSet<String>();
		List<WebElement> currentprice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		for(WebElement value1:currentprice) {
			allcurrentprice.add(value1.getText());
			
		}
		System.out.println(allcurrentprice);
	}

	public static void main(String[] args) {
		Comanylist aa = new Comanylist();
		aa.LaunchBrowser();
		aa.NavigateURL("https://demo.guru99.com/test/web-table-element.php");
		System.out.println("title of the url is" +aa.getCurrentURL());
		System.out.println("title og the page is" +aa.getTitle());
		aa.name();
		aa.Rate();
		
		

	}

}
