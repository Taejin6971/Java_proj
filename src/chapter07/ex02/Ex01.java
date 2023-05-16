package chapter07.ex02;

class C {

	void print(int[] a, double[] b) {

		// a 배열의 값을 for문 으로 출력
		System.out.println("===== 정수 배열 출력 =====");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");

		// b 배열의 값을 for문 으로 출력
		System.out.println("===== 실수 배열 출력 =====");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("\n");
	}

}

public class Ex01 {
	public static void main(String[] args) {

		// 객체 생성
		C c1 = new C();

		// 배열 생성
		/*
		int[] arr1 = new int[5];
		for (int i = 0, a = 100; i < arr1.length; i++, a += 100) {
			arr1[i] = a;
		}
		
		double[] arr2 = new double[5];
		for (double i = 0,b = 11.11; i < arr2.length; i++, b+=1) {
			arr2[(int) i] = b;
		}
		 */
		int[] arr1 = new int[] { 100, 200, 300, 400, 500 };
		c1.print(arr1, new double[] { 11.11, 12.12, 13.13, 14.14, 15.15 });

	}
}
