package chapter16.ex09;

// 테스트할 클래스 생성
class A {
}

class B extends A {
}

class C extends B {
}

class D extends C {
}

// 상품을 저장하는 제너릭 클래스를 생성 <== 모든타입의 상품을 저장할 수 있는 클래스
class Goods<T> { // <t> : 모든 타입이 올수 있다. Wrapper class [8], 참조자료형[무한대]

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Test {

	// 일반 메소드 : 메소드 아규먼트로 제너릭 타입의 제한
	void method1(Goods<A> g) { // case 1 : <A> : A타입만 가능, 주의 : 자식 클래스는 적용되지 않음 B, C, D
	}

	void method2(Goods<?> g) { // case 2 : <?> : 모든 타입이 가능
	}

	void method3(Goods<? extends B> g) { // case 3 : <? extends B> B, C, D 타입만 가능
	}

	void method4(Goods<? super B> g) { // case 4 : <? super B> A, B 타입만 가능
	}
}

public class BoundedTypeOfMethodArgument {
	public static void main(String[] args) {

//		제너릭 클래스도 아니고 제너릭 메소드도 아니지만 
//		일반메소드의 아규먼트로 들어오는 타입 제한

		// Test 객체 생성
		Test t = new Test();

		// case 1 메소드 호출 : <A> : A타입만 가능
		t.method1(new Goods<A>());
//		t.method1(new Goods<B>());
//		t.method1(new Goods<C>());
//		t.method1(new Goods<D>());

		// case 2 메소드 호출 : <?> : 모든 타입이 가능
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());

		// case 3 메소드 호출 : <? extends B> B, C, D 타입만 가능
//		t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());

		// case 4 메소드 호출 : <? super B> A, B 타입만 가능
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());

	}
}
