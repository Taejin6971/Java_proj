package chapter10.ex07;

class C {

	String name;

	C(String name) {
		this.name = name;
	}
}

class D {
	
	String name;

	D(String name) {
		this.name = name;
	}
	
	// Object 클래스의 equals() 메소드를 재정의
	// D 객체의 name 필드의 값이 같을때 true를 리턴으로 돌려주도록 재정의
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((D)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}

public class Object_Class03 {
	public static void main(String[] args) {

		C c1 = new C("홍길동");
		C c2 = new C("홍길동");

		System.out.println(c1);
		System.out.println(c2);

		System.out.println(c1 == c2); 		// false, == : Stack의 저장된 값을 비교
		System.out.println(c1.equals(c2)); 	// false
		
		System.out.println("==========================");
		
		D d1 = new D("이순신");
		D d2 = new D("이순신");
		
		System.out.println(d1 == d2);		// false
		System.out.println(d1.equals(d2));	// true
		
	}
}
