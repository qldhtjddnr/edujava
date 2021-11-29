package 과제;

public class BuyTrans {

	public static void main(String[] args) {
		Customer Kim = new Customer("Kim", 8000);
		Customer Lee = new Customer("Lee", 9800);

		
		StarCoffee americano = new StarCoffee("아메리카노", 4000 );
		Kim.take(americano);
		
		BeanCoffee latte = new BeanCoffee("라떼", 4500);
		Lee.take(latte);
		 
		System.out.println("아메리카노를 4000원에 결재하셨습니다.");
		americano.showInfo();
		System.out.println("라떼를 4500원에 결재하셨습니다.");
		latte.showInfo();
		
		Kim.showInfo();
		Lee.showInfo();

		
		
		
		System.out.println();
		//--------------------------------------------------
		
		Card kbCard = new Card();
		System.out.println(Card.getSerialNum());
	
		Card kdbCard = new Card();
		System.out.println(Card.getSerialNum());
	
		
		kbCard.setCardtName("kbCard");
		System.out.println(kbCard.getCardtName() + " : " + kbCard.getCardNum());
		
		kdbCard.setCardtName("kdbCard");
		System.out.println(kdbCard.getCardtName() + " : " + kdbCard.getCardNum());

		
		
		System.out.println();
		//-----------------------------------------------------------------
		
		CardCompany company = CardCompany.getInstance();
		System.out.println("카드회사가 설립되었습니다.");
		System.out.println("카드회사가 운영중입니다.");
		Card firstCard = company.createCard();
		System.out.println("카드가 생성되었습니다.");
		Card secondCard = company.createCard();
		System.out.println("카드가 생성되었습니다.");
		
		System.out.println("첫번째 카드: " + firstCard.getCardNum());
		System.out.println("두번째 카드: " + secondCard.getCardNum());
		
		
		

	}

}
