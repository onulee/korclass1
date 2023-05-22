package j0522;

import java.util.Scanner;

public class C0522_03 {

	// 기본생성자를 사용
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 두수의 입력받아, 더하기,빼기,곱하기,나누기
		// 생성자를 활용
		
		//배열선언
		Data[] d = new Data[100];
		//객체선언
		//Data d = new Data();
		
		for(int i=0;i<2;i++) {
			//객체선언
			d[i] = new Data();
			System.out.println("1번째 숫자를 입력하세요.");
			d[i].num1 = scan.nextInt();
			
			System.out.println("2번째 숫자를 입력하세요.");
			d[i].num2 = scan.nextInt();
			
			d[i].data1 = d[i].num1+d[i].num2;
			System.out.println(d[i].data1);
			d[i].data2 = d[i].num1-d[i].num2;
			System.out.println(d[i].data2);
			d[i].data3 = d[i].num1*d[i].num2;
			System.out.println(d[i].data3);
			d[i].data4 = d[i].num1/d[i].num2;
			System.out.println(d[i].data4);
			
			
			
		}
		

	}

}
