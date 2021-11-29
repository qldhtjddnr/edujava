package com.yedam.java.ch02_02;

public class HankukTire extends Tire {
	//생성자
	public HankukTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation <maxRotation) {
			System.out.println(location + "HankukTire 수명 :" + (maxRotation - accumulatedRotation) + " 회");
			return true;
		}else {
			System.out.println("***" + location + " HankukTire 평크 ***");
			return false;
		}
	}
}
