package j0509;

import java.util.Scanner;

public class Class0509_04 {

	public static void main(String[] args) {
		// 아이디,패스워드,이름을 입력받아 출력하시오.
		// 문자열,정수형,문자열
		// --------------------------
		// 아이디   패스워드   이름
		//--------------------------
		// abcd   1111     홍길동
		
		//1. 변수선언
		String id = "";
	    String pw = "";
		String name ="";
		
		//2.Scanner - 입력클래스
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		id = scan.nextLine();  
		System.out.println("패스워드를 입력하세요.");
		pw = scan.nextLine();
		//scan.nextLine(); //nextInt() enter키를 입력으로 사용
		System.out.println("이름을 입력하세요.");
		name = scan.nextLine();
		
		//3.출력
		System.out.println("-----------------------------------------");
		System.out.println("아이디\t패스워드\t이름");
		System.out.println("-----------------------------------------");
		System.out.printf("%s\t%s\t%s \n",id,pw,name);
		

	}

}
