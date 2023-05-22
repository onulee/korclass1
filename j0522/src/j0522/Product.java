package j0522;

public class Product {
	static int count=0; //클래스변수 - 객체선언 없이 클래스명.변수명
	int serialNo;       //인스턴스변수 - 객체선언후 참조변수명.변수명
	{  //인스턴스 초기화블럭
		
	}
	
	Product(){
		++count;
	serialNo = count;
	} //기본생성자

}
