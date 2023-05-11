package j0511;

import java.util.Scanner;

public class C0511_08 {

	public static void main(String[] args) {
		// 랜덤숫자맞추기
		// 10번 기회를 주어지고 정답확인 시 입력한 번호를 출력해보세요.
		Scanner scan = new Scanner(System.in);
		int input=0; //입력받은 변수
		int random=0; //랜덤숫자 저장변수
		int count=0;  //도전횟수
		int[] num = new int[10]; //입력한 숫자를 저장
		
		random = (int)(Math.random()*100)+1;
		System.out.println("랜덤숫자 : "+random);
		
		while(true) {
			// 몇번 도전했는지 확인
			if(count>9) {
				System.out.println("10번 도전했습니다. 프로그램을 종료합니다.");
				break;
			}
			// 도전번호 입력
			System.out.println((count+1)+"번째 숫자를 입력하세요.>>");
			num[count] = scan.nextInt();
			if(num[count]==random) {
				System.out.println("정답입니다.");
				break;
			}else {
				System.out.println("오답입니다. 다시 도전하세요.");
			}
			count++;
		}
		
		//count = 10
		
		//입력한 숫자 출력
		System.out.println("정답 : "+random);
		System.out.print("입력한 숫자 : ");
		for(int i=0;i<count;i++) {
			if(i==0) {
				System.out.print(num[i]);
			}else {
				System.out.print(","+num[i]);
			}
		}
		
		

	}

}
