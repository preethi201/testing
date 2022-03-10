package Change;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mango {
WebDriver driver;
	public void Hat() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver98\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void navigate(String url) {
	 driver.navigate().to(url);
	}
   
	public String title() {
		return driver.getTitle();
	}
	
	public String currenturl() {
		return driver.getCurrentUrl();
	}
	
	public void man() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		LinkedHashSet<String> value=new LinkedHashSet<String>();
		List<WebElement> alllinks=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
		System.out.println(alllinks.size());
		for(int i=1;i<alllinks.size();i++) {
			value.add(alllinks.get(i).getText());
//		for(WebElement link:alllinks) {
//			value.add(link.getText());


		}
		System.out.println(value);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Mango a = new Mango();
		a.Hat();
		a.navigate("https://demo.guru99.com/V4/");
		System.out.println(a.title());
		System.out.println(a.currenturl());
		a.man();
		
	}

	}


