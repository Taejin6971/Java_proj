package chapter10.ex03;

class Animal {

	void cry() {
		System.out.println("모든 동물은 웁니다.");
	}
}

class Tiger extends Animal {

	@Override
	void cry() {
		System.out.println("어흥~~");
	}
}

class Eagle extends Animal {

	@Override
	void cry() {
		System.out.println("끼이오~~");
	}
}

class Lion extends Animal {

	@Override
	void cry() {
		System.out.println("크아아~~");
	}
}

public class Method_OverRiding02 {
	public static void main(String[] args) {

		// 1. Animal을 Animal 타입으로 객체화
		Animal a1 = new Animal();
		a1.cry(); // Animal 클래스의 cry를 호출
		
		// 2. 자식을 객체화 하면서 부모 타임으로 선언 : 오버라이딩된 메소드가 출력
		Animal t1 = new Tiger();
		t1.cry(); // t1.cry() 메소드는 Animal의 메소드 호출이지만 오버라이드된 Tiger 메소드가 출력
		
		Animal e1 = new Eagle();
		e1.cry(); // e1.cry() 메소드는 Animal의 메소드 호출이지만 오버라이드된 Eagle 메소드가 출력
		
		Animal l1 = new Lion();
		l1.cry(); // l1.cry() 메소드는 Animal의 메소드 호출이지만 오버라이드된 Lion 메소드가 출력
	}
}
