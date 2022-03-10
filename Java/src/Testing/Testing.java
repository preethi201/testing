package Testing;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Testing extends Sample{
	
	public void Searchdata() {
	
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("testing"+Keys.ENTER);
	}
	
	public static void main(String[] args) {
		
	Testing s = new Testing();
	s.Launchbrowser();
	s.Searchdata();

		
	}

}
