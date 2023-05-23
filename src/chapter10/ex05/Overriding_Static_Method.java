package chapter10.ex05;

class Aaa {

	// 정적 메소드 : Aaa 클래스 영역에 실행코드가 들어감.
	static void print() {
		System.out.println("Aaa - 정적 print()");
	}

	void print2() {
		System.out.println("Aaa - 인스턴스 print2()");
	}
}

class Bbb extends Aaa {

	static void print() {
		System.out.println("Bbb - 정적 print()");
	}

	void print2() {
		System.out.println("Bbb - 인스턴스 print2()");
	}
}

public class Overriding_Static_Method {
	public static void main(String[] args) {

//		정적 메소드 : 클래스 영역에 실행코드를 가지고 있음. 각 클래스 영역에 들어있기 때문에 오버라이딩 불가.
//			- 객체 생성 후 호출 가능
//			- 객체 생성 없이 클래스 이름으로 호출 가능

		// 객체 생성 후 호출 : 정적/인스턴스 메소드
		// 자식 객체를 생산시 부모 타입으로 지정
		Aaa b1 = new Bbb();
		b1.print(); // 정적 메소드 : 오버라이딩 되지않고 각각 별개의 공간에서 호출
		b1.print2(); // 인스턴스 메소드 : 오버라이딩되어 자식의 오버라이딩된 메소드 호출

		System.out.println("=======================");
		
		Bbb b2 = (Bbb) b1;
		b2.print();
		b2.print2();
		
		System.out.println("========================");
		Aaa.print();
		Bbb.print();
	}
}
