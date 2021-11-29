package 나혼자공부하는거;

public class test3 {

	public static void main(String[] args) {
		int age = 8;
		int charge; 
		
		if(age <8) {
			charge =1000;
			System.out.printf("8세 미만은 %d원 입니다.", charge);
		}else if(age <14) {
			charge =2000;
			System.out.printf("14세 미만은 %d원 입니다.", charge);
		}else if(age <20) {
			charge =2500;
			System.out.printf("20세 미만은 %d원 입니다.", charge);
		}else if (age >= 20) {
			charge =3000;
			System.out.printf("20세 이상은 %d원 입니다.", charge);
		}
		
	}

}
