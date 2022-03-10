package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Arithmetic {
	
	int a=20;
	int b=30;
	
	@BeforeClass
public void change() {
	System.out.println("dedication");
}
	
	@Test
	public void addition() {
     System.out.println(""+(a+b));
}
	@Test
	public void subtraction() {
System.out.println(""+(a-b));
	}
	@Test
	public void multiplication() {
System.out.println(""+(a*b));
	}
	@Test
	public void division() {
System.out.println(""+(a/b));
	}
	
	@BeforeSuite
	public void display() {
		
	}
	@BeforeMethod
	public void sample4() {
System.out.println("automation");
	}
	
	@AfterMethod
	public void sampl7() {
System.out.println("testig");
	}
	@AfterClass
	public void sample9() {
		System.out.println("runner");
			}
	

	}

	