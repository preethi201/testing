package Change;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testngformat.Program7;

public class Guhash extends Program7{

	public void display() {
	List<WebElement> all=driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
    System.out.println(all.get(0).getText());
	}
	public static void main(String[] args) {
		Guhash a = new Guhash();
		a.launch();
		a.navigate("https://demo.guru99.com/test/web-table-element.php");
		System.out.println(a.title());
		System.out.println(a.currenturl());
		
	

	}

}
