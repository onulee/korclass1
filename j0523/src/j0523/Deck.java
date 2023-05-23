package j0523;

public class Deck {
	
	//52개 카드 생성
	Card[] c = new Card[52]; // 배열선언 ,  4종류 * 13 = 52장
	
	Deck() { //기본생성자
		// kind=null, number=0; //space,1 space,2 space,3...clover 13;
		// space : 1-13, Heart-13장, Diamond-13장, Clover-13장
		
		int k=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[k] = new Card(Card.shape[i],j+1);
				k++;
			}
		}
	}//Deck

}
