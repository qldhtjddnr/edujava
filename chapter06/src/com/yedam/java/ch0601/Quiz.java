package com.yedam.java.ch0601;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Order order = new Order();
		order.setOrderNo("201803120001");
		order.setCustomerId("abc123");
		order.setOrderDate("2018년 3월 12일");
		order.setCustomerName("홍길순");
		order.setProductNo("PD0345-12");
		order.setCustomerAddress("서울시 영등포구 여의도동 20번지");
		
		System.out.println("주문번호 : " + order.getOrderNo());
		System.out.println("주문번호 : " + order.getCustomerId());
		System.out.println("주문번호 : " + order.getOrderDate());
		System.out.println("주문번호 : " + order.getCustomerName());
		System.out.println("주문번호 : " + order.getProductNo());
		System.out.println("주문번호 : " + order.getCustomerAddress());
		
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		excute(x, y);
		
	}
	
	public static int plus(int x, int y) {
		return x +y;
	}
	
	public static int minus (int x, int y) {
		return x-y;
	}
	
	public static int multi(int x, int y) {
		return x*y;
	}
	public static int divide(int x, int y) {
		return x/y;
	}
	
	public static void excute(int x, int y) {
		System.out.println("+ : " + plus(x,y));
		System.out.println("+ : " + minus(x,y));
		System.out.println("+ : " + multi(x,y));
		System.out.println("+ : " + divide(x,y));
	}
	

}
