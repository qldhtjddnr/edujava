package com.yedam.java.test;

public class CardTest {

	public static void main(String[] args) {
		
		Card cardkd1 = new Card();
		System.out.println(Card.getSerialNum());

		Card cardkd2 = new Card();
		System.out.println(Card.getSerialNum());
		
		cardkd1.setCardNumber("kbCard");
		System.out.println(cardkd1.getCardNumber());
		
		cardkd2.setCardNumber("kbCard");
		System.out.println(cardkd2.getCardNumber());
		
		
		
		CardCompany company = CardCompany.getInstance();
		System.out.println("카드회사가 설립되었습니다.");
		System.out.println("카드회사가 운영중입니다.");
		Card firstCard = company.createCard();
		System.out.println("카드가 생성되었습니다.");
		Card secondCard = company.createCard();
		System.out.println("카드가 생성되었습니다.");
		
		System.out.println("첫번째 : " + firstCard.getCardNumber());
		System.out.println("두번째 : " + secondCard.getCardNumber());
	}

}
