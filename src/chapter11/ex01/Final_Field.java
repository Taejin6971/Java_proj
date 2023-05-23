package chapter11.ex01;

class A {

	int a = 3; // 필드 : Heap에 변수와 값이 저장됨, 값 수정 가능.
	final int B = 5; // 상수(대문자) : 값 수정이 불가함.

	A() {
		a = 7; // 수정이 가능
//		B = 10; // 오류 발생 : 수정이 불가능
	}

	void print() {

		int c = 10; // 지역 변수 : Stack에 변수와 값이 저장
		final int B = 20; // 지역 상수(대문자) : 값 수정 불가

		c = 100;
//		B = 200; // 오류 발생 : 수정이 불가능

	}
}

public class Final_Field {
	public static void main(String[] args) {

//		final modifier: 마지막이다.
//			- 1. 필드[변수] : 값을 수정하지 못하도록 한다. [상수]
//			- 2. 메소드 : 메소드를 수정하지 못하도록 한다. 오버라이딩이 불가능한 메소드
//			- 3. 클래스 : 상속이 불가능한 클래스
		
	}
}
