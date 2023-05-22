package j0522;

public class Student {
	
	static int count=1000; //클래스변수
	int stuNo; //20231011001
	String name; //인스턴스변수
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{ //초기화블럭
		++count; //1001
		//stuNo = "2023"+  String.format("%04d", 1); //2023 101 1001
		stuNo = count; 
	}
	
	Student(){ }
	
	Student(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}

}
