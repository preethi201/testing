package Proface;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Face4 {
	public static String readdata(String key) throws IOException {
		Properties properties = new Properties();
		FileInputStream fileinputstream = new FileInputStream("D:\\workspace\\Java\\Man.properties");
		properties.load(fileinputstream);
		String value=properties.getProperty(key);
		return value;
			}
	WebDriver driver;

	public void launch() {
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
	
	public void sample() throws IOException, InterruptedException {
		driver.findElement(By.id("email")).sendKeys(readdata("email"));
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.linkText("Create New Account")).click();;
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys(readdata("firstna"));
		driver.findElement(By.name("lastname")).sendKeys(readdata("lastna"));
		driver.findElement(By.name("reg_email__")).sendKeys(readdata("mobile1"));
		driver.findElement(By.name("reg_passwd__")).sendKeys(readdata("password1"));
		WebElement daydropdown =driver.findElement(By.id("day"));
	      Select obj = new Select(daydropdown);
	      obj.selectByVisibleText(readdata("day1"));
	      Thread.sleep(2000);
	      WebElement monthdropdown =driver.findElement(By.id("month"));
	      Select month = new Select(monthdropdown);
	      month.selectByVisibleText(readdata("month1"));
	      Thread.sleep(2000);
	      WebElement yeardropdown =driver.findElement(By.id("year"));
	      Select year = new Select(yeardropdown);
	      year.selectByVisibleText(readdata("year1"));
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		TakesScreenshot scrshot = (( TakesScreenshot)driver);
		File scrfile =scrshot.getScreenshotAs(OutputType.FILE);
		File destfile= new File("D:\\automationproject\\AutomationTesting\\Screenkey\\flip.png");
		FileUtils.copyFile(scrfile, destfile);
		
	
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Face4 a = new Face4();
		a.launch();
		a.navigate(readdata("url"));
		System.out.println(a.title());
		System.out.println(a.currenturl());
		a.sample();
	      

	}
	
	}

