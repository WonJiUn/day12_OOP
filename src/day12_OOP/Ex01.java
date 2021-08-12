package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println(time);
	
		SimpleDateFormat s = new SimpleDateFormat("yyyy년-MM월-dd일 hh:mm:ss");
		
		String str = s.format(time);		//초단위로 얻어온 날짜를 지정한 포맷으로 변경
		System.out.println(str);
		
		Date d = new Date();
		System.out.println("date : " + d);	//미국형식의 날짜표기
		System.out.println("format(d) : " + s.format(d));
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : " + cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);	//0월 ~ 11월까지 표기
		System.out.println(cal.get(Calendar.DATE));
		
		
	}
}
