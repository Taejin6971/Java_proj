package chapter10.ex03;

// 부모(Super) 클래스 : Animal1
class Animal1 {

	// 인스턴스 메소드 : 인스턴스 메소드만 오버라이딩 가능 << 인스턴스 메소드 오버라이딩>>
	void run() {
		System.out.println("Animal1 - 모든 동물은 달립니다.");
	}
}

class Tiger1 extends Animal1 {

	@Override
	void run() {
		System.out.println("Tiger1 - 호랑이는 달립니다.");
	}
}

class Eagle1 extends Animal1 {

	@Override
	void run() {
		System.out.println("Eagle11 - 독수라는 날라다닙니다.");
	}
}

class Cat extends Animal1 {

	@Override
	void run() {
		System.out.println("Cat - 고양이는 뛰어다닙니다.");
	}
}

class CatChild extends Cat {

	@Override
	void run() {
		System.out.println("CatChild - 새끼고양이는 기어다닙니다.");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// 자식 클래스를 객체화시 부모 타입으로 지정 후 메소드 호출시 자식에서 오버라이딩된 메소드 호출

		// 자식 클래스를 객체화시 부모 타입으로 지정
		Animal1 ta1 = new Tiger1();
		Animal1 ea1 = new Eagle1();
		Animal1 ca1 = new Cat();
		Animal1 cca1 = new CatChild();

		ta1.run();
		ea1.run();
		ca1.run();
		cca1.run();

		System.out.println("===== 배열에 저장 후 한번에 출력 =====");

		Animal1[] arr1 = new Animal1[] { ta1, ea1, ca1, cca1 };
		
		// for 문을 사용해서 각 배열의 메소드 호출
		for (int i=0; i<arr1.length; i++) {
			
			// Animal 타입의 run 이 호출됨
			arr1[i].run();
		}
		
		System.out.println("===== Enhanced For 문을 사용해서 출력 ======");
		
		// Enhanced For 문을 사용해서 출력
		for (Animal1 k : arr1) {
			k.run();
		}
	}
}
