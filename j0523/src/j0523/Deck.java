package j0523;

public class Deck {
	
	//52개 카드 생성
	Card[] c = new Card[52]; // 배열선언 ,  4종류 * 13 = 52장
	
	Deck() { //기본생성자
		for(int i=0;i<52;i++) {
			c[i] = new Card(); //객체선언 
			c[i].kind = c[i].shape[i/13];  // 0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1... 
			c[i].number = (i%13)+1;   //1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5......
		}//for
	}//Deck
	
	//카드뽑기 c[0]-Space,1 ,c[1],c[2],c[3].....c[51]
	Card pick(int index) { //0-51
		return c[index];
	}
	
	//카드 섞기
	void shuffle() {
		for(int i=0;i<1000;i++) {
			int random = (int)(Math.random()*51);
			
			//Card c = new Card();
			Card temp=null;
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}//shuffle
	
	
	
	

}
