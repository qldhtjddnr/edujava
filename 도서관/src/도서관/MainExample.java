package 도서관;

import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {
		Library library = new Library();
		String name = null;
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("1.책정보 입력 | 2.전체조회 |3.단건조회|4.책대여|5.|6.|7.종료");
			System.out.println("선택>");
			int menuNo = scanner.nextInt();
			
			switch(menuNo) {
			case 1:
				System.out.println("책정보 >");
				name = scanner.next();
				String writer = scanner.next();
				library.addBook(name, writer);
				break;
			case 2:
				library.printBookList();
				break;
			case 3:
				System.out.println("책 이름 >");
				name = scanner.next();
				library.selectBookInfo(name);
				break;
			case 4:
				System.out.println("책 이름 >");
				name = scanner.next();
				library.rentalBook(name);
				break;
			case 5:
				System.out.println("책 이름 >");
				name = scanner.next();
				library.returnBook(name);
				break;
			case 6:
				library.showRank();
				break;
			case 7:
				break;
				
			}
		}
		
	}

}
