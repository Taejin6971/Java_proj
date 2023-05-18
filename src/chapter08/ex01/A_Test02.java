package chapter08.ex01;

import chapter08.ex02.A;

public class A_Test02 {
	public static void main(String[] args) {

		// A 클래스와 다른 패키지에 존재 : import / 클래스의 전제이름 : 패지키명.클래스명

		// 1. 다른 패키지의 클래스를 전체 이름으로 사용
		chapter08.ex02.A a1 = new chapter08.ex02.A();
		
		// 2. import를 사용
		A a2 = new A();
		
		// 접근 가능한 필드/메소드 : public 접근 제어자만 접근 가능
		System.out.println(a1.a); // public
//		System.out.println(a1.b); // protected (상속 관계가 성정이 되어있을때 다른 패키지에서 접근 가능) 
//		System.out.println(a1.c); // default
//		System.out.println(a1.d); // private

		// 메소드 호출
		a1.abc(); // public
//		a1.bcd(); // protected
//		a1.cde(); // default
//		a1.def(); // private
		
	}
}
