package chapter05.ex01;

public class Array_Definition03 {
	public static void main(String[] args) {

		System.out.println("======1. 방법 1======");
		/*
		1차원 배열 선언 방법 3가
		 */
		
		int[] arr1; // 배열 변수 선언
		arr1 = new int[3]; // 배열방의 크기 지정

		int arr2[];
		arr2 = new int[3];

		int[] arr3 = new int[3]; // 배열 변수 선언과 동시에 배열방의 크기 지정

		int arr4[] = new int[3];

		System.out.println("======2. 방법 2======");

		// 배열을 선언과 동시에 값을 할당.
		// 주의 : 방 크기를 지정 하면 안됨
		int[] arr5 = new int[] { 10, 20, 30 }; // 배열 선언과 동시에 방의 값을 바로 할당

		int[] arr6; // 선언 후
		arr6 = new int[] { 10, 20, 30 }; // 방의 값을 할당

		System.out.println("======3. 방법 3======");

		// 선언과 동시에 값을 바로 할당
		int[] arr7 = { 10, 20, 30 };

		// 오류 발생
		int[] arr8;
		// arr8= {10,20,30};

	}
}
