package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Method {
	@BeforeTest
	public void display() {
		System.out.println("automation");
	}
	@BeforeClass
	public void change() {
		System.out.println("selenium");
	}
	@BeforeMethod
	public void display1() {
		System.out.println("auto");
	}
	@Test
	public void chain() {
		System.out.println("lens");
	}
	
	@Test
	public void play() {
		System.out.println("notation");
	}
	@AfterMethod
	public void play5() {
		System.out.println("foudation");
		}
	@AfterClass
	public void play6() {
		System.out.println("champion");
		}
	@BeforeGroups
	public void play8() {
		System.out.println("championship");
		}
	
}
