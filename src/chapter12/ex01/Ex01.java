package chapter12.ex01;

abstract class Car { // 추상 클래스 : 트럭(경유), 자가용(휘발유), 굴삭기(경유), 봉고(LPG)

	abstract void run();

	abstract void eat();
}

class 트럭 extends Car {

	@Override
	void run() {
		System.out.println("트럭이 달립니다");
	}

	@Override
	void eat() {
		System.out.println("트럭은 경유를 넣습니다");
	}
}

class 자가용 extends Car {

	@Override
	void run() {
		System.out.println("자가용이 달립니다");
	}

	@Override
	void eat() {
		System.out.println("자가용은 휘발유를 넣습니다");
	}
}

class 굴삭기 extends Car {

	@Override
	void run() {
		System.out.println("굴삭기가 달립니다");
	}

	@Override
	void eat() {
		System.out.println("굴삭기는 경유를 넣습니다");
	}
}

class 봉고 extends Car {

	@Override
	void run() {
		System.out.println("봉고가 달립니다");
	}

	@Override
	void eat() {
		System.out.println("봉고는 LPG를 넣습니다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 구현한 클래스를 생성 후, 자식 객체를 생성시 부모 타입으로 지정, 오버라이딩() 호출

		Car 트럭 = new 트럭();
		Car 자가용 = new 자가용();
		Car 굴삭기 = new 굴삭기();
		Car 봉고 = new 봉고();

		Car[] arr = new Car[] { 트럭, 자가용, 굴삭기, 봉고 };

		for (Car k : arr) {
			k.run();
			k.eat();
		}
	}
}
