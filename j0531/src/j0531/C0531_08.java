package j0531;

import java.util.List;

public class C0531_08 {

	public static void main(String[] args) {
		//객체선언
		DataClass d = new DataClass();
		int num1 = 10;
		int num2 = 5;
		int sum = d.numAdd(num1,num2);
		System.out.println(sum*2);
		
		int kor = 100;
		int eng = 100;
		int math = 99;
		
		Student s = d.stuAdd(kor,eng,math);
		System.out.println(s.getTotal());
		
		List<Student> list = d.stuList();
		
		for(int i=0;i<list.size();i++) {
			System.out.printf("%d,%s \n",
					list.get(i).getStuNo(),list.get(i).getName());
		}
		
		

	}

}
