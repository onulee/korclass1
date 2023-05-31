package j0531;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C0531_04 {

	public static void main(String[] args) {
		
		//FileReader : 문자열 읽어오기
		File f = new File("c:/savedata/b.txt");
		BufferedReader br = null; //1줄씩 데이터를 읽어옴.
		//FileReader - 1byte단위로 글을 읽어옴.
		try {
			br = new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine(); //1줄을 읽어와서 String에 데이터를 넣음.
				if(line==null) break;        //더이상 데이터가 없으면 종료
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("파일이 저장되었습니다.");
		
		
		//FileWriter : 문자열 저장하기
//		File f = new File("c:/savedata/b.txt");
//		FileWriter fw = null; 
//		try {
//			fw = new FileWriter(f);
//			for(int i=0;i<10;i++) {
//				String data = i+"번째 줄입니다. \r\n";
//				fw.write(data);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				fw.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
		
//		System.out.println("파일이 저장되었습니다.");
		

	}

}
