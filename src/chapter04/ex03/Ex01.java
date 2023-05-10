package chapter04.ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		스캐너로 1~9 까지의 정수를 인풋 받아서 for 문을 사용해서
		인풋 받은 단수를 출력
		1. println() 으로 출력
		2. printf() 로 출력
	 */
		
		Scanner sc = new Scanner(System.in);
		// 사용할 번순 선언 : i(단), j
		int i, j;
		System.out.println("1~9까지 중에 정수 한개를 입력 하시오>>>");
		i = sc.nextInt();

		System.out.println("=====println() 으로 출력");
		for (j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + " = " + i * j);
		}

		System.out.println("===== printf() 로 출력 ======");

		for (j = 1; j < 10; j++) {
			System.out.printf("%d*%d = %d\n", i, j, i * j);
		}

		sc.close();

	}
}