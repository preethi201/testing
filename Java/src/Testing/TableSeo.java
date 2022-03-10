package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableSeo extends Facebookj{
	
	public void display() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space(.)='SEO']")).click();
		Thread.sleep(3000);
		List<WebElement> pages=driver.findElements(By.xpath("//a[normalize-space(.)='SEO']/following-sibling::ul/li	/a"));
		for(int i=0;i<pages.size();i++) {
			System.out.println(pages.get(i).getText());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		TableSeo a = new TableSeo();
		a.LaunchBrowser();
		a.NavigateURL("https://demo.guru99.com/test/web-table-element.php");
		System.out.println("title of the page"+a.getTitle());
		System.out.println("title of the url"+a.getCurrentURL());
		a.display();
		
	}

}
