package j0517;

import java.util.Arrays;
import java.util.Scanner;

public class C0517_08 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 작은수 부터 순차적으로 출력하시오.
		// calculate() 메소드를 만들어서 사용하시오.
		// 10 5 25 -> 5 10 25
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.println("숫자를 입력하세요.");
			arr[i] = scan.nextInt();
		}
		//배열정렬
		//Arrays.sort(arr);
		calculate(arr);
		
		for(int i=0;i<3;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}//main
	
	static void calculate(int[] arr) {
		int min = Math.min(Math.min(arr[0], arr[1]),arr[2]);
		int max = Math.max(Math.max(arr[0], arr[1]),arr[2]);
		int middle = (arr[0]+arr[1]+arr[2])-max-min;
		
		arr[0]=min;
		arr[1]=middle;
		arr[2]=max;
	}
	
	

}//class
