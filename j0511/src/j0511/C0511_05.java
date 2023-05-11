package j0511;

import java.util.Scanner;

public class C0511_05 {

	public static void main(String[] args) {
		//
		// 1. 랜덤숫자 생성
		// 2. 숫자맞추기 10까지 사용할수 있도록
		// 0. 종료
		
		//숫자맞추기 프로그램
		
		Scanner scan = new Scanner(System.in);
		int random=0,input=0,num=0,count=0;
		
		while(true) {
			System.out.println("[숫자맞추기 프로그램]");
			System.out.println("1. 랜덤숫자 생성");
			System.out.println("2. 숫자맞추기 게임");
			System.out.println("3. 종료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요.");
			input = scan.nextInt();
			
			switch(input) {
			
			case 1:
				//1~100까지 랜덤숫자 생성
				random = (int)(Math.random()*100)+1;
				System.out.println("랜덤숫자 : "+random);
				System.out.println("랜덤숫자가 생성되었습니다.!!");
				break;
			case 2:
				
				while(true) {
					//count
					if(count>=3) {
						System.out.println("3번 도전했습니다.");
						System.out.println("정답 : " + random);
						break;
					}
					System.out.printf("1~100까지의 숫자를 입력하세요.(%d번째 도전) \n",count+1);
					input = scan.nextInt();
					if(input==random) {
						System.out.println("정답입니다.");
						break;
					}else {
						System.out.println("오답입니다.");
					}
					count++; //1씩증가
				}//while
				break;
			
			
			}
			
			
		}//while
	}//main

}//class
