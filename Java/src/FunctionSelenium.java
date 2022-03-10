import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to(  "https://www.browserstack.com/users/sign_up");
        Boolean button = driver.findElement(By.xpath("//input[@id='user_submit']")).isDisplayed();
        
        System.out.println(button);
        
        
        driver.navigate().to(  "https://www.browserstack.com/users/sign_up");
        Boolean button1 = driver.findElement(By.xpath("//input[@id='user_submit']")).isEnabled();
        
        System.out.println(button1);
        
        driver.navigate().to(  "https://www.browserstack.com/users/sign_up");
        Boolean button2 = driver.findElement(By.xpath("//input[@id='user_submit']")).isSelected();
        
        System.out.println(button2);
	}
	

}
