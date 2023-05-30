package j0530;

import java.util.ArrayList;

public class ColClass3 {
	
	// execute3()메소드를 만들어서
	// list main메소드에 전달하시오.
//	ArrayList<Student> list = new ArrayList<>();
//	list.add(new Student(1,"홍길동",100,100,99));
//	list.add(new Student(2,"유관순",99,98,99));
//	list.add(new Student(3,"이순신",90,91,90));
//	list.add(new Student(4,"강감찬",90,91,90));
//	list.add(new Student(5,"김구",90,91,90));
//	list.add(new Student(6,"홍길순",90,91,90));
//	list.add(new Student(7,"홍길자",90,91,90));
//	list.add(new Student(8,"김유신",90,91,90));
//	list.add(new Student(9,"김유순",90,91,90));
//	list.add(new Student(10,"김유자",90,91,90));

	//메소드 구현
	//리턴타입 메소드명(매개변수){ return 리턴타입일치 }
	ArrayList<Student> execute3(){ 

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
	    
		return list;
    }
	
	
	
}
