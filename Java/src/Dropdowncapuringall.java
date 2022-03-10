import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowncapuringall {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\292849\\Pictures\\chromedriver_win32 (1)\\chromedriver.exe");
	       
		WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to( "https://www.facebook.com/");
        System.out.println("title of the page"+driver.getTitle());
        
        WebElement newaccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
        System.out.println("give the tagname is   "  +newaccount.getTagName());
        System.out.println("gives attribute values is"  +newaccount.getAttribute("class"));
        System.out.println("gives attribute values is"  +newaccount.getAttribute("role"));     
        System.out.println("gives attribute values is"  +newaccount.getAttribute("ajaxify"));
        System.out.println("gives attribute values is"  +newaccount.getAttribute("id"));
        System.out.println("gives colour values is"   +newaccount.getCssValue("colour"));
        System.out.println("gives colour values is"   +newaccount.getCssValue("bgcolour"));
        
        
        
        newaccount.click();
        
        Thread.sleep(2000);
        
        WebElement daydropdown=driver.findElement(By.id("day"));
        Select obj = new Select(daydropdown);
        List <WebElement> dayvalues= obj.getOptions();
        System.out.println("print all day values is" +dayvalues.size());
        
        for(int i=0;i<dayvalues.size();i++) {
        	System.out.println(dayvalues.get(i).getText());
        }
      System.out.println ("...................................");	

            
      
             WebElement mounthdropdown=driver.findElement(By.id("month"));
      
             Select objj = new Select(mounthdropdown);
             List <WebElement> mounthvalues= objj.getOptions();
             System.out.println("print month values is" +mounthvalues.size());
             
             for(int i=0;i<mounthvalues.size();i++) {
             	System.out.println(mounthvalues.get(i).getText());
             }
             	 
             WebElement yeardropdown=driver.findElement(By.id("year"));
                 Select objjj = new Select(yeardropdown);
                 List <WebElement> yearvalues= objjj.getOptions();
                 System.out.println("print year values" +yearvalues.size());
                 
                 for(int i=0;i<yearvalues.size();i++) {
                 	System.out.println(yearvalues.get(i).getText());
                 	
                 }
        
        
        
        
        
        
        
        
         
        

	}

}
