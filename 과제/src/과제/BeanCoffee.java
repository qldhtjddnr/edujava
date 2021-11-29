package 과제;

public class BeanCoffee {
	//필드
	String coffeeName;
	int price;
	int passengerCount;
	int todayIncome;

	//생성자
	public BeanCoffee(String coffeeName, int price) {
		this.coffeeName = coffeeName;
		this.price = price;
		this.passengerCount = 0;
		todayIncome = 0;
	}
	
	//메서드
	public void makeCoffee() {
		passengerCount++;
		todayIncome += price;
	}
	
	public void showInfo() {
		System.out.printf("콩다방 콩다방 1호점의 손님은 %d 이고 수입은 %d 원입니다\n", passengerCount,  price);
	}

	public int getPrice() {
		return price;
	}
}
