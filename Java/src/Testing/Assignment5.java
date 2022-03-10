package Testing;

public class Assignment5 extends Facebookj{
	public void display() throws InterruptedException {
	
	
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Assignment5 ff = new Assignment5();
		ff.LaunchBrowser();
		ff.NavigateURL("https://stqatools.com/");
		System.out.println("title of the page"+ff.getTitle());
        System.out.println("title of the currenturl"+ff.getCurrentURL());
        ff.display();
	}

}
