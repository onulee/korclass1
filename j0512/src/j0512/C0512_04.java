package j0512;

import java.util.Scanner;

public class C0512_04 {

	public static void main(String[] args) {
		//변수선언
		Scanner scan = new Scanner(System.in);
		int temp = 0;   //임시저장변수
		int random = 0; //랜덤변수
		int count = 0;  //당첨개수
		
		//1. 배열생성 - 45개
		int[] lotto = new int[45]; //로또번호
		int[] myNum = new int[6];  //나의입력번호
		int[] lottoNum = new int[6]; //당첨번호
		
		//2. 로또번호생성
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		
		//3. 로또번호섞기
		for(int i=0;i<1000;i++) {
			random = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		
		//4. 로또번호입력
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째 번호를 입력하세요.");
			myNum[i] = scan.nextInt();
		}
		
		//5. 로또번호 당첨개수확인
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotto[i]==myNum[j]) {
					lottoNum[count] = lotto[i];
					count++; //당첨개수 증가
				}
			}
		}//for
		
		//6. 로또번호출력
		System.out.print("6개 로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		//7. 입력번호출력
		System.out.print("6개 입력번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(myNum[i]+" ");
		}
		System.out.println();
		
		//8. 당첨번호출력
		System.out.print("당첨번호 : ");
		for(int i=0;i<count;i++) {
			System.out.print(lottoNum[i]+" ");
		}
		System.out.println();
		
		//9. 당첨개수출력
		System.out.println("당첨개수 : "+count);
		
		

	}

}
