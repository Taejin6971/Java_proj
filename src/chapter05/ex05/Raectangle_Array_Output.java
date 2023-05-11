package chapter05.ex05;

import java.util.Arrays;

public class Raectangle_Array_Output {
	public static void main(String[] args) {
		/*
		2차원 정방향 배열 출력 방법 
		- for-for 문으로 출력
		- Enhenced for-Enhenced for 문으로 출력
		- Arrtas.toString(배열 변수) 
		 */
		
		// 배열 > 행:3, 열:100 (index:0~99) : for-for
		// 0형 :1~100 까지 정수
		// 1행: 2의 배수만
		// 2행: 3의 배수만
		
		int[][] arr1 = new int[3][100];

		System.out.println(arr1.length); // 행의 갯수(2차원) //3
		System.out.println(arr1[0].length); // 0행의 열의 갯수 //100
		System.out.println(arr1[1].length); // 1행의 열의 갯수 //100
		System.out.println(arr1[2].length); // 2행의 열의 갯수 //100

		// 배열의 각 방에 값 넣기
		for (int i = 0; i < arr1.length; i++) { // 행을 Loop : 0,1,2
			if (i == 0) { // 1~100 까지
				for (int j = 0, a = 1; j < arr1[i].length; j++, a++) { // 열을 Loop : 0,1,2,...,99
					arr1[i][j] = j + 1;
					// arr1[i][j] = a;
				}
			} else if (i == 1) { // 2의 배수
				for (int j = 0, a = 2; j < arr1[i].length; j++, a += 2) {
					arr1[i][j] = a;
				}
			} else if (i == 2) { // 3의 배수
				for (int j = 0, a = 3; j < arr1[i].length; j++, a += 3) {
					arr1[i][j] = a;
				}
			}
		}

		// for-for
		System.out.println("===== for-for ======");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {

				if (j < arr1[i].length - 1) {
					System.out.print(arr1[i][j] + ", ");
				} else {
					System.out.print(arr1[i][j]);
				}
			}
			System.out.println();
		}

		// Enhanced for-Enhanced for 문으로 출력
		System.out.println("===== Enhanced for-Enhanced for =====");
		for (int[] k : arr1) {
			for (int a : k) {
				System.out.print(a + ", ");
			}
			System.out.println();
		}
		// Arrays.toString()
		System.out.println("===== Arrays.toString() =====");
		System.out.println(Arrays.toString(arr1[0])); // 0 행의 값
		System.out.println(Arrays.toString(arr1[1])); // 1 행의 값
		System.out.println(Arrays.toString(arr1[2])); // 2 행의 값
	}
}
