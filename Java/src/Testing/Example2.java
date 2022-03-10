package Testing;

public abstract class Example2 extends Example1 {
	
	abstract void chaun();
	abstract void fun();
	
	
	void show() {
		System.out.println("method1");
		}

	void test() {
		System.out.println("method2");
		
		}
	
	static class Example3 extends Example2 {
		
	void chaun() {
		System.out.println("gun");
	
	}
	
	void fun() {
		System.out.println("chain");
		
		}
	}
	
	public static void main(String[] args) {
		Example3 a = new Example3();
		a.show();
		a.test();
		a.display();
		a.chaun();
		a.fun();
		
	}

}
