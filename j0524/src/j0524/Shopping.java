package j0524;

public class Shopping {

	public static void main(String[] args) {
		System.out.println("[ 쇼핑몰 프로그램 ]");
		System.out.println("1. Stv");
		System.out.println("2. Computer");
		System.out.println("3. Audio");
		System.out.println("------------------");
		System.out.println("구매하고 싶은 번호를 입력하세요.");
		
		Buyer b = new Buyer();
		b.buy(new Stv());
		b.buy(new Stv());
		
		//컴퓨터 1대 구매
		b.buy(new Computer());
		b.buy(new Audio());
		
		
		
		System.out.println("잔액 : "+b.money);
		System.out.println("보너스 : "+b.bonusPoint);
		
		

	}

}
