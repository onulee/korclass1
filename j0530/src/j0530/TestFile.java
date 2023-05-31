package j0530;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class TestFile {
	
	//리턴타입 메소드명(){ return list; }
	ArrayList<Student> fileRead() throws Exception {
		ArrayList<Student> list = new ArrayList<>();
		BufferedReader br = null;
		//1줄씩 읽어오는 방식사용
		br = new BufferedReader(new FileReader("c:/data/student.txt"));
		while(true) {
			String data = br.readLine();
			
			if(data==null) break; //더이상 읽어올 데이터가 없으면 종료
			System.out.println(data); 
			// student.txt파일에서 1줄을 읽어와서 ,로 분리 - 1,홍길동,100,100,99
			String[] dataArr = data.split(","); //특정문자로 분리
			System.out.println("길이 : "+dataArr.length);
			int stuNo = Integer.parseInt(dataArr[0].trim()); //
			String name = dataArr[1];
			int kor = Integer.parseInt(dataArr[2].trim());
			int eng = Integer.parseInt(dataArr[3].trim());
			int math = Integer.parseInt(dataArr[4].trim());
			
			list.add(new Student(stuNo,name,kor,eng,math));
		}
		br.close();
		
		return list;
		
		//2byte씩 읽어오는 방식
		//FileReader fr = new FileReader("c:/data/student.txt");
	}//fileRead()
	
	
	
	private String trim(String string) {
		// TODO Auto-generated method stub
		return null;
	}



	//저장하기 메소드
	void fileSave() throws Exception {
		
		FileWriter fw = null; //파일저장은 try-catch
		fw = new FileWriter("c:/data/student.txt",true);
		String data = "1,홍길동,100,100,99\r\n";
		data += "2,유관순,99,99,98\r\n";
		data += "3,이순신,98,98,91\r\n";
	    fw.write(data);
		fw.flush();
		fw.close();
		
		System.out.println("파일이 저장되었습니다.");
		
	}
	

}
