package com.yedam.java.test;

public class Coffee2 {
	
	String latte;
	int money;

	
	public Coffee2(String latte) {
		this.latte = latte;
		this.money = 0 ;
		
	}
	
	public void buy(int money) {
		this.money += money;

	}
	
	public void showInfo() {
		System.out.printf("아침출근길에 김씨는 카페 s%에서 d%원을 내고 s%를 사먹었습니다.\n", latte, money,latte );
	}

}
