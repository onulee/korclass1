package j0530;

import java.util.ArrayList;
import java.util.List;

public class C0530_05 {

	public static void main(String[] args) {
		// list : 객체들의 집합, 데이터 이동 및 읽기, 저장용도로 사용
		ArrayList list = new ArrayList(); //다형성	
		list.add("abc"); //0
		list.add("abc"); //1
		list.add("bbb"); //2
		list.add("aaa"); //3
		list.add("ccc"); //3
		list.add(3); //Integer
		System.out.println(list.get(4));
		for(int i=0;i<list.size();i++) {
			System.out.println("list : "+list.get(i));
		}
		
//		ArrayList<Student> list2 = new ArrayList(); //지네릭스:특정클래스만 입력가능
//		list2.add(new Student(1,"홍길동",100,100,99));
//		list2.add(new Student(2,"유관순",90,90,99));
//		list2.add(new Student(3,"이순신",80,80,87));
//		list2.add(new Student(3,"이순신",80,80,87));
//		//list2.add(2);
//		//list2.add("abc");
//		
//		//출력하시오.
//		// list2.get(i)        student.getName()
//		for(int i=0;i<list2.size();i++) {
//			Student s = list2.get(i);
//			System.out.println("list2 : "+s.getStuNo()+" "+s.getName()+" "+s.getKor());
//			System.out.printf("%d %s %d %d %d %d %.2f \n",s.getStuNo(),
//					s.getName(),s.getKor(),
//					s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
//		}
		
	}

}
