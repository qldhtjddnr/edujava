package com.yedam.java.quiz4;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	
	public static CarFactory getInstance() {
		return instance;
	}//카펙토리 싱글톤 공장 하나 만듦(정적메소드)

	public Car createCar() {
		return new Car();//인스턴스에서 만든것 , 카라는 연산자를 만들어~
		
	}
	
	
}
