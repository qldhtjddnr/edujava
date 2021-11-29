package com.yedam.java.ch02_03;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();

		
		Bus bus = new Bus ();
		Taxi taxi =new Taxi();
		
		driver.drive(bus);//여러차를몰수있지만 차를 몬다는 동작은 하나 
		driver.drive(taxi);
	}

}
