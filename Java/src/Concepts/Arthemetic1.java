package Concepts;

public class Arthemetic1 {
	
	int a = 60;
	int b = 30;
	
	public int add() {
		return a+b;
	}
	public int sub() {
		return a-b;
	}
	public int mul() {
		return  a*b;
	}
	public int div() {
		return  a/b;
	}
	public static void main(String[] args) {
		Arthemetic1 a = new Arthemetic1();
	System.out.println(a.add());
	System.out.println(a.sub());
	System.out.println(a.mul());
	System.out.println(a.div());
	
	}
	
	
}
