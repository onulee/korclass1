package j0531;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C0531_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int stuCount = 3; //학번
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"홍길동",100,100,99));
		list.add(new Student(2,"유관순",99,99,98));
		
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
				//객체선언
				StuProcess sp = new StuProcess();
				//메소드호출후 데이터전달 받음.
				Map<String,Object> map = sp.stuInput(list,stuCount);
				list = (List<Student>) map.get("list");
				stuCount = (int) map.get("stuCount");
				
				//출력
				for(int i=0;i<list.size();i++) {
					System.out.printf("%d %s \n",list.get(i).getStuNo(),
							list.get(i).getName());
				}
				
				break;
			}
			
		}

	}

}
