package com.yedam.java.test;

public class Coffee1 {
	
	String americano;
	int money;

	
	public Coffee1(String americano) {
		this.americano = americano;
		this.money = 0 ;
		
	}
	
	public void buy(int money) {
		this.money += money;

	}
	
	public void showInfo() {
		System.out.printf("아침출근길에 김씨는 d%원을 내고 별다방에서 s%를 사먹었습니다.\n",americano, money );
	}

}
