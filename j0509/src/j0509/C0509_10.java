package j0509;

import java.util.Scanner;

public class C0509_10 {

	public static void main(String[] args) {
		//double num = 564.124586 소수점 3자리 절사 2자리까지 존재
		
		
		// 실수 소수점자리 7자리까지 입력받아, 소수점 4자리까지만 출력하시오. 
		// 1.변수선언 2.입력 3.출력
		double num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("실수를 입력하세요.");
		num = scan.nextDouble();
		double result = (int)(num*10000)/10000.0;
		System.out.println(result);
		
		
		
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0;
//		System.out.println(result);

	}

}
