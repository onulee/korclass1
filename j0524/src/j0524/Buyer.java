package j0524;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	
	Product[] cart = new Product[10];
	
	// Stv s = new Stv();
	// Product p = new Stv();
	// Product p = new Computer();
	// Product p = new Audio();
	int count=0;
	void buy(Product p) {
		money = money - p.price; //150
		bonusPoint = bonusPoint + p.bonusPoint;
		cart[count] = p;
		count++;
	}
	
	

}
