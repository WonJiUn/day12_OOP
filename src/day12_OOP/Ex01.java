package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println(time);
	
		SimpleDateFormat s = new SimpleDateFormat("yyyy��-MM��-dd�� hh:mm:ss");
		
		String str = s.format(time);		//�ʴ����� ���� ��¥�� ������ �������� ����
		System.out.println(str);
		
		Date d = new Date();
		System.out.println("date : " + d);	//�̱������� ��¥ǥ��
		System.out.println("format(d) : " + s.format(d));
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : " + cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);	//0�� ~ 11������ ǥ��
		System.out.println(cal.get(Calendar.DATE));
		
		
	}
}
