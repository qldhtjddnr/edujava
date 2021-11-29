package com.yedam.java.quiz3;

public class Student {
	//필드
	private static int serialNum = 1000 ;
	
	private int studentId;//학번
	private String studentName;//학생이름
	private int grade;//학년
	private int address;//주소
	private int cardNum ;
	
	//생성자
	public Student() {
		Student.serialNum++;
		this.studentId = serialNum;
		this.cardNum = this.studentId+100;

	}

	
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSeroalNum(int serialNum) {
		Student.serialNum =serialNum;
	}
	
	
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId =studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return studentId;
	}
	public void setGrade(int grade) {
		this.grade =grade;
	}
	public int getAddress() {
		return studentId;
	}
	public void setAddress(int address) {
		this.address =address;
	}
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum =cardNum;
	}
	//메소드
}
//학번먼저생성 학번에 +100을 한게 학생 카드번호