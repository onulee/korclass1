package j0509;

import java.util.Scanner;

public class Class0509_08 {

	public static void main(String[] args) {
		
//		byte a = 10;
//		byte b = 20;
//		int c = a+b;
		
		int a = 1000000;
		int b = 2000000;
		long c = (long)(a) * b;
		System.out.println(c);
		
		
		
		//대문자 입력시 소문자로 출력하시오.
		//1. 변수선언 2.입력 3.출력
		char ch =' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("대문자를 입력하세요.");
		ch = scan.next().charAt(0); //문자열에 첫번째 문자를 가져옴.
		char ch2 = (char)(ch+32); //대문자로 치환
		System.out.println("입력한 대문자 : "+ch);
		System.out.println("변환된 문자 : "+ch2);
		
		//소문자를 입력받아 대문자로 출력하시오.
		System.out.println("소문자를 입력하세요.");
		char ch3 =' ';
		ch3 = scan.next().charAt(0); //문자열에 첫번째 문자를 가져옴.
		char ch4 = (char)(ch3-32);
		System.out.println("입력한 소문자 : "+ch3);
		System.out.println("변환된 문자 : "+ch4);
		
		
		
//	    char ch ='A';
//	    int num = ch+1;
//	    System.out.println((char)num);
		
		
		//이항연산자
//		int num= 10;
//		double num2 = 10;
//		double num3 = num+num2;
//		System.out.println();
		
		
		
		//1.변수선언 2.입력 3.출력
//		int input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		input = scan.nextInt();
//		String result = (input%2==0)?"짝수입니다.":"홀수입니다.";
//		System.out.println(result);

	}

}
