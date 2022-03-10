package Testing;



public class Testinj {
	
	public void display() {
		System.out.println("Automation testing");
	}
  
	public int add(int a,int b) {
		return a+b;
	}	
	
	public double add(int a,int b,double c) {
		return a+b+c;
	}
	
    public double add(double a,double b) {
    	return a+b;
		
	}
    
    public static void main(String[] args) {
    	Testinj a = new Testinj();
    	a.display();
    	System.out.println(a.add(30, 40));
    	System.out.println(a.add(20, 60, 2.555));
    	System.out.println(a.add(2.33, 4.55));
    			
		
	}
}
