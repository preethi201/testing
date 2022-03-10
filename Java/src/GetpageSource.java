import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetpageSource {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://www.orangehrm.com/contact-sales/");
        
        String source= driver.getPageSource();
        System.out.println(source);
        System.out.println(",,,,,,,"+driver.getTitle());
        System.out.println("hhhhhh"+driver.getCurrentUrl());

	}

}
