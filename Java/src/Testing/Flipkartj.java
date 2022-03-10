package Testing;

public class Flipkartj extends Facebookj{

	public static void main(String[] args) {
		Flipkartj s = new Flipkartj();
		s.LaunchBrowser();
		s.NavigateURL("https://facebook.com/");
		System.out.println(s.getTitle());
		System.out.println(s.getCurrentURL());
		System.out.println("//////////////////////////////////");
		s.LaunchBrowser();
		s.NavigateURL("https://google.com/");
		System.out.println(s.getTitle());
		System.out.println(s.getCurrentURL());
		System.out.println("//////////////////////////////////");
		s.LaunchBrowser();
		s.NavigateURL("https://amazon.com/");
		System.out.println(s.getTitle());
		System.out.println(s.getCurrentURL());
		System.out.println("//////////////////////////////////");
		s.LaunchBrowser();
		s.NavigateURL("https://flipkart.com/");
		System.out.println(s.getTitle());
		System.out.println(s.getCurrentURL());
		
		
		
		
		
	}

}
