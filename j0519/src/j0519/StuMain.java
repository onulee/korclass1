package j0519;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in); //객체선언
		Student[] s = new Student[10]; //배열선언
		int choice = 0; //원하는 번호 입력하는 변수
		int count = 0;  //입력된 학생수
		
		//반복문 : while,for
		//조건이 맞으면 실행 : 무한반복 - 100%
		while(true) {
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생검색");
			System.out.println("0. 프로그램종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			//입력된 번호를 선택하는 조건문
			switch(choice) {
			case 1:
				//10명 성적을 입력하는 반복문 - (초기식;조건식;증감식)
				for(int i=count;i<s.length;i++) { //나왔다가 다시 들어올 경우 입력된 학생수 다음부터 진행
					
					s[i] = new Student();    //객체선언-공간할당을 해줌.
					
					System.out.println((i+1)+"번째 이름을 입력하세요.(0.이전페이지 이동)");
					s[i].name = scan.next();  //이름입력 또는 이전페이지 이동입력
					//이전페이지 이동입력이 되었는지 확인 - equals, ==
					if(s[i].name.equals("0")) {
						System.out.println("[ 이전페이지로 이동합니다. ]");
						break; //반복문for,while,switch
					}//if
					
					System.out.println("국어점수를 입력하세요.");
					s[i].kor = scan.nextInt();
					System.out.println("영어점수를 입력하세요.");
					s[i].eng = scan.nextInt();
					System.out.println("수학점수를 입력하세요.");
					s[i].math = scan.nextInt();
					
					s[i].sum();     //합계처리
					s[i].average(); //평균처리
					
					count++; //입력이 완료되면 입력된 학생수 1증가
					
				}//for
				break; //switch빠져나올때 사용되는 구문
			case 2:
				System.out.println("[ 학생성적 ]");
				//String[] title = Student.title;
				//클래스변수사용방법 : 클래스명.변수명
				//상단타이틀 출력
				for(int i=0;i<Student.title.length;i++) {
					System.out.print(Student.title[i]+"\t");
				}
				System.out.println();
				System.out.println("---------------------------------------------------");
				//입력된 성적출력
				for(int i=0;i<count;i++) {
					System.out.print(s[i].name+"\t");
					System.out.print(s[i].kor+"\t");
					System.out.print(s[i].eng+"\t");
					System.out.print(s[i].math+"\t");
					System.out.print(s[i].total+"\t");
					System.out.printf("%.2f \t",s[i].avg);
					System.out.print(s[i].rank+"\n");
				}
				System.out.println();
				
				break;
				
			default:
				
				break;
			
			
			}
			
		}
		
	

	}

}
