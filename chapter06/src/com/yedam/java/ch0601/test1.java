package com.yedam.java.ch0601;

import java.util.Scanner;

public class test1 {

		 public static void main(String[] args) {
		      // 문제2) 두 수를 입력받아 두수의 대소관계 및 사칙연산을 수행하는 프로그램을 구현하세요.
		      // 메뉴는 아래와 같이 구성합니다.
		      // input.숫자입력 | +.더하기 | -.빼기 | *.곱하기 | /.나누기 | ?.대소관계 | exit.종료
		      
		      Scanner scanner = new Scanner(System.in);
		      
		      int x =0;
		      int y = 0;
		      
		      boolean run = true;
		      while(run) {
		         System.out.println("input.숫자입력 | +.더하기 | -.빼기 | *.곱하기 | /.나누기 | ?.대소관계 | exit.종료");
		         System.out.println("수행해야할 명령을 입력하세요.");
		         String menu = scanner.nextLine();
		         
		         switch(menu) {
		         case "input":
		            x = Integer.parseInt(scanner.nextLine());
		            y = Integer.parseInt(scanner.nextLine());
		            break;
		         case"+":
		            System.out.printf("%d + %d = %d\n", x, y, x + y);
		            break;   
		         case"-":
		            System.out.printf("%d - %d = %d\n", x, y, x - y);
		            break;   
		         case"*":
		            System.out.printf("%d * %d = %d\n", x, y, x * y);
		            break;   
		         case"/":
		            System.out.printf("%d / %d = %d\n", x, y, x / y);
		            break;   
		         case"?":
		            if(x > y) {
		               System.out.printf("%d가 %d보다 작습니다.\n", x ,y);
		            }else if(x<y) {
		               System.out.printf("%d가 %d보다 큽니다.\n", x ,y);
		            }else if (x == y) {
		            	System.out.printf("%d가 %d와 같습니다..\n", x ,y);
		            
		            break;
		            }
		         case "exit" :
		        	 run = false ;

		        	 System.out.println("종료하겠습니다.");
		        	 break;
		        	 
		         }
		      }
		   }

		}