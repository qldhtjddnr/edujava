package com.yedam.java.ch0605;

public class Calculator {
	//필드
	static double pi = 3.141592;
	//생성자
	
	//메소드
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;//정적멤버는 인스턴스멤버를 포함할 수 없지만 인스턴스 멤버는 정적멤버를 포함할 수 있다.
		           //static 붙이면 정적 메소드로 만들 수 있다.
	}
}
