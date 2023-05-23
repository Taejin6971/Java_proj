package chapter10.ex05;

class C { // 부모

	// 필드 : 오버라이딩 불가. 자식과는 완전히 별개
	int m = 3;
	static int n = 30;

	// 인스턴스 메소드 : 오버라이딩 가능
	void print() {
		System.out.println("C");
	}

	// 정적 메소드 : 오버라이딩 불가. 자식과는 완전히 별개
	static void pront2() {
		System.out.println("C");
	}
}

class D extends C { // 자식

	// 필드 : 오버라이딩 불가. 부모와는 완전히 별개
	int m = 4;
	static int n = 40;

	// 인스턴스 메소드 : 오버라이딩 가능
	void print() {
		System.out.println("D");
	}

	// 정적 메소드 : 오버라이딩 불가. 부모와는 완전히 별개
	static void pront2() {
		System.out.println("D");
	}
}

public class Overriding_All_Info {
	public static void main(String[] args) {

		C d1 = new D();
		System.out.println(d1.m); // 3(부모)
		System.out.println(d1.n); // 30(부모)
		d1.print(); // D(자식) - 오버라이딩
		d1.pront2(); // C(부모)

		System.out.println("==================");
		
		// 다운캐스팅
		D d2 = (D) d1;
		System.out.println(d2.m); // 4(자식)
		System.out.println(d2.n); // 40(자식)
		d2.print(); // D(자식)
		d2.pront2(); // D(자식)
		
	}
}
