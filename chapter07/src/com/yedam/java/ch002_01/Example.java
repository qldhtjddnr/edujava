package com.yedam.java.ch002_01;

public class Example {

	public static void main(String[] args) {
		// 자동타입변환
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b2 = d;
		C c2 = e;
		
		//B b3 = e;
		//C c3 = d;
		
		//===자동타입변환 후 멤버를 접근하는데 제한이됨
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent =child;// parent가 child   라는 인스턴트가 됨
		parent.method1();
		parent.method2();
		//parent.method3();//인스턴스는 소유하고있지만 선언되지 않아서 실행안됨
		
		Parent temp = new Parent();
		temp.method1();
		temp.method2();
	}

}
