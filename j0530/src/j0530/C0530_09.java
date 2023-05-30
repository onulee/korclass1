package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class C0530_09 {
	public static void main(String[] args) {
		
		//ColClass 사용하려면? 객체선언
		ColClass c = new ColClass();
		Map<String, Object> map = new HashMap<>();
		map = c.execute();
		
		//ColClass2 사용하려면? 객체선언
		ColClass2 c2 = new ColClass2();
		int nowPage=0;
		nowPage = c2.execute2();
		
		//ColClass3 사용하려면? 객체선언
		ColClass3 c3 = new ColClass3();
		ArrayList<Student> list = new ArrayList<>();
		list = c3.execute3();
		
		//ColClass4 사용하려면?
		ColClass c4 = new ColClass();
		Map<String, Object> map2 = new HashMap<>();
		map2 = c4.execute();
		
		
		
		
		
		
		
		
	}//main
	
	
	
}
