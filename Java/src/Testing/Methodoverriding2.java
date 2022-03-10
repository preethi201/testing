package Testing;



public class Methodoverriding2 extends Methodoverriding1{
	
	public void display() {
		super.display();//come from parent class	
		
		System.out.println("Tesing");
		
	}
      
	public static void main(String[] args) {
		Methodoverriding2 a = new Methodoverriding2();
		a.display();
	}
}
