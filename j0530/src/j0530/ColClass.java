package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColClass {
	
	//list,nowPage,startRow,endRow
	Map<String, Object> execute(){
		Map<String, Object> map = new HashMap<>();
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1,"홍길동",100,100,99));
		list.add(new Student(2,"유관순",99,98,99));
		list.add(new Student(3,"이순신",90,91,90));
		list.add(new Student(4,"강감찬",90,91,90));
		list.add(new Student(5,"김구",90,91,90));
		list.add(new Student(6,"홍길순",90,91,90));
		list.add(new Student(7,"홍길자",90,91,90));
		list.add(new Student(8,"김유신",90,91,90));
		list.add(new Student(9,"김유순",90,91,90));
		list.add(new Student(10,"김유자",90,91,90));
		
		int nowPage = 3;
		int startRow = 21;
		int endRow = 30;
		
		map.put("list", list);
		map.put("nowPage", nowPage);
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		
		return map;
	}
	
	

}
