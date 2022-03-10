package Screenshot111;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Camp {
	
	WebDriver driver;
	@Test
	public void display() throws IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
	        TakesScreenshot a = (( TakesScreenshot)driver);
	        File SrcFile = a.getScreenshotAs(OutputType.FILE);
	        File DestFile = new File("D:\\workspace\\Java\\Screen\\amazon.png");
	        FileUtils.copyFile(SrcFile, DestFile);
	        

	}

}
