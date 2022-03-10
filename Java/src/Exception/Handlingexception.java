package Exception;

import org.testng.annotations.Test;

public class Handlingexception {
	@Test
	public void smaple() {
try {
	int x = 30/0;
}
catch(ArithmeticException e) {
	System.out.println("automation");
	}
}}