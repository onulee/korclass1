package j0526;

public class C0526_10 {

	public static void main(String[] args) {
		String data1 = "1001,홍길동,100,100,99";
		// 배열로 담아 출력하시오.
		String[] result = data1.split(",");
		//String문자열을 int로 변환
		int stuNo = Integer.parseInt(result[0]);
		String name = result[1];
		int kor = Integer.parseInt(result[2]);
		int eng = Integer.parseInt(result[3]);
		int math = Integer.parseInt(result[4]);
		//Double.parseDouble(result[2]);
		//Long.parseLong(result[3]);
		
		Student s = new Student(stuNo,name,kor,eng,math);
		//total,avg출력
		System.out.println(s.getTotal());
		System.out.println(s.getAvg());
		
		String[] chk_info = new String[1];
		chk_info[0] = "HTML";
		//chk_info[1] = "CSS";
		//chk_info[2] = "webDesign";
		
		String info3="";
		for(int i=0;i<chk_info.length;i++) {
			if(i==0) info3 = info3+chk_info[i];
			else info3 = info3+","+chk_info[i];
		}
		
		System.out.println(info3);
		
		String info1 = chk_info[0]+","+chk_info[1]+","+chk_info[2];
		//String info2 = "HTML,CSS,webDesign";
		
		
		

	}

}
