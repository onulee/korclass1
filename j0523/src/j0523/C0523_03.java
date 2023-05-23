package j0523;

import java.util.Date;
import java.util.Scanner;
public class C0523_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Date today = new Date();
		final int NUMBER = 1;
		Card c = new Card("Space",1);
		
		Card c2 = null;
		Deck d1 = new Deck();
		
		//c2 = d1; //타입이 다르기에 넣을수 없슴.
		
		Object o = null;
		
		o = d1;  //조상과 자손이라는 관계가 맺어져서 가능함.
		
		c2 = c; //같은 타입이면 넣을수 있슴.
		
		int a = 5;
		String str = null;
		//str = a; //타입이 다르기에 넣을수 없음
		
		System.out.println(c);
		
		int num = 5;
		num=10;
		
		//NUMBER=5;  //상수는 대문자로 씀
		
		
	}//main
	
	static void add() {
		
	}
	
	static void add(int x) { //오버로딩 : 다른메소드가 됨.
		
	}

}
