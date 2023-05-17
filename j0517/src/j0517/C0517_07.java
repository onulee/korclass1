package j0517;

public class C0517_07 {

	public static void main(String[] args) {
	
		// static 객체선언없이 사용
		
		int[] num = new int[2];
		
		int a = 10;
		int b = 5;
		
		calulate(num,a,b);
		
		System.out.println("합계 : "+num[0]); //15
		System.out.println("평균 : "+num[1]); //7
		

	}
	
	static void calulate(int[] num,int a, int b) {
		// 두수의 합, 평균
		num[0] = a+b;
		num[1] = (a+b)/2;
		
	}
	
	

}
