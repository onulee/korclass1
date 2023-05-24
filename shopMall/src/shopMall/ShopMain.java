package shopMall;

public class ShopMain {

	public static void main(String[] args) {
		System.out.println("[ 삼성쇼핑몰 ]");
		System.out.println("1. QLED TV 70인치");
		System.out.println("2. 갤럭시 북");
		System.out.println("3. 홈 미니 블루투스 스피커");
		System.out.println("-----------------------");
		System.out.println("구매하고 싶은 번호를 입력하세요.");
		
		//id,pw
		Buyer b = new Buyer("hong","홍길동","길동스");
		//Tv
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		
		//Computer
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Speaker());
		b.buy(new Speaker());
		b.buy(new Speaker());
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Washer());
		
		System.out.println("잔액 : " + b.money);
		System.out.println("구매개수 : "+b.list.size());
		
		//구매목록 메소드 호출
		b.buyList();
		

	}

}
