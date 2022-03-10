import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fdp%2FB09BG4D69N%2F%3Fpf_rd_r%3DN6QBYNJ1D9CYYR4SG418%26pf_rd_p%3Dfbbd018e-4132-47d7-817a-9260033facbc%26pd_rd_r%3D1c731b6a-e75a-4af2-81c8-3022583acbf6%26pd_rd_w%3DhMavV%26pd_rd_wg%3DPBadP%26ref_%3Dnav_signin&prevRID=M2DN4MZC6TPS4HB54E42&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        
        driver.findElement(By.id("ap_customer_name")).sendKeys("pratham");
        Thread.sleep(2000);
      
        driver.findElement(By.id("ap_email")).sendKeys("ksahdk@gmail.com");
        Thread.sleep(2000);
       driver.findElement(By.id("ap_password")).sendKeys("pratham");
       Thread.sleep(2000);
       driver.findElement(By.id("ap_phone_number")).sendKeys("7463862498");
       Thread.sleep(2000);
        
        Thread.sleep(50000);
        
        
        
      
        
     

	}

}
