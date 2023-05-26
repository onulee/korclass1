package j0526;

import java.util.Scanner;

public class C0526_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String lotto1 = "1";
		//String lotto2 = "1조12587";
		// 1-9조 00000-99999
		// 0-9 랜덤숫자를 맞추는 게임을 구현하시오.
		
		int random = (int)(Math.random()*10);
		//System.out.println(random);
		System.out.println("조의 앞자리 숫자를 입력하세요.");
		String strNum = scan.next(); //1조12587
		//String strNum2 = strNum.substring(0,1);
		int myNum = Integer.parseInt(strNum.substring(0,1)); // 입력받은 문자열 1을 숫자1로 변경
		
		if(random==myNum) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		
		

	}

}
