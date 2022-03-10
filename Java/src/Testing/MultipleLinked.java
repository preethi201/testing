package Testing;

import java.util.LinkedList;

public class MultipleLinked {

	public static void main(String[] args) {
		
		LinkedList<String> value = new LinkedList<String>();
		LinkedList<String> value1 = new LinkedList<String>();
		value.add("aa");
		value1.add("cc");
		value.add("bb");
		value1.add("ee");
		value.add("ff");
		value1.add("kk");
		
		System.out.println(value.size());
		System.out.println(value1.size());
		
		System.out.println(value);
		System.out.println(value1);
		
		value.add(2, "jj");
		System.out.println(value);//aa bb jj ff
		
		value1.add(1, "zz");
		System.out.println(value1);//cc zz ee kk
		
		value.remove(3);
		System.out.println(value);//aa bb jj
		
		value1.remove(0);
		System.out.println(value1);//zz ee kk
		
		System.out.println(value.get(0));
		System.out.println(value1.get(2));
		
		value.addAll(value1);
		System.out.println(value);
		
		
	}

	}


