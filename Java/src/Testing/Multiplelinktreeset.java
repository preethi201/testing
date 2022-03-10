package Testing;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Multiplelinktreeset {

	public static void main(String[] args) {

		LinkedHashSet<String> value= new LinkedHashSet<String>();
		TreeSet<String> value1= new TreeSet<String>();
		value.add("Akash");
		value.add("suma");
		value.add("latha");
		value.add("manu");
		value.add("suma");
		value1.add("Akash");
		value1.add("suma");
		value1.add("latha");
		value1.add("manu");
		value1.add("suma");
		
		value1.addAll(value);
		System.out.println(value1);
		
	}

}
