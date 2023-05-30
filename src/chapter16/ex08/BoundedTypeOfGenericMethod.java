package chapter16.ex08;

class A { // 일반 클래스의 제너릭 메소드

	// Number 클래스 : 정수(byte, short, int, long)나 실수(float, double)를 처리하는 부모 클래스
	// <T> : Byte, Short, Integer, Long, Float, Double 타입만 올수 있다.
	public <T extends Number> void method1(T t) { // 정수나 실수마 처리하는 자료형만 올수 있다.
		System.out.println(t.intValue()); // t.intValue() : Number 타입의 메소드
	}
}

// 인터페이스 : 제너릭 타입 제한시 인터페이스일때 다중 제한 가능. (클래스 일때는 하나만 제한 처리 가능)
// <T extends IF1 & IF2 & IF3>
// 인터페이스로 제한을 두면 인터페이스를 구현한 하위의 모든 클래스가 타입으로 지정 가능
interface IF1 {

	void print(); // public abstract가 생략.
//	1. 자식 클래스에서 구현 클래스를 만들고 사용
//	2. 익명 클래스를 사용해서 구현 
}

class Aa implements IF1 {

	@Override
	public void print() {
		System.out.println("Aa 구현된 메소드 호출 - 오버라이딩");
	}
}

class Aaa extends Aa {

	@Override
	public void print() {
		System.out.println("Aaa 구현된 메소드 호출 - 오버라이딩");
	}

	public void print2() {
		System.out.println("Aa의 자식 Aaa의 print()");
	}
}

interface IF2 {

	void eat();
}

interface IF3 {

	void run();
}

// 제너릭 클래스에서 인터페이스를 사용한 타입을 제한 : 여러 인터페이스를 적용 가능
class E<T extends IF1> { // <T> : IF1(자식 : Aa, Aaa)

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

// 제너릭 메소드에서 인터페이스 타입 가용 제한
class B {

	public <T extends IF1> void method1(T t) { // <T> : IF1(자식 : Aa, Aaa)
		t.print();
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {

//		제너릭 메소드에서 타입 제한 : 
//			- 타입 제한을 두지 않을때 : 모든 타입이 매개변수 인자로 오기 때문에 Object의 메소드만 사용 가능
//			- 타입 제한을 두면 : 제한을 둔 클래스의 메소드만 사용 사능

		A a = new A(); // 일반 클래스
		a.<Double>method1(88.88);
		a.<Float>method1(99.99F);
		a.<Integer>method1(100);
//		a.<String>method1("안녕");

		System.out.println("================");

		B b1 = new B();

		// 제너릭 메소드 호출
		b1.<IF1>method1(new Aa()); // 자식 클래스를 객체화 해서 인터페이스 타입으로 오버라이딩
		b1.<IF1>method1(new Aaa());

		// 제너릭 메소드 호출 (익명 클래스를 사용해서 호출)
		// 인터페이스는 객체화 불가 : 자식을 객체화하여 타입으로 지정은 가능
		// - 인터페이스의 메소드 호출시 자식의 오버라이딩된 메소드 호출
		b1.<IF1>method1(new IF1() { // 익명 클래스
			@Override
			public void print() {
				System.out.println("오버라이딩된 익명 클래스");
			}
		});

		b1.<IF1>method1(new IF1() { // 익명 클래스
			@Override
			public void print() {
				System.out.println("익명 클래스2");
			}
		});

		b1.<Aa>method1(new Aa());
		b1.<Aaa>method1(new Aaa());

	}
}
