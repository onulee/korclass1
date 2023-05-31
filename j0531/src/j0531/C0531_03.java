package j0531;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class C0531_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//OutputStream : 파일저장하기, 외부와 접속할때 try~catch
		OutputStream os = null;
		try {
			os = new FileOutputStream("c:/savedata/a.txt");
			System.out.println("원하는 글자를 입력하세요.");
			//String str = scan.nextLine();
			String str = "글자를 입력합니다. 안녕하세요.\r\n 반갑습니다.줄단락을 하였습니다.\r\n";
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("파일을 저장했습니다.");
		
		//InputStream : 파일읽어오기,  외부와 접속할때 try~catch
		InputStream is = null;
		try {
			is = new FileInputStream("c:/savedata/a.txt");
			int i=-1;
			while(true) {
				if((i = is.read())==-1) break; //-1 : 더이상 읽어올 데이터가 없슴.
				System.out.println("데이터 : "+(char)i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
