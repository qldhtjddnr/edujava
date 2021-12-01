package com.yedam.java.Class;

public class Student {
	/*
	 * //필드 //학번 //이름 //수강과목 목록 -> 최대 3과목까지 //수강과목 목록에 저장된 수강과목 수
	 * 
	 * public static int serialNumber = 1000; public int studentNo; public String
	 * studentName;
	 * 
	 * private static final int MAX_SIZE = 3; private Subject[] subjectList; private
	 * int subjectCount;
	 * 
	 * //생성자 //매개변수로 학번과 이름을 받아서 필드를 초기화
	 * 
	 * public Student(String name) { this.studentName = name ; this.studentNo = 0; }
	 * 
	 * 
	 * 
	 * //메소드 // //학생이 가지고 잇는 과목정보 public void addSubject(String subjectName, int
	 * Scorepoint) { if(this.subjectCount == Student.MAX_SIZE) {
	 * System.out.println("더잇아 입력할 수 없습니다."); return; }
	 * 
	 * }
	 * 
	 * public void printSubjectLits(){ for(int i = 0; i < this.subjectCount;i++)
	 * System.out.println(subjectList[i]); }
	 * 
	 * //2.지정된 과목의 정보확인 public void selectSubjectInfo(String name) { for(int i = 0;
	 * i< this.subjectCount;i++) { Subject subject = subjectList[i]; String
	 * subjectName = subject.getSubjectName(); if(subjectName.equals(name)) {
	 * System.out.println(subject); } } }
	 * 
	 * //출력형태 1) 학생 홍길동의 수학과목은 80점입니다. //출력형태 2) 학생 홍길동의 총점은 300점입니다. public void
	 * showStudentInfo() {
	 * 
	 * }
	 */

	// 필드
	int studentId;
	String studentName;
	Subject[] subjectList;
	static int MAX_SIZE = 3;
	int subjectIndex;

	// 생성자
	// 매개변수로 학번과 이름을 받아서 필드를 초기화
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.subjectList = new Subject[MAX_SIZE];
		this.subjectIndex = 0;
	}

	// 메소드

	// 학생이 가지고 있는 과목정보
	public void addSubject(String subjectName, int scorePoint) {
		if (this.subjectIndex < Student.MAX_SIZE) {
			Subject subject = new Subject();
			subject.setName(subjectName);
			subject.setScorePoint(scorePoint);
			subjectList[subjectIndex++] = subject;
		} else {
			System.out.println("수강과목정보를 더이상 입력할 수 없습니다.");
		}
	}

	// 출력형태 1) 학생 홍길동의 수학 괌고은 80점 입니다.
	// 출력형태 2) 학생 홍길동의 총점은 300점 입니다.
	public void showStudentInfo() {
		// 각 수강 과목 정보출력
		for (int i = 0; i < this.subjectIndex; i++) {
			System.out.println("학생 " + this.studentName + "의" + subjectList[i].getName() + "과목은 "
					+ subjectList[i].getScorePoint() + "점입니다.");
		}

		// 각 수강과목 점수의 총합
		int sum = 0;
		for (int i = 0 ; i < this.subjectIndex; i++) {
			sum+= subjectList[i].getScorePoint();
		}
		System.out.println("학생 " +this.studentName + "의 총합은 " + sum +"점 입니다.");
	}
}
