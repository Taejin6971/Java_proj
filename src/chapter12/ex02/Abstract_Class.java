package chapter12.ex02;

// 1. 콘크리트 클래스를 생성 후 사용 : <<자주 매번 사용하는 경우>>
abstract class A { // 추상 클래스

	// 추상 메소드
	abstract void cry();
}

class B extends A {

	@Override
	void cry() {
		System.out.println("구현된 메소드 출력");
	}
}

// 2. 익명 클래스를 생성 후 사용 : << 한번 사용하고 더이상 사용하지 않을 경우>>
abstract class C {

	abstract void cry();
}

abstract class D {

	abstract void run();

	abstract void eat();
}

public class Abstract_Class {
	public static void main(String[] args) {

//		추상 클래스 (Abstract Class)
//			- 추상 메소드를 포함한 클래스 
//				- abstract void abc();
//			- 추상 클래스는 객체화 할 수 없다. 자식을 객체화시 타입으로는 지정 가능
//			- 추상 클래스를 구현하는 방법 2가지
//				- 1. 자식 클래스에서 상속을 통해 추상 메소드를 구현할 클래스를 만들고(콘크리트 클래스)
//					 자식 클래스를 객체화 해서 사용 <자주 사용하는 경우>
//				- 2. 콘크리트 클래스없이 익명 클래스를 만들어서 사용 <한번 사용하고 버리는 경우>
//					 안드로이트 폰 개발시 이벤트 처리 할때 많이 사용

		// 1. 구현 클래스를 만들어 사용 (콘크리트 클래스를 객체화시 타입을 추상 클래스로 지정 후 메소드 호출)
		A b1 = new B();
		b1.cry();

		// 2. 익명 클래스를 만들어 사용
		C c1 = new C() {
			@Override
			void cry() {
				System.out.println("C 클래스에 cry()");
			}
		};
		c1.cry();

		D d1 = new D() {

			@Override
			void run() {
				System.out.println("D 클래스의 run()");
			}

			@Override
			void eat() {
				System.out.println("D 클래스에 eat()");
			}
		};
		d1.run();
		d1.eat();

	}
}
