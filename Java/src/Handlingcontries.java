import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingcontries {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://www.w3schools.com/html/html_tables.asp");
        
        String text=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[3]")).getText();
        System.out.println("the output is:"+text);
        
	}

}
