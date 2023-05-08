package j0508_01;

public class Class0508_04 {
	
	public static void main(String[] args) {
		long num = 2;
		long num2 = 0L;
		char ch = 'A';
		//char ch2 = 'AB';
		char ch3 =' ';
		String str1 = "";
		
		String str2 = "a"+"b";
		System.out.println(str2);
		
		int num3 = 7;
		int num4 = 7;
		String num5 = "7";
		System.out.println(num3+num4); //14 - int + int = int
		System.out.println(num3+num4+num5); //147 int+int+String=String
		System.out.println(num5+num4+num3); //777 String+int+int=String
		
		                   //String + int + int = String
		System.out.println("결과값 : "+(num3+num4));//77
		

	}

}
