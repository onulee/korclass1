package j0511;

import java.util.Scanner;

public class C0511_09 {

	public static void main(String[] args) {
		//성적처리프로그램
		// 1.이름 2.국어 3.영어 4.수학 합계, 평균 자동으로 들어갈수 있도록 함
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		
		for(int i=0;i<name.length;i++) {
			System.out.println("이름을 입력하세요.");
			name[i] = scan.next();
			System.out.println("국어점수를 입력하세요.");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math[i] = scan.nextInt();
			//자동계산
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
			
		}
		
		//출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("-----------------------------------------");
		for(int i=0;i<name.length;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
		}
	
		

	}

}
