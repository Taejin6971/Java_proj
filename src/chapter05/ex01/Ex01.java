package chapter05.ex01;

public class Ex01 {
	public static void main(String[] args) {
		/*
		배열 방 100개 생성 후 3의 배수만 저장 후 출력
		 */
		
		// 1. 배열 변수 선언 및 방크기 지정
		int a = 100;
		int[] arr1 = new int[a]; // index 0~99

		System.out.println(arr1.length);

		int b = 0; // 3의 배수를 저장하는 변수

		// arr1 배열의 각 방에 값을 저장하는 for
		for (int i = 0; i < arr1.length; i++) {
			b += 3; // a = a+3;
			arr1[i] = b;
		}

		// arr1 배월의 각 방에 값을 출력 하는 for
		System.out.println("===== for 문을 사용해서 출력 =====");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1 [" + i + "] 의 값은 : " + arr1[i]);
		}

		System.out.println("===== Enhanced for : 향상된 for =====");
		// 배열의 첫 번째 방부터 마지막 방까지 자동으로 그 값을 출력 할때 사용
		for (int c : arr1) {
			System.out.print(c + " ");
		}
		System.out.println("\n\n");
	}
}
