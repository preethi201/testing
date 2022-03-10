package Testing;



public class Additionj {
	
      int result;
	
	  public int add(int a,int b) {
	return	result = a+b;
	}
	  
	  public int sub(int a,int b,int c) {
		return	result = a-b;
		}
	  
	  
	  public int mul(int x,int y) {
		return	result =x*y;
		}
	  
	  
	  public int div(int z,int u) {
		return	result =z/u;
		
	  }
	  public static void main(String[] args) {
		  Additionj a = new Additionj();
		  System.out.println(a.add(20, 30));
		  System.out.println(a.sub(50, 20, 2));
		  System.out.println(a.mul(4, 8));
		  System.out.println(a.div(8, 4));
		
	

	}
}
