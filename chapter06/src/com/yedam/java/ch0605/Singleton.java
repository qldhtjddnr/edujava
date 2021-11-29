package com.yedam.java.ch0605;

public class Singleton {

	private static Singleton singleton = new Singleton();      //힙영역에 객체가 생성되어 위의 singleton에 객체가 생김
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
	
}
