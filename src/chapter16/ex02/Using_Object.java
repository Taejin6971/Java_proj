package chapter16.ex02;

class Banana {
	Banana() {
	}

	Banana(String name) {
		this.name = name;
	}

	String name;
}

class Orange {
	Orange() {
	}

	Orange(String name) {
		this.name = name;
	}

	String name;
}

class pencil {
	pencil() {
	}

	pencil(String name) {
		this.name = name;
	}

	String name;
}

class Goods2 {

	// 필드
	private Object obj = new Object();

	// getter : 필드의 값을 리턴
	public Object getObj() {
		return obj;
	}

	// setter : 필드의 값을 할당
	public void setObj(Object obj) { // obj 변수에 자바의 모든 클래스(여러 입)를 담을수 있다.
		this.obj = obj;
	}
}

public class Using_Object {
	public static void main(String[] args) {

//		Object 클래스는 모든 클래스의 부모이다.
//			- 모든 객체는 Object 타입으로 저장이 가능
//			- 다운캐스팅해서 필드/메소드의 내용을 출력 할 수 있다.
//			- 문제가 발생됨 : Object로 업캐스팅되어 들어간 하위 타입을 알아내기가 어렵다.

		// 1. Goods2 객체 생성
		Goods2 g2 = new Goods2();

		// Goods2(상품) : 바나나 객체 할당
		Banana b1 = new Banana("바나나");

		g2.setObj(b1); // b1 : Banana ==> Object 타입으로 자동 업캐스팅

		Object o1 = g2.getObj(); // getter를 사용해 객체를 가지고 온다
		Banana b2 = (Banana) o1; // 다운캐스팅
		System.out.println(b2.name);

		// Goods2(상품) : 오렌지 객체 할당
		g2.setObj(new Orange("오렌지")); // Orange ==> Object 타입으로 업케스팅 되어 할당
		System.out.println(((Orange) g2.getObj()).name);

		// Goods2(상품) : 연필 객체 할당
		g2.setObj(new pencil("연필")); // Pencil ==> Object 타입으로 업케스팅 되어 할당
		System.out.println(((pencil) g2.getObj()).name);

	}
}
