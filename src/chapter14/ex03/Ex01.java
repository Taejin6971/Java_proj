package chapter14.ex03;

class A {
	int a;
}

class B extends A {
	int b;
}

class C extends A {
	int c;
}

public class Ex01 {
	public static void main(String[] args) {

		A b1 = new B();
		String[] arr = new String[] { "안녕", "오늘", "날씨", "맑음" };
		String str = null;

//		C b2 = (C) b1; // 예외 발생 ClassCastException
//		System.out.println(arr[4]); // 예외 발생 ArrayIndexOutOfBoundsException
//		System.out.println(str.charAt(1)); // 예외 발생 NullPointerException

		System.out.println("=== 1. 각각 처리 ===========");
		try {
			C b2 = (C) b1; // 예외 발생 ClassCastException
		} catch (ClassCastException e) {
		}
		try {
			System.out.println(arr[4]); // 예외 발생 ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		try {
			System.out.println(str.charAt(1)); // 예외 발생 NullPointerException
		} catch (NullPointerException e) {
		}

		System.out.println("=== 2. 여러 catch로 처리 ===========");
		try {
			C b2 = (C) b1; // 예외 발생 ClassCastException
			System.out.println(arr[4]); // 예외 발생 ArrayIndexOutOfBoundsException
			System.out.println(str.charAt(1)); // 예외 발생 NullPointerException
		} catch (ClassCastException | ArrayIndexOutOfBoundsException | NullPointerException e) {
		}

		System.out.println("=== 3. Exception으로 한꺼번에 처리===========");
		try {
			C b2 = (C) b1; // 예외 발생 ClassCastException
			System.out.println(arr[4]); // 예외 발생 ArrayIndexOutOfBoundsException
			System.out.println(str.charAt(1)); // 예외 발생 NullPointerException
		} catch (Exception e) {
		}

		System.out.println("=== 4. catch 블락에서 세밀하게 처리하고 그외는 Exception ===========");
		try {
			C b2 = (C) b1; // 예외 발생 ClassCastException
			System.out.println(arr[4]); // 예외 발생 ArrayIndexOutOfBoundsException
			System.out.println(str.charAt(1)); // 예외 발생 NullPointerException
		} catch (ClassCastException e) {
		} catch (ArrayIndexOutOfBoundsException e) {
		} catch (NullPointerException e) {
		} catch (Exception e) {
		}

		System.out.println("프로그램 종료");

	}
}
