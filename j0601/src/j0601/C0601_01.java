package j0601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C0601_01 {

	public static void main(String[] args) {
		Date today = new Date(); //날짜객체 2023-06-01 , 2023년 06월 01일
		System.out.println(today.toString());
		//날짜형태를 지정하는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss zzz");
		System.out.println(sdf.format(today));
		
		System.out.println(today.getYear()); //년
		System.out.println(today.getMonth()); //월
		System.out.println(today.getDate()); //일
		System.out.println(today.getDay()); //요일 0-일요일,1-월,2-화,3-수,4-목,5-금,6-토
		System.out.println(today.getHours()); //시
		System.out.println(today.getMinutes()); //분
		System.out.println(today.getSeconds()); //초
		
		
		//객체선언 - 싱글톤 패턴
		//Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		Date date1 = cal.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(date1));
		
        int year = cal.get(Calendar.YEAR);  //년
        int month = cal.get(Calendar.MONTH); //월
        int date = cal.get(Calendar.DATE); //일
        int hour = cal.get(Calendar.HOUR); //시
        int minute = cal.get(Calendar.MINUTE); //분
        int second = cal.get(Calendar.SECOND); //초
        System.out.println(year);
        System.out.println(month+1); //0-1월,1-2월,2-3월,.....11-12월
        System.out.println(date);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        
		

	}

}
