package j0523;

public class C0523_05 {

	public static void main(String[] args) {
		// 12시 50분 52초를 입력하고,
		Time t = new Time(12,50,52);
		// 12시를 출력하시오.
		System.out.println(t.getHour());
		
		t.hour=25;
		
		System.out.println(t.getHour());
		
		//t.setHour(22);
		
		///System.out.println(t.getHour());

	}

}
