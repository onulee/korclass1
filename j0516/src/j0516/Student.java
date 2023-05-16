package j0516;

public class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void sum() {
		total = kor+eng+math;
	}
	
	void average() {
		avg = total/3.0;
	}

}
