package j0522;

public class C0522_09 {

	public static void main(String[] args) {
	
		//객체선언후
		//serialNo=1
		Product p1 = new Product(); 
		System.out.println("p1 serialNo : "+p1.serialNo);
		
		//serialNo = 
		Product p2 = new Product();
		System.out.println("p2 serialNo : "+p2.serialNo);
		
		Product p3 = new Product();
		System.out.println("p3 serialNo : "+ p3.serialNo);
		
		//p1.count 얼마일까요?
		System.out.println("p1 count : "+p1.count);
		System.out.println("p2 count : "+p2.count);
		System.out.println("p3 count : "+p3.count);
		// int count = 0
		// int serialNo = 0;
		// 초기화블럭 : count=1; serialNo = 1;
		// 생성자 : 
		

	}

}
