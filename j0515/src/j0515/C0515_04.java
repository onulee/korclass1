package j0515;

public class C0515_04 {

	public static void main(String[] args) {
		// 2차원배열
		// [4][3]배열
		int[][] box = new int[4][3];
		//번호입력
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				box[i][j] = (3*i)+(j+1);
			}
		}
		
		System.out.println("---------------------");
		//번호출력
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(box[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		

	}//main

}//class
