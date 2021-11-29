package com.yedam.java.quiz;

public class MyDate {

	// 클래스 완성하기
	// day(int), month(int), year(int) 필드는 private로 선언합니다.
	// 각 필드의 get, set 메서드를 public으로 만듭니다.
	// MyDate(int day, int month, int year)생성자를 만듭니다.
	// public boolean isValid()메서드를 만들어 날짜가 유효한지 확인합니다.

	// 필드
	private int day, month, year;

	// 생성자
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// 메서드
	public void setDay(int day) {	
			this.day = day;
	}
	public int getDay() {
		return day;
	}

	public void setMonth(int month) {
			this.month = month;
	}
	public int getMonth() {
		return month;
	}

	public void setYear(int year) {
			this.year = year;
	}
	public int getYear() {
		return year;
	}

	public boolean isValid() {
		int startOfMonth = 1;
		int endOfMonth = 0;
		switch(this.month) {
		case 2:
			endOfMonth = 28;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			endOfMonth = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
		}
		
		if(this.day >= startOfMonth && this.day <= endOfMonth) {
		return true;	
		}else {
			return false;
		}
	
	}

}
