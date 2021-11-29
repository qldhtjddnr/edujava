package com.yedam.java.ch0605;

public class Quiz6_3test {

	public static void main(String[] args) {
		Quiz6_3 memberService = new Quiz6_3();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
