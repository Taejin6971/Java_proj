package chapter02.scanner;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		// 1. 스캐너 등록
		// 우리가족의 이름(String) 및 몸무게 (double)를 인풋받고, 몸무게의 합과
		// 평균을 구해서 출력 하는 프로그램을 작성
		// sc.nextDouble();
		Scanner sc = new Scanner(System.in);
		String fName;
		String mName;
		String bName;
		String myName;
		double fWeith;
		double mWeith;
		double bWeith;
		double myWeith;

		System.out.println("아버지의 이름을 입력하세요>>>");
		fName = sc.next();
		System.out.println("어머니의 이름을 입력하세요>>>");
		mName = sc.next();
		System.out.println("형제의 이름을 입력하세요>>>");
		bName = sc.next();
		System.out.println("자신의 이름을 입력하세요>>>");
		myName = sc.next();
		System.out.println("아버지의 몸무게를 입력하세요>>>");
		fWeith = sc.nextDouble();
		System.out.println("어머니의 몸무게를 입력하세요>>>");
		mWeith = sc.nextDouble();
		System.out.println("형제의 몸무게를 입력하세요>>>");
		bWeith = sc.nextDouble();
		System.out.println("자신의 몸무게를 입력하세요>>>");
		myWeith = sc.nextDouble();

		double sum = fWeith + mWeith + bWeith + myWeith;
		double avg = sum / 4.00;

		System.out.printf("%s 님의 가족원 몸무게 합은 %5.2f 이고," + "평균 몸무게는 %5.2f 입니다.", myName, sum, avg);

	}
}
