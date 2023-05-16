package chapter07.ex02;

class F {
	// 1. 메소드 : 두 배열의 각 방의 내용을 더해서 출력
	// 2. 메소드 : 두 배열의 각 방의 내용을 빼서 출력
	// 3. 메소드 : 두 배열의 각 방의 내용을 곱해서 출력
	// 4. 메소드 : 두 배열의 각 방의 내용을 나눠서 출력

	void sum(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + b[i] + " ");
		}
		System.out.println();
	}

	void diff(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] - b[i] + " ");
		}
		System.out.println();
	}

	void mul(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] * b[i] + " ");
		}
		System.out.println();
	}

	void div(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
				System.out.print((double) a[i] / b[i] + " ");
		}
		System.out.println();
	}

}

public class Ex04 {
	public static void main(String[] args) {

		// 1. 정수를 담는 배열 arr1 방 100개 생성 : 7의 배수만 저장
		// 7, 14, 21, 28, ...

		int[] arr1 = new int[100];

		//System.out.println("=== 7의 배수 ===");
		for (int i = 0, a = 7; i < arr1.length; i++, a += 7) {
			arr1[i] = a;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// 2. 정수를 담는 배열 arr2 방 100개 생성 : 4의 배수만 저장하는데 8의 배수는 제외
		// 4, 12, 20, 28, ...

		int[] arr2 = new int[100];

		//System.out.println("=== 4의 배수이지만 8의 배수는 제외 ===");

		for (int i = 0, a = 0; i < arr2.length; a++) {
			if (a % 4 != 0 || a % 8 == 0)
				continue;
				arr2[i] = a;
				i++;

		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("\n");

		F f1 = new F();

		f1.sum(arr1, arr2);
		f1.diff(arr1, arr2);
		f1.mul(arr1, arr2);
		f1.div(arr1, arr2);

	}
}
