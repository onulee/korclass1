package j0511;

public class C0511_07 {

	public static void main(String[] args) {
		
		//10개의 배열을 만들고 랜덤숫자 1-10까지 숫자를 입력해서 출력하시오.
		int[] num = new int[10];
		for(int i=0;i<10;i++) {
			num[i] = (int)(Math.random()*10)+1;
			System.out.println(num[i]);
		}
		
		
		
		//배열100개를 만들고 1-100까지 숫자를 입력
//		int[] num = new int[100];
//		for(int i=0;i<100;i++) {
//			num[i] = i+1;
//			System.out.println(num[i]);
//		}
		
		
		
		// int 배열
//		int[] num = new int[2];
//		num[0]=1;
//		num[1]=2;
//		
//		for(int i=0;i<num.length;i++) { //0,1,2,3,4
//			System.out.println(num[i]);
//		}

	}

}
