package com.yedam.java.ch0201;

public class Quiz {

	public static void main(String[] args) {
		// 문제1) 정수형 변수 3개를 이용하여
		// 정수값 54와 36을 아래와 같이 출력하는 프로그램을 만들어라.\
		// 54 + 36 = 90
		// 54 - 36 = 18
		// 54 * 36 =
		// 54 / 36 =

		int x, y, z;

		x = 54;
		y = 36;
		z = x + y;
		System.out.println(x + "+" + y + "=" + z);
		z = x - y;
		System.out.println(x + "-" + y + "=" + z);
		z = x * y;
		System.out.println(x + "*" + y + "=" + z);
		z = x / y;
		System.out.println(x + "/" + y + "=" + z);

		
		System.out.println();
		// 문제2) 다음과 같이 각 변수에 값이 지정되어 있을 때
		// 아래와 같이 출력하는 프로그램을 만들어라.
		// a:50, b:90, c : 10
		int a = 10, b = 50, c = 90;

		int temp;
		temp = a;
		a = b;
		b = c;		
		c = temp;
		System.out.println("a: " + a +" "+"b: " + b +" "+"c: " + c);

		
		
		System.out.println();
		// 문제3) 다음과 같이 오류가 날 경우 1라인만 수정하여
		// 아래와같이 출력하는 프로그램을 만들어라.

		int m = 10;

		if (m == 10) {
			int n = 21;
			int sum = m + n;

			System.out.println("sum:" + sum);
		}
	}

}
