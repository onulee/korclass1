package j0512;

import java.util.Scanner;

public class C0512_05 {

	public static void main(String[] args) {
		// 10진수를 2진수로 변경하는 프로그램
		Scanner scan = new Scanner(System.in);
		//                0       1       2      3     4     5    6    7    8    9
		String[] data = {"0000","0001","0010","0011","0100","0101","60","70","80","90"};
		int[] num = new int[5];
		
		//1. 숫자입력
		for(int i=0;i<5;i++){
			System.out.println("10진수를 입력하세요."); //5
			num[i] = scan.nextInt();
			//int num = scan.nextInt();
			//System.out.println((data[num]));
		}
		//2. 2진코드 출력
		for(int i=0;i<5;i++) {
			System.out.print(data[num[i]]+" "); //출력
		}
		System.out.println();
		
		
		
		
		
		


	}

}
