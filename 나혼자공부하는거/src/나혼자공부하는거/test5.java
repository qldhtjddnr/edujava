package 나혼자공부하는거;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {

		int max = 0;
		int min = 1;
		int[] array = { 1, 2, 3, 4, 5 };

		boolean run = true;
		int goodsNum = 0;
		int[] price = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("=== 1.학생수 입력 | 2.학생점수 입력 | 3.학생점수 전체조회 | 4.학생점수 분석 | 5. 종료 ===");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("학생 수 > ");
				goodsNum = Integer.parseInt(scanner.nextLine());
				price = new int[goodsNum];
				

			} else if (selectNo == 2) {
				if (goodsNum > 0) {
					for (int k = 0; k < price.length; k++) {
						System.out.println("점수:");
						price[k] = Integer.parseInt(scanner.nextLine());
					}
				
				}
				
				
			} else if (selectNo == 3) {
				for (int i = 0; i < price.length; i++) {
					System.out.println("점수[" + "학생"+( i+1 )+ "점수"+"] : " + price[i]);
				}
				
				
				
			} else if (selectNo == 4) {
				System.out.print("분석 > ");
				int maxPrice = max;
				double sum = 0.0;
				int sumprice = 0;
				int result;
				
				
				for (int i = 0; i < (price.length) - 1; i++) {
					if (price[i] < price[i + 1]) {
						maxPrice = price[i + 1];
					}
				}
				System.out.println("최고가격 : " + maxPrice);

				
				for (int j = 0; j < price.length; j++) {
					sumprice += price[j];
				}
				result = sumprice - maxPrice;
				System.out.println("최고가격의 제품을 제외한 나머지의 합 : "+ result);

			} else if (selectNo == 5) {
				run = false;

			}
		}

		System.out.println("프로그램 종료");

	}

}
