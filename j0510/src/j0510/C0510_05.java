package j0510;

import java.util.Scanner;

public class C0510_05 {

	public static void main(String[] args) {
		
		//점수를 입력받아, 90점이상이면 A, 80점이상이면 B, 70-C,60-D, F
		// 97점이상 A+, 93이하 A-, 87점이상 B+, 83이하 B-
		
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		score = scan.nextInt();
		
		if(score>=90) { //90,91,92...100
			System.out.print("A");
			if(score>=97) {
				System.out.println("+");
			}else if(score<=93) {
				System.out.println("-");
			}
		}else if(score>=80) { //80,81,82...89
			System.out.print("B");
			if(score>=87) {
				System.out.println("+");
			}else if(score<=83) {
				System.out.println("-");
			}
		}else if(score>=70) {
			System.out.print("C");
			if(score>=77) {
				System.out.println("+");
			}else if(score<=73) {
				System.out.println("-");
			}
		}else if(score>=60) {
			System.out.print("D");
			if(score>=67) {
				System.out.println("+");
			}else if(score<=63) {
				System.out.println("-");
			}
		}else {
			System.out.println("F");
		}
		
		

	}

}
