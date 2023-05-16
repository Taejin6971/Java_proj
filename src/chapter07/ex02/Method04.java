package chapter07.ex02;

public class Method04 {

	// 인스턴스 메소드 : 객체화 해야 호출 가능

	String sum(int a, int b) {
		int c = a + b;
		String d = String.valueOf(c); // 정수 c를 String 타입으로 변환해서 d변수에 할당
		return d;
	}

	// 정적(static) 메소드 : 객체 생성 없이 호출 가능
	static int sum2(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		// main 메소는 static 키워드가 들어가 있다.
		// 같은 클래스 내에서 static 붙은 메소드는 메소드 명으로 바로 호출이 가능
		int a;
		a = sum2(10, 20);
		System.out.println(a);

		// sum : 인스턴스 메소드, 객체화 해야 호출 가능
		Method04 m1 = new Method04();

		String s1 = m1.sum(10, 30); // 40 <== String
		String s2 = m1.sum(70, 70); // 140 <== String

		System.out.println(s1); // 40 <== String
		System.out.println(s2); // 140 <== String

		System.out.println(s1 + s2);
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2)); // 180 <== int

		// 같은 클래스 내부에서 메소드 호출 ( static 메소드는 static 메소드를 호출 가능)
		// sum2 : static(정적 메소드)

		Method04 m3 = new Method04(); // 1. 객체 생성 후 출력
		int m = m3.sum2(10, 20);
		System.out.println(m);

		int n = Method04.sum2(10, 20); // 2. 클래스명으로 호출 : 객체 생성 없이 호출 가능
		System.out.println(n);

		int k = sum2(10, 20); // 3. main 메소드에서 메소드 명으로 호출 가능 : 동일한 클래스 내부, static
		System.out.println(k);

		// sum(10, 20); // 인스턴스 메소드 : 객체화 해야 호출 가능
		sum2(10, 20); // 정적(static) 메소드 : 객체 생성 후 출력, 클래스명으로 호출, 메소드 명으로 호출 가능

	}
}
