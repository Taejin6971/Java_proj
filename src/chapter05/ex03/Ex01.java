package chapter05.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 변수 선언
		int[] arr1; // 배열 변수 : arr1
		int a; // 프로그램을 선택하는 변수 (1,2,3,4)
		int idx; // 배열 변수에서 방의 크기를 저장하는 변수

		do {
			System.out.println("=========================================================");
			System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
			System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수만 뺴고 저장후 출력");
			System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수인 경우만 뺴고 정장후 출력");
			System.out.println("4. 프로그램 종료");
			System.out.println("=========================================================");

			System.out.println("위 번호를 입력하시오 >>>");
			a = sc.nextInt();

			if (a == 1) {
				System.out.println("인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
				System.out.println("배열 방의 크기를 정수값으로 입력 하시오 >>>");
				idx = sc.nextInt();

				// 배열 방을 생성
				arr1 = new int[idx]; // 콘솔에서 입력 받아서 배열 방 크기를 지정

				// 배열방의 for 문을 사용해서 7,8의 배수를 배열방에 저장
				int n = 0; // 배열 방의 번호
				int i; // 배열방에 들어갈 값을 저장하는 변수
				for (i = 1;; i++) { // 무한루프 - i = 배열의 방에 저장되는 7,8의 배수의 값
					if (i % 7 == 0 || i % 8 == 0) { // i가 7,8의 배수일때
						arr1[n] = i;
						n++;
					}
					if (n == idx)
						break;
				}
				// for 문을 사용해서 배열의 각 방의 내용을 출력
				for (n = 0; n < arr1.length; n++) {
					System.out.print(arr1[n] + " ");
				}
				System.out.println("\n");

				// Enhanced for 문을 사용해서 출력
				for (int k : arr1) {
					System.out.print(k + " ");
				}
				System.out.println("\n");

				// Arrays.toString() 으로 출력
				System.out.println(Arrays.toString(arr1));

			} else if (a == 2) {
				System.out.println("인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수만 뺴고 저장후 출력");
				System.out.println("배열 방의 크기를 정수값으로 입력 하시오 >>>");
				idx = sc.nextInt();

				arr1 = new int[idx];

				int n = 0; // 방 번호를 지정하는 변수
				int i; // 배열방에 들어갈 값을 저장하는 변수

				// 배열의 각 방에 값을 저장하는 for
				for (i = 0;; i++) {
					if (i % 4 == 0)
						continue;
					arr1[n] = i;
					n++;

					if (n == idx)
						break;
				}

				// 배열의 저장된 내용을 출력 : for,
				for (n = 0; n < arr1.length; n++) {
					System.out.print(arr1[n] + " ");
				}
				System.out.println("\n");

				// 배열의 저장된 내용을 출력 : Enhanced for,
				for (int k : arr1) {
					System.out.print(k + " ");
				}
				System.out.println("\n");

				// 배열의 저장된 내용을 출력 : Arrays.toString(),
				System.out.println(Arrays.toString(arr1));

			} else if (a == 3) {
				System.out.println("인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수인 경우만 뺴고 정장후 출력");
				System.out.println("배열 방의 크기를 정수값으로 입력 하시오 >>>");
				idx = sc.nextInt();

				arr1 = new int[idx];

				int n = 0;
				int i;

				for (i = 0;; i += 3) {
					if (i % 6 == 0)
						continue;
					arr1[n] = i;
					n++;

					if (n == idx)
						break;
				}
				// 배열의 저장된 내용을 출력 : for,
				for (n = 0; n < arr1.length; n++) {
					System.out.print(arr1[n] + " ");
				}
				System.out.println("\n");

				// 배열의 저장된 내용을 출력 : Enhanced for,
				for (int k : arr1) {
					System.out.print(k + " ");
				}
				System.out.println("\n");

				// 배열의 저장된 내용을 출력 : Arrays.toString(),
				System.out.println(Arrays.toString(arr1));

			} else if (a == 4) {
				System.out.println("프로그램 종료");
				break;

			} else {
				System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요 >>>");
			}

		} while (true);

		sc.close();

	}
}
