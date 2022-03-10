package Testing;

import java.util.ArrayList;

public class Arrayint {

	public static void main(String[] args) {

		 ArrayList<	Integer> sports = new ArrayList<Integer>();
		    sports.add(33);
		    sports.add(44);
		    sports.add(77);
		    sports.add(88);
		    sports.add(99);
		    System.out.println(sports);
		    
		    System.out.println(sports.get(3));
		    System.out.println(sports.get(0));
		    System.out.println(sports.get(1));
		    System.out.println(sports.get(2));
		    
		    System.out.println(sports);
		    sports.remove(1);
		    System.out.println(sports);
			}

	}


