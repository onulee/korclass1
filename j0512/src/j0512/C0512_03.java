package j0512;

import java.util.Scanner;

public class C0512_03 {

	public static void main(String[] args) {
		// 로또 프로그램
		//1. 배열생성
		Scanner scan = new Scanner(System.in);
		int random=0; //랜덤번호
		int temp = 0; //임시저장변수
		int count = 0; //당첨번호개수
		int[] myNum = new int[6];  //입력번호
		int[] lottoNum = new int[6]; //당첨번호
		int[] lotto = new int[45]; //로또번호
		
		//2. 로또번호생성
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1; //1,2,3,.....45
			//lotto[i] = (int)(Math.random()*45)+1;
		}
			
		//3. 번호섞기
		for(int i=0;i<1000;i++) {
			random = (int)(Math.random()*45); //0-44 랜덤번호
			temp =  lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		
		//4. 로또번호 입력
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째 로또번호를 입력하세요.");
			myNum[i] = scan.nextInt();
		}
		
		//5. 로또번호확인
		for(int i=0;i<6;i++) { //lotto배열
			for(int j=0;j<6;j++) { //myNum배열
				if(lotto[i]==myNum[j]) {
					//count 1증가
					lottoNum[count] = lotto[i]; //당첨번호 넣기
					count++; //당첨개수 증가
					continue;
				}
			}
		}
		
		//6. 로또번호출력
		System.out.print("로또번호 자동생성 : ");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		
		//7. 입력번호출력
		System.out.print("입력번호 : ");
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
		
		//당첨개수
		System.out.println("당첨 개수 : "+count);
		
		

	}

}
