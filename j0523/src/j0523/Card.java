package j0523;

public class Card {
	
	static String[] shape= {"Space","Heart","Diamond","Clover"};
	
	String kind; //무늬 - 4가지 Space,Heart,Diamond,Clover
	int number;  //숫자 - 1,2,3,4,5,6,7,8,9,10,11-J,12-Q,13-K
	
	Card(){}
	
	Card(String kind){
		this.kind = kind;
	}
	
	Card(String kind,int number){
		this.kind = kind;
		this.number = number;
	}

}
