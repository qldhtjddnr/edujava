package com.yedam.java.ch0503;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		// 문제) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 가격을 입력받을 수 있도록 구현하세요.
		// 3) 각 가격에 해당하는 제품명은 인덱스+1로 합니다.
		// 예를 들어 배열[0] = 10000 이면 10,000원인 제품은 1번째 제품입니다.
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		int max = 0;
		int[] array = { 1, 2, 3, 4, 5 };

		boolean run = true;
		int goodsNum = 0;
		int[] price = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("입력> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("상품 수 > ");
				goodsNum = Integer.parseInt(scanner.nextLine());
				price = new int[goodsNum];
				

			} else if (selectNo == 2) {
				System.out.print("가격입력 > ");
				if (goodsNum > 0) {
					for (int k = 0; k < price.length; k++) {
						System.out.print("제품번호[" + (k+1 )+ "] > ");
						price[k] = Integer.parseInt(scanner.nextLine());
					}
				
				}
				
				
			} else if (selectNo == 3) {
				System.out.print("제품별 가격 > ");
				for (int i = 0; i < price.length; i++) {
					System.out.println("제품 가격[" + ( i+1 )+ "] > " + price[i]);
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
