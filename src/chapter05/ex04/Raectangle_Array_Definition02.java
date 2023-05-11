package chapter05.ex04;

public class Raectangle_Array_Definition02 {
	public static void main(String[] args) {
		/*
		2차원 정방향 배열 선언 방법 3가지
		 */
		
		System.out.println("===== 1. 선언방법 1 =====");
		// 1. 선언 후 방 크기 지장
		int[][] arr1;
		arr1 = new int[3][4];

		// 2. 선언과 동시에 방 크기 지정
		int[][] arr2 = new int[3][4];

		// 3.
		int arr3[][] = new int[3][4];

		// 4.
		int[] arr4[] = new int[3][4];

		System.out.println("===== 2. 선언방법 2 =====");
		// 선언과 동시에 값 넣기
		int[][] arr5 = new int[][] { { 1, 2, 3, 4 }, { 10, 20, 30, 40 } };

		int[][] arr6;
		arr6 = new int[][] { { 1, 2, 3 }, { 10, 20, 30, }, { 100, 200, 300 }, { 1000, 2000, 3000, } };

		System.out.println("===== 3. 선언방법 3 =====");
		// 선언과 동시에 값 넣기 : new int [][] 생략
		int[][] arr7 = { { 1, 2, 3, 4, 5 }, { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 } };

		// 오류 발생
		int[][] arr8;
//		arr8 = { { 1, 2, 3, 4, 5 }, { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 } };

	}
}
