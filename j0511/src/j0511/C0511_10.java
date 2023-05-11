package j0511;

import java.util.Scanner;

public class C0511_10 {

	public static void main(String[] args) {
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 0. 프로그램종료
		Scanner scan = new Scanner(System.in);
		int input=0; //번호선택변수
		int count=0; //입력된 학생수
		//성적입력 변수
		String[] name = new String[10];
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] math = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		
		while(true) {
			System.out.println("[성적처리프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("---------------");
			System.out.println("원하는 번호를 입력하세요.");
			input = scan.nextInt();
			
			switch(input) {
			
			case 1: //성적입력
				for(int i=count;i<name.length;i++) {
					System.out.println((count+1)+"번째 이름을 입력하세요.(0.이전페이지이동)");
					name[i] = scan.next();
					if(name[i].equals("0")) {
						System.out.println("이전페이지로 이동합니다.");
						System.out.println();
						break;
					}
					System.out.println("국어점수를 입력하세요.");
					kor[i] = scan.nextInt();
					System.out.println("영어점수를 입력하세요.");
					eng[i] = scan.nextInt();
					System.out.println("수학점수를 입력하세요.");
					math[i] = scan.nextInt();
					//자동계산
					total[i] = kor[i]+eng[i]+math[i];
					avg[i] = total[i]/3.0;
					count++;
				}//for
				
				break; //switch
			case 2:
				//출력
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("-----------------------------------------");
				for(int i=0;i<count;i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
				}
				
				break;
				
			}//switch
			
		}//while
		
		
		
		

	}

}
