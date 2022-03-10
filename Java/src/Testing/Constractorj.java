package Testing;

public class Constractorj {
	
	String name;
	int money;
	
	Constractorj(){//default contractor
		this.name = "ram";
		this.money= 2290;
			}
	Constractorj(String name,int money){//parameterized contractor
		this.name = name;
		this.money = money;
	}
	
public static void main(String[] args) {//default contractor
	 Constractorj a = new Constractorj();
	 System.out.println(a.name);
	 System.out.println(a.money);
	 

	Constractorj aa = new Constractorj("pratham", 2280);//Parameterized contractor
	System.out.println(aa.name);
	System.out.println(aa.money);
}
}
