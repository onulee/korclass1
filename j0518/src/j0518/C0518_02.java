package j0518;

public class C0518_02 {

	public static void main(String[] args) {
		// 프린트 print, println, printf
		System.out.println("안녕하세요.");
		System.out.print("반갑습니다.");
		System.out.println("이렇게 하면 어떻게 될까요?");
		
		int a = 10;
		int b = 100; 
		//a : 10, b : 100
		System.out.println("a : "+ a +", b : "+b);
		int num = 1, num2=2, num3=3;
		// num = 1, num2 = 2, num3 = 3
		System.out.println("num = "+num+", num2 = "+num2+", num3 = "+num3);
		System.out.printf("num = %d, num2 = %d, num3 = %d \n",num,num2,num3);
		System.out.println(10/3.0); //3.3333
		System.out.printf("%.1f \n",10/3.0);

	}

}
