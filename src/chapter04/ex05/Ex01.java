package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		// 단축키 : Ctrl + Shift + f <== 코드 자동정렬
		// 단축키 : Ctrl + Alt + Down(화살표) <== 선택된 라인 복사
		// 단축키 : Alt + Up/Down <== 선택 라인 이동

		// 스캐너로 번호를 인풋 받아서, 4번 누르기 전까지는 무한루프
		// do while, if, for-for

		Scanner sc = new Scanner(System.in);
		int A;

		do {
			System.out.println("===========================================================");
			System.out.println("1. 구구단 출력 | 2. 19단 출력 | 3. 19단의 7의배수 출력 | 4. 프로그램 종료");
			System.out.println("===========================================================");
			System.out.println("위의 번호를 입력 하시오>>>");
			A = sc.nextInt();

			if (A == 1) {
				System.out.println("===== 1. 구구단 출력 =====\n");
				for (int i = 1; i < 10; i++) {
					System.out.println(i + "단");
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d * %d = %d\t", i, j, i * j);
					}
					System.out.println();
				}

			} else if (A == 2) {
				System.out.println("===== 2. 19단 출력 =====\n");
				for (int i = 1; i < 20; i++) {
					System.out.println(i + "단");
					for (int j = 1; j < 20; j++) {
						System.out.printf("%d * %d = %d\t", i, j, i * j);
					}
					System.out.println();
				}

			} else if (A == 3) {
				System.out.println("===== 3. 19단의 7의배수 출력 =====\n");
				for (int i = 7; i < 20; i += 7) {
					System.out.println(i + "단");
					for (int j = 1; j < 20; j++) {
						System.out.printf("%d * %d = %d\t", i, j, i * j);
					}
					System.out.println();
				}

			} else if (A == 4) {
				System.out.println("===== 4. 프로그램 종료 ======");
				break;

			} else {
				System.out.println("===== 잘못 입력하셨습니다. 다른 정수를 다시 입력해주세요. =====");
			}
			System.out.println();
		} while (true);

		System.out.println("프로그램이 종료되었습니다.\n감사합니다.");

		sc.close();

	}
}
