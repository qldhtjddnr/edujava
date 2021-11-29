package com.yedam.java.ch02_02;

public class KumhoTire extends Tire {
	//생ㅅ어자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);//생성자 호출하는 거  super
	}
	//메소드
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation <maxRotation) {
			System.out.println(location + "Tire 수명 :" + (maxRotation - accumulatedRotation) + " 회");
			return true;
		}else {
			System.out.println("***" + location + " KumhoTire 평크 ***");
			return false;
		}
	}
}
