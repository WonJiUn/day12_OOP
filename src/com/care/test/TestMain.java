package com.care.test;

import java.util.*;			//아래와 같은 이유로 삽입 필요

import com.care.zzz.*;		//현재 존재한 패키지에 해당 클래스가 없기 때문에 넣어줘야함


public class TestMain {

	public static void main(String[] args) {
		
		Test t = new Test();
		t.test();
		
		TestClass tc = new TestClass();
		tc.testClass();		//같은 패키지 안에서는 public이 없어도 디폴트로 접근이 가능하지만 다른 클래스에서는 디폴트 접근 불가능
		//Scanner
		//ArrayList<E>
		//HashSet<E>
		
		
		TestClass02 tc2 = new TestClass02();
		tc2.testClass02();
		
		a.a.a.TestClass tt = new a.a.a.TestClass();		//같은 이름인것을 두개 이상 가져다 쓰는 경우 앞에 패키지명이 붙는경우가 있음
		
		
		
		
		
	}

}
