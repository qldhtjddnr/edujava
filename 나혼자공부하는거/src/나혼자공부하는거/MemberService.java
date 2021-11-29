package 나혼자공부하는거;

public class MemberService {
	
	
	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {   // (&&)and연산자 둘다 성립할때
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
