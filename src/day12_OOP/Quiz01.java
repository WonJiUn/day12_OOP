package day12_OOP;

import java.io.IOException;
import java.util.*;

class Win7{
	private String s = null;
	private HashMap map = new HashMap();
	private ArrayList arr;
	
	
	
	public boolean flag() {
		return false;
	}
	public void PB(String s) {
		ProcessBuilder pro = new ProcessBuilder((String)map.get(s));
		if(map.containsKey(s)) {
			System.out.println(map.get(s) + " �����մϴ�");
			
			try {
				pro.start();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}else {
			System.out.println("���� ��� �Դϴ�");
		}
		
		
	}
	public void HashMap() {
		this.map.put("�޸���", "notepad.exe");
		this.map.put("����", "calc.exe");
		//System.out.println("1. �޸���");
		//System.out.println("2. ����");
		
	}
	
	public ArrayList getarr() {
		arr = new ArrayList();
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			arr.add(it.next());
		}
		return arr;
	}
	
	
}

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Win7 w = new Win7();
		boolean flag = true;
		int select = 0;
		String s = null;
		ArrayList arr = null;
		
		System.out.println("===== ȯ �� �� �� �� =====");
		while(flag) {
			
			System.out.println("1. ���");
			System.out.println("2. off");
			System.out.print("�Է� >>>> ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("��� ���� ���");
				w.HashMap();
				w.getarr();
				arr = w.getarr();
				for(int i = 0; i<arr.size(); i++) {
					System.out.println((i+1) + " : " + arr.get(i));
				}
				System.out.print("����� ��� �Է� : ");
				s = sc.next();
				w.PB(s);
				
				break;
			case 2:
				System.out.println("�����մϴ�");
				flag = w.flag();
				break;
			default : System.out.println("1 �Ǵ� 2�� �Է����ּ���");
			}
		}
		
	}
}
