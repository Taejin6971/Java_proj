package chapter07.ex02;

class D {

	// 메소드 : 정수 두개를 인풋 받아서 4칙 연산해서 연산 한 값을 돌려주는 메소드

	int plus(int a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a - b;
	}

	int mul(int a, int b) {
		return a * b;
	}

	double div(int a, int b) {
		return (double) a / b;
	}

}

public class Ex02 {
	public static void main(String[] args) {

		// 객체 생성
		D d1 = new D();

		// 메소드 호출
		int a = d1.plus(10, 50);

		System.out.println(a);

		System.out.println(d1.minus(70, 40));

		System.out.println(d1.mul(3, 4));

		System.out.println(d1.div(50, 3));
	}
}
