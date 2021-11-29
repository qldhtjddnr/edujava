package com.yedam.java.ch0601;

public class Shop {
	//문제2) 쇼핑몰에 주문이 들어왔습니다. 주문 내용은 다음과 같습니다.
			//		<<주문 내용>>
			//		주문 번호 : 201803120001
			//		주문자 아이디 : abc123
			//		주문 날짜 : 2018년 3월 12일
			//		주문자 이름 : 홍길순
			//		주문 상품 번호 : PD0345-12
			//		배송 주소 : 서울시 영등포구 여의도동 20번지
			//		위 주문 내용에 대한 클래스를 만들고
			//		주문 내용을 인스턴스로 생성한 후 위와 같은 형식으로 출력하세요.
	

	String orderNum;
	String ID  ;
	String date ;
	String name  ;
	String goodsNum ;
	String address ;
	
	public Shop(String o, String I, String d, String n, String g, String a) {
		orderNum = o;
		ID = I;
		date = d;
		name = n;
		goodsNum = g;
		address =a;
		
	}
}
