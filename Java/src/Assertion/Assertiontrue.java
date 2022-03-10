package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertiontrue {
	@Test
  public void display() {
	  String a ="1223";
	  Assert.assertTrue(a.contains("1223"));
  }
}
