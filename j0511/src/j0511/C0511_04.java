package j0511;

import java.util.Scanner;

public class C0511_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input=0,num1=0,num2=0,sum=0;
		
		loop:while(true) { //무한반복
			System.out.println("1.더하기");
			System.out.println("2.곱하기");
			System.out.println("0.종료");
			System.out.println("----------");
			System.out.println("원하는 번호를 입력하세요.");
			input = scan.nextInt();
			if(input==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			//조건문
			switch(input) {
			
			case 1:
				while(true) {
					System.out.println("첫번째 숫자를 입력하세요.(0.이전페이지,1:종료)");
					num1=scan.nextInt();
					if(num1==0) break;
					if(num1==1) break loop;
					System.out.println("두번째 숫자를 입력하세요.");
					num2=scan.nextInt();
					System.out.printf("결과값 : %d + %d = %d \n",num1,num2,num1+num2);
				}//while
				
			}
		}
		
		
		
		
//		loop:for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(j==6) break loop;
//				System.out.printf("%d*%d=%d\n",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
		//구구단 5단빼고 출력하시오.
//		for(int i=2;i<=9;i++) {
//			if(i%2!=0) continue;
//			for(int j=1;j<=9;j++) {
//				if(j%2==0) continue;
//				System.out.printf("%d*%d=%d\n",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
//		for(int i=0;i<=10;i++) {
//			if(i==5) {
//				continue;
//			}
//			System.out.println(i);
//			
//		}//for

	}//main

}
