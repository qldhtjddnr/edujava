package com.yedam.java.test;

public class CoffeeTest {

	public static void main(String[] args) {
		Customer Kim = new Customer("Kim", 10000);
		Customer Lee = new Customer("Lee", 10000);
		
		Coffee1 americano1 = new Coffee1("별다방");
		Kim.buy(americano1);
		
		Coffee2 latte2 = new Coffee2("콩다방");
		Lee.buy(latte2);
		
		Kim.showInfo();
		Lee.showInfo();
		
		americano1.showInfo();
		latte2.showInfo();
	}

}
