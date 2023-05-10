package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
	 	switch 문으로 작성
	1. Scanner 로 정수 1, 2, 3, 인풋받기	
	 	1 : "금메달 입니다."
	 	2 : "은메달 입니다."
	 	3 : "동메달 입니다."
	 	그외 정수를 인풋 받으면 : "메달이 없습니다"
	 	
	 	================================
	 	
	2. Scanner 로 문자열 "gold", "silver", "bronze"
	 	"gold" : "금메달 입니다."
	 	"silver" : "은메달 입니다."
	 	"bronze" : "동메달 입니다."
	 	그외 문자열를 인풋 받으면 : "메달이 없습니다"
	 */
		Scanner sc = new Scanner(System.in);

		int medal1;

		System.out.println("정수를 입력 하시오>>>");
		medal1 = sc.nextInt();

		switch (medal1) {
		case 1:
			System.out.println("금 메달 입니다.");
			break;
		case 2:
			System.out.println("은 메달 입니다.");
			break;
		case 3:
			System.out.println("동 메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}
		System.out.println("=================================");

		String medal2;
		System.out.println("Gold, Silver, Bronze 중 하나의 문자열을 입력하시오 >>>");
		medal2 = sc.next();

		switch (medal2) {
		case "gold":
		case "Gold":
		case "GOLD":
			System.out.println("금 메달 입니다.");
			break;
		case "silver":
		case "Silver":
		case "SILVER":
			System.out.println("은 메달 입니다.");
			break;
		case "bronze":
		case "Bronze":
		case "BRONZE":
			System.out.println("동 메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}

		sc.close();

	}
}
