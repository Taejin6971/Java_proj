package chapter07.ex02;

class E {

	// a = 배열, b 배열의 각 방의 값을 곱하는 인자
	// 배열의 각 방의 값을 b인자로 받은 변수로 곱해서 출력
	void print(int[] a, int b) {
		// 배열의 내용을 출력
		System.out.println("===== 배열의 원본 출력 =====");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");

		System.out.println("===== 인풋 받은 배열의 내용을 출력 =====");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] * b + " ");
		}
		System.out.println("\n");
	}

}

public class Ex03 {
	public static void main(String[] args) {

		// 객체 선언
		E e1 = new E();

		// 배열 선언
		//int[] arr1 = new int[] { 11, 22, 33, 44, 55, 66, 77 };
		
		int[] arr1 = new int[10];
		for (int i = 0, b = 1; i < arr1.length; i++) {
			arr1[i] = i * b;
		}
		
		e1.print(arr1, 5);
	}
}
