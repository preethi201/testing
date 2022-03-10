package Testing;

public class Methodoverloading {
	
	public void add() {
		System.out.println("Automation");
		}

	public int add(int a,int b) {
		return a+b;
		}
	
	public double add(int a,double b,int c) {
		return a+b+c;
		}
	
	public int add(int a,int b,int c) {
		return a+b+c;
		}
	
	public double add(double a ,double b) {
		return a+b;
		}
	
	public static void main(String[] args) {
		Methodoverloading a = new Methodoverloading();
		a.add();
	    System.out.println(a.add(30, 20));
	    System.out.println(a.add(20, 2.333, 20));
	    System.out.println(a.add(20, 49, 50));
	    System.out.println(a.add(3.44, 4.55));
	}
	
	
	}


