package chapter04.ex05;

import java.util.Scanner;

public class Do_While_statement02 {
	public static void main(String[] args) {

		// do while 문을 사용해서 무한루프르르 돌립니다.
		// do while 문 내에서 if를 사용
		// 스캐너에서 정수 값을 입력 받아서
		// 4 : 프로그램 종료
		// 1 : "평균 출력"
		// 2 : "합계 출력"
		// 3 : "이름 출력"

		Scanner sc = new Scanner(System.in);

		int number; // 스캐너로 부터 인풋 받는 변수
		do {
			System.out.println("===============================================");
			System.out.println("1. 평균출력 | 2. 합계출력 | 3. 이름출력 | 4. 프로그램 종료");
			System.out.println("===============================================");
			System.out.println("위의 번호를 입력 하시오>>>");
			number = sc.nextInt();
			if (number == 1) {
				System.out.println(" 평균 출력 \n");
			} else if (number == 2) {
				System.out.println(" 합계 출력 \n");
			} else if (number == 3) {
				System.out.println(" 이름 출력 \n");
			} else if (number == 4) {
				System.out.println(" 프로그램 종료 ");
				break;
			} else {
				System.out.println(" 다시 번호를 입력하시오>>> \n");
			}
		} while (true);

		System.out.println(" While 문을 빠져나왔습니다. 프로그램이 종료 되었습니다.");

		sc.close();

	}
}
