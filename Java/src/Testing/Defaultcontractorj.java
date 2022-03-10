package Testing;



public class Defaultcontractorj {
	String name ;
	int money;

	
	Defaultcontractorj(){
		this.name = "Ram";
		this.money = 24000;
	}
	
	public static void main(String[] args) {
		Defaultcontractorj a = new Defaultcontractorj();
		System.out.println(a.name);
		System.out.println(a.money);
		
	}
		
	}
	


