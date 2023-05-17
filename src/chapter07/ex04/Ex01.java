package chapter07.ex04;

public class Ex01 {

	// 두 배열의 각 방의 내용을 더해서 출력
	static void arrSum(int[] a, int[] b) {
		int[] c = new int[71];
		
		for (int i = 0, j = 0; i < a.length; i++, j++) {
			if (i > 54) {
				c[i] = a[i];
			} else {
				c[i] = a[i] + b[j];
			}
			System.out.print(c[i] + "\t");
		}
	}

	public static void main(String[] args) {

		int[] a = new int[500 / 7]; // 0~500 까지 의 7의 배수 저장
		int[] b = new int[500 / 9]; // 0~500 까지 의 9의 배수 저장

		for (int i = 0, j = 7; i < a.length; i++, j += 7) {
			a[i] = j;
			System.out.print(a[i] + "\t");
		}
		System.out.println();

		for (int i = 0, j = 9; i < b.length; i++, j += 9) {
			b[i] = j;
			System.out.print(b[i] + "\t");
		}
		System.out.println();

		// 각 방의 내용을 더해서 출력
		Ex01.arrSum(a, b);

	}
}
