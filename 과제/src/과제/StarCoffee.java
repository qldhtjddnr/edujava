package 과제;

public class StarCoffee {
	//필드
	int customer;
	int price;
	String coffeeName;
	int income;
	
	//생성자
	public StarCoffee (String coffeeName, int price) {
	
		this.coffeeName = coffeeName;
		this.price =price;//위에서 값을 갖고오기위해 public StarCoffee에 값을 적어줌
		this.income = 0;
		this.customer = 0;
		
	}
	
	
	//메서드-> 타입 메서드명(메서드를 구동하는데 필요요소)
	public void makeCoffee(){
		// a+=b
		// a=a+b
		customer++ ;
		income += price;
		
	}
	
	void showInfo() {
		//void showIn
		System.out.printf("별다방 별다방 1호점의 손님은 %d이고 수입은 %d 원입니다.\n",customer, price);
	}

	public int getPrice() {
		return price;
	}
}
