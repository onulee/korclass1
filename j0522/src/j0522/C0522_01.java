package j0522;

import java.util.Scanner;

public class C0522_01 {

	//기본변수를 사용 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 두수의 입력받아, 더하기,빼기,곱하기,나누기
		// 생성자를 활용
		
		System.out.println("1번째 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		
		System.out.println("2번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
		
		int data1 = num1+num2;
		System.out.println(data1);
		int data2 = num1-num2;
		System.out.println(data2);
		int data3 = num1*num2;
		System.out.println(data3);
		int data4 = num1/num2;
		System.out.println(data4);
		
		System.out.println("1번째 숫자를 입력하세요.");
		int num3 = scan.nextInt();
		
		System.out.println("2번째 숫자를 입력하세요.");
		int num4 = scan.nextInt();
		
		int data5 = num3+num4;
		System.out.println(data5);
		int data6 = num3-num4;
		System.out.println(data6);
		int data7 = num3*num4;
		System.out.println(data7);
		int data8 = num3/num4;
		System.out.println(data8);
		
		
		

	}

}
