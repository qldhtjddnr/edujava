package com.yedam.java.ch0601;

import java.util.Scanner;

public class test2 {

	 public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);

	      boolean run = true;

	      int[] dice = null;
	      int size = 0;

	      while (run) {
	         System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료===");

	         System.out.println("메뉴 >");
	         int selectNo = Integer.parseInt(scanner.nextLine());

	         switch (selectNo) {
	         case 1:
	            System.out.println("주사위 크기>");
	            size = Integer.parseInt(scanner.nextLine());
	            if (size < 5 || size > 10) {
	               size = 0;
	               System.out.println("입력한 값이 벗어났습니다. 5~10 사이의 수를 입력해주세요.");
	            } else {
	               dice = new int[size];
	            }
	            break;
	         
	         case 2:
	            int count =0;
	            while(true) {
	               int random = (int)(Math.random()* size) +1;
	               dice[random -1]++;
	               count++;
	               if(random == 5) {
	                  break;
	               }
	            }
	            System.out.println("5가 나올 때까지 주사위를" + count + "번 굴렸습니다.");
	            break;
	         
	         case 3:
	            for(int i= 0; i<dice.length;i++) {
	               System.out.println((i+1) +"은"+ dice[i] + "번 나왔습니다.");
	            }   
	            break;
	         
	         case 4:
	            int max = 0;
	            for(int num : dice) {
	               if(max< num) {
	                  max = num;
	               }
	            }
	            
	            int i=0;
	            for(; i<dice.length; i++) {
	               if(dice[i] == max) {
	                  break;
	               }
	            }   
	            System.out.println("가장 많이 나온 수는 " + (i+1) + "입니다.");

	            break;
	         
	         case 5:
	            run = false;
	            System.out.println("프로그램 종료");
	            break;

	         }

	      }
	   }

	}