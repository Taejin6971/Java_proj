package chapter16.ex07;

class Apple {
	String name = "사과";
}

class Banana {
	String name = "바나나";
}

class Orange {
	String name = "오렌지";
}

class Aa<T> { // <T>타입으로 모든 타입을 받는 클래스

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Bb<T extends Apple> { // <T>타입으로 Apple 타입만 받는 클래스

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class Ex01 {
	public static void main(String[] args) {

		// Aa : 제너릭 타입에 모든 타입을 다 적용 가능
		Aa<String> a1 = new Aa<>();
		Aa<Integer> a2 = new Aa<>();
		Aa<Double> a3 = new Aa<>();
		Aa<Apple> a4 = new Aa<>();
		Aa<Banana> a5 = new Aa<>();
		Aa<Orange> a6 = new Aa<>();

		// Bb : 제너릭 타입에 Apple 타입만 적용 가능
//		Bb<String> b1 = new Bb<>();
//		Bb<Integer> b2 = new Bb<>();
//		Bb<Double> b3 = new Bb<>();
//		Bb<Banana> b4 = new Bb<>();
//		Bb<Orange> b5 = new Bb<>();
		Bb<Apple> b6 = new Bb<>();

	}
}
