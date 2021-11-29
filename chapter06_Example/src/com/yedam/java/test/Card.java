package com.yedam.java.test;

public class Card {
	
	private static int serialNum = 1000;
	private int cardNumber;
	
	public Card() {
		Card.serialNum++;
		this.cardNumber = serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Card.serialNum = serialNum;
	}
	public static int getSerialNum() {
		return serialNum;
	}


	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCardNumber() {
		return cardNumber;
	}




}
