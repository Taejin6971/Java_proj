package chapter04.ex06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		// 스캐너로 번호를 입력 받고 각 프로그램을 출력 하는 프로그램 작성
		// for 문 블락 내에서 scanner를 인풋 받는다

		Scanner sc = new Scanner(System.in);

		int a;
		do {
			System.out.println("=========================");
			System.out.println("1. 1부터 20까지 홀수를 차례로 출력하는 프로그램");
			System.out.println("2. 10 이하의 정수를 입력받아 정수만큼 \"JAVA 프로그래밍\" 이라고 출력하는 프로그램");
			System.out.println("3. 10개의 정수를 입력 받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램");
			System.out.println("4. 입력받은 점수만큼 성적을 입력 받아서 총점과 평균을 출력하는 프로그램");
			System.out.println("5. 프로그램 종료");
			System.out.println("=========================");

			System.out.println("위 번호를 입력 하시오>>>");
			a = sc.nextInt();

			if (a == 1) {

				System.out.println("1. 1부터 20까지 홀수를 차례로 출력하는 프로그램");
				System.out.println(" Type 1 : 증가값으로 홀수 출력");
				for (int i = 1; i <= 20; i += 2) {
					System.out.print(i + " ");
				}
				System.out.println();

				System.out.println(" Type 2 : if 조건으로 홀수 출력");
				for (int i = 1; i <= 20; i++) {
					if (i % 2 != 0) {
						System.out.print(i + " ");
					}
				}

			} else if (a == 2) {

				System.out.println("2. 10 이하의 정수를 입력받아 정수만큼 \"JAVA 프로그래밍\" 이라고 출력하는 프로그램");
				int b;
				System.out.println("1~10 까지중 하나의 정수를 입력하시오>>>");
				b = sc.nextInt();

				for (int i = 1; i <= b; i++) {
					System.out.println("JAVA프로그래핑 : " + i);
				}

			} else if (a == 3) {

				System.out.println("3. 10개의 정수를 입력 받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램");
				System.out.println("10개의 정수를 띄워서 입력하시오>>>");
				int c, count = 0; // c : 스캐너로 받아서 저장하는 변수, count : 짝수만 카운트 하는 변수
				for (int i = 1; i <= 10; i++) {
					c = sc.nextInt();
					if (c == 0) {
						continue;
					}
					if (c % 2 == 0) {
						count++;
					}
				}
				System.out.printf("입력 받은 짝수는 %d 개 입니다.", count);

			} else if (a == 4) {

				System.out.println("4. 입력받은 점수만큼 성적을 입력 받아서 총점과 평균을 출력하는 프로그램");
				System.out.println("성적을 몇개 작성할지 정수로 넣어주세요>>>");
				int b, c, sum = 0, count = 0;
				// b : 과목의 성적의 갯수 : 3 (국어,영어,수학)
				// c : 점수를 담을 변수 : for 문을 사용해서 스캐너로 인풋
				// sum : 인풋 받은 점수를 합하는 변수,
				// count : 과목의 갯수 == b
				b = sc.nextInt();
				System.out.println("각 과목의 점수를 띄워서 입력한 객수 만큼 입력 하시오>>>");
				for (int i = 1; i <= b; i++) {
					c = sc.nextInt();
					sum += c; // sum = sum + c
					count++;
				}
				double avg = (double) sum / count;
				System.out.printf("귀하의 과목 총점은 %d 이고, 평균은 %5.2f 입니다.",sum,avg);
				
			} else if (a == 5) {
				System.out.println("5. 프로그램 종료");
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
