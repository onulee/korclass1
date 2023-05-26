package stuProject2;

public class TestFile2 {

	public static void main(String[] args) {
		String name="홍길동";
		int kor = 100;
		int eng = 99;
		int math = 90;
		System.out.printf("%s,%d,%d,%d \r\n",name,kor,eng,math);
		
		String data = String.format("%s,%d,%d,%d \r\n",name,kor,eng,math);
		System.out.println("문자열로 변수 저장 : "+data);

	}

}
