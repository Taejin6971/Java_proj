package chapter08.ex01;

import chapter08.ex02.A;

public class A_Test03 extends A { // A : 부모 클래스, A_Test03 : 자식 클래스 < 상속 관계 설정 (extends)

	// 부모 클래스 : A 클래스의 필드중 public, protected 만 접근가능
	int k = a; // public 접근가능		: 1
	int l = b; // protected 접근가능	: 2
//	int m = c; // default
//	int n = d; // private
	
	// 상속된 메소드 2개가 내려옴 : abc(), bcd() 

	public static void main(String[] args) {

		A a1 = new A();

		// 접근 가능한 필드/메소드 : public,  // A 클래스의 a 필드 : public
		System.out.println(a1.a); // public 접근가능
		a1.abc(); // public 접근가능
		
		System.out.println("=======================");
		
		A_Test03 t1 = new A_Test03();
		
		System.out.println(t1.a); // A 클래스의 a 필드 : public
		System.out.println(t1.b); // A 클래스의 b 필드 : protected
		
		t1.abc(); // A 클래스의 abc 메소드 : public
		t1.bcd(); // A 클래스의 bcd 메소드 : protected

	}
}
