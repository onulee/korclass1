package j0522;

public class C0522_07 {

	//C0522_07(){} //기본생성자 자동생성
	
	int x;  //인스턴스 변수
	int y=x; //인스턴스 변수
	char ch;
	String str;
	
	
	public static void main(String[] args) {
		int a=0; //초기화
		int b=a;
		
		int num=0,num1=0; //초기화
		long num2=0; //초기화
		// a,b,x,y를 출력하시오.
		//출력
		System.out.println(a);
		System.out.println(b);
		
		//객체선언후 참조변수명.변수명
		C0522_07 c = new C0522_07();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println("ch : "+c.ch);
		System.out.println("str : "+c.str);

	}

}
