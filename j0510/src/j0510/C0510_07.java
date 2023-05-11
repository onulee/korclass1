package j0510;

import java.util.Scanner;

public class C0510_07 {

	public static void main(String[] args) {
		
		//숫자를 입력받아 같은 값일경우 당첨 그렇지 않으면 꽝 출력하시오.
		int random = (int)(Math.random()*3)+1; //1,2,3
		int input=0;
		
		Scanner scan = new Scanner(System.in);
		//1.
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		
		if(input==random) {
			System.out.println("당첨입니다.");
		}else {
			System.out.println("꽝입니다.");
		}
		
		//2.
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		
		if(input==random) {
			System.out.println("당첨입니다.");
		}else {
			System.out.println("꽝입니다.");
		}
		
		//3.
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		
		if(input==random) {
			System.out.println("당첨입니다.");
		}else {
			System.out.println("꽝입니다.");
		}
		
		System.out.println("랜덤숫자 : "+random);
		System.out.println("입력숫자 : "+input);
		
		
		//랜덤숫자
		//System.out.println((int)(Math.random()*10)+1);
		
		// 랜덤숫자
//		int random = 0;
//		random =(int)(Math.random()*5)+1; //
//		System.out.println(random);
		
		

	}

}
