package j0508_01;

public class Class0508_07 {

	public static void main(String[] args) {
		// printf, println, print
		System.out.println(10/4.0); //출력후 enter키가 포함
		// \n 단락 \t tab키
		System.out.printf("%.2f \n",10/7.0);  //실수형 출력후 자동enter키가 없음
		System.out.printf("%9d \n",1000); //정수형
		System.out.printf("%x \n",16); //16진수
		System.out.printf("%o \n",9);     //8진수
		System.out.printf("당신의 나이 : %d 세, 생년 : %d 년 \n",25,1986);
		System.out.println("당신의 나이 : "+25+" 세, 생년 : "+1986+" 년");
		
		

	}

}
