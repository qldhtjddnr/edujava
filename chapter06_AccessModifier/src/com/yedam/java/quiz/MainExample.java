package com.yedam.java.quiz;

public class MainExample {

	public static void main(String[] args) {
		//문제1)
		MyDate date1 = new MyDate(30, 2, 2000);
		date1.setDay(30);
		date1.setMonth(20);
		date1.setYear(2000);
		System.out.println(date1.isValid() == true?  "유효하지 않은 날짜입니다." : "유효한 날짜입니다.");
		//유효하지 않은 날짜입니다.
		
		MyDate date2 = new MyDate(2, 10, 2006);
		date2.setDay(2);
		date2.setMonth(10);
		date2.setYear(2006);
		System.out.println(date2.isValid() + "유효한 날짜입니다 ");
                                                                                                                                             
		//유효한 날짜입니다.

	}

}
