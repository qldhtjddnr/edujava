package com.yedam.java.ch0605;//여기가 힙영역

public class MainExample {
	String message;//String 메시지라는 필드를 가짐
	
	void println() {
		System.out.println(this.message);//실행클래스로써 직접적으로 메소드르 가지고 있진 않음..//이것들은 인스턴스 멤버들임
	}
	
	public static void main(String[] args) {   //static을 써줌으로서 정적멤버로 선언되는거 
		//인스턴스 멤버와 this
		Car myCar = new Car("포르쉐");//뉴연산자로 인스턴스를 만든과정
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
		
		// 정적멤버 사용
		double result1 = 10* 10*Calculator.pi;//클래스 명을 이용하고 도트연산자를 활용해 pi를 가져옴
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		//정적메소드 선언 시 주의할 점
		MainExample main = new MainExample();
		main.message ="Today is...!";
		main.println();
		
		//싱글톤
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체입니다.");
		}else {
			System.out.println("다른 singleton 객체입니다.");
		}
		
		//final
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.ssn = "654321-7654321";
		p1.name = "홍삼원";
		
		//상수선언및 사용
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 : " + Earth.EARTH_AREA + "km^2");
		
	}

}
