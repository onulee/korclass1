package j0518;

import java.util.Scanner;

public class C0518_06 {

	public static void main(String[] args) {
		// 국어,영어,수학 입력받아 평균점수 90점이상 A, 80 B,C,D,F
		// 97점이상 A+, 93 A-, 87점이상 B+, 83점이하 B-,....
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		if(avg>=90) {
			System.out.print("A");
			if(avg>=97) {
				System.out.println("+");
			}else if(avg<=93) {
				System.out.println("-");
			}
		}else if(avg>=80) {
			System.out.println("B");
			if(avg>=87) {
				System.out.println("+");
			}else if(avg<=83) {
				System.out.println("-");
			}
		}else if(avg>=70) {
			System.out.println("C");
			if(avg>=77) {
				System.out.println("+");
			}else if(avg<=73) {
				System.out.println("-");
			}
		}else if(avg>=60) {
			System.out.println("D");
			if(avg>=67) {
				System.out.println("+");
			}else if(avg<=63) {
				System.out.println("-");
			}
		}else {
			System.out.println("F");
		}
		
		
//		int[] num = new int[3];
//		String[] title = {"국어","영어","수학"};
//		for(int i=0;i<3;i++) {
//			System.out.println(title[i]+" 점수를 입력하세요.");
//			num[i] = scan.nextInt();
//		}
		

	}

}
