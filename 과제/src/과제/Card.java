package 과제;

public class Card {
	private static int serialNum = 1000 ;
	
	private int cardNum;
	private String cardtName;

	
	//생성자
	public Card() {
		Card.serialNum++;
		this.cardNum = serialNum;
		this.cardNum = this.cardNum;

	}

	
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Card.serialNum =serialNum;
	}


	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}


	
	public String getCardtName() {
		return cardtName;
	}
	public void setCardtName(String cardtName) {
		this.cardtName = cardtName;
	}
	
	
	
	

	//메소드
}