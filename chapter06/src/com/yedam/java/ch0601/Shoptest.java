package com.yedam.java.ch0601;

public class Shoptest {

	public static void main(String[] args) {
		Shop s1 = new Shop("201803120001", "abc123", "2018년 3월 12일", "홍길순", "PD0345-12", "서울시 영등포구 여의도동 20번지");
		System.out.println("주문 번호: " + s1.orderNum);
		System.out.println("주문자 아이디: " + s1.ID);
		System.out.println("주문 날짜: " + s1.date);
		System.out.println("주문자 이름: " + s1.name);
		System.out.println("주문 상품 번호: " + s1.goodsNum);
		System.out.println("배송 주소: " + s1.address);
	
		
		}

	}


