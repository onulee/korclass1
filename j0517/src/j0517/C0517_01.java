package j0517;

public class C0517_01 {

	public static void main(String[] args) {
		//객체선언
		Card c1 = new Card();
		//사용방법 참조변수명.변수명
		c1.kind = "Heart";
		c1.number = 7;
		c1.width=500;
		c1.number = 25;
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		Card c3 = new Card();
		
		System.out.println("c1 카드종류 : "+c1.kind);
		System.out.println("c1 카드숫자 : "+c1.number);
		System.out.println("c1 가로길이 : "+Card.width);
		System.out.println("c1 세로길이 : "+Card.height);
		System.out.println("-----------------------");
		System.out.println("c2 카드종류 : "+c2.kind);
		System.out.println("c2 카드숫자 : "+c2.number);
		System.out.println("c2 가로길이 : "+Card.width);
		System.out.println("c2 세로길이 : "+Card.height);
		System.out.println("-----------------------");
		System.out.println("c3 가로길이 : "+Card.width);

	}

}


