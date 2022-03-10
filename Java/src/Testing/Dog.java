package Testing;



public class Dog {
	
	String size;
	String breed;
	String color;
	int age;
	
	public String change() {
		return ("size is:"+size+" breed is :"+breed);
		
	}
	

	public String change1() {
		return ("size is:"+size+" breed is :"+breed);
		
	}
	
	
	
		public static void main(String[] args) {
			
			Dog a = new Dog();
			a.age=23;
			a.breed="lav";
			a.color="brown";
			a.size="small";
			
			System.out.println(a.change());
			
			Dog a1 = new Dog();
			a1.age=12;
			a1.breed="jow";
			a1.color="black";
			a1.size="big";
			System.out.println(a1.change1());
			
			
	}


			
		}
	


