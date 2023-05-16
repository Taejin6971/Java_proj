package chapter07.ex02;

class B {

	// 매개변수로 배열을 받아서 처리하는 메소드
	// void : 리턴이 없을 때
	void print(int[] a) { // 배열의 정보를 출력하는 매소드

		// for 문으로 출력
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
	}

}

public class Method02 {
	public static void main(String[] args) {

		// 1. 객체생성 후 메소드 호출
		B b1 = new B();

		// 2. 배열을 선언 후 값을 넣고 메소드 호출시 인풋값으로 배열을 넣어준다
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 3. 메소드 호출시 배열을 매개변수로 넣어준다
		b1.print(arr1);

		System.out.println("=================");

		B b2 = new B();

		b2.print(new int[] { 10, 20, 30, 40, 50, 60 });
	}
}
