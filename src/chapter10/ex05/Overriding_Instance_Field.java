package chapter10.ex05;

class A {

	// 인스턴스 필드
	int m = 20;

	// 인스턴스 메소드
	void print() {
		System.out.println("A - print()");
	}
}

class B extends A {

	int m = 30;

	// 인스턴스 메소드는 오버 라이딩
	void print() {
		System.out.println("B - print()");
	}
}

public class Overriding_Instance_Field {
	public static void main(String[] args) {

//		상속에서 주의 : 오버라이딩은 인스턴스 메소드만 오버라이딩이 된다

//		상속은 부모 클래스의 필드(인스턴스/정적) / 메소드(인스턴스/정적) / 이너클래스 를 상속 받는다. 생성자는 상속 되지않는다.
//			- 오버 라이딩은 인스턴스 메소드만 오버라이딩이 된다.
//			- 인스턴스/정적 필드, 정적 메소드는 오버라이딩 되지않는다.
		
//		필드와 메소드의 메모리 저장 위치
//			- 인스턴스 필드 : Heap 영역에 저장이됨. 부모/자식 필드 별개의 공간에 저장됨 <== 오버라이딩되지 않음.
//			- 정적 필드 : 클래스 영역에 저장됨. 부모/자식은 별개의 공간에 저장됨 <== 오버라이딩되지 않음.
//			- 인스턴스 메소드 : 인스턴스 메소드 영역에 저장됨  <== 오버라이딩 됨.
//			- 정적 메소드 : 클래스 영역에 저장됨. 부모/자식은 별개의 공간에 저장됨 <== 오버라이딩되지 않음.

		// 자식 객체를 생산시 부모 타입으로 지정 (인스턴스 필드는 오버라이딩 되지 않는다.)
		A b1 = new B();

		// m 필드의 값 출력
		System.out.println(b1.m); // 20
		b1.print();
		
		// 다운캐스팅
		B b2 = (B) b1;
		System.out.println(b2.m); // 30
		b2.print();

	}
}
