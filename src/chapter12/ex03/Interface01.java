package chapter12.ex03;

// 1. 정식 표현 : 코드가 길어짐
interface A { // interface는 클래스가 아니기때문에 생성자 X, 필드/메소드 O

	// 필드
	public static final int a = 3;

	// 메소드 <== 추상 메소드
	public abstract void abc();

	// 구현한 메소드를 선언시 오류 발생 : 단 예외적으로 default, static 메소드는 제외
//	void bdc() {}
}

// interface의 구현되지 않는 메소드를 구현 하는 클래스
class Aa implements A {

	@Override
	public void abc() {
		System.out.println("A interface의 구현 되지 않는 메소드를 구현한 메소드 abc()");
	}
}

// 2. 약식 표현 <== 많이 사용
interface B {

	int a = 3; // (public static final) 생략

	void abd(); // (public abstract) 생략
}

class Bb implements B {

	@Override
	public void abd() {
		System.out.println("B interface의 구현 되지 않는 메소드를 구현한 메소드 abc()");
	}
}

public class Interface01 {
	public static void main(String[] args) {

//		인터페이스 (Interface) : 내부와 외부를 연결 시켜주는 접점. 콘센트(가전제품 <=> 전기), 메뉴판(손님 <=> 주방장)
//			API (Application Programming Interface) : API를 통해 백앤드의 다양한 서비스를 받게 된다.

//			- 모든 필드/메소드는 public 접근 제어가 적용된다.

//			- 모든 필드는 public static final 이 생략되어 있다. <== interface의 필드 값은 수정이 불가하다.
//			- 모든 메소드는 public abstract가 생략 되어있다.	<== 선언만 된 메소드
//				- 단 예외적으로 default, static 메소드는 제외 <== 자바 1.8 부터 적용됨
//			- interface는 객체화 할 수 없다. 단 타입으로 지정은 가능.
//			- interface를 구현한 클래스는 여러 interface를 구현 가능 하다.
//			- 클래스는 하나의 부모만 상속할 수 있다. 다중 상속 불가 (extends)
//			- 클래스는 여러 interface를 구현할 수 있다. 다중 상속 가능 (implements)
//			- 유지 보수를 쉽게 하기위해 interface를 사용. 강결합 ==> 약결합 (유지보수쉽게)
//			- interface에 선언된 메소드를 오버라이딩햇 구현하도록 만든다.
//			- interface를 구현한 클래스는 오버라이딩된 메소드를 수정할 수 없다.

		// 1. interface는 객체화 할 수 없다.
//		A a = new A();
//		B b = new B();

		// 2. isterface를 구현한 클래스를 객체화시 타입으로 지정은 가능
		A a1 = new Aa();
		a1.abc(); // 오버라이딩된 메소드 출력

		System.out.println("================================================");

		B b1 = new Bb();
		b1.abd();
		System.out.println(b1.a);
//		b1.a = 10; // 필드의 값을 수정할 수 없다. public static final(상수)

	}
}
