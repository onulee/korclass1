package j0508_01;

public class Class0508_08 {

	public static void main(String[] args) {
		// int 선언할것 : num1 변수 10, num2 변수 3 을 선언후, 
		// 두수를 나눠서 소수점 2자리까지 출력하시오.
		int num=10;
		int num2=3;
		System.out.printf("%.2f \n",num/(float)num2);
		System.out.println(10/3.0);
		
		//변수 n1 : 3.14, 변수 n2 : 5
		// [ n1+n2의 결과값 : 8.14 ] 를 출력하시오. 
		
		double n1 = 3.14;
		int n2 = 5;
		System.out.printf("[ n1+n2의 결과값 : %f ] \n",n1+n2);
		System.out.println();
		
		//국어점수 int kor 100, eng 100, math 99
		// 합계와 평균을 출력하시오. 평균은 소수점2자리까지 출력
		// [ 합계 : 299 , 평균 : 99.67 ]
		
		int kor=100,eng=100,math=99;
		int total = kor+eng+math;
		double avg = total/3.0;
		System.out.printf("[ 합계 : %d , 평균 : %.2f ]",total,avg);
		

	}

}
