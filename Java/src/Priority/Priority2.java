package Priority;

import org.testng.annotations.Test;

public class Priority2 {
	
	public class Priority1 {
		@Test(priority=2)
	public void apple() {
		System.out.println("333");
		}
		@Test(priority=3)
	public void carrot() {
		System.out.println("111");
		}

	@Test(priority=0)
	public void mango() {
		System.out.println("222");
		}

	@Test(priority=4)
	public void peas() {
		System.out.println("555");
		}

		@Test(priority=1)		
	public void beans() {
		System.out.println("888");
		}
			
	}
	}
