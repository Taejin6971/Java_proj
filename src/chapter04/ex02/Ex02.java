package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		스캐너로 월을 인풋 받는다.(1~12월까지 정수를 인풋 받는다.)
		월을 인풋 받아서 해당 월의 날짜를 출력하는 프로그램
		"해당 월은 ? 월이고, ? 일까지 존재 합니다."
		
		 참고 :	1,3,5,7,8,10,12 <== 31일
		 		2				<== 28일
		 		4,6,9,11		<== 그 외는 30일
	 */
		Scanner sc = new Scanner(System.in);
		int month; // 스캐너로 월을 인풋 받는다
		int day = 30; // day 변수에 초기 값을 30으로 할당

		System.out.println("1~12월 중 하나의 정숙 값을 입력하시오>>>");
		month = sc.nextInt();

		System.out.println("====== 1. case 문 내에서 출력 ===== ");
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			// day +=1; <== day = day+1;
			System.out.printf("해당 월은 %d월 이고, %d일 까지 존재 합니다.\n\n", month, day);
			break;
		case 2:
			day = 28;
			// day -=2; <== day = day-2;
			System.out.printf("해당 월은 %d월 이고, %d일 까지 존재 합니다.\n\n", month, day);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("해당 월은 %d월 이고, %d일 까지 존재 합니다.\n\n", month, day);
			break;
		default:
			System.out.println("잘못 입력 했습니다. 다시 입력 하시오>>>");
		}

		System.out.println("====== 1. case 문 밖에서 출력 ===== ");

		System.out.printf("해당 월은 %d월 이고, %d일 까지 존재 합니다.\n\n", month, day);

		sc.close();

	}
}
