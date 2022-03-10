package Concepts;

import org.openqa.selenium.By;

public class Google1 extends Google{
	
	public void data() {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		
	}

	public static void main(String[] args) {
		Google1 a = new Google1();
		a.display();
		a.navigate("https://www.google.com/");
		a.data();
		System.out.println(a.title());
		System.out.println(a.urltitle());
	}

}
