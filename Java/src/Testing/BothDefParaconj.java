package Testing;



public class BothDefParaconj {

	
	String name;
	int money;
	
	BothDefParaconj(){
		
		this.name = "ram" ;
		this.money = 2249;
	}
  
	BothDefParaconj(String name,int money){
		this.name = name;
		this.money = money;
	
		
	}
	



public static void main(String[] args) {
	    BothDefParaconj a = new BothDefParaconj();
	    System.out.println(a.money);
	    System.out.println(a.name);
	    
	    BothDefParaconj aa = new BothDefParaconj("Ram", 2000);
	    System.out.println(aa.money);
	    System.out.println(aa.name);
}
}
