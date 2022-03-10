package Invocation;

import org.testng.annotations.Test;

public class Sample {

	@Test(invocationCount=13)
	public void display() {
		System.out.println("selenium program");
	}
}
