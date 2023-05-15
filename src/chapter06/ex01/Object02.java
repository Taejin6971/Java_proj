package chapter06.ex01; // 클래스를 조직화 하는 폴더

// 클래스 외부 : 1. 패키자 이름, 2. 임포트 (같은 패키지에 존재하지 않는 클래스 import), 3. 외부 클래스

class A { // 외부 클래스 : public 클래스는 1개만 존재 해야 한다.

	// 1. 생성자 : 리턴타입이 없고 클래스 이름과 동일한 메소드, 객체를 생성시 생성자를 호출
		// A(){} : 인풋 매개변수가 없는 생성자를 시본 생성자, 기본 생성자는 생략 될 수 있다.
		// 생성자는 필드의 값을 초기화 할때 사용된다.
	public A() {} // 기본 생성자 : 생략 가능, 생성자가 존재하지 않으면 객체를 생성 할 수 없다.
	
	// 2. 필드 : 객체화 해서 사용 (Heap 메모리에 저장됨)
	int m = 3;
	int n = 7;
	double d = 10.5;
	
	// 3. 메소드 (호출시 작동, 필드의 내용을 출력하는 메소드)
	public void print() {
		System.out.println("m : " + m);
		System.out.println("n : " + n);
		System.out.println("d : " + d);
	}
	
}

public class Object02 {
	// 클래스 블락 : 1. 생성자, 2. 필드, 3. 메소드, 4. 이너 클래스 (클래스 내부의 클래스)

	public static void main(String[] args) {
		// main method (함수)

		int b = 10; // 지역변수, 메소드 블락에서 선언된 변수, if, switch, for ,while, do while
					// 블락을 벗어나면 사라지는 변수
					// Stack 공간에 저장
		
		// 객체 생성 : 클래스의 필드와 메소드를 객체화 해서 RAM으로 로드한다.
		A a = new A();	// new 기본생성자호출();
		
		// 객체의 필드의 값을 출력
		System.out.println(a.m); // 3
		System.out.println(a.n); // 7
		System.out.println(a.d); // 10.5
		
		// a 객채의 메소드 호출
		a.print();
		
		System.out.println("==================================");
		
		// 객체의 필드의 값을 수정 후 출력
		a.m = 100;
		a.n = 200;
		a.d = 300.55;
		
		// 메소드 호출
		a.print();
		
		System.out.println("==================================");

		// 클래스는 하나의 틀을 가지고 여러개의 객체를 생성 할 수 있다.
		A aa = new A();	//
		
		// 필드의 값을 할당
		aa.m = 200;
		aa.n = 300;
		aa.d = 30.33;
		
		aa.print();
	}
}
