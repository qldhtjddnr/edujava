package com.yedam.java.Class;

public class MainExample {

	public static void main(String[] args) {
		//1001학번 Lee와 1002학번 Kim, 두학생이 있습니다.
		//Lee학생은 2과목을 수강합니다. 국어점수가 100점, 수학점수가 50점입니다.
		//Kim학생은 3과목을 수강, 국어점수가 70점, 수학점수가 85점, 영어점수가 100점이다.
		//Student 클래스와 Subject 클래스를 생성한 후 두학생의 과목성적과 총점을 출력하는 프로그램
	
		Student lee = new Student(1001, "Lee");
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 50);
		lee.showStudentInfo();
		
		System.out.println();
		
		Student kim = new Student(1002, "kim");
		kim.addSubject("국어", 70);
		kim.addSubject("수학", 85);
		kim.addSubject("영어", 100);
		kim.showStudentInfo();
	}

}
