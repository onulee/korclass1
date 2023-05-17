import java.util.Scanner;

public class StuMain {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Student[] s = new Student[10];
		int choice = 0; //선택번호
		int count = 0;  //성적입력 학생수
		String searchName=""; //검색이름
		int chk=0; //존재유무 체크
		
		while(true) {
			//화면출력
			choice = stuScreen();
			
			switch(choice) {
			case 1: //성적입력
				//성적입력 메소드호출 - 클래스명.메소드명() / 메소드명()
			    count = stuInput(count,s);  //입력된 학생수
				break;
				
			case 2: //성적출력
				//한줄
				break;
			case 3: //성적수정
				//한줄
				break;
			case 4: //등수처리
				//한줄
				break;
			case 5: //학생검색
				//한줄
				break;
			case 0:
				
				break;
				
				
			}
			
		}//while
	}//main
	
	static int stuScreen() {
		System.out.println("[ 학생성적처리 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 등수처리");
		System.out.println("5. 학생검색");
		System.out.println("0. 프로그램종료");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요.");
		int choice =  scan.nextInt();
		return choice;
	}//stuScreen
	
	
	
	//1. 성적입력 메소드
	static int stuInput(int count,Student[] s) {
		for(int i=count;i<s.length;i++) {
			//객체선언
			s[i] = new Student(); 
			System.out.println((i+1)+"번째 학생 이름을 입력하세요.(0.이전페이지 이동)");
			s[i].name = scan.next();
			if(s[i].name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			}
			System.out.println("국어점수를 입력하세요.");
			s[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			s[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			s[i].math = scan.nextInt();
			s[i].sum(); //합계
			s[i].average(); //평균
			
			System.out.println((count+1)+"번째 학생성적 등록이 완료되었습니다.");
			System.out.println();
			//학생수 1증가
			count++;
			
		}//for
		
		return count;
	}//stuInput
	
	
	

}//class
