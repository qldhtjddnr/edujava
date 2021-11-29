package com.yedam.java.test;

public class Customer {
	//필드
	String name;
	int money;
	
	//생성자
	Customer(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	//메소드
	public void buy(Coffee1 coffee1) {
		coffee1.buy(4000);
		this.money -=4000;
	}
	public void buy(Coffee2 coffee2) {
		coffee2.buy(4500);
		this.money -=4500;
	}
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은" + money + "입니다.");
	}

}
