package chapter16.ex06;

class A { // 일반 클래스 : 제너릭 메소드 생성

	// 매갭녀수 타입으로 들어오는 변수에서 Object의 메소드만 사용 가능하다. <==
	public <T> void method(T t) {
//		t.length(); // length() : String 타입에 존재하는 메소드
		System.out.println(t.equals("안녕")); // equals()는 Object 클래스의 메소드이므로 모든 타입에서 사용가능
		System.out.println(t.equals(10));
	}

	public int method2(String s) {
		return s.length();
	}
}

public class AbableGenericMethod {
	public static void main(String[] args) {

//		제너릭 메소드의 인풋 매개변수에서 사용 가능한 메소드 : Object 클래스의 메소드만 사용 가능하다.
//			- 다양한 타입이 들어오므로 Object클래스의 메소드만 사용 가능함.

		A a = new A();

		System.out.println(a.method2("안녕하세요"));
		a.<String>method("안녕"); // 제너릭 메소드 호출
		a.method("안녕"); // 제너릭 메소드 호출

		System.out.println("=============");

		a.<Integer>method(10);
		a.method(10);

	}
}
