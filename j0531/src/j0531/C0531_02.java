package j0531;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C0531_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//객체선언
		StuProcess sp = new StuProcess();
		List<Student> list = new ArrayList<>();
		int choice = 0;
		int stuCount = list.size()+1; //학번
		
		while(true) {
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1. 학생입력");
			System.out.println("2. 학생출력");
			System.out.println("8. 파일에서 가져오기");
			System.out.println("9. 파일저장하기");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				//메소드호출후 데이터전달 받음.
				stuCount = list.size()+1;
				Map<String,Object> map = sp.stuInput(list,stuCount);
				list = (List<Student>) map.get("list");
				stuCount = (int) map.get("stuCount");
				break;
				
			case 2:
				//메소드호출(매개변수 전달)-list
				list = sp.stuOutput(list);
				break;
				
			case 8: //파일에서 가져오기
				list = sp.stuRead();
				System.out.println("[ 파일 읽어오기가 완료되었습니다. ]");
				System.out.println();
				break;
			
			case 9:
				sp.stuSave(list);
				System.out.println("[ 학생성적이 저장되었습니다. ]");
				System.out.println();
				break;
				
				
				
			}//switch
			
		}//while

	}//main

}//class
