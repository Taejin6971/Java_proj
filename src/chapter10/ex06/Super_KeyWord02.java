package chapter10.ex06;

class Aa {

	int a = 10;

	void abc() {
		System.out.println("Aa - abc()");
	}

	void ab() {
		System.out.println("Aa - ab()");
	}
}

class Bb extends Aa {

	int b = 20;

	@Override
	void abc() {
		System.out.println("Bb - abc()");
	}

	void bcd() {
		abc(); // this.abc(), this가 생략
	}

	void cde() {
		super.abc(); // 부모 객체의 abc() 호출
	}

	void def() {
		super.ab(); // 부모 객체의 ab() 호출
	}

	void efg() {
		System.out.println(super.a);
		System.out.println(this.b);
	}
}

public class Super_KeyWord02 {
	public static void main(String[] args) {

		// 객체생성
		Bb b1 = new Bb(); // Bb : Aa/Bb 타입 내포하지만 Bb 타입으로 지정
		b1.bcd(); // 자기 자신(Bb)의 abc() 호출, this
		b1.cde(); // 부모 클래스(Aa)의 abc() 호출,
		b1.def();// 부모 클래스(Aa)의 ab() 호출,

		b1.efg(); // 10/20

	}
}
