package j0510;

import java.util.Scanner;

public class C0510_03 {

	public static void main(String[] args) {
		
		// m,f문자로 입력받다 m이면 남자입니다. f이면 여자입니다. 출력하시오.
		//1.변수선언 2.scan 한후 변수입력받음 3.비교 4.출력
		String input = ""; //객체, 기본형타입만 ==
		Scanner scan = new Scanner(System.in);
		System.out.println("영문자를 입력하세요.");
		input = scan.next(); //문자열을 입력받음.
		if(input.equals("m") || input.equals("M")) {
			System.out.println("남자입니다.");
		}else if(input.equals("f") || input.equals("F")) {
			System.out.println("여자입니다.");
		}else {
			System.out.println("다른 문자를 입력하셨습니다. 다시 입력하세요.");
		}
		
		
		
		// 입력한 숫자가 1,6,9만 입력받아 1,6,9 출력하시오.
		// if() else if() else
//		int input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		input = scan.nextInt();
//		if(input==1) {
//			System.out.println("1입니다.");
//		}else if(input==6) {
//			System.out.println("6입니다.");
//		}else {
//			System.out.println("9입니다.");
//		}
		
		
		// 점수를 입력받아 60점이상이면 합격, 60점미만이면 불합격을 출력하시오.
		//1.변수선언 2.scan 한후 변수입력받음 3.비교 4.출력
//		int input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//		input = scan.nextInt();
//		if(input>=60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}//if

		
		
	}//main
}//class
