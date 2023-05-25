package j0525;

import java.util.ArrayList;

public class C0525_02 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<>();
		
		//퀴즈1 - 1,13
//		for(int i=0;i<13;i++) {
//			list.add(new Card(Card.kinds[0],i+1));
//		}
		
		//퀴즈2 - 카드 4개를 만들어서, 4가지 종류, 숫자는 1로 넣으시오.
//		for(int i=0;i<4;i++) {
//			list.add(new Card(Card.kinds[i],1));
//		}
		
		//퀴즈3 - 카드 52장을 만들어서 SPACE-13장, HAERT-13장,DIAMOND-13장,CLOVER-13장, 
		//       숫자로 1로 넣으시오. /13, %13
		//0/13=0 1/13=0,2/13=0...12/13=0,13/13=1,14/13=1......25/13=1
		for(int i=0;i<52;i++) {
			list.add(new Card(Card.kinds[i/13],1));
		}
		
		
		//출력
		for(int i=0;i<52;i++) {
			System.out.println
			//(list.get(i).kind+","+list.get(i).number);
			(list.get(i).kind+","+Card.numbers[list.get(i).number]);
		}
		
		
		

	}

}
