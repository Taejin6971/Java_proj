package chapter07.ex01;

class A { // 1.생성자, 2.필드, 3.메소드, 4.이너클래스

	// 기본 생성자 (생략가능)
		public A() {}
		/*
			필드 : Heap 에 저장 됨
				- 인스턴스 필드 : 필드 이름 앞에 static 키가 들어가지 않은 필드, Heap에 저장됨, 객체화 해야 사용가능
						다른 객체와 공유 되지않는 필드,
						
				- 정적(static) 필드 :필드 이름 앞에 static 키가 붙어있는 필드, static 공간에 저장
						객체화 해서 사용가능, 객체화 하지않고 사용가능 클래스 이름으로 바로 사용가능,
						다른 객체와 공유해서 사용 가능한 필드
		 */ 
		
		int a;			// 인스턴스(객체화) 필드 - 그 객체서만 사용 가능, Heap에 저장
		static int b;	// 정정(static) 필드 - 모든 객체에서 공유되는 필드, RAM 클래스 영역에 저장됨

}

public class Field01 {
	public static void main(String[] args) {

		// A 클래스(타입) 으로 a 객체 생성
		A a = new A(); // a 객체 생성. 기본생성자를 호출
		A aa = new A();
		A aaa = new A();

		// 각 객체에 필드의 값 할당
		a.a = 10;
		aa.a = 20;
		aaa.a = 30;

		System.out.println(a.a); // 10
		System.out.println(aa.a); // 20
		System.out.println(aaa.a); // 30

		System.out.println("==========");

		// 정적(static) 필드의 값 할당 : 모든 객체가 공유되는 필드 <== A class로 생성된 모든 객체가 공유해서 사용하는 필드
		a.b = 10;
		aa.b = 20;
		aaa.b = 30;
		a.b = 40;

		System.out.println(a.b); // 40
		System.out.println(aa.b); // 40.
		System.out.println(aaa.b); // 40

		// 정적(static) 필드 : 객체화 하지않고 클래스 이름으로 바로 사용가능
		A.b = 50;	// 클래스 이름으로 사용

		System.out.println(A.b); // 50
		System.out.println(a.b); // 50
		System.out.println(aa.b); // 50
		System.out.println(aaa.b); // 50

	}
}
