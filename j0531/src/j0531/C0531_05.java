package j0531;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C0531_05 {

	public static void main(String[] args) {
		//파일쓰기 - c.txt
		String str = "파일쓰기를 시작합니다.";
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/savedata/c.txt");
			fw.write(str);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("파일을 저장합니다.");
		
		
		//파일읽어오기
		FileReader fr = null;
		try {
			fr = new FileReader("c:/savedata/news.txt");
			while(true) {
				int i=0;
				if((i=fr.read())==-1) break;
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader("c:/savedata/news.txt"));
//			while(true) {
//				String data = br.readLine();
//				if(data==null) break;
//				System.out.println(data);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				br.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
		
		System.out.println();

	}

}
