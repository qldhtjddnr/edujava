package 도서관;

public class Library {

	// 필드

	private static final int MAX_SIZE = 5;
	private Book[] bookList;// 보유중인 책정보
	private int bookCount;// 보유중인 책수량

	// 생성자
	public Library() {
		this.bookList = new Book[MAX_SIZE];
		this.bookCount = 0;// 현재 북 정보에대해 가지고 있는정보 //몇개가 있는지에대한거//1.북리스트에 현재 비어있는 역할// 2.북리스트의 정보수 역할
	}

	// 메소드
	// 3.책에대한 입고처리
	public void addBook(String name, String writer) {
		if (this.bookCount == Library.MAX_SIZE) {
			System.out.println("더이상 책 정보를 입력할 수 없습니다.");
			return;
		}
		Book book = new Book(name, writer);
		bookList[bookCount] = book;
		bookCount++;
		System.out.println("정상 입고되었습니다.");
	}
	// 1.현재 보유중이 책 정보 확인

	public void printBookList() {
		for (int i = 0; i < this.bookCount; i++)
			System.out.println(bookList[i]);
	}

	// 2. 지정된 책 정보 확인
	public void selectBookInfo(String name) {
		for (int i = 0; i < this.bookCount; i++) {
			Book book = bookList[i];
			String bookName = book.getBookName();
			if (bookName.equals(name)) {
				System.out.println(book);
			}
		}
	}

	// 4. 책을 대여 -> rentalBook
	// -> 해당되는 책을 찾은 경우 1. 행당 책의 대여유무 확인
	// 2. 대여되지 않은 경우 대여 처리
	// 3. 대여횟수 증가
	public void rentalBook(String name)/* 외부에서 네임을 넘겨받아 */ {
		for (int i = 0; i < this.bookCount; i++) {
			Book book = bookList[i];
			String bookName = book.getBookName();
			if (bookName.equals(name)) {
				if (!book.isRental()) {
					book.setRental(true);
					book.rentalCountUP();
					System.out.printf("책 %s이 대여되었습니다.", name);
				} else {
					System.out.printf("책 %s이 대여중입니다.", name);

				}
			}
		}

	}

	// 5. 책 반납
	public void returnBook(String name)/* 외부에서 네임을 넘겨받아 */ {
		for (int i = 0; i < this.bookCount; i++) {
			Book book = bookList[i];// 값을 하나씩 꺼내온다
			String bookName = book.getBookName();// 내가 보유하고 있는 책네임을 가져온다
			if (bookName.equals(name)) {// 책이 맞는지 비교하는거
				book.setRental(false);
				System.out.printf("책 %s이 반납되었습니다.", name);
			}

		}
	}

	public void showRank() {
		Book[] rank = new Book[bookCount];
		System.arraycopy(bookList, 0, rank, 0, bookCount);

		for (int i = 0; i < rank.length - 1; i++) {
			for (int j = i + 1; j < rank.length; j++) {
				if (rank[i].getRentalCount() < rank[j].getRentalCount()) {
					Book temp = rank[i];
					rank[i] = rank[j];
					rank[j] = temp;

				}
			}
		}
		for (Book book : rank) {
			System.out.println(book);
		}
	}
}

// 6. 대여 횟수를 기준으로 인기순위 확인
