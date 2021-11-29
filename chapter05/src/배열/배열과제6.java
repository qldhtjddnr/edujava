package 배열;

import java.util.Scanner;

public class 배열과제6 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				if (studentNum > 0) {
					for (int k = 0; k < scores.length; k++) {
						System.out.print("scores[" + k + "] > ");
						scores[k] = Integer.parseInt(scanner.nextLine());
					}

				} else if (selectNo == 3) {
					for (int i = 0; i < scores.length; i++) {

						System.out.println("scores[" + i + "] > " + scores[i]);

					}

				} else if (selectNo == 4) {
					int maxScore = 0;
					double avgScore = 0.0;
					int sumScore = 0;

					for (int i = 0; i < (scores.length) - 1; i++) {
						if (scores[i] < scores[i + 1]) {
							maxScore = scores[i + 1];
						}
					}
					System.out.println("최고점수 : " + maxScore);

					for (int j = 0; j < scores.length; j++) {
						sumScore += scores[j];
					}
					System.out.println("평균점수 : " + (double) sumScore / scores.length);

				} else if (selectNo == 5) {
					run = false;

				}
			}

			System.out.println("프로그램 종료");

		}

	}
}
