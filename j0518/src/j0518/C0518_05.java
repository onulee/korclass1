package j0518;

import java.util.Scanner;

public class C0518_05 {

	public static void main(String[] args) {
		// 숫자를 입력받아, 양수인지 음수인지 출력하시오. 0 은 양수로 인정
		// 국어,영어,수학 입력받아 평균 60을 넘으면 합격, 불합격 출력하시오.
		Scanner scan = new Scanner(System.in);
		
		int kor=0;
		int eng=0;
		int math=0;
		
		System.out.println("국어점수를 입력하세요.");
		kor = scan.nextInt(); //100
		System.out.println("영어점수를 입력하세요.");
		eng = scan.nextInt(); //100
		System.out.println("수학점수를 입력하세요.");
		math = scan.nextInt(); //100
		
		int total=kor+eng+math;
		double avg = total/3.0;
		
		if(avg>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		

	}

}
