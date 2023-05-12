package j0512;

import java.util.Scanner;

public class C0512_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1차원배열
//		int[] num = new int[3];
//		for(int i=0;i<num.length;i++) {
//			System.out.println("점수를 입력하세요.");
//			num[i] = scan.nextInt();
//		}
//		
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}

		//2차원 배열
		int[][] score = new int[3][4];
		//입력
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				
				System.out.println("2차원 점수를 입력하세요.");
				score[i][j] = scan.nextInt();
			}
		}
		
		//출력
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
