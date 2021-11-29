package com.yedam.java.ch0503;

import java.util.Scanner;

public class test2 {

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
		
		Scanner scanner = new Scanner(System.in);
		int productNum = 0;
		int[] products = null;//초기화while문안에서 돌리기위해

		
		
		boolean run = true;
		while(run) {
			System.out.println("1.상품 수 , 2.가격 입력 , 3.제품별 가격, 4.분석, 5.종료");
			System.out.println("선택 : ");
			int selectNo  = Integer.parseInt(scanner.nextLine());
			
			switch(selectNo){
			case 1: 
				System.out.println("상품 수>");
				productNum = Integer.parseInt(scanner.nextLine());
				products = new int[productNum];
				break;
			case 2:
				for(int i =0; i<products.length; i++) {
					System.out.println((i+1)+ "번째 제품 >");
					products[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
			case 3:for(int i = 0; i < products.length; i++) {
				System.out.println((i+1)+ "번째 제품 : " + products[i]);
			}
				break;
			case 4:
				int max = 0;
				for(int product : products) {
					if(max < product) {
						max = product;
					}
				}
				int sum = 0;
				int index = 0;
				for(int i=0; i< products.length; i++) {
					if(products[i] == max) {
						index = i +1;
						continue;
					}
					sum += products[i];
				}
				
				System.out.println("최고 가격을 가진 제품은 : " + index + "입니다.");
				System.out.println("최고 가격을 제외한 제품들의 합은 : " + sum + "입니다.");
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료합니다.");
				break;
			}
		}

	}

}
