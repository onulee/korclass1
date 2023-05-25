package j0525;

public class C0525_04 {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Marine m1 = new Marine();
		Tank t2 = new Tank();
		Marine m2 = new Marine();
		Scv s1 = new Scv();
		Vulture v1 = new Vulture();
		
		
		t1.hitPoint -= 10; //총
		t1.hitPoint -= 10;
		System.out.println("현재체력 : "+t1.hitPoint);
		s1.repair(t1);
		System.out.println("수리완료후 체력 : "+ t1.hitPoint);
		
		v1.hitPoint -= 10;
		v1.hitPoint -= 10;
		System.out.println("현재체력 : "+v1.hitPoint);
		s1.repair(v1);
		System.out.println("수리완료후 체력 : "+ v1.hitPoint);
		
		
		
		
		
		
		

	}

}
