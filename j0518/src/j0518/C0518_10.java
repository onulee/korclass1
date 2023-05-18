package j0518;

public class C0518_10 {

	int iv;
	static int cv;
	
	void i_Method() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void c_Method() {
		//System.out.println(iv);
		System.out.println(cv);
	}
	
	
	public static void main(String[] args) {
		C0518_10.cv = 50; //클래스명.변수명
		System.out.println(cv);
		
		C0518_10 c = new C0518_10();
		c.iv = 100;
		System.out.println(c.iv);
		
		
		
		
		

	}

}
