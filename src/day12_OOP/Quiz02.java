package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Date;

class TimerQuiz{
	private Date date;
	private SimpleDateFormat simpl;
	
	public void setDate() {
		date = new Date();
		simpl = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		
	}
	public String getDate() {
		return simpl.format(date);
	}
	
	public void time() {
		for(int i = 0; i<10; i++) {
			setDate();
			String s = getDate();
			System.out.println(s);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			
		}
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		
		TimerQuiz t = new TimerQuiz();
		
		t.time();
		
		System.out.println("�����մϴ�");
		
		
		
		
		
	}
}
