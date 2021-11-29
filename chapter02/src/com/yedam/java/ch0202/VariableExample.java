package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// 정수 리터럴

		int var1 = 0b1011; // 2진수
		int var2 = 0206; // 18진수
		int var3 = 365; // 10진수
		int var4 = 0xB3; // 16진수

		System.out.println("var1:" + var1);
		System.out.println("var2:" + var2);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);

		// byte 타입 변수
		byte v1 = -128;
		byte v2 = -30;
		byte v3 = 0;
		byte v4 = 30;
		byte v5 = 127;
		// byte v6 = 128;

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);

		// long 타입변수
		long vaR1 = 10;
		long vaR2 = 20L;
		long vaR3 = 10000000000000L;
		System.out.println(vaR1);
		System.out.println(vaR2);
		System.out.println(vaR3);

		// char 타입 변수
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';

		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

		// String 타입 변수
		String ch1 = "A";
		// char ch2 = "A";

		String name = "홍길동";
		String job = "프로그래마";
		System.out.println("성함 : " + name + ", 직업 : " + job);

		System.out.println("번호\t이름\t직업");
		System.out.println("행 단위 출력\n");
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println();
		// float 와 double 타입
		float f1 = 3.14F;
		double d1 = 3.14;

		float varF = 0.1234567890123456789f;
		double varD = 0.1234567890123456789f;

		System.out.println("f1 : " + f1);
		System.out.println("f1 : " + d1);
		System.out.println("varF: " + varF);
		System.out.println("varD : " + varD);


		// boolean 타입

		boolean stop = false    ;
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}
}