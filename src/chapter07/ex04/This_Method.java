package chapter07.ex04;

class C { // this() 메소드를 사용하지 않고, 생성자를 초기화 함.

	int m1, m2, m3, m4; // 필드 선언

	// 생성자 : 매개변수가 없는 생성자 <== 기본 생성자
	C() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}

	// 생성자 - 매개변수 1개
	C(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}

	// 생성자 - 매개변수 2개
	C(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}

	// 생성자 - 매개변수 3개
	C(int a, int b, int c) {
		m1 = a;
		m2 = b;
		m3 = c;
		m4 = 4;
	}

	// 각 객체에서 필드의 등록된 값을 출력
	@Override
	public String toString() {
		return "C [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + "]";
	}

}

class D { // this() 메소드를 사용해서, 생성자를 초기화 함.

	int m1, m2, m3, m4;

	D() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}

	D(int a) {
		this();
		m1 = a;
	}

	D(int a, int b) {
		this(a);
		m2 = b;
	}

	D(int a, int b, int c) {
		this(a, b);
		m3 = c;
	}

	@Override
	public String toString() {
		return "D [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + "]";
	}

}

public class This_Method {
	public static void main(String[] args) {
		/*
			this() 메소드 : 생성자 호출할때 사용됨
				- 생성자 내부에서 사용됨.
				- 생성자 첫 라인에 와야함.
				- 생성자 내부에서 다른 생성자를 호출할때 사용됨.
				- 시그니처에 따라서 생성자를 호출 : 아규먼트(인풋매개변수) 갯수, 아규먼트의 타입
		 */

		// C 클래스로 객체를 생성 후 생성자 호출 후 각 필드의 내용호출
		C c1 = new C(); 				// 기본생성자 호출
		C c2 = new C(10); 				// 생성자 매개변수 1개
		C c3 = new C(100, 200); 		// 생성자 매개변수 2개
		C c4 = new C(1000, 2000, 3000); // 생성자 매개변수 3개

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		System.out.println("==============");
		D d1 = new D(); 				// 기본생성자 호출
		D d2 = new D(11); 				// 생성자 매개변수 1개
		D d3 = new D(111, 222); 		// 생성자 매개변수 2개
		D d4 = new D(1111, 2222, 3333); // 생성자 매개변수 3개

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);

	}
}
