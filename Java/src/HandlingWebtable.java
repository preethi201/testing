import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "http://demo.guru99.com/test/write-xpath-table.html");
        
        String text = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
        System.out.println("the output is :"+text);
        
        String text1 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
        System.out.println("the output is :"+text1);
        
        String text2 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
        System.out.println("the output is :"+text2);
        
        String text3 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        System.out.println("the output is :"+text3);
	}

}