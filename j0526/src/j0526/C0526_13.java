package j0526;

import java.util.Scanner;

public class C0526_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String lotto1 = "1";
		
		int random = (int)(Math.random()*10); //0-9
		int random2 = (int)(Math.random()*100000); //0-99999
		String strRandom = String.format("%05d",random2); //00000,09999,99999
		System.out.println(random);
		System.out.println(strRandom);
		System.out.println("조앞의 숫자와 5자리 숫자를 입력하세요.(예:1조12587)");
		String strNum = scan.next(); //1조12587
		
		//String strNum2 = strNum.substring(0,1);
		int myNum = Integer.parseInt(strNum.substring(0,1)); // 입력받은 문자열 1을 숫자1로 변경
		System.out.println("[ 조단위 ]");
		if(random==myNum) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		
		//5자리 확인
		String myNum2 = strNum.substring(2,3);
		String strRandom2 = strRandom.substring(0,1);
		System.out.println("[ 5자리 숫자 비교 ]");
		if(myNum2.equals(strRandom2)) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		

	}

}
