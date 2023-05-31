package j0531;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StuProcess {
	Scanner scan = new Scanner(System.in);
	int stuNo;
	String name;
	int kor, eng, math;

	// 리턴타입 메소드명
	Map<String,Object> stuInput(List<Student> list,int stuCount) {

		// 반복
		while (true) {
			System.out.println("[ 학생성적 입력 ]");
			System.out.println("이름을 입력하세요.(0.이전페이지 이동)");
			name = scan.next();
			if(name.equals("0")) {
				System.out.println("[ 이전페이지 이동 ]");
				break;
			}
			System.out.println("국어점수를 입력하세요.");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math = scan.nextInt();
			list.add(new Student(stuCount, name, kor, eng, math));

			stuCount++; //1증가
		} // while

		System.out.println();
		// list,stuCount 2개
		Map<String, Object> map = new HashMap<>();
		map.put("list", list); // list=list
		map.put("stuCount", stuCount); //stuCount=4
		
		return map;
	}

}
