package Testngformat;

import java.util.ArrayList;
import java.util.LinkedList;



public class Program6 {
	
	

	public static void main(String[] args) {
		ArrayList<String> value = new ArrayList<String>();
		value.add("aa");
		value.add("cc");
		System.out.println(value);
		
		LinkedList<Integer> values = new LinkedList<Integer>();
		values.add(20);
		values.add(30);
		values.add(10);
		System.out.println(values);
		
		System.out.println(value.get(0));
		System.out.println(values.get(1));
		values.add(0, 88);
		System.out.println(values);
		
		System.out.println(value.remove(1));
		

	}

}
