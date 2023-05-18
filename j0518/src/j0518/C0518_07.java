package j0518;

import java.util.Scanner;

public class C0518_07 {

	public static void main(String[] args) {
		//1-100까지의 랜덤숫자를 생성해서 숫자를 맞추는 프로그램을 구현하시오.
		// 횟수 10번만 가능

		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		//배열사용해서, 입력한 숫자를 모두 출력하시오.
		int[] num = new int[10];
		
		//for문
		for(int i=0;i<num.length;i++) {
			//1.숫자입력 num[9]
			
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			num[i] = scan.nextInt();
			//비교 if(입력받은 숫자와 랜덤숫자가 같은지 비교)
			if(num[i]==random) {
				System.out.println("정답입니다.");
				break;
			}else {
				System.out.println("틀렸습니다. 다시 입력하세요.");
			}
			
		}//for
		
		System.out.println("정답 : "+random);
		
		//배열출력
		System.out.print("내가 입력한 번호 : ");
		for(int i=0;i<num.length;i++) { //배열을 출력하기 위한 for문
			System.out.print(num[i] + " ");
		}
		
		
		

	}

}
