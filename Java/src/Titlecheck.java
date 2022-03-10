import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlecheck {

	public static void main(String[] args) {
		
		String expectedTitle = "facebook";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        
        String actualTitle=driver.getTitle();
        System.out.println("actual title is "+actualTitle);
        
        if(expectedTitle.equals(actualTitle)) {
        	System.out.println("pass");
        }
        else {
        	System.out.println("fail");
        
        
        }

	}

}
