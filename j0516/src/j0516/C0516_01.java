package j0516;

import java.util.Scanner;

public class C0516_01 {

	//클래스 변수 - 클래스명.변수명 : 같은 클래스 내에서는 클래스명 생략가능
	static String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
	
	public static void main(String[] args) {
		//객체선언 Student s = new Student();
		//C0516_01 c = new C0516_01();
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생검색
		// 0. 프로그램종료

		// 이름,국어,영어,수학,합계,평균 - 10명
		Scanner scan = new Scanner(System.in);
		int choice = 0; //선택번호
		int count = 0;  //성적입력 학생수
		String searchName=""; //검색이름
		int chk=0; //존재유무 체크
		
		
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];
		
		//무한반복
		loop:while(true) {
			//화면출력부분
			// 사용하는 방법 클래스명.메소드명
			screen();
			choice = scan.nextInt();
			
			switch(choice) {
			
			case 1: //성적입력
				for(int i=count;i<name.length;i++) {
					//이름입력부분
					System.out.println(count+1 + "번째 학생의 이름을 입력하세요.(0.이전페이지 이동)>>");
					name[i] = scan.next();
					
					//이전페이지 이동확인
					if(name[i].equals("0")) {
						System.out.println("이전페이지로 이동합니다.!!");
						System.out.println();
						break;
					}
					
					// score[i][0] 국어,score[i][1] 영어,score[i][2] 수학
					for(int j=0;j<3;j++) {
						System.out.println(title[j+1] + "점수를 입력하세요.");
						score[i][j] = scan.nextInt();
					}
					
					//합계부분
					score[i][3] = score[i][0]+score[i][1]+score[i][2];
					//평균부분
					avg[i] = score[i][3]/3.0;
					
					System.out.println((count+1)+"번째 학생성적이 등록되었습니다.");
					System.out.println();
					
					//학생수 1증가
					count++;
				}
				break;
			
			case 2://성적출력
				System.out.println("[ 학생성적 ]");
				
				titleScreen();
				
				for(int i=0;i<count;i++) {
					System.out.print(name[i]+"\t");
					for(int j=0;j<score[i].length;j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.printf("%.2f\t",avg[i]);  //평균
					System.out.printf("%d\n",rank[i]); //등수
					System.out.println();
				}
				break;
				
			case 3: //성적수정
				//수정할 학생이름 입력
				System.out.println("수정할 학생의 이름을 입력하세요.");
				searchName = scan.next();
				
				//수정할 학생 검색
				chk=0;
				for(int i=0;i<count;i++) {
					if(name[i].equals(searchName)) { //모든학생을 검색
						//수정할 과목 선택
						System.out.println("[ 수정할 학생을 찾았습니다. ]");
						System.out.println("수정할 과목을 선택하세요.");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("-------------------------");
						System.out.println("수정할 과목 번호를 입력하세요.");
						choice = scan.nextInt();
						
						//수정할 과목 이전점수 표시
						// 국어:score[i][0], 영어:score[i][1], 수학:score[i][2]
						System.out.printf("[ 현재 %s 점수 ] : %d \n",title[choice],score[i][choice-1]);	
						System.out.println("----------------------");
						System.out.println("수정할 점수를 입력하세요.>>");
						score[i][choice-1] = scan.nextInt();
						//합계,평균수정
						score[i][3] = score[i][0]+score[i][1]+score[i][2];
						avg[i] = score[i][3]/3.0;
						
						System.out.println("점수가 수정되었습니다.!!");
						System.out.println();
						chk=1;
					}//if
				}//for
				
				//찾는 학생이 없을시
				if(chk==0) {
					System.out.println("입력한 학생이 없습니다. 다시 입력하세요.!!");
					System.out.println();
				}
				
				break;
				
			case 4://등수처리 score[i][3]:합계
				for(int i=0;i<count;i++) {
					int rankCount=1;
					for(int j=0;j<count;j++) {
						//모든 학생성적합계 비교 
						if(score[i][3]<score[j][3]) {
							//자기 점수보다 높으면 등수1증가
							rankCount++;
						}
					}
					//등수부분에 등수입력
					rank[i] = rankCount;
				}
				
				System.out.println("[ 등수처리가 완료되었습니다. ]");
				System.out.println();
				break;
				
			case 5://학생검색
				System.out.println("[ 학생검색 ]");
				System.out.println("검색할 학생의 이름을 입력하세요.>>");
				searchName = scan.next();
				chk=0;
				
				titleScreen();
				
				for(int i=0;i<count;i++) {
					//순 -> 홍길동, 홍길순, 홍길자, 홍길구, 김구, 이순신  
					if(name[i].contains(searchName)) { //검색:contains
						//이름이 출력되도록
						System.out.print(name[i]+"\t");
						for(int j=0;j<score[i].length;j++) {
							System.out.print(score[i][j]+"\t");
						}
						System.out.printf("%.2f\t",avg[i]);  //평균
						System.out.printf("%d\n",rank[i]); //등수
						chk=1;
					}//if
				}//for
				
				//검색할 이름이 없는 경우
				if(chk==0) {
					System.out.println("[ 찾고자 하는 학생이 없습니다. 다시 입력하세요.!! ]");
				}
				System.out.println();
				
				break;
			
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
				break loop;
			
			}//switch
			
		}//while

	}//main
	
	
	//클래스 메소드
	static void screen() {
		System.out.println("[ 학생성적처리 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 등수처리");
		System.out.println("5. 학생검색");
		System.out.println("0. 프로그램종료");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요.");
	}
	
	static void titleScreen() {
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println("");
		System.out.println("---------------------------------------------------");
	}
	
	
	
	
	
	
	

}//class
