package chapter12.ex07;

interface A {

	// 필드 <== public static final 생략, 값 수정 불가(상수)
	int a = 20;
	int b = 30;
	String c = "현대자동차";

	// 메소드 <== public abstract 생략
	void abc(); // 2000년도에 구현된 메소드 : USB 1.0

	void bcd(); // 2005년도에 구현된 메소드 : USB 2.0

	// default () : 인터페이스 내부에서 구현 코드를 가지는 메소드
	default void cde() { // 2010년도에 구현된 메소드 : USB 3.0 <== 새로운 기능을 1000개의 하위 클래스에 적용
		System.out.println("default() - 2010년도의 USB 3.0 기능 구현");
	}

	// static () : 인터페이스 내부에서 구현 코드를 가지는 메소드
	static void def() {
		System.out.println("static() - 객체 생성없이 바로 구현가능한 메소드");
	}
}

// 위의 인터페이스를 구현한 클래스가 1000개 있다.
class Aa implements A {

	@Override
	public void abc() {
		System.out.println("Aa - 2000년도에 USB 1.0을 구현한 메소드");
	}

	@Override
	public void bcd() {
		System.out.println("Aa - 2005년도에 USB 2.0을 구현한 메소드");
	}
}

class Aaa implements A {

	@Override
	public void abc() {
		System.out.println("Aaa - 2000년도에 USB 1.0을 구현한 메소드");
	}

	@Override
	public void bcd() {
		System.out.println("Aaa - 2005년도에 USB 2.0을 구현한 메소드");
	}

	// default 메소드 오버라이딩 : 부모의ㅡ 기능을 자식 클래스에서 새롭게 재정의 해서 사용
	@Override
	public void cde() {
		System.out.println("Aaa - 부모의 default 메소드 오버라이딩");
	}
}

public class Drfault_Method {
	public static void main(String[] args) {

//		인터페이스의 특징:
//			- 모든 필드/메소드는 public 접근제어자
//			- 모든 필드는 public static final 이 생략
//			- 모든 메소드는 public abstract 이 생략
//			- 인터페이스 내부의 메소드는 선언만 되어야 한다. 구현부{}를 생성하면 안된다.<== 자바 1.7버전
//				- default/static <== 인터페이스 내부에서 구현부를 가지는 메소드 <== 자바 1.8버전부터 추가

//		default 메소드 : 인터페이스 내에서 메소드 이름앞에 붙이는 키, 구현부가 있는 메소드, 주의 : 접근 제어자가 아니다. 
//			- 인터페이스에서 구현된 모든 클래스에서 상속되어서 적용.
//			- 새로운 기능을 하위의 모든 클래스에게 적용할때 사용. 오류없이 적용할때 사용.
//			- 오버라이딩 가능

//		static 매소드 : 인터페이스 내에서 메소드 이름앞에 붙이는 키, 구현부가 있는 메소드
//			- 자식 클래스의 객체를 생성하지 않고 인터페이스 이름으로 호출 가능한 메소드

		// 자식 클래스의 객체 생성시 부모 타입으로 지정
		A a = new Aa();
		A aa = new Aaa();

		a.abc();
		a.bcd();
		a.cde(); // default 메소드

		System.out.println("=== default 메소드 오버라이딩 ==============");

		aa.abc();
		aa.bcd();
		aa.cde();

		System.out.println("=== ststic() 호출 ====================");
		A.def(); // A 인터페이스 타입 메소드
		System.out.println(A.a); // A 인터페이스 타입 필드
		System.out.println(A.b);
		System.out.println(A.c);

//		A.a = 50; // 오류발생 : final(상수) 이기 때문에 수정 불가
		
	}
}
