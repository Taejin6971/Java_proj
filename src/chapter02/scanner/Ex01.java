package chapter02.scanner;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		// 18:00 까지 완료.

		// 1. Scanner 등록
		// 2. 아버지 이름, 어머니 이름, 형제 이름, 자신 이름 : sc.next();
		// 아버지 나이, 어머니 나이, 형제 나이, 자신 나이 : sc.nextint();
		// 3. 스캐너로 받은 변수의 값을 출력
		// 4. 전체 나이의 합과, 평균을 구해서 소숫점 이하 2자리까지 출력

		Scanner sc = new Scanner(System.in);
		String fName;
		String mName;
		String bName;
		String myName;
		int fAge;
		int mAge;
		int bAge;
		int myAge;

		System.out.println("아버지의 이름을 입력하세요>>>");
		fName = sc.next();
		System.out.println("어머니의 이름을 입력하세요>>>");
		mName = sc.next();
		System.out.println("형제의 이름을 입력하세요>>>");
		bName = sc.next();
		System.out.println("자신의 이름을 입력하세요>>>");
		myName = sc.next();

		System.out.println("아버지의 나이를 입력하세요>>>");
		fAge = sc.nextInt();
		System.out.println("어머니의 나이를 입력하세요>>>");
		mAge = sc.nextInt();
		System.out.println("형제의 나이를 입력하세요>>>");
		bAge = sc.nextInt();
		System.out.println("자신의 나이를 입력하세요>>>");
		myAge = sc.nextInt();

		int sum = fAge + mAge + bAge + myAge;
		double avg = sum / 4.0;

		System.out.printf("입력한 가족의 이름은 %s, %s, %s, %s, 입니다.\n", fName, mName, bName, myName);
		System.out.printf("아버지 나이는 %d, 어머니 나이는 %d, 형제 나이는 %d, 자신의 나이는 %d 입니다,\n", fAge, mAge, bAge, myAge);
		System.out.printf("%s 님의 가족원의 나이의 합은 %d 이고, 평균은 %5.2f 입니다.", myName, sum, avg);

	}
}
