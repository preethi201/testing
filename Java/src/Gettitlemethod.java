import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitlemethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://www.facebook.com/");
        
        String title = driver.getTitle(); 
        System.out.println("the title of the page is:"+title);
        
        String url=driver.getCurrentUrl();
        System.out.println("URL of the webpage:"+url);
        
        driver.findElement(By.linkText("Forgotten password?")).click();
        
        String title1 = driver.getTitle(); 
        System.out.println("the title of the page is:"+title1);
        
        String url1=driver.getCurrentUrl();
        System.out.println("URL of the webpage:"+url1);
        
        
	}

}
