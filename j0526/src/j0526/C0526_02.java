package j0526;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C0526_02 {

	public static void main(String[] args) {
		
		
//		File dir = new File("c:/bbb");
//		dir.mkdirs(); //폴더생성 메소드
//		System.out.println("폴더를 생성합니다.");
		
//		File f = new File("c:/bbb/test.txt");
//		try {
//			f.createNewFile(); //파일생성 메소드
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("파일을 생성합니다.");
		FileWriter fw = null;
		String str = "";
		try {
			fw = new FileWriter("c:/bbb/test.txt");
			for(int i=0;i<10;i++) {
				str = str + "글자를 저장합니다. \r\n";
				fw.write(str); //글자를 저장하는 메소드
				//fw.flush(); //버퍼에 있는 모든것을 저장
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	    System.out.println("글자가 저장되었습니다.");
		
		
		
		
	}

}
