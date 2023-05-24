package chapter12.ex02;

abstract class Calc {

	abstract int add(int a, int b); // 두 정수를 인풋 받아서 더한값을 리턴

	abstract int diff(int a, int b); // 빼기

	abstract int mull(int a, int b); // 곱하기

	abstract double div(int a, int b); // 나누기
}

class Q extends Calc {

	@Override
	int add(int a, int b) {
		return a + b;
	}

	@Override
	int diff(int a, int b) {
		return a - b;
	}

	@Override
	int mull(int a, int b) {
		return a * b;
	}

	@Override
	double div(int a, int b) {
		return (double) a / b;
	}
}

public class Ex01 {
	public static void main(String[] args) {

		// 위 추상 클래스를
		// 1. 콘크리트 클래스를 생성 후 작동
		// 2. 익명 클래스를 생성 후 작동

		Calc q1 = new Q();

		int a= 12;
		int b= 5;
		
		System.out.println(q1.add(a, b));
		System.out.println(q1.diff(a, b));
		System.out.println(q1.mull(a, b));
		System.out.println(q1.div(a, b));

		System.out.println("========================");

		Calc c1 = new Calc() {

			@Override
			int add(int a, int b) {
				return a + b;
			}

			@Override
			int diff(int a, int b) {
				return a - b;
			}

			@Override
			int mull(int a, int b) {
				return a * b;
			}

			@Override
			double div(int a, int b) {
				return (double) a / b;
			}

		};
		System.out.println(c1.add(a, b));
		System.out.println(c1.diff(a, b));
		System.out.println(c1.mull(a, b));
		System.out.println(c1.div(a, b));

	}
}
