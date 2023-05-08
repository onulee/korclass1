package j0508_01;

public class Class0508_03 {

	static int num;  //전역변수 - class영역에서도 변수선언 가능
	
	public static void main(String[] args) {
		int num; //지역변수
		num=10;
		System.out.println("main메소드 num 호출 : "+num);
		sub();
	}
	
	static void sub() {
		//System.out.println(num);
		System.out.println("sub메소드 num 호출 : "+num);
	}
	
	
}
