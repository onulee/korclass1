package j0517;

import java.util.Scanner;

public class C0517_05 {

	public static void main(String[] args) {
		// 3개의 수를 입력받아, 평균 합격/불합격을 출력하시오.
		Scanner scan = new Scanner(System.in);
		//객체선언
		C0517_05 c = new C0517_05();
		int[] num = new int[3];
		
		String result="";
		
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"숫자를 입력하세요.");
			num[i] = scan.nextInt();
		}//3번만 입력 - 10 20 30 , 90 90 80
		result = c.average(num[0], num[1], num[2]);
		System.out.println("합격여부 : "+result);
		
	}//main
	
	String average(int a,int b,int c) {
		String result = "";
		if(((a+b+c)/3.0)>=60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		return result;
	}

}
