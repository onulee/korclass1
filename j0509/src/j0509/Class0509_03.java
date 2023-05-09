package j0509;

import java.util.Scanner;

public class Class0509_03 {

	public static void main(String[] args) {
		double kor = 0;
		int eng = 90;
		int math = 89;
		String name="홍길동";
		
		//데이터 입력 Scanner - 화면에서 입력을 받음.
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		name = scan.next(); //너무 좋아요
		//name = scan.nextLine(); //너무 좋아요 함께 해요.
		System.out.println("국어점수를 입력하세요.");
		kor = scan.nextDouble();
		System.out.println("영어점수를 입력하세요.");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		math = scan.nextInt();
		
		double total = kor+eng+math;
		double avg = total/3.0;
		System.out.println("-------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("-------------------------------------------");
		System.out.printf("%s\t%.1f\t%d\t%d\t%.1f\t%.2f\n",name,kor,eng,math,total,avg);

		
		
	}

}
