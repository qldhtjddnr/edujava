package 나혼자공부하는거;

public class EqualDemo {

	public static void main(String[] args) {
		System.out.println(1 == 2);
		System.out.println(1 != 1);
		System.out.println("one" == "two");
		System.out.println("one" == "one");
		
		
		String a = "Hello World";
		String b = new String ("Hello World");
		System.out.println(a ==b);
		System.out.println(a.equals(b)); //문자열이 같은지 알고싶을 때
		
	}

}
