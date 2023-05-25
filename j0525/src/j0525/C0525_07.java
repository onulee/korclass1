package j0525;

import java.util.Scanner;

public class C0525_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			int num1 = scan.nextInt();
			System.out.println("숫자를 입력하세요.");
			int num2 = scan.nextInt();
			try {
				System.out.println("나누기 : "+(num1/num2));
			} catch (Exception e) {
				System.out.println("프로그램에 오류가 있어 다시 실행됩니다.");
				e.printStackTrace();
			} 
		}

	}

}
