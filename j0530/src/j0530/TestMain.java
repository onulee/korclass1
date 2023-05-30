package j0530;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) throws Exception {
		//객체선언
		TestFile t = new TestFile();
		//t.fileSave(); //파일저장하기
		ArrayList<Student> list = new ArrayList<>();
		list = t.fileRead();   //파일읽어오기
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName());
		}
		
		
		

	}

}
