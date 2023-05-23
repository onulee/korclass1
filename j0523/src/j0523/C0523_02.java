package j0523;

public class C0523_02 {

	public static void main(String[] args) {
		
		Card[] c = new Card[52]; //배열선언
		
		//Space,Heart,Diamond,Clover
		for(int i=0;i<52;i++) {
			c[i] = new Card(); //객체선언 
			c[i].kind = c[i].shape[i/13];  // 0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1... 
			c[i].number = (i%13)+1;   //1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5......
		}//for
		
		//출력하시오.
		for(int i=0;i<52;i++) {
			System.out.printf("%s,%d \n",c[i].kind,c[i].number);
		}//for

	}

}
