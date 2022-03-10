package Concepts;

public class Inhertance2 extends  Inheritance{
	int z = 10;
	int x= 20;
	
	public void sample() {
		System.out.println("testing");
	}

	public static void main(String[] args) {
		Inhertance2 a = new Inhertance2();
		System.out.println(a.z);
		System.out.println(a.x);
		a.sample();
		System.out.println(a.a);
System.out.println(a.b);

	}

}
