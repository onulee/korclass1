package j0517;

import java.util.Scanner;

public class C0517_02 {

	public static void main(String[] args) {
		C0517_02 c = new C0517_02();
		Scanner scan = new Scanner(System.in);
		int num1 = 10;
		int num2 = 5;
		
		//객체선언
		//클래스명 참조변수명 = new 클래스명();
		//Card c1 = new Card();
		//두수를 입력받아 더하기 결과값을 출력하시오.
//		System.out.println("1번째 숫자를 입력하세요.");
//		num1 = scan.nextInt();
//		System.out.println("2번째 숫자를 입력하세요.");
//		num2 = scan.nextInt();
		
		int[] num = new int[2];
		for(int i=0;i<2;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			num[i] = scan.nextInt();
		}
		//더하기,빼기,곱하기,나누기 메소드 호출
		int result1 = c.add(num[0],num[1]);
		int result2 = c.sub(num[0],num[1]);
		int result3 = c.multi(num[0],num[1]);
		int result4 = c.div(num[0],num[1]);
		System.out.println("두수의 더하기 : "+result1);
		System.out.println("두수의 빼기 : "+result2);
		System.out.println("두수의 곱하기 : "+result3);
		System.out.println("두수의 나누기 : "+result4);

	}
	
	//더하기 메소드
	int add(int num1,int num2) {
		int result = num1 + num2;
		return result;
	}
	
	//빼기 메소드 sub
	int sub(int num1,int num2) {
		int result = num1 - num2;
		return result;
	}
	
	//곱하기 메소드 multi
	int multi(int num1,int num2) {
		int result = num1 * num2;
		return result;
	}
	//나누기 메소드 div
	int div(int num1,int num2) {
		int result = num1 / num2;
		return result;
	}

}
