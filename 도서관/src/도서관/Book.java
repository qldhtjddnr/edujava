package 도서관;

public class Book {
	//필드
	
	public static int serialNumber = 1000;
	
	public int bookNo;//책번호
	public String bookName;//책이름
	public String bookWriter;//지은이
	public int rentalCount;//대여횟수
	public boolean rental;//대여유무

	// 생성자
	public Book(String name, String writer) {
		Book.serialNumber++;
		this.bookNo = Book.serialNumber;
		this.bookName = name;
		this.bookWriter = writer;
		this.rentalCount = 0;
		this.rental = false;
	}

	public static int getSerialNumber() {
		return serialNumber;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookName(String name) {
		this.bookName = name;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookWriter(String writer) {
		this.bookWriter = writer;
	}
	
	public String getBookWriter() {
		return bookWriter;
	}
	public void rentalCountUP() {
		this.rentalCount++;
	}
	public int getRentalCount() {
		return rentalCount;
	}
	
	public void setRental(boolean rental) {
		this.rental = rental;
	}
	
	public boolean isRental() {
		return rental;	
	}

	@Override
	public String toString() {
		String rental = this.rental ? "유" : "무";
		return "책 정보, 고유번호 : " + bookNo 
				+ ", 이름 : " + bookName 
				+ ", 지은이 : " + bookWriter 
				+ ", 대여 : " + rental 
				+ ", 대여횟수 : " + rentalCount;
	}
	
	
	
	
	
	
	
	
}