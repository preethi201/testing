import static org.apache.commons.io.FilenameUtils.concat;

public class Programdata {
	int result=0;
	
	public String exe(String a,String b) {
		return concat(a,b);
		
	}
	
	public int add1(int d) {
		return d;
		}
	public float add11(float s) {
		return s;
		}
	public double add12(double z) {
		return z;
		}
	
	public static void main(String[] args) {
		Programdata a = new Programdata();
		System.out.println(a.add1(20));
		System.out.println(a.add11(0.123f));
		System.out.println(a.add12(1.234));
		System.out.println(a.exe("selenium", "testing"));
	}
	
	
	
	
	
	
	
	

	 

	}


