package chapter04.ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		스캐너로 money 를 인풋 받습니다.
		0 ~ 2,999 : "걸어서 다닙니다."
		3,00 ~ 29,999 : "지하철을 타고 다닙니다."
		30,00 ~ 99,999 : "택시를 타고 다닙니다."
		100,00 ~		: "비행기를 타고 다닙니다."
 		 */
		
		//1. 스캐너 등록 (콘솔 인풋 ==> 변수)
		Scanner sc = new Scanner(System.in);
		
		int money;
		
		System.out.println("현재 소지한 금액을 입력하시오>>>");
		money = sc.nextInt();
		
		if (0 <= money && money < 3000) {
			System.out.println("걸어서 다닙니다.");
		} else if (3000 <= money && money < 30000) {
			System.out.println("지하철을 타고 다닙니다.");
		} else if (30000<= money && money < 100000) {
			System.out.println("택시를 타고 다닙니다.");
		} else {
			System.out.println("비행기를 타고 다닙니다.");
		}
		sc.close();	// 스캐너 종료, 메모리에서 삭제
	}
}
