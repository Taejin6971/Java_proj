package chapter12.ex06;

interface A {
}

interface B {
}

// 1. 단일 인터페이스 상속
class C implements A {
}

class D implements B {
}

// 2. 다중 인터페이스 상속
class E implements A, B {
}

// 3. 클래스와 인터페이스를 한번에 상속 (extends, implements 의 순서를 변경하면 안됨)
// 자바는 하나의 클래스만 상속이 가능, 인터페이스는 여러 클래스를 상속 가능
class F extends C implements A, B {
}

public class Inharitance {
	public static void main(String[] args) {

//		인터페이스 상속 : 
//			- 클래스는 하나의 부모 클래스만 가질수 있다. <자바는 다중 상속이 불가능 하다>
//				- class 자식클래스명 extends 부모클래스명
//			- 인터페이스를 구현한 클래스는 여러 인터페이스를 상속 할수있다. 
//				- class 자식클래스명 implements 인터페이스명, 인터페이스명, 인터페이스명
	}
}
