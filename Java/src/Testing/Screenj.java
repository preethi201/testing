package Testing;

public class Screenj extends Additionj{
	
	public void testing123() {
		System.out.println("selenium");
	}
	public void testing12() {
			System.out.println("testing");	
		
	}
	public void testing1() {
		System.out.println("tool");
		
	}
	public static void main(String[] args) {
		Screenj s = new Screenj();
		System.out.println(s.add(50, 70));
        System.out.println(s.sub(60, 20, 10));
        System.out.println(s.mul(50, 50));
        System.out.println(s.div(150, 3));
        s.testing123();
        s.testing12();
        s.testing1();

	}

}
