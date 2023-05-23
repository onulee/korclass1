package j0523;

public class C0523_02 {

	public static void main(String[] args) {
		
		Deck d = new Deck();
		
		
		//카드섞기
		d.shuffle();
		
		//카드뽑기 메소드 = d.pick(번호)
		//System.out.printf("%s, %d \n",d.pick(0).kind,d.pick(0).number);
		
		
		
		//출력하시오.
		for(int i=0;i<52;i++) {
			//System.out.printf("%s,%s \n",d.c[i].kind,Card.numbers[d.c[i].number]);
			System.out.printf("%s\n",d.c[i]);
		}//for

	}

}
