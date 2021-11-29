package com.yedam.java.quiz4;

public class MainExample {

	public static void main(String[] args) {
		//자동차 공장 공장은 하나 자동차 여러대 생성되는 인스턴스
		//자동차 공장 싱글톤
		//자동차에 시리얼 넘버붙음
		//자동차 공장을 밑에 만들어봄
		CarFactory factory = CarFactory.getInstance();//카펙토리 변수선언하고 가지고옴
		Car firstCar = factory.createCar();
		Car secondCar = factory.createCar();
		System.out.println(firstCar.getCarNumber());
		System.out.println(secondCar.getCarNumber());//자동차의 시리얼 번호가 잘 나오는지 확인
		
	}

}
