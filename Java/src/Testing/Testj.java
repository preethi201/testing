package Testing;

public class Testj extends Screenj {
   
	public void Show() {
		System.out.println("{{{{{{{{{{{{{{{{{{{[");
		
	}
	public static void main(String[] args) {
		
		Testj s = new Testj();
		System.out.println(s.add(40, 20));
		System.out.println(s.sub(80, 30, 20));
		System.out.println(s.div(60, 20));
		System.out.println(s.mul(20, 30));
		s.testing12();
		s.Show();
		

	}

}
