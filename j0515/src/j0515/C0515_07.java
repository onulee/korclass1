package j0515;

public class C0515_07 {

	public static void main(String[] args) {
		// 5,5배열
		String[][] box = new String[5][5];
		
		//1차원 배열에 숫자넣기
		int[] num = new int[25];
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;  //num[0] = 1, num[1]=2, num[2] = 3 .... num[24]=25 
		}
		
		//배열섞기
		
		
		
		
		//2차원 배열에 숫자넣기
		for(int i=0;i<box.length;i++) {
			for(int j=0;j<box[i].length;j++) {
				box[i][j] = ""+num[5*i+j];  //String타입 = ""+int;
			}
		}
		
		//화면출력
		for(int i=0;i<box.length;i++) {
			for(int j=0;j<box[i].length;j++) {
				System.out.print(box[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		

	}

}
