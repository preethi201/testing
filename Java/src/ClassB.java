
public class ClassB extends ClassA {

	int  z=30;
	int  u=60;
	
	public void Show() {
		System.out.println("testing concepts");
		
	}
	
	
	public static void main(String[] args) {

	ClassB b = new ClassB();
    System.out.println(b.u);
    System.out.println(b.z);		
    b.Show();	
	System.out.println(b.a);
	System.out.println(b.b);
	b.display();

	}

}
