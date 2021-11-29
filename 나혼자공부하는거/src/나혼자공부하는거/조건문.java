package 나혼자공부하는거;

public class 조건문 {

	public static void main(String[] args) {
		/*
		 * if(false) { System.out.println(1); System.out.println(2);
		 * System.out.println(3); System.out.println(4); } System.out.println(5);
		 */
		/*
		 * if(false) { System.out.println(1); }else { System.out.println(2); }
		 */
		String id = args[0];
        if(id.equals("egoing")){
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}