package chapter14.ex01;

class A { // 부모 클래스
	int a;
	int b;
}

class B extends A { // 자식 클래스
	int c;
	int d;
}

class C extends A { // 자식 클래스
	int e;
	int f;
}

public class Unchecked_Exception {
	public static void main(String[] args) {

//		실행 예외 : Unchecked Exception, Runtime Exception : 실행기 예외가 발생

		// 1. ArithmeticException : 정수를 0으로 나누면 발생되는 예외
		// 컴퓨터 프로그램에서는 0으로 나눌수 없다. (나누면 무조건 오류발생)
//		System.out.println(3 / 0);

		// 2. ClassCastException : 다운캐스팅 시 객체 내부에 해당 타입이 존재하지 않을때 발생되는 예외
//		A b1 = new B();	// b1 : A/B
//		A c1 = new C(); // c1 : A/C
//		C b2 = (C) b1;

		// 3. ArrayIndexOutOfBoundsException : 배열의 방번호를 넘어간 경우 발생되는 예외
//		int[] arr = new int[] { 1, 2, 3, 4, 5 };
//		System.out.println(arr[5]);

		// 4. NumberFormatException : 문자타입의 정수/실수를 정수/실수로 바꿀때 발생되는 예외
//		String a = "10!";
//		int num = Integer.parseInt(a); // 문자 ==> 정수/실수

		// 5. NullPointerException : 참조 주소의 값이 Null 인데, 메소드를 호출하는 경우 발생되는 예외
//		String str = null;
//		System.out.println(str.charAt(2));

	}
}
