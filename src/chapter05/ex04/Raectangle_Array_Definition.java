package chapter05.ex04;

public class Raectangle_Array_Definition {
	public static void main(String[] args) {
		/*
		다차원 배열 : 2 차원
		- 정방향 배열(2차원) : 행(row,recode), 열(column,field) 이 동일한 배열
		- 비정방향 배열(2차원) : 행(row,recode), 열(column,field)이 동일하지 않은 배열
		 */
		
		// 1. 2차원 배열 선언
		int[][] arr1 = new int[3][4];
		// 3:행의 갯수(0,1,2), 4:열의 갯수(0,1,2,3)

		// 2. 2차원 배열에 값 넣기
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[0][3] = 40;
//		arr1[0][4] = 50;	//오류 [예외] : 컴파일 오류(이클립스에서 잡아줌), 실행시 오류

		arr1[1][0] = 100;
		arr1[1][1] = 200;
		arr1[1][2] = 300;
		arr1[1][3] = 400;

		arr1[2][0] = 1000;
		arr1[2][1] = 2000;
		arr1[2][2] = 3000;
		arr1[2][3] = 4000;

		// 직접 방 번호를 넣어서 출력
		System.out.println(arr1[2][2]);

		// for 문을 사용해서 출력 :
		// arr1.length <== 1차원 배열 : 열의 갯수를 출력,
		// arr1.length <== 2차원 배열 : 행의 갯수를 출력
		// arr1[0].length <== 0행의 열의 갯수 출력
		System.out.println(arr1.length); // 3: 행의 갯수 <== 2차원 배열 일때
		System.out.println(arr1[0].length); // 4 : 0번 행의 열의 갯수
		System.out.println(arr1[1].length); // 4 : 1번 행의 열의 갯수
		System.out.println(arr1[2].length); // 4 : 2번 행의 열의 갯수

		System.out.println("===== 2. 2차원 배열을 for 문을 사용해서 출력 =====");

		// for 문을 사용해서 arr1 배열의 값을 출력 하기 : for-for 문을 사용해서 출력
		// for(행을 루프) : 바깥쪽 for, arr1.length 사용
		// for(열을 루프) : 안쪽 for, arr1[i].length 사용

		for (int i = 0; i < arr1.length; i++) { // i : 행의 index번호
			for (int j = 0; j < arr1[i].length; j++) { // j : 열의 index번호
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
