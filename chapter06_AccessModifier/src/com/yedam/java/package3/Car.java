package com.yedam.java.package3;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드
	public void setSpeed(int speed) {//스피드 값을 집어넣기위해 set하고 대문자로 기본골격임
		if(speed <0) {
			this.speed = 0;
			return;// 값자체를 반환시키거나 종료시키는 역할 
		}else {
			this.speed = speed;
			return;
		}
	
	}
	public int getSpeed() {
		return speed;
		
	}
	
	public void setStop(boolean stop) {
		this.speed = 0;
		this.stop = stop;
	}
	
	public boolean isStop() {
		return stop;
	}
	
}
