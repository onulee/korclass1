package j0509;

import java.util.Scanner;

public class Class0509_06 {

	public static void main(String[] args) {
		int num = 5;
		//int result = ++num; //num을 1을 더해서 그 결과값을 result대입
		int result = num++;  //result에 먼저 값을 대입한 후 num을 1을 더함.
		System.out.println(result);
		
		String answer = (num>1)?"1보다 큽니다.":"1보다 작습니다.";
		System.out.println(answer);
		
		// 1개의 정수형을 입력받아 10보다 큰수인지 출력하시오.
		// 1.변수선언 2.입력 3.확인출력
		int input=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		String answer2 = (input>10)?"10보다 큽니다.":(input==10)?"10입니다.":"10보다 작습니다.";
		;
		System.out.println(answer2);
		
		
		// 정수를 입력받아 음수 양수로 양수면 음수로 변경하시오.
		System.out.println("음수는 양수로, 양수는 음수로 변경합니다. 숫자를 입력하세요.");
		input = scan.nextInt();
		int result2 = (input>0)?-input:input;
		System.out.println("결과값 : "+result2);
		
		
		
	}

}
