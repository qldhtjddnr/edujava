package 과제;

public class Customer {
	String name;//이름
	int money;//보유하고 있는 돈

	//생성자
	Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	//메소드
	
	//탄다 
	public void take(StarCoffee starcoffee) {
		money -= starcoffee.getPrice();
		System.out.println("");
		starcoffee.makeCoffee();
	}
	
	public void take(BeanCoffee beancoffee) {
		money -= beancoffee.getPrice();
		System.out.println("");
		beancoffee.makeCoffee();
	}

	//학생정보
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은" + money + "입니다.");
	}

}
