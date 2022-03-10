package Testing;

import java.util.ArrayList;

public class Arraylist {
	

	
	public static void main(String[] args) {
		ArrayList<String> sports = new ArrayList<String>();
	     sports.add("cricket");
	     sports.add("basketball");
	     sports.add("tennies");
	     sports.add("cricket");
	     sports.add("vallyball");
	     sports.add("vallyball");
	     System.out.println(sports);
	     
	     
	     System.out.println(sports.get(3));
	     System.out.println(sports.get(5));
	     System.out.println(sports.get(0));
	     System.out.println(sports.get(1));
	     System.out.println(sports.get(2));
	     System.out.println(".......................");
	     System.out.println(sports);
	     sports.remove(1);
	     System.out.println(".........................");
	     System.out.println(sports);
	     
	  
	}

}
