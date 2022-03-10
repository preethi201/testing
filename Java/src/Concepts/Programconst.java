package Concepts;

public class Programconst {
	
	int a;
	float b;
	
	Programconst(){
		
		this.a=20;
		this.b=0.123f;
	}
	
	Programconst(int a,float b){
		this.a=a;
		this.b=b;
		
	}
	

	public static void main(String[] args) {
		Programconst l= new Programconst();
		System.out.println(l.a);
		System.out.println(l.b);

		Programconst ll = new Programconst(30,0.83f);
		System.out.println(ll.a);
		System.out.println(ll.b);


	}

}
