package chapter16.ex01;

// 상품을 저장하는 클래스 : Object 와 Generic 을 사용하지 않는 경우
// 하나의 상품 클래스에 하나의 타입의 상품을 저장함

class Apple {

	// 기본 생성자
	Apple() {
	}

	Apple(String name) {
		this.name = name;
	}

	String name; // 국광, 부사, 홍옥, ...
}

class Goods1 { // 상품을 저장하는 클래스 <== 한 종류의 삼품만 저장가능 (Apple 객체만 저장)
	private Apple apple = new Apple();

	// getter
	public Apple getApple() {
		return apple;
	}

	// setter
	public void setapple(Apple apple) {
		this.apple = apple;
	}
}

public class ProbleamsBeforeGeneric {
	public static void main(String[] args) {

//		제너릭을 사용하기전의 여러 가지 문제점 :
//			- 제너릭은 클래스내부에 다양한 타입을 사용자가 정의 해서 넣을 수 있다.
//			- 제너릭을 사용전에는 하나의 클래스에 다양한 타입의 정보를 저장하려면
//				각 각의 클래스를 만들어서 사용함.
//			- 하나의 클래스에 다양한 객체정보를 저장하기 위해서 Object 타입으로 업캐스팅해서
//				저장 후 다시 다운 캐스팅을 사용해서 객체 내부의 정보를 읽기/쓰기 를 했다.
//			- 제너릭을 사용하면 업캐스팅 / 다운캐스팅 없이 여러타입의 객체를 하나의 클래스에
//				넣고 사용할 수 있다.

		// 상품 객체 생성 <== 사과만 저장 가능
		Goods1 g1 = new Goods1();
		g1.setapple(new Apple("홍옥")); // setter를 사용해서 객체를 생성
		System.out.println((g1.getApple()).name);

		g1.setapple(new Apple("국왕"));
		System.out.println((g1.getApple()).name);

		g1.setapple(new Apple("부사"));
		System.out.println((g1.getApple()).name);

	}
}
