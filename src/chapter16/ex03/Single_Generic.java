package chapter16.ex03;

class Apple {
	String name = "사과";
}

class Banana {
	String name = "바나나";
}

class Pencil {
	String name = "연필";
}

class Goods<T> { // 클래스 이름뒤 <T> : 객체를 생성시 지정되는 타입

	private T t;

	// getter
	public T getT() {
		return t;
	}

	// setter
	public void setT(T t) {
		this.t = t;
	}
}

public class Single_Generic {
	public static void main(String[] args) {

//		제너릭 클래스 : 다양한 타입을 저장 할 수 있는 클래스
//			- 클래스 이름뒤에 : <T> <== 인풋 되는 타입 지정. T : Type
//			- 객체를 생성할때 <T>에 들어있는 타입을 지정해서 객체를 생성 하게됨.
//			- <T>에 들어오는 타입은 반드시 객체형 자료형이여야 한다. 기본자료형은 올수 없다. Wrapper class를 사용함

//				Wrapper class : 기본 자료형을 객체혈 자료형으로 만듬
//					기본 자료형 <===> 객체 자료형
//					- boolean <===> Boolean
//					- char <===> Charter 
//					- byte <===> Byte
//					- short <===> Short
//					- int <===> Integer
//					- long <===> Long
//					- float <===> Float
//					- double <===> Double

		// 사과 객체 생성
		Goods<Apple> apple = new Goods<Apple>();
		// setter를 사용해서 Apple 객체를 주입
		apple.setT(new Apple());
		// getter를 사용해서 Apple 객체를 가져와서 필드의 내용 출력 // 자신이 원하는 객체를 주입 후 다운캐스팅 없이 출력 가능
		System.out.println(apple.getT().name);

		// 바나나 객체 저장
		Goods<Banana> banana = new Goods<Banana>();
		// setter를 사용해서 Banana 객체를 주입
		banana.setT(new Banana());
		// getter를 사용해서 Banana 객체를 가져와서 필드의 내용 출력
		System.out.println(banana.getT().name);

		// Pencil
		Goods<Pencil> pencil = new Goods<>();
		// setter를 사용해서 pencil 객체를 주입
		pencil.setT(new Pencil());
		// getter를 사용해서 pencil 객체의 필드내용 출력
		System.out.println(pencil.getT().name);

	}
}
